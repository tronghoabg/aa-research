package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* loaded from: classes3.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i5);

    void onRenderFail(View view, String str, int i5);

    void onRenderSuccess(View view, float f10, float f11);
}
