package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* loaded from: classes3.dex */
public class PAGBiddingRequest {
    private PAGBannerSize uef = null;

    /* renamed from: oa, reason: collision with root package name */
    private String f25271oa = null;
    private String yo = null;

    public String getAdxId() {
        return this.yo;
    }

    public PAGBannerSize getBannerSize() {
        return this.uef;
    }

    public String getSlotId() {
        return this.f25271oa;
    }

    public void setAdxId(String str) {
        this.yo = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.uef = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.f25271oa = str;
    }
}
