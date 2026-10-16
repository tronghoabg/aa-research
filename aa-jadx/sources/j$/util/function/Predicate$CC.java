package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Predicate$CC {
    public static java.util.function.Predicate $default$and(java.util.function.Predicate predicate, java.util.function.Predicate predicate2) {
        predicate2.getClass();
        return new j$.util.function.j(predicate, predicate2, (byte) 0);
    }

    public static java.util.function.Predicate $default$negate(java.util.function.Predicate predicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 7, predicate);
    }

    public static java.util.function.Predicate $default$or(java.util.function.Predicate predicate, java.util.function.Predicate predicate2) {
        predicate2.getClass();
        return new j$.util.function.j(predicate, predicate2, (byte) 1);
    }

    public static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T> predicate) {
        predicate.getClass();
        return predicate.mo55negate();
    }
}
