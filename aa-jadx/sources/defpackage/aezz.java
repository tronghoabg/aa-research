package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aezz implements defpackage.afac {
    public final /* synthetic */ defpackage.afac a;
    public final /* synthetic */ defpackage.afac b;
    private final /* synthetic */ int c;

    public /* synthetic */ aezz(defpackage.afac afacVar, defpackage.afac afacVar2, int i) {
        this.c = i;
        this.a = afacVar;
        this.b = afacVar2;
    }

    @Override // defpackage.afac
    public final /* synthetic */ defpackage.afac a(defpackage.afac afacVar) {
        return this.c != 0 ? defpackage.adrs.I(this, afacVar) : defpackage.adrs.I(this, afacVar);
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        return this.c != 0 ? defpackage.adrs.J(this, intPredicate) : defpackage.adrs.J(this, intPredicate);
    }

    @Override // defpackage.afac
    public final /* synthetic */ defpackage.afac b(defpackage.afac afacVar) {
        return this.c != 0 ? defpackage.adrs.K(this, afacVar) : defpackage.adrs.K(this, afacVar);
    }

    @Override // defpackage.afac
    public final /* synthetic */ boolean c(java.lang.Short sh) {
        return this.c != 0 ? defpackage.adrs.O(this, sh) : defpackage.adrs.O(this, sh);
    }

    @Override // defpackage.afac
    public final boolean d(short s) {
        int i = this.c;
        defpackage.afac afacVar = this.a;
        if (i != 0) {
            return afacVar.d(s) || this.b.d(s);
        }
        return afacVar.d(s) && this.b.d(s);
    }

    public final /* synthetic */ java.util.function.IntPredicate negate() {
        return this.c != 0 ? new defpackage.afab(this) : new defpackage.afab(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        return this.c != 0 ? defpackage.adrs.L(this, intPredicate) : defpackage.adrs.L(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return this.c != 0 ? defpackage.adrs.M(this, i) : defpackage.adrs.M(this, i);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return this.c != 0 ? j$.util.function.Predicate$CC.$default$and(this, predicate) : j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return this.c != 0 ? j$.util.function.Predicate$CC.$default$or(this, predicate) : j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(java.lang.Object obj) {
        return this.c != 0 ? c((java.lang.Short) obj) : c((java.lang.Short) obj);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        return this.c != 0 ? new defpackage.afab(this) : new defpackage.afab(this);
    }
}
