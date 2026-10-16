package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.BiPredicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BiPredicate$CC {
    public static java.util.function.BiPredicate $default$and(java.util.function.BiPredicate biPredicate, java.util.function.BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new j$.util.function.a(biPredicate, biPredicate2, (byte) 1);
    }

    public static java.util.function.BiPredicate $default$negate(java.util.function.BiPredicate biPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 3, biPredicate);
    }

    public static java.util.function.BiPredicate $default$or(java.util.function.BiPredicate biPredicate, java.util.function.BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new j$.util.function.a(biPredicate, biPredicate2, (byte) 0);
    }
}
