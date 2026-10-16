package j$.util.function;

import java.util.function.IntPredicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements IntPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntPredicate b;
    public final /* synthetic */ IntPredicate c;

    public /* synthetic */ f(IntPredicate intPredicate, IntPredicate intPredicate2, byte b) {
        this.a = b;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.a) {
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.a) {
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.a) {
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        byte b = this.a;
        IntPredicate intPredicate = this.c;
        IntPredicate intPredicate2 = this.b;
        switch (b) {
            case 0:
                if (intPredicate2.test(i) || intPredicate.test(i)) {
                    break;
                }
                break;
            default:
                if (intPredicate2.test(i) && intPredicate.test(i)) {
                    break;
                }
                break;
        }
        return true;
    }
}
