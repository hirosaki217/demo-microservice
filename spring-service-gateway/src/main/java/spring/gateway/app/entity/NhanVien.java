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
@ToString
@Data
public class NhanVien {
	private String maNV;
	
	private String ten;
	private int luong;
	
//	@OneToMany(mappedBy = "nhanvien", cascade =CascadeType.ALL)
//	
//	@ToString.Exclude
//	private List<ChungNhan> chungNhans;
	
}
