package j$.util.function;

import java.util.function.IntPredicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.IntPredicate$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class IntPredicate$CC {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new f(intPredicate, intPredicate2, (byte) 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 5, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new f(intPredicate, intPredicate2, (byte) 0);
    }
}
