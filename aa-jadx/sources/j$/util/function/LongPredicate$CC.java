package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.LongPredicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class LongPredicate$CC {
    public static java.util.function.LongPredicate $default$and(java.util.function.LongPredicate longPredicate, java.util.function.LongPredicate longPredicate2) {
        longPredicate2.getClass();
        return new j$.util.function.h(longPredicate, longPredicate2, (byte) 1);
    }

    public static java.util.function.LongPredicate $default$negate(java.util.function.LongPredicate longPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 6, longPredicate);
    }

    public static java.util.function.LongPredicate $default$or(java.util.function.LongPredicate longPredicate, java.util.function.LongPredicate longPredicate2) {
        longPredicate2.getClass();
        return new j$.util.function.h(longPredicate, longPredicate2, (byte) 0);
    }
}
