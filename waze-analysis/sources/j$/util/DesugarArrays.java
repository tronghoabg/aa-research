package j$.util;

import com.waze.strings.DisplayStrings;
import j$.util.stream.Stream;
import j$.util.stream.p8;

/* loaded from: classes10.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return p8.a(Spliterators.b(tArr, 0, tArr.length, DisplayStrings.DS_LOG_OUT), false);
    }
}
