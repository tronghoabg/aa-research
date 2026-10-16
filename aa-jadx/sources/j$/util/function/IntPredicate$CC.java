package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.IntPredicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class IntPredicate$CC {
    public static java.util.function.IntPredicate $default$and(java.util.function.IntPredicate intPredicate, java.util.function.IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new j$.util.function.f(intPredicate, intPredicate2, (byte) 1);
    }

    public static java.util.function.IntPredicate $default$negate(java.util.function.IntPredicate intPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 5, intPredicate);
    }

    public static java.util.function.IntPredicate $default$or(java.util.function.IntPredicate intPredicate, java.util.function.IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new j$.util.function.f(intPredicate, intPredicate2, (byte) 0);
    }
}
