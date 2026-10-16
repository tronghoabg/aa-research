package G5;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Q extends y {

    /* renamed from: i, reason: collision with root package name */
    public int f4378i;

    /* renamed from: j, reason: collision with root package name */
    public int f4379j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f4380l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f4381m;

    /* renamed from: n, reason: collision with root package name */
    public int f4382n;

    /* renamed from: o, reason: collision with root package name */
    public long f4383o;

    @Override // G5.y
    public final C0530k a(C0530k c0530k) throws C0531l {
        if (c0530k.f4424c != 2) {
            throw new C0531l(c0530k);
        }
        this.k = true;
        return (this.f4378i == 0 && this.f4379j == 0) ? C0530k.f4421e : c0530k;
    }

    @Override // G5.y, G5.InterfaceC0532m
    public final boolean b() {
        return super.b() && this.f4382n == 0;
    }

    @Override // G5.y, G5.InterfaceC0532m
    public final ByteBuffer c() {
        int i5;
        if (super.b() && (i5 = this.f4382n) > 0) {
            j(i5).put(this.f4381m, 0, this.f4382n).flip();
            this.f4382n = 0;
        }
        return super.c();
    }

    @Override // G5.InterfaceC0532m
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        if (i5 == 0) {
            return;
        }
        int iMin = Math.min(i5, this.f4380l);
        this.f4383o += iMin / this.f4485b.f4425d;
        this.f4380l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f4380l > 0) {
            return;
        }
        int i10 = i5 - iMin;
        int length = (this.f4382n + i10) - this.f4381m.length;
        ByteBuffer byteBufferJ = j(length);
        int iH = u6.v.h(length, 0, this.f4382n);
        byteBufferJ.put(this.f4381m, 0, iH);
        int iH2 = u6.v.h(length - iH, 0, i10);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i11 = i10 - iH2;
        int i12 = this.f4382n - iH;
        this.f4382n = i12;
        byte[] bArr = this.f4381m;
        System.arraycopy(bArr, iH, bArr, 0, i12);
        byteBuffer.get(this.f4381m, this.f4382n, i11);
        this.f4382n += i11;
        byteBufferJ.flip();
    }

    @Override // G5.y
    public final void g() {
        if (this.k) {
            this.k = false;
            int i5 = this.f4379j;
            int i10 = this.f4485b.f4425d;
            this.f4381m = new byte[i5 * i10];
            this.f4380l = this.f4378i * i10;
        }
        this.f4382n = 0;
    }

    @Override // G5.y
    public final void h() {
        if (this.k) {
            if (this.f4382n > 0) {
                this.f4383o += r0 / this.f4485b.f4425d;
            }
            this.f4382n = 0;
        }
    }

    @Override // G5.y
    public final void i() {
        this.f4381m = u6.v.f46726f;
    }
}
