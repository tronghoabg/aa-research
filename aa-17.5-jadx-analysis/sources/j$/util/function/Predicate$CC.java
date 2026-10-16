package j$.util.function;

import java.util.function.Predicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new j(predicate, predicate2, (byte) 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 7, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new j(predicate, predicate2, (byte) 1);
    }

    public static <T> Predicate<T> not(Predicate<? super T> predicate) {
        predicate.getClass();
        return predicate.mo56negate();
    }
}
