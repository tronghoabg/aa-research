package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yuv {
    public static final defpackage.yuv d = new defpackage.yus("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final defpackage.yuv e = new defpackage.yus("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new defpackage.yuu("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new defpackage.yuu("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new defpackage.yur(new defpackage.yuq("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.yut;

    public abstract void b(java.lang.Appendable appendable, byte[] bArr, int i) throws java.io.IOException;

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract defpackage.yuv f();

    public java.lang.CharSequence g(java.lang.CharSequence charSequence) {
        throw null;
    }

    public final java.lang.String i(byte[] bArr) {
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(e(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (java.io.IOException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final byte[] j(java.lang.CharSequence charSequence) {
        try {
            java.lang.CharSequence charSequenceG = g(charSequence);
            int iD = d(charSequenceG.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceG);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (defpackage.yut e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }
}
