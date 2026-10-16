package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.m4;

/* loaded from: classes4.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return m4.a(Spliterators.b(tArr, 0, tArr.length, 1040), false);
    }
}
