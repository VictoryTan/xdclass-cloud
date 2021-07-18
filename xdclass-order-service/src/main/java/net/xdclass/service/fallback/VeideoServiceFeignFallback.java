package net.xdclass.service.fallback;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoServiceFeign;
import org.springframework.stereotype.Component;


@Component
public class VeideoServiceFeignFallback implements VideoServiceFeign {
    @Override
    public Video getVideoById(int videoId) {
        Video video = new Video();
        video.setTitle("熔断降级数据");
        return video;
    }

    @Override
    public Video saveVideo(Video video) {
        video.setTitle("熔断降级数据");
        return video;
    }
}
