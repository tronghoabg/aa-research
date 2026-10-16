package defpackage;

/* loaded from: classes2.dex */
final class kyu extends lhk {
    final /* synthetic */ kyw a;

    public kyu(kyw kywVar) {
        this.a = kywVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eqn, java.lang.Object] */
    @Override // defpackage.lhk, defpackage.lhl
    public final void a() {
        kyw kywVar = this.a;
        if (kywVar.q && !kywVar.r) {
            kywVar.r = true;
            kzt kztVarA = kzt.a();
            kztVarA.c();
            ((eqj) kztVarA.c).i(kztVarA.d);
            lhm lhmVarD = lbh.d();
            lhmVarD.gK(new kzr(kztVarA, lhmVarD));
            kywVar.f.e();
            int i = kywVar.A;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                kywVar.X();
            }
        }
        lbh.d().d(this);
    }
}
