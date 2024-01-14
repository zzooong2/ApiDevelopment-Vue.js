package build.webboard.service;

import build.webboard.domain.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public List<BoardVO> getList();
}
