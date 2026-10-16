package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f37896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f37897c;

    public /* synthetic */ i(Predicate predicate, Predicate predicate2, int i5) {
        this.f37895a = i5;
        this.f37896b = predicate;
        this.f37897c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f37895a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f37895a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f37895a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f37895a) {
            case 0:
                return this.f37896b.test(obj) && this.f37897c.test(obj);
            default:
                return this.f37896b.test(obj) || this.f37897c.test(obj);
        }
    }
}
