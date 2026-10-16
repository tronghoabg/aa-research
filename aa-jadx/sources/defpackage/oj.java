package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class oj extends defpackage.oi {
    @Override // defpackage.oh, defpackage.on
    public void a(defpackage.ov ovVar, defpackage.ov ovVar2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        defpackage.ebr edjVar;
        defpackage.ebo.d(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        defpackage.erh erhVar = new defpackage.erh(view, (byte[]) null);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            edjVar = new defpackage.edk(window);
        } else {
            edjVar = android.os.Build.VERSION.SDK_INT >= 30 ? new defpackage.edj(window) : new defpackage.edi(window, erhVar);
        }
        defpackage.ebs.d(!z, edjVar);
        defpackage.ebs.c(true ^ z2, edjVar);
    }
}
