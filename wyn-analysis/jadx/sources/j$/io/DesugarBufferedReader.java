package j$.io;

import j$.util.Spliterators;
import j$.util.stream.L3;
import j$.util.stream.Stream;
import java.io.BufferedReader;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarBufferedReader {
    public static Stream lines(BufferedReader bufferedReader) {
        return L3.d(Spliterators.m(new a(bufferedReader)), false);
    }
}
