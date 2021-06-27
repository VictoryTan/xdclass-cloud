package net.xdclass.controller;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 旭瑶&小滴课堂 xdclass.net
 * @Author 二当家小D  代码、笔记和技术指导联系我即可
 * @Version 1.0
 **/

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {



    @Autowired
    private VideoService videoService;


    @RequestMapping("/find_by_id")
    public Object findById(int videoId, HttpServletRequest request){
        Video video = videoService.findById(videoId);
        video.setServerInfo(request.getServerName()+":"+request.getServerPort());
        return video;
    }

}
