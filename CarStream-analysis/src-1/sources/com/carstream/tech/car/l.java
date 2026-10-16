package com.carstream.tech.car;

import android.os.SystemClock;
import android.webkit.WebView;
import defpackage.dd;
import defpackage.l0;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public /* synthetic */ l(e eVar, String str, int i) {
        this.a = i;
        this.c = eVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        dd ddVar;
        switch (this.a) {
            case 0:
                e eVar = this.c;
                eVar.b.leaveFullscreenForCommand();
                boolean z = false;
                for (dd ddVar2 : l0.a) {
                    String str = ddVar2.a;
                    String str2 = this.b;
                    if (str.equals(str2)) {
                        dd ddVar3 = eVar.b.currentApp;
                        if (ddVar3 != null && ddVar3.a.equals(str2)) {
                            z = true;
                        }
                        eVar.b.openApp(ddVar2);
                        if (z && (webView = eVar.b.web) != null) {
                            webView.loadUrl(ddVar2.d);
                            break;
                        }
                    }
                }
                break;
            case 1:
                e eVar2 = this.c;
                CarScreen carScreen = eVar2.b;
                if (carScreen.web != null && (ddVar = carScreen.currentApp) != null && ddVar.a.equals(this.b)) {
                    eVar2.b.web.reload();
                    break;
                }
                break;
            default:
                CarScreen carScreen2 = this.c.b;
                c cVar = carScreen2.autoOpen;
                cVar.c = true;
                cVar.e = SystemClock.uptimeMillis();
                carScreen2.searchBar.h(this.b);
                break;
        }
    }
}
