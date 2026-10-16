package j$.util.function;

import j$.desugar.sun.nio.fs.n;
import java.util.function.Function;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function function, Function function2) {
        function2.getClass();
        return new d(function, function2, (byte) 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        function2.getClass();
        return new d(function, function2, (byte) 1);
    }

    public static <T> Function<T, T> identity() {
        return new n((byte) 14);
    }
}
