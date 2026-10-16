package j$.util.function;

import java.util.function.LongPredicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.LongPredicate$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class LongPredicate$CC {
    public static LongPredicate $default$and(LongPredicate longPredicate, LongPredicate longPredicate2) {
        longPredicate2.getClass();
        return new h(longPredicate, longPredicate2, (byte) 1);
    }

    public static LongPredicate $default$negate(LongPredicate longPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 6, longPredicate);
    }

    public static LongPredicate $default$or(LongPredicate longPredicate, LongPredicate longPredicate2) {
        longPredicate2.getClass();
        return new h(longPredicate, longPredicate2, (byte) 0);
    }
}
