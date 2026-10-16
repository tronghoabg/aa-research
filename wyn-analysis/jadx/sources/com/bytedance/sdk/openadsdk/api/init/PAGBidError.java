package com.bytedance.sdk.openadsdk.api.init;

/* loaded from: classes3.dex */
public class PAGBidError {

    /* renamed from: oa, reason: collision with root package name */
    private String f25272oa;
    private int uef;

    public PAGBidError(int i5, String str) {
        this.uef = i5;
        this.f25272oa = str;
    }

    public int getCode() {
        return this.uef;
    }

    public String getMessage() {
        return this.f25272oa;
    }
}
