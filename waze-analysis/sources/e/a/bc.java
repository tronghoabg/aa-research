package e.a;

import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f46477a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.d.h.f f46478b = cm.f46535b;

    public static int a(cm cmVar) {
        return cmVar.b();
    }

    public static ch b(String str, bb bbVar) {
        char cCharAt = str.charAt(0);
        int i2 = ch.f46523a;
        return new ck(str, cCharAt == ':', bbVar);
    }

    public static cm c(byte[]... bArr) {
        return new cm(bArr.length >> 1, bArr);
    }

    public static cm d(int i2, Object[] objArr) {
        return new cm(i2, objArr);
    }

    public static Object[] e(cm cmVar) {
        return cmVar.l();
    }

    public static byte[][] f(cm cmVar) {
        return cmVar.m();
    }
}
