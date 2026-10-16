package com.bytedance.sdk.component.adexpress.lw;

/* loaded from: classes.dex */
public interface oa {
    String adInfo();

    String appInfo();

    void changeVideoState(String str);

    void clickEvent(String str);

    void dynamicTrack(String str);

    String getCurrentVideoState();

    String getData(String str);

    String getTemplateInfo();

    void initRenderFinish();

    void muteVideo(String str);

    void renderDidFinish(String str);

    void skipVideo();

    void uef(String str);

    void videoFrameChanged(String str);
}
