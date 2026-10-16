package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class imj implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ imj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Predicate$CC.$default$and(this, predicate);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.Predicate$CC.$default$and(this, predicate) : j$.util.function.Predicate$CC.$default$and(this, predicate);
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Predicate$CC.$default$negate(this);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.Predicate$CC.$default$negate(this) : j$.util.function.Predicate$CC.$default$negate(this);
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Predicate$CC.$default$or(this, predicate);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.Predicate$CC.$default$or(this, predicate) : j$.util.function.Predicate$CC.$default$or(this, predicate);
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            int i2 = defpackage.imk.b;
            return ((com.google.android.gms.car.display.CarRegionGroup) obj).b.equals(this.a);
        }
        if (i == 1) {
            int i3 = defpackage.imk.b;
            return ((com.google.android.gms.car.display.CarRegionGroup) obj).b.equals(this.a);
        }
        if (i != 2) {
            return ((defpackage.ygm) this.a).contains((defpackage.tgt) obj);
        }
        int i4 = defpackage.inl.g;
        return ((java.lang.String) obj).equalsIgnoreCase(((android.content.ComponentName) this.a).getPackageName());
    }
}
