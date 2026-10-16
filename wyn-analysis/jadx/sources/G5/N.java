package G5;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class N extends y {

    /* renamed from: i, reason: collision with root package name */
    public final long f4332i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f4333j = 20000;
    public final short k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f4334l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4335m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f4336n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f4337o;

    /* renamed from: p, reason: collision with root package name */
    public int f4338p;

    /* renamed from: q, reason: collision with root package name */
    public int f4339q;

    /* renamed from: r, reason: collision with root package name */
    public int f4340r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4341s;

    /* renamed from: t, reason: collision with root package name */
    public long f4342t;

    public N() {
        byte[] bArr = u6.v.f46726f;
        this.f4336n = bArr;
        this.f4337o = bArr;
    }

    @Override // G5.y
    public final C0530k a(C0530k c0530k) throws C0531l {
        if (c0530k.f4424c == 2) {
            return this.f4335m ? c0530k : C0530k.f4421e;
        }
        throw new C0531l(c0530k);
    }

    @Override // G5.InterfaceC0532m
    public final void d(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f4490g.hasRemaining()) {
            int i5 = this.f4338p;
            if (i5 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f4336n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i10 = this.f4334l;
                            iPosition = ((iLimit2 / i10) * i10) + i10;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f4338p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f4341s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i5 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iK = k(byteBuffer);
                int iPosition2 = iK - byteBuffer.position();
                byte[] bArr = this.f4336n;
                int length = bArr.length;
                int i11 = this.f4339q;
                int i12 = length - i11;
                if (iK >= iLimit3 || iPosition2 >= i12) {
                    int iMin = Math.min(iPosition2, i12);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f4336n, this.f4339q, iMin);
                    int i13 = this.f4339q + iMin;
                    this.f4339q = i13;
                    byte[] bArr2 = this.f4336n;
                    if (i13 == bArr2.length) {
                        if (this.f4341s) {
                            l(this.f4340r, bArr2);
                            this.f4342t += (this.f4339q - (this.f4340r * 2)) / this.f4334l;
                        } else {
                            this.f4342t += (i13 - this.f4340r) / this.f4334l;
                        }
                        m(this.f4339q, byteBuffer, this.f4336n);
                        this.f4339q = 0;
                        this.f4338p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    l(i11, bArr);
                    this.f4339q = 0;
                    this.f4338p = 0;
                }
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iK2 = k(byteBuffer);
                byteBuffer.limit(iK2);
                this.f4342t += byteBuffer.remaining() / this.f4334l;
                m(this.f4340r, byteBuffer, this.f4337o);
                if (iK2 < iLimit4) {
                    l(this.f4340r, this.f4337o);
                    this.f4338p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // G5.y
    public final void g() {
        if (this.f4335m) {
            C0530k c0530k = this.f4485b;
            int i5 = c0530k.f4425d;
            this.f4334l = i5;
            int i10 = c0530k.f4422a;
            int i11 = ((int) ((this.f4332i * i10) / 1000000)) * i5;
            if (this.f4336n.length != i11) {
                this.f4336n = new byte[i11];
            }
            int i12 = ((int) ((this.f4333j * i10) / 1000000)) * i5;
            this.f4340r = i12;
            if (this.f4337o.length != i12) {
                this.f4337o = new byte[i12];
            }
        }
        this.f4338p = 0;
        this.f4342t = 0L;
        this.f4339q = 0;
        this.f4341s = false;
    }

    @Override // G5.y
    public final void h() {
        int i5 = this.f4339q;
        if (i5 > 0) {
            l(i5, this.f4336n);
        }
        if (this.f4341s) {
            return;
        }
        this.f4342t += this.f4340r / this.f4334l;
    }

    @Override // G5.y
    public final void i() {
        this.f4335m = false;
        this.f4340r = 0;
        byte[] bArr = u6.v.f46726f;
        this.f4336n = bArr;
        this.f4337o = bArr;
    }

    @Override // G5.y, G5.InterfaceC0532m
    public final boolean isActive() {
        return this.f4335m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i5 = this.f4334l;
                return (iPosition / i5) * i5;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i5, byte[] bArr) {
        j(i5).put(bArr, 0, i5).flip();
        if (i5 > 0) {
            this.f4341s = true;
        }
    }

    public final void m(int i5, ByteBuffer byteBuffer, byte[] bArr) {
        int iMin = Math.min(byteBuffer.remaining(), this.f4340r);
        int i10 = this.f4340r - iMin;
        System.arraycopy(bArr, i5 - i10, this.f4337o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f4337o, i10, iMin);
    }
}
