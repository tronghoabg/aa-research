package j$.util.function;

import java.util.function.BiPredicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.BiPredicate$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiPredicate$CC {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new a(biPredicate, biPredicate2, (byte) 1);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 3, biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new a(biPredicate, biPredicate2, (byte) 0);
    }
}
