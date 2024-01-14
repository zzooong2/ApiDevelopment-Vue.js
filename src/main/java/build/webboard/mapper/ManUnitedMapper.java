package build.webboard.mapper;

import build.webboard.domain.ManUnitedVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManUnitedMapper {
    public List<ManUnitedVO> getList();
}
