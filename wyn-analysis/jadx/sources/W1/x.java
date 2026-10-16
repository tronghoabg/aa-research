package W1;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes.dex */
public final class x extends O1.e {

    /* renamed from: n, reason: collision with root package name */
    public int f15123n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15124o;

    /* renamed from: p, reason: collision with root package name */
    public int f15125p;

    /* renamed from: q, reason: collision with root package name */
    public long f15126q;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f15128s;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f15131v;

    /* renamed from: r, reason: collision with root package name */
    public int f15127r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f15129t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f15130u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f15121l = PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;

    /* renamed from: i, reason: collision with root package name */
    public final float f15119i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f15122m = 2000000;
    public final int k = 10;

    /* renamed from: j, reason: collision with root package name */
    public final short f15120j = 1024;

    public x() {
        byte[] bArr = Q1.x.f9729f;
        this.f15128s = bArr;
        this.f15131v = bArr;
    }

    @Override // O1.d
    public final void d(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f8812g.hasRemaining()) {
            int i5 = this.f15125p;
            short s10 = this.f15120j;
            if (i5 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f15128s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & ForkServer.ERROR)) > s10) {
                        int i10 = this.f15123n;
                        iPosition = ((iLimit3 / i10) * i10) + i10;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f15125p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException();
                }
                Q1.k.g(this.f15129t < this.f15128s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & ForkServer.ERROR)) > s10) {
                        int i11 = this.f15123n;
                        iLimit = (iPosition2 / i11) * i11;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f15129t;
                int i12 = this.f15130u;
                int length2 = length + i12;
                byte[] bArr = this.f15128s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i12 - (bArr.length - length);
                }
                int i13 = length - length2;
                boolean z2 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i13);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f15128s, length2, iMin);
                int i14 = this.f15130u + iMin;
                this.f15130u = i14;
                Q1.k.g(i14 <= this.f15128s.length);
                boolean z10 = z2 && iPosition3 < i13;
                l(z10);
                if (z10) {
                    this.f15125p = 0;
                    this.f15127r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // O1.e
    public final O1.b f(O1.b bVar) throws O1.c {
        if (bVar.f8804c == 2) {
            return bVar.f8802a == -1 ? O1.b.f8801e : bVar;
        }
        throw new O1.c(bVar);
    }

    @Override // O1.e
    public final void g() {
        if (isActive()) {
            int i5 = this.f8807b.f8803b * 2;
            this.f15123n = i5;
            int i10 = ((((int) ((this.f15121l * r0.f8802a) / 1000000)) / 2) / i5) * i5 * 2;
            if (this.f15128s.length != i10) {
                this.f15128s = new byte[i10];
                this.f15131v = new byte[i10];
            }
        }
        this.f15125p = 0;
        this.f15126q = 0L;
        this.f15127r = 0;
        this.f15129t = 0;
        this.f15130u = 0;
    }

    @Override // O1.e
    public final void h() {
        if (this.f15130u > 0) {
            l(true);
            this.f15127r = 0;
        }
    }

    @Override // O1.e
    public final void i() {
        this.f15124o = false;
        byte[] bArr = Q1.x.f9729f;
        this.f15128s = bArr;
        this.f15131v = bArr;
    }

    @Override // O1.e, O1.d
    public final boolean isActive() {
        return super.isActive() && this.f15124o;
    }

    public final int k(int i5) {
        int length = ((((int) ((this.f15122m * this.f8807b.f8802a) / 1000000)) - this.f15127r) * this.f15123n) - (this.f15128s.length / 2);
        Q1.k.g(length >= 0);
        int iMin = (int) Math.min((i5 * this.f15119i) + 0.5f, length);
        int i10 = this.f15123n;
        return (iMin / i10) * i10;
    }

    public final void l(boolean z2) {
        int length;
        int iK;
        int i5 = this.f15130u;
        byte[] bArr = this.f15128s;
        if (i5 == bArr.length || z2) {
            if (this.f15127r == 0) {
                if (z2) {
                    m(i5, 3);
                    length = i5;
                } else {
                    Q1.k.g(i5 >= bArr.length / 2);
                    length = this.f15128s.length / 2;
                    m(length, 0);
                }
                iK = length;
            } else if (z2) {
                int length2 = i5 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iK2 = k(length2) + (this.f15128s.length / 2);
                m(iK2, 2);
                iK = iK2;
                length = length3;
            } else {
                length = i5 - (bArr.length / 2);
                iK = k(length);
                m(iK, 1);
            }
            Q1.k.f("bytesConsumed is not aligned to frame size: %s" + length, length % this.f15123n == 0);
            Q1.k.g(i5 >= iK);
            this.f15130u -= length;
            int i10 = this.f15129t + length;
            this.f15129t = i10;
            this.f15129t = i10 % this.f15128s.length;
            this.f15127r = (iK / this.f15123n) + this.f15127r;
            this.f15126q += (length - iK) / r2;
        }
    }

    public final void m(int i5, int i10) {
        if (i5 == 0) {
            return;
        }
        Q1.k.c(this.f15130u >= i5);
        if (i10 == 2) {
            int i11 = this.f15129t;
            int i12 = this.f15130u;
            int i13 = i11 + i12;
            byte[] bArr = this.f15128s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i5, this.f15131v, 0, i5);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i5) {
                    System.arraycopy(bArr, length - i5, this.f15131v, 0, i5);
                } else {
                    int i14 = i5 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.f15131v, 0, i14);
                    System.arraycopy(this.f15128s, 0, this.f15131v, i14, length);
                }
            }
        } else {
            int i15 = this.f15129t;
            int i16 = i15 + i5;
            byte[] bArr2 = this.f15128s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.f15131v, 0, i5);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.f15131v, 0, length2);
                System.arraycopy(this.f15128s, 0, this.f15131v, length2, i5 - length2);
            }
        }
        Q1.k.b("sizeToOutput is not aligned to frame size: " + i5, i5 % this.f15123n == 0);
        Q1.k.g(this.f15129t < this.f15128s.length);
        byte[] bArr3 = this.f15131v;
        Q1.k.b("byteOutput size is not aligned to frame size " + i5, i5 % this.f15123n == 0);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i5; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & ForkServer.ERROR);
                int i20 = this.k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i5 - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i5 - 1)) / 1000;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = 127;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = -128;
                } else {
                    bArr3[i17] = (byte) (i21 & 255);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        j(i5).put(bArr3, 0, i5).flip();
    }
}
