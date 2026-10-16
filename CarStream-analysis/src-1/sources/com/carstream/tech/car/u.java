package com.carstream.tech.car;

import android.os.Handler;
import android.os.SystemClock;
import android.webkit.WebView;
import com.carstream.tech.core.web.BackgroundWebView;
import com.carstream.tech.core.web.KeepAliveFrame;
import defpackage.s2;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class u {
    public final s2 a;
    public final Handler b;
    public long c;
    public h d;
    public long e;

    public u(s2 s2Var, Handler handler) {
        this.a = s2Var;
        this.b = handler;
    }

    public final void a(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 <= this.e) {
            c(true);
            return;
        }
        this.e = j2;
        c(true);
        h hVar = this.d;
        Handler handler = this.b;
        if (hVar != null) {
            handler.removeCallbacks(hVar);
        }
        h hVar2 = new h(this, 1);
        this.d = hVar2;
        handler.postDelayed(hVar2, this.e - jElapsedRealtime);
    }

    public final void b() {
        a(2000L);
    }

    public final void c(boolean z) {
        CarScreen carScreen = this.a.a;
        BackgroundWebView backgroundWebView = carScreen.bgWeb;
        if (backgroundWebView != null) {
            backgroundWebView.a(z);
        }
        KeepAliveFrame keepAliveFrame = carScreen.fullscreenHolder;
        if (keepAliveFrame != null) {
            keepAliveFrame.a = z;
        }
    }

    public final void d() {
        WebView webView = this.a.a.web;
        if (webView == null) {
            return;
        }
        webView.post(new defpackage.h(12, this, webView));
    }
}
