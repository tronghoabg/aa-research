package Y4;

import A7.AbstractC0279p0;
import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.util.Arrays;
import k8.AbstractC3198g;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16679a;

    /* renamed from: b, reason: collision with root package name */
    public int f16680b;

    /* renamed from: c, reason: collision with root package name */
    public int f16681c;

    public b() {
        this.f16679a = v.f46726f;
    }

    public void A(int i5) {
        AbstractC4256a.e(i5 >= 0 && i5 <= this.f16681c);
        this.f16680b = i5;
    }

    public void B(int i5) {
        A(this.f16680b + i5);
    }

    public int a() {
        return this.f16681c - this.f16680b;
    }

    public void b(int i5) {
        byte[] bArr = this.f16679a;
        if (i5 > bArr.length) {
            this.f16679a = Arrays.copyOf(bArr, i5);
        }
    }

    public void c(int i5, int i10, byte[] bArr) {
        System.arraycopy(this.f16679a, this.f16680b, bArr, i5, i10);
        this.f16680b += i10;
    }

    public int d() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        int i10 = i5 + 1;
        this.f16680b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 24;
        int i12 = i5 + 2;
        this.f16680b = i12;
        int i13 = ((bArr[i10] & ForkServer.ERROR) << 16) | i11;
        int i14 = i5 + 3;
        this.f16680b = i14;
        int i15 = i13 | ((bArr[i12] & ForkServer.ERROR) << 8);
        this.f16680b = i5 + 4;
        return (bArr[i14] & ForkServer.ERROR) | i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String e() {
        /*
            r8 = this;
            int r0 = r8.a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r8.f16680b
        La:
            int r1 = r8.f16681c
            r2 = 13
            r3 = 10
            if (r0 >= r1) goto L20
            byte[] r1 = r8.f16679a
            r1 = r1[r0]
            int r4 = u6.v.f46721a
            if (r1 == r3) goto L20
            if (r1 != r2) goto L1d
            goto L20
        L1d:
            int r0 = r0 + 1
            goto La
        L20:
            int r1 = r8.f16680b
            int r4 = r0 - r1
            r5 = 3
            if (r4 < r5) goto L42
            byte[] r4 = r8.f16679a
            r6 = r4[r1]
            r7 = -17
            if (r6 != r7) goto L42
            int r6 = r1 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L42
            int r6 = r1 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L42
            int r1 = r1 + r5
            r8.f16680b = r1
        L42:
            byte[] r1 = r8.f16679a
            int r4 = r8.f16680b
            int r5 = r0 - r4
            int r6 = u6.v.f46721a
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = k8.AbstractC3198g.f39301c
            r6.<init>(r1, r4, r5, r7)
            r8.f16680b = r0
            int r1 = r8.f16681c
            if (r0 != r1) goto L58
            goto L6f
        L58:
            byte[] r4 = r8.f16679a
            r5 = r4[r0]
            if (r5 != r2) goto L65
            int r0 = r0 + 1
            r8.f16680b = r0
            if (r0 != r1) goto L65
            goto L6f
        L65:
            int r0 = r8.f16680b
            r1 = r4[r0]
            if (r1 != r3) goto L6f
            int r0 = r0 + 1
            r8.f16680b = r0
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.b.e():java.lang.String");
    }

    public int f() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        int i10 = i5 + 1;
        this.f16680b = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        int i12 = i5 + 2;
        this.f16680b = i12;
        int i13 = ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
        int i14 = i5 + 3;
        this.f16680b = i14;
        int i15 = i13 | ((bArr[i12] & ForkServer.ERROR) << 16);
        this.f16680b = i5 + 4;
        return ((bArr[i14] & ForkServer.ERROR) << 24) | i15;
    }

    public long g() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        this.f16680b = i5 + 1;
        this.f16680b = i5 + 2;
        this.f16680b = i5 + 3;
        long j8 = (bArr[i5] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f16680b = i5 + 4;
        long j10 = j8 | ((bArr[r8] & 255) << 24);
        this.f16680b = i5 + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 32);
        this.f16680b = i5 + 6;
        long j12 = j11 | ((bArr[r8] & 255) << 40);
        this.f16680b = i5 + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 48);
        this.f16680b = i5 + 8;
        return ((bArr[r8] & 255) << 56) | j13;
    }

    public long h() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        this.f16680b = i5 + 1;
        this.f16680b = i5 + 2;
        long j8 = (bArr[i5] & 255) | ((bArr[r2] & 255) << 8);
        this.f16680b = i5 + 3;
        long j10 = j8 | ((bArr[r7] & 255) << 16);
        this.f16680b = i5 + 4;
        return ((bArr[r2] & 255) << 24) | j10;
    }

    public int i() {
        int iF = f();
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException(AbstractC3256n.g(iF, "Top bit not zero: "));
    }

    public int j() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        int i10 = i5 + 1;
        this.f16680b = i10;
        int i11 = bArr[i5] & ForkServer.ERROR;
        this.f16680b = i5 + 2;
        return ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
    }

    public long k() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        this.f16680b = i5 + 1;
        this.f16680b = i5 + 2;
        long j8 = ((bArr[i5] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.f16680b = i5 + 3;
        long j10 = j8 | ((bArr[r7] & 255) << 40);
        this.f16680b = i5 + 4;
        long j11 = j10 | ((bArr[r2] & 255) << 32);
        this.f16680b = i5 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f16680b = i5 + 6;
        long j13 = j12 | ((bArr[r2] & 255) << 16);
        this.f16680b = i5 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f16680b = i5 + 8;
        return (bArr[r2] & 255) | j14;
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i5 = this.f16680b;
        while (i5 < this.f16681c && this.f16679a[i5] != 0) {
            i5++;
        }
        byte[] bArr = this.f16679a;
        int i10 = this.f16680b;
        int i11 = v.f46721a;
        String str = new String(bArr, i10, i5 - i10, AbstractC3198g.f39301c);
        this.f16680b = i5;
        if (i5 < this.f16681c) {
            this.f16680b = i5 + 1;
        }
        return str;
    }

    public String m(int i5) {
        if (i5 == 0) {
            return "";
        }
        int i10 = this.f16680b;
        int i11 = (i10 + i5) - 1;
        int i12 = (i11 >= this.f16681c || this.f16679a[i11] != 0) ? i5 : i5 - 1;
        byte[] bArr = this.f16679a;
        int i13 = v.f46721a;
        String str = new String(bArr, i10, i12, AbstractC3198g.f39301c);
        this.f16680b += i5;
        return str;
    }

    public short n() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        int i10 = i5 + 1;
        this.f16680b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 8;
        this.f16680b = i5 + 2;
        return (short) ((bArr[i10] & ForkServer.ERROR) | i11);
    }

    public String o(int i5, Charset charset) {
        String str = new String(this.f16679a, this.f16680b, i5, charset);
        this.f16680b += i5;
        return str;
    }

    public int p() {
        return (q() << 21) | (q() << 14) | (q() << 7) | q();
    }

    public int q() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        this.f16680b = i5 + 1;
        return bArr[i5] & ForkServer.ERROR;
    }

    public long r() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        this.f16680b = i5 + 1;
        this.f16680b = i5 + 2;
        long j8 = ((bArr[i5] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.f16680b = i5 + 3;
        long j10 = j8 | ((bArr[r7] & 255) << 8);
        this.f16680b = i5 + 4;
        return (bArr[r2] & 255) | j10;
    }

    public int s() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        int i10 = i5 + 1;
        this.f16680b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 16;
        int i12 = i5 + 2;
        this.f16680b = i12;
        int i13 = ((bArr[i10] & ForkServer.ERROR) << 8) | i11;
        this.f16680b = i5 + 3;
        return (bArr[i12] & ForkServer.ERROR) | i13;
    }

    public int t() {
        int iD = d();
        if (iD >= 0) {
            return iD;
        }
        throw new IllegalStateException(AbstractC3256n.g(iD, "Top bit not zero: "));
    }

    public long u() {
        long jK = k();
        if (jK >= 0) {
            return jK;
        }
        throw new IllegalStateException(AbstractC0279p0.k(jK, "Top bit not zero: "));
    }

    public int v() {
        byte[] bArr = this.f16679a;
        int i5 = this.f16680b;
        int i10 = i5 + 1;
        this.f16680b = i10;
        int i11 = (bArr[i5] & ForkServer.ERROR) << 8;
        this.f16680b = i5 + 2;
        return (bArr[i10] & ForkServer.ERROR) | i11;
    }

    public long w() {
        int i5;
        int i10;
        long j8 = this.f16679a[this.f16680b];
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
            if ((this.f16679a[this.f16680b + i5] & 192) != 128) {
                throw new NumberFormatException(AbstractC0279p0.k(j8, "Invalid UTF-8 sequence continuation byte: "));
            }
            j8 = (j8 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f16680b += i10;
        return j8;
    }

    public void x(int i5) {
        byte[] bArr = this.f16679a;
        if (bArr.length < i5) {
            bArr = new byte[i5];
        }
        y(i5, bArr);
    }

    public void y(int i5, byte[] bArr) {
        this.f16679a = bArr;
        this.f16681c = i5;
        this.f16680b = 0;
    }

    public void z(int i5) {
        AbstractC4256a.e(i5 >= 0 && i5 <= this.f16679a.length);
        this.f16681c = i5;
    }

    public b(int i5) {
        this.f16679a = new byte[i5];
        this.f16681c = i5;
    }

    public b(byte[] bArr) {
        this.f16679a = bArr;
        this.f16681c = bArr.length;
    }

    public b(byte[] bArr, int i5) {
        this.f16679a = bArr;
        this.f16681c = i5;
    }
}
