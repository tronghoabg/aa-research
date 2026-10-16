package defpackage;

/* JADX INFO: loaded from: classes.dex */
class oh extends defpackage.om {
    @Override // defpackage.on
    public void a(defpackage.ov ovVar, defpackage.ov ovVar2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        defpackage.ebr edjVar;
        defpackage.ebo.d(window, false);
        window.setStatusBarColor(ovVar.a(z));
        window.setNavigationBarColor(ovVar2.a(z2));
        defpackage.erh erhVar = new defpackage.erh(view, (byte[]) null);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            edjVar = new defpackage.edk(window);
        } else {
            edjVar = android.os.Build.VERSION.SDK_INT >= 30 ? new defpackage.edj(window) : new defpackage.edi(window, erhVar);
        }
        defpackage.ebs.d(!z, edjVar);
        defpackage.ebs.c(!z2, edjVar);
    }
}
