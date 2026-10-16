package m8;

import A6.h;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* renamed from: m8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3498e {

    /* renamed from: d, reason: collision with root package name */
    public static final C3496c f40402d = new C3496c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final C3495b f40403e;

    /* renamed from: a, reason: collision with root package name */
    public final C3494a f40404a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f40405b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C3498e f40406c;

    static {
        new C3496c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C3498e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C3498e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f40403e = new C3495b(new C3494a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3498e(m8.C3494a r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.f40404a = r3
            if (r4 == 0) goto L1a
            char r0 = r4.charValue()
            byte[] r3 = r3.f40398g
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L1a
            r3 = 0
            goto L1b
        L1a:
            r3 = 1
        L1b:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            Fe.e.r(r3, r0, r4)
            r2.f40405b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.C3498e.<init>(m8.a, java.lang.Character):void");
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.f40404a.f40395d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, g(str));
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (C3497d e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws C3497d {
        int i5;
        int i10;
        CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        C3494a c3494a = this.f40404a;
        if (!c3494a.f40399h[length % c3494a.f40396e]) {
            throw new C3497d("Invalid input length " + charSequenceG.length());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceG.length()) {
            long jA = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i5 = c3494a.f40395d;
                i10 = c3494a.f40396e;
                if (i13 >= i10) {
                    break;
                }
                jA <<= i5;
                if (i11 + i13 < charSequenceG.length()) {
                    jA |= c3494a.a(charSequenceG.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = c3494a.f40397f;
            int i16 = (i15 * 8) - (i14 * i5);
            int i17 = (i15 - 1) * 8;
            while (i17 >= i16) {
                bArr[i12] = (byte) ((jA >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        Fe.e.v(0, length, bArr.length);
        C3494a c3494a = this.f40404a;
        int i5 = c3494a.f40396e;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(A6.c.q(length, c3494a.f40397f) * i5);
        try {
            e(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void d(StringBuilder sb2, byte[] bArr, int i5, int i10) {
        Fe.e.v(i5, i5 + i10, bArr.length);
        C3494a c3494a = this.f40404a;
        int i11 = 0;
        Fe.e.q(i10 <= c3494a.f40397f);
        long j8 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j8 = (j8 | (bArr[i5 + i12] & ForkServer.ERROR)) << 8;
        }
        int i13 = c3494a.f40395d;
        int i14 = ((i10 + 1) * 8) - i13;
        while (i11 < i10 * 8) {
            sb2.append(c3494a.f40393b[((int) (j8 >>> (i14 - i11))) & c3494a.f40394c]);
            i11 += i13;
        }
        Character ch = this.f40405b;
        if (ch != null) {
            while (i11 < c3494a.f40397f * 8) {
                sb2.append(ch.charValue());
                i11 += i13;
            }
        }
    }

    public void e(StringBuilder sb2, byte[] bArr, int i5) {
        int i10 = 0;
        Fe.e.v(0, i5, bArr.length);
        while (i10 < i5) {
            C3494a c3494a = this.f40404a;
            d(sb2, bArr, i10, Math.min(c3494a.f40397f, i5 - i10));
            i10 += c3494a.f40397f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3498e) {
            C3498e c3498e = (C3498e) obj;
            if (this.f40404a.equals(c3498e.f40404a) && Objects.equals(this.f40405b, c3498e.f40405b)) {
                return true;
            }
        }
        return false;
    }

    public C3498e f(C3494a c3494a, Character ch) {
        return new C3498e(c3494a, ch);
    }

    public final CharSequence g(CharSequence charSequence) {
        Character ch = this.f40405b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final C3498e h() {
        int i5;
        boolean z2;
        C3498e c3498e = this.f40406c;
        if (c3498e != null) {
            return c3498e;
        }
        C3494a c3494a = this.f40404a;
        char[] cArr = c3494a.f40393b;
        int length = cArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (h.C(cArr[i10])) {
                int length2 = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        z2 = false;
                        break;
                    }
                    char c10 = cArr[i11];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        z2 = true;
                        break;
                    }
                    i11++;
                }
                Fe.e.w("Cannot call upperCase() on a mixed-case alphabet", !z2);
                char[] cArr2 = new char[cArr.length];
                for (int i12 = 0; i12 < cArr.length; i12++) {
                    char c11 = cArr[i12];
                    if (h.C(c11)) {
                        c11 = (char) (c11 ^ ' ');
                    }
                    cArr2[i12] = c11;
                }
                C3494a c3494a2 = new C3494a(wg.b.c(new StringBuilder(), c3494a.f40392a, ".upperCase()"), cArr2);
                if (!c3494a.f40400i || c3494a2.f40400i) {
                    c3494a = c3494a2;
                } else {
                    byte[] bArr = c3494a2.f40398g;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    for (i5 = 65; i5 <= 90; i5++) {
                        int i13 = i5 | 32;
                        byte b5 = bArr[i5];
                        byte b10 = bArr[i13];
                        if (b5 == -1) {
                            bArrCopyOf[i5] = b10;
                        } else {
                            char c12 = (char) i5;
                            char c13 = (char) i13;
                            if (!(b10 == -1)) {
                                throw new IllegalStateException(Fe.g.E("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                            }
                            bArrCopyOf[i13] = b5;
                        }
                    }
                    c3494a = new C3494a(wg.b.c(new StringBuilder(), c3494a2.f40392a, ".ignoreCase()"), c3494a2.f40393b, bArrCopyOf, true);
                }
            } else {
                i10++;
            }
        }
        C3498e c3498eF = c3494a == this.f40404a ? this : f(c3494a, this.f40405b);
        this.f40406c = c3498eF;
        return c3498eF;
    }

    public final int hashCode() {
        return this.f40404a.hashCode() ^ Objects.hashCode(this.f40405b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        C3494a c3494a = this.f40404a;
        sb2.append(c3494a);
        if (8 % c3494a.f40395d != 0) {
            Character ch = this.f40405b;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public C3498e(String str, String str2) {
        this(new C3494a(str, str2.toCharArray()), (Character) '=');
    }
}
