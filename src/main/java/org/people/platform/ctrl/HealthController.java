package org.people.platform.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoyunxing
 * @date 2023-06-06 23:06
 */
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "ok";
    }
}
