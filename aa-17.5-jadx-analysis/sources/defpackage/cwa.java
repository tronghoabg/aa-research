package defpackage;

/* loaded from: classes.dex */
final class cwa implements cie {
    public static final cwa a = new cwa();
    public static Boolean b;

    @Override // defpackage.cie
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.cie
    public final boolean l() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        crt.a("canFocus is read before it is written");
        throw new aezp();
    }

    @Override // defpackage.cie
    public final /* synthetic */ void b(cil cilVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void c(cjb cjbVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void d(cil cilVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void e(cil cilVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void f(afec afecVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void g(afec afecVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void h(cil cilVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void i(cil cilVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void j(cil cilVar) {
    }

    @Override // defpackage.cie
    public final /* synthetic */ void k(cil cilVar) {
    }
}
