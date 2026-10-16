package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class og extends of {
    @Override // defpackage.oe, defpackage.ok
    public void a(os osVar, os osVar2, Window window, View view, boolean z, boolean z2) {
        ebh.d(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ebj eddVar = Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(view));
        ecw.c(!z, eddVar);
        ecw.b(true ^ z2, eddVar);
    }
}
