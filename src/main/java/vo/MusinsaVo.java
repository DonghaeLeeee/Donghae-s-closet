package vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class MusinsaVo {
	
	private int memberno;
	private String name;
	private String nickname;
	private String phone;
	private String address;
	private Date joindate;
	private String id;
	private String password;
}
