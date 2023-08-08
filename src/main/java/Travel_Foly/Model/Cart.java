package Travel_Foly.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Carts")
public class Cart {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CartId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private User Cart;
	
	@OneToMany(mappedBy = "CartItem")
	private List<CartItem> CartItems;
}
