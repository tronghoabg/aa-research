package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kuv extends defpackage.jri {
    public static final defpackage.yqm a = defpackage.yqm.c("Gh.ComposeCatalog");

    @Override // defpackage.jri, defpackage.ovs, defpackage.qso, defpackage.qsk, defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        C().getDecorView().setSystemUiVisibility(C().getDecorView().getSystemUiVisibility() | 1280);
        C().addFlags(67108864);
        C().addFlags(134217728);
        C().setStatusBarColor(defpackage.cjv.i(defpackage.cjv.j(0)));
        defpackage.jus.e(this, defpackage.kut.e);
    }
}
