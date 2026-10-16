package com.bytedance.sdk.component.adexpress.lw;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class yo {
    private WeakReference<oa> uef;

    public yo(oa oaVar) {
        this.uef = new WeakReference<>(oaVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<oa> weakReference = this.uef;
        return (weakReference == null || weakReference.get() == null) ? "" : this.uef.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<oa> weakReference = this.uef;
        return (weakReference == null || weakReference.get() == null) ? "" : this.uef.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<oa> weakReference = this.uef;
        return (weakReference == null || weakReference.get() == null) ? "" : this.uef.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<oa> weakReference = this.uef;
        return (weakReference == null || weakReference.get() == null) ? "" : this.uef.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<oa> weakReference = this.uef;
        return (weakReference == null || weakReference.get() == null) ? "" : this.uef.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().uef(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().skipVideo();
    }

    public void uef(oa oaVar) {
        this.uef = new WeakReference<>(oaVar);
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<oa> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.uef.get().videoFrameChanged(str);
    }
}
