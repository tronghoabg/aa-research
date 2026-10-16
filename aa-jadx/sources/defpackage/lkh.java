package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lkh implements java.util.function.Predicate {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ lkh(long j, int i) {
        this.b = i;
        this.a = j;
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return this.b != 0 ? j$.util.function.Predicate$CC.$default$and(this, predicate) : j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        return this.b != 0 ? j$.util.function.Predicate$CC.$default$negate(this) : j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return this.b != 0 ? j$.util.function.Predicate$CC.$default$or(this, predicate) : j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        if (this.b != 0) {
            return ((android.util.Range) obj).contains(java.lang.Long.valueOf(this.a));
        }
        java.util.Map map = defpackage.lki.a;
        return (this.a & ((java.lang.Long) obj).longValue()) != 0;
    }
}
