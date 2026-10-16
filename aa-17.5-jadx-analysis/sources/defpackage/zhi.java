package defpackage;

/* loaded from: classes.dex */
final class zhi extends zgn {
    final /* synthetic */ zhk a;
    private final zfj b;

    public zhi(zhk zhkVar, zfj zfjVar) {
        this.a = zhkVar;
        this.b = zfjVar;
    }

    @Override // defpackage.zgn
    public final /* bridge */ /* synthetic */ Object a() throws Exception {
        zgp zgpVarA = this.b.a();
        zgpVarA.getClass();
        return zgpVarA;
    }

    @Override // defpackage.zgn
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.zgn
    public final void d(Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.zgn
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.r((zgp) obj);
    }

    @Override // defpackage.zgn
    public final boolean g() {
        return this.a.isDone();
    }
}
