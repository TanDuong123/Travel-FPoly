package Travel_Foly.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="OrderDetailHotels")
public class OrderDetailHotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer OrderDetailHotelId;
	private Date CheckInDate;
	private Date CheckOutDate;
	private Integer Quantity;
	private Double Price;
	private Date Date;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HotelId")
	private Hotel OrderDetailHotel;
	@OneToMany(mappedBy = "OrderDetailHotel")
	private List<OrderHotel> OrderHotels;
}
