package j$.util.function;

import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f50245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f50246c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i2) {
        this.f50244a = i2;
        this.f50245b = predicate;
        this.f50246c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f50244a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f50244a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f50244a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f50244a) {
            case 0:
                return this.f50245b.test(obj) && this.f50246c.test(obj);
            default:
                return this.f50245b.test(obj) || this.f50246c.test(obj);
        }
    }
}
