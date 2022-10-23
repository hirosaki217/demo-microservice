package spring.gateway.app.entity;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChuyenBay {
	private String maCb;
	private String gaDi;
	private String gaDen;
	private int doDai;
	private Date gioDi;
	private Date gioDen;
	private int chiPhi;

}
