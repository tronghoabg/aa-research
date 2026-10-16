package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.L3;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return L3.d(Spliterators.l(tArr, 0, tArr.length), false);
    }

    public static IntStream stream(int[] iArr) {
        return L3.b(Spliterators.spliterator(iArr, 0, iArr.length, 1040));
    }
}
