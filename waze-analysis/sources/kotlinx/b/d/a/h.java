package kotlinx.b.d.a;

import com.fasterxml.jackson.core.JsonFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f51160a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f51161b = new byte[126];

    static {
        for (int i2 = 0; i2 < 32; i2++) {
            a(i2, 'u');
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, JsonFactory.DEFAULT_QUOTE_CHAR);
        a(92, '\\');
        for (int i3 = 0; i3 < 33; i3++) {
            b(i3, (byte) 127);
        }
        b(9, (byte) 3);
        b(10, (byte) 3);
        b(13, (byte) 3);
        b(32, (byte) 3);
        b(44, (byte) 4);
        b(58, (byte) 5);
        b(123, (byte) 6);
        b(125, (byte) 7);
        b(91, (byte) 8);
        b(93, (byte) 9);
        b(34, (byte) 1);
        b(92, (byte) 2);
    }

    private static final void a(int i2, char c2) {
        if (c2 != 'u') {
            f51160a[c2] = (char) i2;
        }
    }

    private static final void b(int i2, byte b2) {
        f51161b[i2] = b2;
    }
}
