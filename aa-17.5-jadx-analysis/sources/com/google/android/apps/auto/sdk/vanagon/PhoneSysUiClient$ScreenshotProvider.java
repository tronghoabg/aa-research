package com.google.android.apps.auto.sdk.vanagon;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public interface PhoneSysUiClient$ScreenshotProvider {

    public interface OnCompleteListener {
        void onScreenshotComplete(Bitmap bitmap);
    }

    void getScreenshot(OnCompleteListener onCompleteListener);
}
