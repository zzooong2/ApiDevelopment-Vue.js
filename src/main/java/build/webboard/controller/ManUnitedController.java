package build.webboard.controller;

import build.webboard.domain.ManUnitedVO;
import build.webboard.service.ManUnitedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mu/*")
@RequiredArgsConstructor
public class ManUnitedController {

    private final ManUnitedService manUnitedService;

    @GetMapping("/players")
    public List<ManUnitedVO> getList(){
        List<ManUnitedVO> list = manUnitedService.getList();
        return list;
    }
}
