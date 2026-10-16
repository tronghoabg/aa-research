package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Function$CC {
    public static java.util.function.Function $default$andThen(java.util.function.Function function, java.util.function.Function function2) {
        function2.getClass();
        return new j$.util.function.d(function, function2, (byte) 0);
    }

    public static java.util.function.Function $default$compose(java.util.function.Function function, java.util.function.Function function2) {
        function2.getClass();
        return new j$.util.function.d(function, function2, (byte) 1);
    }

    public static <T> java.util.function.Function<T, T> identity() {
        return new j$.desugar.sun.nio.fs.n((byte) 14);
    }
}
