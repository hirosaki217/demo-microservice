package spring.gateway.app.entity;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MayBay {
	private int maMB;
	private String loai;
	private int tambay;
	
//	@OneToMany(mappedBy = "maybay", cascade =CascadeType.ALL)
//	private List<ChungNhan> chungNhans;
}
