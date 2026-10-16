package com.waze.sharedui.web;

import android.webkit.JavascriptInterface;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends ag {
    @JavascriptInterface
    public void blockUser() {
        WazeWebView.k(this.f39311a);
    }

    @JavascriptInterface
    public void clientCallback(final boolean z) {
        this.f39311a.post(new Runnable() { // from class: com.waze.sharedui.web.ab
            @Override // java.lang.Runnable
            public final void run() {
                WazeWebView wazeWebView = this.f39309a.f39311a;
                String str = wazeWebView.f39295e;
                StringBuilder sb = new StringBuilder("clientCallback=");
                boolean z2 = z;
                sb.append(z2);
                com.waze.shared_infra.i.h.b(str, sb.toString());
                WazeWebView.n(wazeWebView, z2);
            }
        });
    }

    @JavascriptInterface
    public void sendClientLogs() {
        WazeWebView.o(this.f39311a);
    }

    @JavascriptInterface
    public void sendClientLogsWithConfirmation() {
        WazeWebView.p(this.f39311a);
    }
}
