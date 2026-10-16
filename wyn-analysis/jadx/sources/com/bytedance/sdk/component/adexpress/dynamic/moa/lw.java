package com.bytedance.sdk.component.adexpress.dynamic.moa;

import Va.M6;
import android.text.TextUtils;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.Map;
import wg.b;

/* loaded from: classes.dex */
public class lw {
    public static final Map<String, Integer> uef;
    private String ivm;
    private ivm lw;
    private ivm moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f24862oa;
    private String yo;

    static {
        HashMap map = new HashMap();
        uef = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put(ApiHeadersProvider.APP_VERSION, 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        M6.x(5, map, "logounion", 9, "logo-union");
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        M6.x(22, map, "webview-close", 12, "feedback-dislike");
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        M6.x(26, map, "carousel-vessel", 25, "leisure-interact");
        map.put("video-hd", 7);
        map.put(MimeTypes.BASE_TYPE_VIDEO, 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        M6.x(11, map, "star", 19, "skip-countdowns");
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        M6.x(20, map, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public int ivm() {
        return this.moa.ne();
    }

    public ivm lw() {
        return this.moa;
    }

    public String moa() {
        return this.ivm;
    }

    public String oa() {
        return this.f24862oa;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLayoutBrick{type='");
        sb2.append(this.f24862oa);
        sb2.append("', data='");
        sb2.append(this.yo);
        sb2.append("', value=");
        sb2.append(this.moa);
        sb2.append(", themeValue=");
        sb2.append(this.lw);
        sb2.append(", dataExtraInfo='");
        return b.c(sb2, this.ivm, "'}");
    }

    public int uef() {
        if (TextUtils.isEmpty(this.f24862oa)) {
            return 0;
        }
        if (this.f24862oa.equals("logo")) {
            String str = this.f24862oa + this.yo;
            this.f24862oa = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f24862oa.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = uef;
        if (map.get(this.f24862oa) != null) {
            return map.get(this.f24862oa).intValue();
        }
        return -1;
    }

    public ivm xs() {
        return this.lw;
    }

    public String yo() {
        return this.yo;
    }

    public void oa(String str) {
        this.yo = str;
    }

    public void yo(String str) {
        this.ivm = str;
    }

    public void oa(ivm ivmVar) {
        this.lw = ivmVar;
    }

    public void uef(String str) {
        this.f24862oa = str;
    }

    public void uef(ivm ivmVar) {
        this.moa = ivmVar;
    }
}
