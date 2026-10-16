package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afaa implements defpackage.afac {
    public final /* synthetic */ java.util.function.IntPredicate a;

    public /* synthetic */ afaa(java.util.function.IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    @Override // defpackage.afac
    public final /* synthetic */ defpackage.afac a(defpackage.afac afacVar) {
        return defpackage.adrs.I(this, afacVar);
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        return defpackage.adrs.J(this, intPredicate);
    }

    @Override // defpackage.afac
    public final /* synthetic */ defpackage.afac b(defpackage.afac afacVar) {
        return defpackage.adrs.K(this, afacVar);
    }

    @Override // defpackage.afac
    public final /* synthetic */ boolean c(java.lang.Short sh) {
        return defpackage.adrs.O(this, sh);
    }

    @Override // defpackage.afac
    public final boolean d(short s) {
        return this.a.test(s);
    }

    public final /* synthetic */ java.util.function.IntPredicate negate() {
        return new defpackage.afab(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        return defpackage.adrs.L(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return defpackage.adrs.M(this, i);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* bridge */ /* synthetic */ boolean test(java.lang.Object obj) {
        return c((java.lang.Short) obj);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        return new defpackage.afab(this);
    }
}
