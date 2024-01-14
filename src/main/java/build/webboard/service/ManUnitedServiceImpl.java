package build.webboard.service;

import build.webboard.domain.ManUnitedVO;
import build.webboard.mapper.ManUnitedMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManUnitedServiceImpl implements ManUnitedService {

    private final ManUnitedMapper mapper;

    @Override
    public List<ManUnitedVO> getList() {
        List<ManUnitedVO> list = mapper.getList();
        return list;
    }

}
