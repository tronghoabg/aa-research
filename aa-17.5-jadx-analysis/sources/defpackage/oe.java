package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
class oe extends oj {
    @Override // defpackage.ok
    public void a(os osVar, os osVar2, Window window, View view, boolean z, boolean z2) {
        ebh.d(window, false);
        window.setStatusBarColor(osVar.a(z));
        window.setNavigationBarColor(osVar2.a(z2));
        ebj eddVar = Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(view));
        ecw.c(!z, eddVar);
        ecw.b(!z2, eddVar);
    }
}
