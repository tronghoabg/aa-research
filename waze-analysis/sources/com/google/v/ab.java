package com.google.v;

import androidx.work.WorkInfo;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends ae {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12636b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12637c;

    /* renamed from: d, reason: collision with root package name */
    private int f12638d;

    ab(byte[] bArr, int i2, int i3) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i4 = i2 + i3;
        int length = bArr.length;
        if ((i2 | i3 | (length - i4)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        this.f12636b = bArr;
        this.f12638d = i2;
        this.f12637c = i4;
    }

    @Override // com.google.v.q
    public final void a(byte[] bArr, int i2, int i3) throws ac {
        e(bArr, i2, i3);
    }

    @Override // com.google.v.ae
    public final int b() {
        return this.f12637c - this.f12638d;
    }

    @Override // com.google.v.ae
    public final void c() {
    }

    @Override // com.google.v.ae
    public final void d(byte b2) throws ac {
        int i2 = this.f12638d;
        try {
            int i3 = i2 + 1;
            try {
                this.f12636b[i2] = b2;
                this.f12638d = i3;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i2 = i3;
                throw new ac(i2, this.f12637c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void e(byte[] bArr, int i2, int i3) throws ac {
        try {
            System.arraycopy(bArr, i2, this.f12636b, this.f12638d, i3);
            this.f12638d += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new ac(this.f12638d, this.f12637c, i3, e2);
        }
    }

    @Override // com.google.v.ae
    public final void f(int i2, boolean z) throws ac {
        t(i2, 0);
        d(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.v.ae
    public final void g(int i2, v vVar) throws ac {
        t(i2, 2);
        h(vVar);
    }

    @Override // com.google.v.ae
    public final void h(v vVar) throws ac {
        v(vVar.c());
        vVar.j(this);
    }

    @Override // com.google.v.ae
    public final void i(int i2, int i3) throws ac {
        t(i2, 5);
        j(i3);
    }

    @Override // com.google.v.ae
    public final void j(int i2) throws ac {
        int i3 = this.f12638d;
        try {
            byte[] bArr = this.f12636b;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.f12638d = i3 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new ac(i3, this.f12637c, 4, e2);
        }
    }

    @Override // com.google.v.ae
    public final void k(int i2, long j2) throws ac {
        t(i2, 1);
        l(j2);
    }

    @Override // com.google.v.ae
    public final void l(long j2) throws ac {
        int i2 = this.f12638d;
        try {
            byte[] bArr = this.f12636b;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.f12638d = i2 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new ac(i2, this.f12637c, 8, e2);
        }
    }

    @Override // com.google.v.ae
    public final void m(int i2, int i3) throws ac {
        t(i2, 0);
        n(i3);
    }

    @Override // com.google.v.ae
    public final void n(int i2) throws ac {
        if (i2 >= 0) {
            v(i2);
            return;
        }
        int i3 = this.f12638d;
        try {
            byte[] bArr = this.f12636b;
            long j2 = i2;
            int i4 = i3 + 1;
            try {
                bArr[i3] = (byte) (((int) j2) | 128);
                int i5 = i3 + 2;
                try {
                    bArr[i4] = (byte) (((int) (j2 >>> 7)) | 128);
                    int i6 = i3 + 3;
                    bArr[i5] = (byte) (((int) (j2 >>> 14)) | 128);
                    i5 = i3 + 4;
                    bArr[i6] = (byte) (((int) (j2 >>> 21)) | 128);
                    int i7 = i3 + 5;
                    bArr[i5] = (byte) (((int) (j2 >>> 28)) | 128);
                    int i8 = i3 + 6;
                    try {
                        bArr[i7] = -1;
                        int i9 = i3 + 7;
                        bArr[i8] = -1;
                        i8 = i3 + 8;
                        bArr[i9] = -1;
                        i4 = i3 + 9;
                        bArr[i8] = -1;
                        i3 += 10;
                        bArr[i4] = 1;
                        this.f12638d = i3;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i3 = i8;
                        throw new ac(i3, this.f12637c, 10, e);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i3 = i5;
                }
            } catch (IndexOutOfBoundsException e4) {
                i3 = i4;
                e = e4;
            }
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
        }
    }

    @Override // com.google.v.ae
    public final void o(fi fiVar) throws ac {
        v(fiVar.getSerializedSize());
        fiVar.writeTo(this);
    }

    @Override // com.google.v.ae
    public final void p(int i2, fi fiVar) throws ac {
        t(1, 3);
        u(2, i2);
        t(3, 2);
        o(fiVar);
        t(1, 4);
    }

    @Override // com.google.v.ae
    public final void q(int i2, v vVar) throws ac {
        t(1, 3);
        u(2, i2);
        g(3, vVar);
        t(1, 4);
    }

    @Override // com.google.v.ae
    public final void r(int i2, String str) throws ac {
        t(i2, 2);
        s(str);
    }

    @Override // com.google.v.ae
    public final void s(String str) throws ac {
        int i2 = this.f12638d;
        try {
            int iW = W(str.length() * 3);
            int iW2 = W(str.length());
            if (iW2 != iW) {
                v(dc.t(str));
                byte[] bArr = this.f12636b;
                int i3 = this.f12638d;
                this.f12638d = dc.o(str, bArr, i3, bArr.length - i3);
                return;
            }
            int i4 = i2 + iW2;
            this.f12638d = i4;
            byte[] bArr2 = this.f12636b;
            int iO = dc.o(str, bArr2, i4, bArr2.length - i4);
            this.f12638d = i2;
            v((iO - i2) - iW2);
            this.f12638d = iO;
        } catch (IndexOutOfBoundsException e2) {
            throw new ac(e2);
        }
    }

    @Override // com.google.v.ae
    public final void t(int i2, int i3) throws ac {
        v(go.c(i2, i3));
    }

    @Override // com.google.v.ae
    public final void u(int i2, int i3) throws ac {
        t(i2, 0);
        v(i3);
    }

    @Override // com.google.v.ae
    public final void v(int i2) throws ac {
        int i3 = this.f12638d;
        int i4 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        byte[] bArr = this.f12636b;
        try {
            if (i4 == 0) {
                int i5 = i3 + 1;
                bArr[i3] = (byte) i2;
                this.f12638d = i5;
                return;
            }
            int i6 = i3 + 1;
            bArr[i3] = (byte) (i2 | 128);
            int i7 = i2 >>> 7;
            try {
                if ((i7 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                    int i8 = i3 + 2;
                    bArr[i6] = (byte) i7;
                    this.f12638d = i8;
                    return;
                }
                int i9 = i3 + 2;
                try {
                    bArr[i6] = (byte) (i7 | 128);
                    int i10 = i2 >>> 14;
                    if ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                        int i11 = i3 + 3;
                        bArr[i9] = (byte) i10;
                        this.f12638d = i11;
                        return;
                    }
                    int i12 = i3 + 3;
                    try {
                        bArr[i9] = (byte) (i10 | 128);
                        int i13 = i2 >>> 21;
                        if ((i13 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                            int i14 = i3 + 4;
                            bArr[i12] = (byte) i13;
                            this.f12638d = i14;
                        } else {
                            i9 = i3 + 4;
                            bArr[i12] = (byte) (i13 | 128);
                            int i15 = i3 + 5;
                            bArr[i9] = (byte) (i2 >>> 28);
                            this.f12638d = i15;
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i4 = i12;
                        throw new ac(i4, this.f12637c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i4 = i9;
                }
            } catch (IndexOutOfBoundsException e4) {
                i4 = i2;
                e = e4;
            }
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
        }
    }

    @Override // com.google.v.ae
    public final void w(int i2, long j2) throws ac {
        t(i2, 0);
        x(j2);
    }

    @Override // com.google.v.ae
    public final void x(long j2) throws ac {
        long j3 = j2 & (-128);
        int i2 = this.f12638d;
        byte[] bArr = this.f12636b;
        try {
            if (j3 == 0) {
                bArr[i2] = (byte) j2;
                this.f12638d = i2 + 1;
                return;
            }
            bArr[i2] = (byte) (((int) j2) | 128);
            int i3 = i2 + 1;
            long j4 = j2 >>> 7;
            long j5 = j4 & (-128);
            int i4 = (int) j4;
            if (j5 == 0) {
                bArr[i3] = (byte) i4;
                this.f12638d = i2 + 2;
                return;
            }
            bArr[i3] = (byte) (i4 | 128);
            int i5 = i2 + 2;
            long j6 = j2 >>> 14;
            long j7 = j6 & (-128);
            int i6 = (int) j6;
            if (j7 == 0) {
                bArr[i5] = (byte) i6;
                this.f12638d = i2 + 3;
                return;
            }
            bArr[i5] = (byte) (i6 | 128);
            int i7 = i2 + 3;
            long j8 = j2 >>> 21;
            long j9 = j8 & (-128);
            int i8 = (int) j8;
            if (j9 == 0) {
                bArr[i7] = (byte) i8;
                this.f12638d = i2 + 4;
                return;
            }
            bArr[i7] = (byte) (i8 | 128);
            int i9 = i2 + 4;
            long j10 = j2 >>> 28;
            long j11 = j10 & (-128);
            int i10 = (int) j10;
            if (j11 == 0) {
                bArr[i9] = (byte) i10;
                this.f12638d = i2 + 5;
                return;
            }
            bArr[i9] = (byte) (i10 | 128);
            int i11 = i2 + 5;
            long j12 = j2 >>> 35;
            long j13 = j12 & (-128);
            int i12 = (int) j12;
            if (j13 == 0) {
                bArr[i11] = (byte) i12;
                this.f12638d = i2 + 6;
                return;
            }
            bArr[i11] = (byte) (i12 | 128);
            int i13 = i2 + 6;
            long j14 = j2 >>> 42;
            long j15 = j14 & (-128);
            int i14 = (int) j14;
            if (j15 == 0) {
                bArr[i13] = (byte) i14;
                this.f12638d = i2 + 7;
                return;
            }
            bArr[i13] = (byte) (i14 | 128);
            int i15 = i2 + 7;
            long j16 = j2 >>> 49;
            long j17 = j16 & (-128);
            int i16 = (int) j16;
            if (j17 == 0) {
                bArr[i15] = (byte) i16;
                this.f12638d = i2 + 8;
                return;
            }
            bArr[i15] = (byte) (i16 | 128);
            int i17 = i2 + 8;
            long j18 = j2 >>> 56;
            int i18 = (int) j18;
            if (((-128) & j18) == 0) {
                bArr[i17] = (byte) i18;
                this.f12638d = i2 + 9;
            } else {
                bArr[i17] = (byte) (i18 | 128);
                bArr[i2 + 9] = (byte) (j2 >>> 63);
                this.f12638d = i2 + 10;
            }
        } catch (IndexOutOfBoundsException e2) {
            throw new ac(i2, this.f12637c, 1, e2);
        }
    }

    @Override // com.google.v.ae
    public final void y(byte[] bArr, int i2) throws ac {
        v(i2);
        e(bArr, 0, i2);
    }
}
