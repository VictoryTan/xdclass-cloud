package net.xdclass.service;


import net.xdclass.domain.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xdclass-video-service")
public interface VideoServiceFeign {


    @GetMapping(value = "/api/v1/video/find_by_id")
    Video getVideoById(@RequestParam("videoId") int videoId);


    //订单服务这边
    @PostMapping(value = "/api/v1/video/save")
    int saveVideo(@RequestBody Video video);
}
