package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class eit extends eiw {
    final byte[] a;
    final int b;
    public int c;
    int d;
    private final OutputStream g;

    public eit(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
        this.g = outputStream;
    }

    private final void V(int i) throws IOException {
        if (this.b - this.c < i) {
            h();
        }
    }

    @Override // defpackage.eiw
    public final void A(int i, long j) throws IOException {
        V(20);
        f(i << 3);
        g(j);
    }

    @Override // defpackage.eiw
    public final void B(long j) throws IOException {
        V(10);
        g(j);
    }

    @Override // defpackage.eiw
    public final void C(byte[] bArr, int i) throws IOException {
        z(i);
        D(bArr, i);
    }

    public final void D(byte[] bArr, int i) throws IOException {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        byte[] bArr2 = this.a;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.c += i;
            this.d += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i3, i4);
        this.c = i2;
        this.d += i4;
        h();
        int i5 = i - i4;
        if (i5 <= i2) {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.c = i5;
        } else {
            this.g.write(bArr, i4, i5);
        }
        this.d += i5;
    }

    @Override // defpackage.eiw, defpackage.eii
    public final void a(byte[] bArr, int i) throws IOException {
        D(bArr, i);
    }

    @Override // defpackage.eiw
    public final int b() {
        throw null;
    }

    final void c(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        bArr[i] = b;
        this.c = i + 1;
        this.d++;
    }

    final void d(int i) {
        int i2 = this.c;
        byte[] bArr = this.a;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.c = i2 + 4;
        this.d += 4;
    }

    final void e(long j) {
        int i = this.c;
        byte[] bArr = this.a;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.c = i + 8;
        this.d += 8;
    }

    final void f(int i) {
        if (eiw.e) {
            long j = this.c;
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.a;
                if (i2 == 0) {
                    int i3 = this.c;
                    this.c = i3 + 1;
                    elf.k(bArr, i3, (byte) i);
                    this.d += (int) (this.c - j);
                    return;
                }
                int i4 = this.c;
                this.c = i4 + 1;
                elf.k(bArr, i4, (byte) (i | 128));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i5 = i & (-128);
                byte[] bArr2 = this.a;
                if (i5 == 0) {
                    int i6 = this.c;
                    this.c = i6 + 1;
                    bArr2[i6] = (byte) i;
                    this.d++;
                    return;
                }
                int i7 = this.c;
                this.c = i7 + 1;
                bArr2[i7] = (byte) (i | 128);
                this.d++;
                i >>>= 7;
            }
        }
    }

    final void g(long j) {
        if (eiw.e) {
            long j2 = this.c;
            while (true) {
                long j3 = j & (-128);
                int i = (int) j;
                byte[] bArr = this.a;
                if (j3 == 0) {
                    int i2 = this.c;
                    this.c = i2 + 1;
                    elf.k(bArr, i2, (byte) i);
                    this.d += (int) (this.c - j2);
                    return;
                }
                int i3 = this.c;
                this.c = i3 + 1;
                elf.k(bArr, i3, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                long j4 = j & (-128);
                int i4 = (int) j;
                byte[] bArr2 = this.a;
                if (j4 == 0) {
                    int i5 = this.c;
                    this.c = i5 + 1;
                    bArr2[i5] = (byte) i4;
                    this.d++;
                    return;
                }
                int i6 = this.c;
                this.c = i6 + 1;
                bArr2[i6] = (byte) (i4 | 128);
                this.d++;
                j >>>= 7;
            }
        }
    }

    public final void h() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    @Override // defpackage.eiw
    public final void i(byte b) throws IOException {
        if (this.c == this.b) {
            h();
        }
        c(b);
    }

    @Override // defpackage.eiw
    public final void j(int i, boolean z) throws IOException {
        V(11);
        f(i << 3);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.eiw
    public final void k(int i, eip eipVar) throws IOException {
        z((i << 3) | 2);
        l(eipVar);
    }

    @Override // defpackage.eiw
    public final void l(eip eipVar) throws IOException {
        z(eipVar.c());
        eipVar.f(this);
    }

    @Override // defpackage.eiw
    public final void m(int i, int i2) throws IOException {
        V(14);
        f((i << 3) | 5);
        d(i2);
    }

    @Override // defpackage.eiw
    public final void n(int i) throws IOException {
        V(4);
        d(i);
    }

    @Override // defpackage.eiw
    public final void o(int i, long j) throws IOException {
        V(18);
        f((i << 3) | 1);
        e(j);
    }

    @Override // defpackage.eiw
    public final void p(long j) throws IOException {
        V(8);
        e(j);
    }

    @Override // defpackage.eiw
    public final void q(int i, int i2) throws IOException {
        V(20);
        f(i << 3);
        if (i2 >= 0) {
            f(i2);
        } else {
            g(i2);
        }
    }

    @Override // defpackage.eiw
    public final void r(int i) throws IOException {
        if (i >= 0) {
            z(i);
        } else {
            B(i);
        }
    }

    @Override // defpackage.eiw
    public final void s(eke ekeVar) throws IOException {
        z(ekeVar.h());
        ekeVar.r(this);
    }

    @Override // defpackage.eiw
    public final void t(int i, eke ekeVar) throws IOException {
        z(11);
        y(2, i);
        z(26);
        s(ekeVar);
        z(12);
    }

    @Override // defpackage.eiw
    public final void u(int i, eip eipVar) throws IOException {
        z(11);
        y(2, i);
        k(3, eipVar);
        z(12);
    }

    @Override // defpackage.eiw
    public final void v(int i, String str) throws IOException {
        z((i << 3) | 2);
        w(str);
    }

    @Override // defpackage.eiw
    public final void w(String str) throws IOException {
        int iB;
        try {
            int length = str.length() * 3;
            int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6;
            int i = iNumberOfLeadingZeros + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = elk.a(str, bArr, 0, length);
                z(iA);
                D(bArr, iA);
                return;
            }
            if (i > i2 - this.c) {
                h();
            }
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            int i3 = this.c;
            try {
                try {
                    if (iNumberOfLeadingZeros2 == iNumberOfLeadingZeros) {
                        int i4 = i3 + iNumberOfLeadingZeros2;
                        this.c = i4;
                        int iA2 = elk.a(str, this.a, i4, i2 - i4);
                        this.c = i3;
                        iB = (iA2 - i3) - iNumberOfLeadingZeros2;
                        f(iB);
                        this.c = iA2;
                    } else {
                        iB = elk.b(str);
                        f(iB);
                        this.c = elk.a(str, this.a, this.c, iB);
                    }
                    this.d += iB;
                } catch (eli e) {
                    this.d -= this.c - i3;
                    this.c = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new eiv(e2);
            }
        } catch (eli e3) {
            Q(str, e3);
        }
    }

    @Override // defpackage.eiw
    public final void x(int i, int i2) throws IOException {
        z((i << 3) | i2);
    }

    @Override // defpackage.eiw
    public final void y(int i, int i2) throws IOException {
        V(20);
        f(i << 3);
        f(i2);
    }

    @Override // defpackage.eiw
    public final void z(int i) throws IOException {
        V(5);
        f(i);
    }
}
