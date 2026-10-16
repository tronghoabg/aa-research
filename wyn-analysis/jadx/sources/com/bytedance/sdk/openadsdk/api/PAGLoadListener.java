package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.xs;

/* loaded from: classes3.dex */
public interface PAGLoadListener<Ad> extends xs {
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.xs
    void onError(int i5, String str);
}
