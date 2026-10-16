package com.carstream.tech.car;

import android.os.SystemClock;
import android.webkit.WebView;
import defpackage.dd;
import defpackage.l3;
import defpackage.s8;
import defpackage.y;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, String str, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y yVar = (y) this.c;
                CarScreen carScreen = (CarScreen) yVar.d;
                carScreen.dangQuetMedia = false;
                carScreen.lucQuetMediaXong = SystemClock.elapsedRealtime();
                try {
                    WebView webView = (WebView) yVar.c;
                    String str = this.b;
                    dd ddVar = carScreen.currentApp;
                    webView.evaluateJavascript("window.__cntMediaData=" + str + ";window.__cntAutoFullscreen=" + (ddVar != null && ddVar.h) + ";if(window.__cntMediaSet){window.__cntMediaSet(window.__cntMediaData);}", null);
                    break;
                } catch (Throwable th) {
                    String.valueOf(th);
                    return;
                }
                break;
            default:
                t tVar = (t) this.c;
                if (tVar.a.pageTrusted()) {
                    l3 l3Var = tVar.a.controlBar;
                    String str2 = this.b;
                    if (str2 != null) {
                        l3Var.getClass();
                        if (!str2.trim().isEmpty()) {
                            l3Var.g = str2.trim();
                        }
                    }
                    s8 s8Var = l3Var.d;
                    if (s8Var != null) {
                        s8Var.e(l3Var.g);
                        break;
                    }
                }
                break;
        }
    }
}
