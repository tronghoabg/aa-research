package com.google.d.h;

import com.google.d.b.an;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final f f7912a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    private static final f f7913b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    private static final f f7914c;

    static {
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f7914c = new b();
    }

    f() {
    }

    public static f l() {
        return f7914c;
    }

    public static f m() {
        return f7912a;
    }

    public static f n() {
        return f7913b;
    }

    abstract int a(byte[] bArr, CharSequence charSequence);

    abstract void c(Appendable appendable, byte[] bArr, int i2, int i3);

    abstract int d(int i2);

    abstract int e(int i2);

    public abstract f f();

    public abstract f g();

    public abstract f h();

    public abstract f i();

    CharSequence j(CharSequence charSequence) {
        throw null;
    }

    public final String o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public final String p(byte[] bArr, int i2, int i3) {
        an.t(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(e(i3));
        try {
            c(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] q(CharSequence charSequence) {
        try {
            CharSequence charSequenceJ = j(charSequence);
            int iD = d(charSequenceJ.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceJ);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (d e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
