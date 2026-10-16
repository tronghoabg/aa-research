package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes3.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize uef;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.uef = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.uef;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.uef = pAGBannerSize;
    }
}
