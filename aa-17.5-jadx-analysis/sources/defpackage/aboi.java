package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class aboi {
    public static final byte[] a;
    public static final ByteBuffer b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = ByteBuffer.wrap(bArr);
        abmw.J(bArr);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
