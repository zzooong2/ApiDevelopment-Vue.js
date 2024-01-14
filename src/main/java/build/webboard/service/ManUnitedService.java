package build.webboard.service;

import build.webboard.domain.ManUnitedVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManUnitedService {
    public List<ManUnitedVO> getList();
}
