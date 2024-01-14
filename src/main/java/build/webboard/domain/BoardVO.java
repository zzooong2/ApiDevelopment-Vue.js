package build.webboard.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BoardVO extends BaseTimeEntity {
    private int board_no;
    private String title;
    private String contents;
    private Date regdate;
    private String writer;
}
