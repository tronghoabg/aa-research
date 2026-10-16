package com.google.v;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends ae {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12639b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12640c;

    /* renamed from: d, reason: collision with root package name */
    private int f12641d;

    /* renamed from: e, reason: collision with root package name */
    private int f12642e;

    /* renamed from: f, reason: collision with root package name */
    private final OutputStream f12643f;

    ad(OutputStream outputStream, int i2) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f12643f = outputStream;
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.f12639b = bArr;
        this.f12640c = bArr.length;
    }

    private final void au() throws IOException {
        this.f12643f.write(this.f12639b, 0, this.f12641d);
        this.f12641d = 0;
    }

    private final void av(int i2) throws IOException {
        if (this.f12640c - this.f12641d < i2) {
            au();
        }
    }

    final void A(long j2) {
        int i2 = this.f12641d;
        byte[] bArr = this.f12639b;
        bArr[i2] = (byte) j2;
        bArr[i2 + 1] = (byte) (j2 >> 8);
        bArr[i2 + 2] = (byte) (j2 >> 16);
        bArr[i2 + 3] = (byte) (j2 >> 24);
        bArr[i2 + 4] = (byte) (j2 >> 32);
        bArr[i2 + 5] = (byte) (j2 >> 40);
        bArr[i2 + 6] = (byte) (j2 >> 48);
        bArr[i2 + 7] = (byte) (j2 >> 56);
        this.f12641d = i2 + 8;
        this.f12642e += 8;
    }

    final void B(int i2, int i3) {
        C(go.c(i2, i3));
    }

    final void C(int i2) {
        int i3 = this.f12641d;
        int i4 = i3 + 1;
        int i5 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i6 = this.f12642e;
        byte[] bArr = this.f12639b;
        if (i5 == 0) {
            bArr[i3] = (byte) i2;
            this.f12641d = i4;
            this.f12642e = i6 + 1;
            return;
        }
        int i7 = i3 + 2;
        bArr[i3] = (byte) (i2 | 128);
        int i8 = i2 >>> 7;
        if ((i8 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            bArr[i4] = (byte) i8;
            this.f12641d = i7;
            this.f12642e = i6 + 2;
            return;
        }
        int i9 = i3 + 3;
        bArr[i4] = (byte) (i8 | 128);
        int i10 = i2 >>> 14;
        if ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            bArr[i7] = (byte) i10;
            this.f12641d = i9;
            this.f12642e = i6 + 3;
            return;
        }
        int i11 = i3 + 4;
        bArr[i7] = (byte) (i10 | 128);
        int i12 = i2 >>> 21;
        if ((i12 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            bArr[i9] = (byte) i12;
            this.f12641d = i11;
            this.f12642e = i6 + 4;
        } else {
            bArr[i9] = (byte) (i12 | 128);
            bArr[i11] = (byte) (i2 >>> 28);
            this.f12641d = i3 + 5;
            this.f12642e = i6 + 5;
        }
    }

    final void D(long j2) {
        int i2 = this.f12641d;
        int i3 = i2 + 1;
        long j3 = j2 & (-128);
        int i4 = (int) j2;
        int i5 = this.f12642e;
        byte[] bArr = this.f12639b;
        if (j3 == 0) {
            bArr[i2] = (byte) i4;
            this.f12641d = i3;
            this.f12642e = i5 + 1;
            return;
        }
        int i6 = i2 + 2;
        bArr[i2] = (byte) (i4 | 128);
        long j4 = j2 >>> 7;
        long j5 = j4 & (-128);
        int i7 = (int) j4;
        if (j5 == 0) {
            bArr[i3] = (byte) i7;
            this.f12641d = i6;
            this.f12642e = i5 + 2;
            return;
        }
        int i8 = i2 + 3;
        bArr[i3] = (byte) (i7 | 128);
        long j6 = j2 >>> 14;
        long j7 = j6 & (-128);
        int i9 = (int) j6;
        if (j7 == 0) {
            bArr[i6] = (byte) i9;
            this.f12641d = i8;
            this.f12642e = i5 + 3;
            return;
        }
        int i10 = i2 + 4;
        bArr[i6] = (byte) (i9 | 128);
        long j8 = j2 >>> 21;
        long j9 = j8 & (-128);
        int i11 = (int) j8;
        if (j9 == 0) {
            bArr[i8] = (byte) i11;
            this.f12641d = i10;
            this.f12642e = i5 + 4;
            return;
        }
        int i12 = i2 + 5;
        bArr[i8] = (byte) (i11 | 128);
        long j10 = j2 >>> 28;
        int i13 = (int) j10;
        if ((j10 & (-128)) == 0) {
            bArr[i10] = (byte) i13;
            this.f12641d = i12;
            this.f12642e = i5 + 5;
            return;
        }
        int i14 = i2 + 6;
        bArr[i10] = (byte) (i13 | 128);
        long j11 = j2 >>> 35;
        int i15 = (int) j11;
        if ((j11 & (-128)) == 0) {
            bArr[i12] = (byte) i15;
            this.f12641d = i14;
            this.f12642e = i5 + 6;
            return;
        }
        int i16 = i2 + 7;
        bArr[i12] = (byte) (i15 | 128);
        long j12 = j2 >>> 42;
        long j13 = j12 & (-128);
        int i17 = (int) j12;
        if (j13 == 0) {
            bArr[i14] = (byte) i17;
            this.f12641d = i16;
            this.f12642e = i5 + 7;
            return;
        }
        int i18 = i2 + 8;
        bArr[i14] = (byte) (i17 | 128);
        long j14 = j2 >>> 49;
        long j15 = j14 & (-128);
        int i19 = (int) j14;
        if (j15 == 0) {
            bArr[i16] = (byte) i19;
            this.f12641d = i18;
            this.f12642e = i5 + 8;
            return;
        }
        int i20 = i2 + 9;
        bArr[i16] = (byte) (i19 | 128);
        long j16 = j2 >>> 56;
        long j17 = j16 & (-128);
        int i21 = (int) j16;
        if (j17 == 0) {
            bArr[i18] = (byte) i21;
            this.f12641d = i20;
            this.f12642e = i5 + 9;
        } else {
            bArr[i18] = (byte) (i21 | 128);
            bArr[i20] = (byte) (j2 >>> 63);
            this.f12641d = i2 + 10;
            this.f12642e = i5 + 10;
        }
    }

    public final void E(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f12640c;
        int i5 = this.f12641d;
        int i6 = i4 - i5;
        byte[] bArr2 = this.f12639b;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i5, i3);
            this.f12641d += i3;
            this.f12642e += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i5, i6);
        int i7 = i2 + i6;
        this.f12641d = i4;
        this.f12642e += i6;
        au();
        int i8 = i3 - i6;
        if (i8 <= i4) {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f12641d = i8;
        } else {
            this.f12643f.write(bArr, i7, i8);
        }
        this.f12642e += i8;
    }

    @Override // com.google.v.q
    public final void a(byte[] bArr, int i2, int i3) throws IOException {
        E(bArr, i2, i3);
    }

    @Override // com.google.v.ae
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.v.ae
    public final void c() throws IOException {
        if (this.f12641d > 0) {
            au();
        }
    }

    @Override // com.google.v.ae
    public final void d(byte b2) throws IOException {
        if (this.f12641d == this.f12640c) {
            au();
        }
        e(b2);
    }

    final void e(byte b2) {
        byte[] bArr = this.f12639b;
        int i2 = this.f12641d;
        bArr[i2] = b2;
        this.f12641d = i2 + 1;
        this.f12642e++;
    }

    @Override // com.google.v.ae
    public final void f(int i2, boolean z) throws IOException {
        av(11);
        B(i2, 0);
        e(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.v.ae
    public final void g(int i2, v vVar) throws IOException {
        t(i2, 2);
        h(vVar);
    }

    @Override // com.google.v.ae
    public final void h(v vVar) throws IOException {
        v(vVar.c());
        vVar.j(this);
    }

    @Override // com.google.v.ae
    public final void i(int i2, int i3) throws IOException {
        av(14);
        B(i2, 5);
        z(i3);
    }

    @Override // com.google.v.ae
    public final void j(int i2) throws IOException {
        av(4);
        z(i2);
    }

    @Override // com.google.v.ae
    public final void k(int i2, long j2) throws IOException {
        av(18);
        B(i2, 1);
        A(j2);
    }

    @Override // com.google.v.ae
    public final void l(long j2) throws IOException {
        av(8);
        A(j2);
    }

    @Override // com.google.v.ae
    public final void m(int i2, int i3) throws IOException {
        av(20);
        B(i2, 0);
        if (i3 >= 0) {
            C(i3);
        } else {
            D(i3);
        }
    }

    @Override // com.google.v.ae
    public final void n(int i2) throws IOException {
        if (i2 >= 0) {
            v(i2);
        } else {
            x(i2);
        }
    }

    @Override // com.google.v.ae
    public final void o(fi fiVar) throws IOException {
        v(fiVar.getSerializedSize());
        fiVar.writeTo(this);
    }

    @Override // com.google.v.ae
    public final void p(int i2, fi fiVar) throws IOException {
        t(1, 3);
        u(2, i2);
        t(3, 2);
        o(fiVar);
        t(1, 4);
    }

    @Override // com.google.v.ae
    public final void q(int i2, v vVar) throws IOException {
        t(1, 3);
        u(2, i2);
        g(3, vVar);
        t(1, 4);
    }

    @Override // com.google.v.ae
    public final void r(int i2, String str) throws gl, IOException {
        t(i2, 2);
        s(str);
    }

    @Override // com.google.v.ae
    public final void s(String str) throws gl, IOException {
        int iT;
        int length = str.length() * 3;
        int iW = W(length);
        int i2 = iW + length;
        int i3 = this.f12640c;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iO = dc.o(str, bArr, 0, length);
            v(iO);
            E(bArr, 0, iO);
            return;
        }
        if (i2 > i3 - this.f12641d) {
            au();
        }
        int iW2 = W(str.length());
        int i4 = this.f12641d;
        try {
            if (iW2 == iW) {
                int i5 = i4 + iW2;
                this.f12641d = i5;
                int iO2 = dc.o(str, this.f12639b, i5, i3 - i5);
                this.f12641d = i4;
                iT = (iO2 - i4) - iW2;
                C(iT);
                this.f12641d = iO2;
            } else {
                iT = dc.t(str);
                C(iT);
                this.f12641d = dc.o(str, this.f12639b, this.f12641d, iT);
            }
            this.f12642e += iT;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ac(e2);
        }
    }

    @Override // com.google.v.ae
    public final void t(int i2, int i3) throws IOException {
        v(go.c(i2, i3));
    }

    @Override // com.google.v.ae
    public final void u(int i2, int i3) throws IOException {
        av(20);
        B(i2, 0);
        C(i3);
    }

    @Override // com.google.v.ae
    public final void v(int i2) throws IOException {
        av(5);
        C(i2);
    }

    @Override // com.google.v.ae
    public final void w(int i2, long j2) throws IOException {
        av(20);
        B(i2, 0);
        D(j2);
    }

    @Override // com.google.v.ae
    public final void x(long j2) throws IOException {
        av(10);
        D(j2);
    }

    @Override // com.google.v.ae
    public final void y(byte[] bArr, int i2) throws IOException {
        v(i2);
        E(bArr, 0, i2);
    }

    final void z(int i2) {
        int i3 = this.f12641d;
        byte[] bArr = this.f12639b;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
        this.f12641d = i3 + 4;
        this.f12642e += 4;
    }
}
