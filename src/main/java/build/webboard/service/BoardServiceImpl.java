package build.webboard.service;

import build.webboard.domain.BoardVO;
import build.webboard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper mapper;

    @Override
    public List<BoardVO> getList() {
        List<BoardVO> list = mapper.getList();
        return list;
    }

}
