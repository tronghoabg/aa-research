package com.google.android.apps.auto.sdk.vanagon;

/* JADX INFO: loaded from: classes2.dex */
public interface PhoneSysUiClient$ScreenshotProvider {

    public interface OnCompleteListener {
        void onScreenshotComplete(android.graphics.Bitmap bitmap);
    }

    void getScreenshot(com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider.OnCompleteListener onCompleteListener);
}
