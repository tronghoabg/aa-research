package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes3.dex */
public class PAGRewardItem {

    /* renamed from: oa, reason: collision with root package name */
    private final String f25287oa;
    private final int uef;

    public PAGRewardItem(int i5, String str) {
        this.uef = i5;
        this.f25287oa = str;
    }

    public int getRewardAmount() {
        return this.uef;
    }

    public String getRewardName() {
        return this.f25287oa;
    }
}
