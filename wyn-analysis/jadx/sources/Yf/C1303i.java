package Yf;

/* renamed from: Yf.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1303i {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16859a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f16860b = new byte[126];

    static {
        int i5 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        while (true) {
            byte[] bArr = f16860b;
            if (i5 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i5] = 127;
            i5++;
        }
    }

    public static void a(int i5, char c10) {
        if (c10 != 'u') {
            f16859a[c10] = (char) i5;
        }
    }
}
