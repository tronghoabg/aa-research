package com.bytedance.sdk.openadsdk.api.nativeAd;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class PAGImageItem {
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f25279oa;
    private final int uef;
    private final String yo;

    public PAGImageItem(int i5, int i10, String str, float f10) {
        this.uef = i5;
        this.f25279oa = i10;
        this.yo = str;
        this.moa = f10;
    }

    public float getDuration() {
        return this.moa;
    }

    public int getHeight() {
        return this.uef;
    }

    public String getImageUrl() {
        return this.yo;
    }

    public int getWidth() {
        return this.f25279oa;
    }

    public PAGImageItem(int i5, int i10, String str) {
        this(i5, i10, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
