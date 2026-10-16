package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes3.dex */
public class PAGErrorModel {

    /* renamed from: oa, reason: collision with root package name */
    private final String f25278oa;
    private final int uef;

    public PAGErrorModel(int i5, String str) {
        this.uef = i5;
        this.f25278oa = str;
    }

    public int getErrorCode() {
        return this.uef;
    }

    public String getErrorMessage() {
        return this.f25278oa;
    }
}
