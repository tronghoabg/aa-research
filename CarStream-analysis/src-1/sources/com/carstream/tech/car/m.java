package com.carstream.tech.car;

import android.webkit.WebView;
import defpackage.dd;
import defpackage.l0;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public m(e eVar, String str, String str2) {
        this.c = eVar;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null || str.isEmpty()) {
            return;
        }
        e eVar = this.c;
        eVar.b.leaveFullscreenForCommand();
        dd ddVar = eVar.b.currentApp;
        String str2 = this.b;
        if (ddVar == null || !ddVar.a.equals(str2)) {
            dd[] ddVarArr = l0.a;
            int length = ddVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                dd ddVar2 = ddVarArr[i];
                if (ddVar2.a.equals(str2)) {
                    eVar.b.openApp(ddVar2);
                    break;
                }
                i++;
            }
        }
        CarScreen carScreen = eVar.b;
        WebView webView = carScreen.web;
        if (webView != null) {
            carScreen.pendingCommandedOpen = true;
            webView.loadUrl(str);
        }
    }
}
