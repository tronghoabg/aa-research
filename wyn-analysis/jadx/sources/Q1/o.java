package Q1;

import A7.AbstractC0279p0;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import ka.AbstractC3256n;
import l8.AbstractC3414P;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f9699d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f9700e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC3414P f9701f = AbstractC3414P.i(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9702a;

    /* renamed from: b, reason: collision with root package name */
    public int f9703b;

    /* renamed from: c, reason: collision with root package name */
    public int f9704c;

    public o() {
        this.f9702a = x.f9729f;
    }

    public final int A() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 8;
        this.f9703b = i5 + 2;
        return (bArr[i10] & ForkServer.ERROR) | i11;
    }

    public final long B() {
        int i5;
        int i10;
        long j8 = this.f9702a[this.f9703b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j8) != 0) {
                i11--;
            } else if (i11 < 6) {
                j8 &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException(AbstractC0279p0.k(j8, "Invalid UTF-8 sequence first byte: "));
        }
        for (i5 = 1; i5 < i10; i5++) {
            if ((this.f9702a[this.f9703b + i5] & 192) != 128) {
                throw new NumberFormatException(AbstractC0279p0.k(j8, "Invalid UTF-8 sequence continuation byte: "));
            }
            j8 = (j8 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f9703b += i10;
        return j8;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f9702a;
            int i5 = this.f9703b;
            if (bArr[i5] == -17 && bArr[i5 + 1] == -69 && bArr[i5 + 2] == -65) {
                this.f9703b = i5 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f9702a;
        int i10 = this.f9703b;
        byte b5 = bArr2[i10];
        if (b5 == -2 && bArr2[i10 + 1] == -1) {
            this.f9703b = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b5 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f9703b = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void D(int i5) {
        byte[] bArr = this.f9702a;
        if (bArr.length < i5) {
            bArr = new byte[i5];
        }
        E(i5, bArr);
    }

    public final void E(int i5, byte[] bArr) {
        this.f9702a = bArr;
        this.f9704c = i5;
        this.f9703b = 0;
    }

    public final void F(int i5) {
        k.c(i5 >= 0 && i5 <= this.f9702a.length);
        this.f9704c = i5;
    }

    public final void G(int i5) {
        k.c(i5 >= 0 && i5 <= this.f9704c);
        this.f9703b = i5;
    }

    public final void H(int i5) {
        G(this.f9703b + i5);
    }

    public final int a() {
        return this.f9704c - this.f9703b;
    }

    public final void b(int i5) {
        byte[] bArr = this.f9702a;
        if (i5 > bArr.length) {
            this.f9702a = Arrays.copyOf(bArr, i5);
        }
    }

    public final char c(Charset charset) {
        k.b("Unsupported charset: " + charset, f9701f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b5;
        int i5;
        byte b10;
        byte b11;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            long j8 = this.f9702a[this.f9703b] & ForkServer.ERROR;
            char c10 = (char) j8;
            Fe.e.o("Out of range: %s", j8, ((long) c10) == j8);
            b5 = (byte) c10;
            i5 = 1;
        } else {
            i5 = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f9702a;
                int i10 = this.f9703b;
                b10 = bArr[i10];
                b11 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f9702a;
                int i11 = this.f9703b;
                b10 = bArr2[i11 + 1];
                b11 = bArr2[i11];
            }
            b5 = (byte) ((char) ((b11 & ForkServer.ERROR) | (b10 << 8)));
        }
        long j10 = b5;
        char c11 = (char) j10;
        Fe.e.o("Out of range: %s", j10, ((long) c11) == j10);
        return (c11 << 16) + i5;
    }

    public final int e() {
        return this.f9702a[this.f9703b] & ForkServer.ERROR;
    }

    public final void f(int i5, int i10, byte[] bArr) {
        System.arraycopy(this.f9702a, this.f9703b, bArr, i5, i10);
        this.f9703b += i10;
    }

    public final char g(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c10 = (char) (iD >> 16);
            for (char c11 : cArr) {
                if (c11 == c10) {
                    this.f9703b += iD & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 24;
        int i12 = i5 + 2;
        this.f9703b = i12;
        int i13 = ((bArr[i10] & ForkServer.ERROR) << 16) | i11;
        int i14 = i5 + 3;
        this.f9703b = i14;
        int i15 = i13 | ((bArr[i12] & ForkServer.ERROR) << 8);
        this.f9703b = i5 + 4;
        return (bArr[i14] & ForkServer.ERROR) | i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            l8.P r0 = Q1.o.f9701f
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            Q1.k.b(r1, r0)
            int r0 = r4.a()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.C()
        L2a:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L64:
            r0 = 2
            goto L67
        L66:
            r0 = 1
        L67:
            int r1 = r4.f9703b
        L69:
            int r2 = r4.f9704c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.f9702a
            r2 = r2[r1]
            boolean r2 = Q1.x.H(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.f9702a
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = Q1.x.H(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.f9702a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = Q1.x.H(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.f9703b
            int r1 = r1 - r0
            java.lang.String r0 = r4.s(r1, r5)
            int r1 = r4.f9703b
            int r2 = r4.f9704c
            if (r1 != r2) goto Ld7
            goto Le6
        Ld7:
            char[] r1 = Q1.o.f9699d
            char r1 = r4.g(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = Q1.o.f9700e
            r4.g(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.o.i(java.nio.charset.Charset):java.lang.String");
    }

    public final int j() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        int i12 = i5 + 2;
        this.f9703b = i12;
        int i13 = ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
        int i14 = i5 + 3;
        this.f9703b = i14;
        int i15 = i13 | ((bArr[i12] & ForkServer.ERROR) << 16);
        this.f9703b = i5 + 4;
        return ((bArr[i14] & ForkServer.ERROR) << 24) | i15;
    }

    public final long k() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        this.f9703b = i5 + 1;
        this.f9703b = i5 + 2;
        this.f9703b = i5 + 3;
        long j8 = (bArr[i5] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f9703b = i5 + 4;
        long j10 = j8 | ((bArr[r8] & 255) << 24);
        this.f9703b = i5 + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 32);
        this.f9703b = i5 + 6;
        long j12 = j11 | ((bArr[r8] & 255) << 40);
        this.f9703b = i5 + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 48);
        this.f9703b = i5 + 8;
        return ((bArr[r8] & 255) << 56) | j13;
    }

    public final long l() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        this.f9703b = i5 + 1;
        this.f9703b = i5 + 2;
        long j8 = (bArr[i5] & 255) | ((bArr[r2] & 255) << 8);
        this.f9703b = i5 + 3;
        long j10 = j8 | ((bArr[r7] & 255) << 16);
        this.f9703b = i5 + 4;
        return ((bArr[r2] & 255) << 24) | j10;
    }

    public final int m() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException(AbstractC3256n.g(iJ, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.f9703b = i5 + 2;
        return ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
    }

    public final long o() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        this.f9703b = i5 + 1;
        this.f9703b = i5 + 2;
        long j8 = ((bArr[i5] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.f9703b = i5 + 3;
        long j10 = j8 | ((bArr[r7] & 255) << 40);
        this.f9703b = i5 + 4;
        long j11 = j10 | ((bArr[r2] & 255) << 32);
        this.f9703b = i5 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f9703b = i5 + 6;
        long j13 = j12 | ((bArr[r2] & 255) << 16);
        this.f9703b = i5 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f9703b = i5 + 8;
        return (bArr[r2] & 255) | j14;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i5 = this.f9703b;
        while (i5 < this.f9704c && this.f9702a[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.f9702a;
        int i10 = this.f9703b;
        int i11 = x.f9724a;
        String str = new String(bArr, i10, i5 - i10, StandardCharsets.UTF_8);
        this.f9703b = i5;
        if (i5 < this.f9704c) {
            this.f9703b = i5 + 1;
        }
        return str;
    }

    public final String q(int i5) {
        if (i5 == 0) {
            return "";
        }
        int i10 = this.f9703b;
        int i11 = (i10 + i5) - 1;
        int i12 = (i11 >= this.f9704c || this.f9702a[i11] != 0) ? i5 : i5 - 1;
        byte[] bArr = this.f9702a;
        int i13 = x.f9724a;
        String str = new String(bArr, i10, i12, StandardCharsets.UTF_8);
        this.f9703b += i5;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 8;
        this.f9703b = i5 + 2;
        return (short) ((bArr[i10] & ForkServer.ERROR) | i11);
    }

    public final String s(int i5, Charset charset) {
        String str = new String(this.f9702a, this.f9703b, i5, charset);
        this.f9703b += i5;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        this.f9703b = i5 + 1;
        return bArr[i5] & ForkServer.ERROR;
    }

    public final int v() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 8;
        this.f9703b = i5 + 2;
        int i12 = (bArr[i10] & ForkServer.ERROR) | i11;
        this.f9703b = i5 + 4;
        return i12;
    }

    public final long w() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        this.f9703b = i5 + 1;
        this.f9703b = i5 + 2;
        long j8 = ((bArr[i5] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.f9703b = i5 + 3;
        long j10 = j8 | ((bArr[r7] & 255) << 8);
        this.f9703b = i5 + 4;
        return (bArr[r2] & 255) | j10;
    }

    public final int x() {
        byte[] bArr = this.f9702a;
        int i5 = this.f9703b;
        int i10 = i5 + 1;
        this.f9703b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 16;
        int i12 = i5 + 2;
        this.f9703b = i12;
        int i13 = ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
        this.f9703b = i5 + 3;
        return (bArr[i12] & ForkServer.ERROR) | i13;
    }

    public final int y() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(AbstractC3256n.g(iH, "Top bit not zero: "));
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(AbstractC0279p0.k(jO, "Top bit not zero: "));
    }

    public o(int i5) {
        this.f9702a = new byte[i5];
        this.f9704c = i5;
    }

    public o(byte[] bArr) {
        this.f9702a = bArr;
        this.f9704c = bArr.length;
    }

    public o(byte[] bArr, int i5) {
        this.f9702a = bArr;
        this.f9704c = i5;
    }
}
