package com.waze.sharedui.web;

import android.webkit.JavascriptInterface;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends ag {
    @JavascriptInterface
    public void shareText(String str) {
        WazeWebView.q(this.f39311a, str);
    }

    @JavascriptInterface
    public void updateWebviewHeader(String str) {
        WazeWebView.r(this.f39311a, str);
    }
}
