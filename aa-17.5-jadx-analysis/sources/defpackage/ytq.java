package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ytq {
    public static final ytq d = new ytn("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final ytq e = new ytn("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new ytp("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new ytp("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new ytm(new ytl("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence) throws yto;

    public abstract void b(Appendable appendable, byte[] bArr, int i) throws IOException;

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract ytq f();

    public CharSequence g(CharSequence charSequence) {
        throw null;
    }

    public final String i(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(e(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] j(CharSequence charSequence) {
        try {
            CharSequence charSequenceG = g(charSequence);
            int iD = d(charSequenceG.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceG);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (yto e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
