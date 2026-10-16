package j$.util.function;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements IntPredicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f37887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f37888c;

    public /* synthetic */ e(IntPredicate intPredicate, IntPredicate intPredicate2, int i5) {
        this.f37886a = i5;
        this.f37887b = intPredicate;
        this.f37888c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.f37886a) {
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.f37886a) {
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.f37886a) {
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i5) {
        switch (this.f37886a) {
            case 0:
                return this.f37887b.test(i5) || this.f37888c.test(i5);
            default:
                return this.f37887b.test(i5) && this.f37888c.test(i5);
        }
    }
}
