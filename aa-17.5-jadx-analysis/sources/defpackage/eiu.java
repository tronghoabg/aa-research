package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
final class eiu extends eiw {
    private final byte[] a;
    private final int b;
    private int c;

    public eiu(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.a = bArr;
        this.c = 0;
        this.b = i;
    }

    @Override // defpackage.eiw
    public final void A(int i, long j) throws IOException {
        z(i << 3);
        B(j);
    }

    @Override // defpackage.eiw
    public final void B(long j) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        int i2 = this.c;
        if (!eiw.e || b() < 10) {
            while (true) {
                long j2 = j & (-128);
                bArr = this.a;
                if (j2 == 0) {
                    break;
                }
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new eiv(i, this.b, 1, e);
                }
                throw new eiv(i, this.b, 1, e);
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while (true) {
                long j3 = j & (-128);
                bArr2 = this.a;
                if (j3 == 0) {
                    break;
                }
                elf.k(bArr2, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            elf.k(bArr2, i2, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.eiw
    public final void C(byte[] bArr, int i) throws IOException {
        z(i);
        c(bArr, i);
    }

    @Override // defpackage.eiw, defpackage.eii
    public final void a(byte[] bArr, int i) throws IOException {
        c(bArr, i);
    }

    @Override // defpackage.eiw
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.a, this.c, i);
            this.c += i;
        } catch (IndexOutOfBoundsException e) {
            throw new eiv(this.c, this.b, i, e);
        }
    }

    @Override // defpackage.eiw
    public final void i(byte b) throws IOException {
        int i = this.c;
        try {
            int i2 = i + 1;
            try {
                this.a[i] = b;
                this.c = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new eiv(i, this.b, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.eiw
    public final void j(int i, boolean z) throws IOException {
        z(i << 3);
        i(z ? (byte) 1 : (byte) 0);
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
        z((i << 3) | 5);
        n(i2);
    }

    @Override // defpackage.eiw
    public final void n(int i) throws IOException {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new eiv(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.eiw
    public final void o(int i, long j) throws IOException {
        z((i << 3) | 1);
        p(j);
    }

    @Override // defpackage.eiw
    public final void p(long j) throws IOException {
        int i = this.c;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new eiv(i, this.b, 8, e);
        }
    }

    @Override // defpackage.eiw
    public final void q(int i, int i2) throws IOException {
        z(i << 3);
        r(i2);
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
        int i = this.c;
        try {
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != ((352 - iNumberOfLeadingZeros) >>> 6)) {
                z(elk.b(str));
                this.c = elk.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + iNumberOfLeadingZeros2;
            this.c = i2;
            int iA = elk.a(str, this.a, i2, b());
            this.c = i;
            z((iA - i) - iNumberOfLeadingZeros2);
            this.c = iA;
        } catch (eli e) {
            this.c = i;
            Q(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new eiv(e2);
        }
    }

    @Override // defpackage.eiw
    public final void x(int i, int i2) throws IOException {
        z((i << 3) | i2);
    }

    @Override // defpackage.eiw
    public final void y(int i, int i2) throws IOException {
        z(i << 3);
        z(i2);
    }

    @Override // defpackage.eiw
    public final void z(int i) throws IOException {
        int i2;
        int i3 = this.c;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.a;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.c = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new eiv(i2, this.b, 1, e);
                }
            }
            throw new eiv(i2, this.b, 1, e);
        }
    }
}
