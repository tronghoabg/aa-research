package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abpk {
    public static final byte[] a;
    public static final java.nio.ByteBuffer b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = java.nio.ByteBuffer.wrap(bArr);
        defpackage.abny.H(bArr);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b() {
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
