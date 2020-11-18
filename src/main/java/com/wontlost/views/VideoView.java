package com.wontlost.views;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.wontlost.video.VaadinVideo;

/**
 * The main view is a top-level placeholder for other views.
 */
@JsModule("./styles/shared-styles.js")
@Viewport("width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes, viewport-fit=cover")
@PWA(name = "VIDEO", shortName = "VIDEO")
@Route(value = "")
@PageTitle("Video")
public class VideoView extends VerticalLayout {

    VideoView() {
        super();
        VaadinVideo video = new VaadinVideo(null,null, null, "video/mp4", "//vjs.zencdn.net/v/oceans.mp4");
        video.setWidth("80%");
        video.setHeight("60%");
        add(video);

        setAlignItems(Alignment.CENTER);
    }

}
