package yc;

import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* renamed from: yc.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C4587j implements IntPredicate {
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i5) {
        return i5 != 0;
    }
}
