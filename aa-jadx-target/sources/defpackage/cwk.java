package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cwk implements defpackage.cim {
    public static final defpackage.cwk a = new defpackage.cwk();
    public static java.lang.Boolean b;

    @Override // defpackage.cim
    public final void a(boolean z) {
        b = java.lang.Boolean.valueOf(z);
    }

    @Override // defpackage.cim
    public final boolean l() {
        java.lang.Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        defpackage.csc.a("canFocus is read before it is written");
        throw new defpackage.afap();
    }

    @Override // defpackage.cim
    public final /* synthetic */ void b(defpackage.cit citVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void c(defpackage.cjj cjjVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void d(defpackage.cit citVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void e(defpackage.cit citVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void f(defpackage.affc affcVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void g(defpackage.affc affcVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void h(defpackage.cit citVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void i(defpackage.cit citVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void j(defpackage.cit citVar) {
    }

    @Override // defpackage.cim
    public final /* synthetic */ void k(defpackage.cit citVar) {
    }
}
