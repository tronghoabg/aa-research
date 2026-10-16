package W1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z extends O1.e {

    /* renamed from: i, reason: collision with root package name */
    public int f15133i;

    /* renamed from: j, reason: collision with root package name */
    public int f15134j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f15135l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f15136m;

    /* renamed from: n, reason: collision with root package name */
    public int f15137n;

    /* renamed from: o, reason: collision with root package name */
    public long f15138o;

    @Override // O1.e, O1.d
    public final boolean b() {
        return super.b() && this.f15137n == 0;
    }

    @Override // O1.e, O1.d
    public final ByteBuffer c() {
        int i5;
        if (super.b() && (i5 = this.f15137n) > 0) {
            j(i5).put(this.f15136m, 0, this.f15137n).flip();
            this.f15137n = 0;
        }
        return super.c();
    }

    @Override // O1.d
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        if (i5 == 0) {
            return;
        }
        int iMin = Math.min(i5, this.f15135l);
        this.f15138o += iMin / this.f8807b.f8805d;
        this.f15135l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f15135l > 0) {
            return;
        }
        int i10 = i5 - iMin;
        int length = (this.f15137n + i10) - this.f15136m.length;
        ByteBuffer byteBufferJ = j(length);
        int i11 = Q1.x.i(length, 0, this.f15137n);
        byteBufferJ.put(this.f15136m, 0, i11);
        int i12 = Q1.x.i(length - i11, 0, i10);
        byteBuffer.limit(byteBuffer.position() + i12);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i10 - i12;
        int i14 = this.f15137n - i11;
        this.f15137n = i14;
        byte[] bArr = this.f15136m;
        System.arraycopy(bArr, i11, bArr, 0, i14);
        byteBuffer.get(this.f15136m, this.f15137n, i13);
        this.f15137n += i13;
        byteBufferJ.flip();
    }

    @Override // O1.e
    public final O1.b f(O1.b bVar) throws O1.c {
        if (bVar.f8804c != 2) {
            throw new O1.c(bVar);
        }
        this.k = true;
        return (this.f15133i == 0 && this.f15134j == 0) ? O1.b.f8801e : bVar;
    }

    @Override // O1.e
    public final void g() {
        if (this.k) {
            this.k = false;
            int i5 = this.f15134j;
            int i10 = this.f8807b.f8805d;
            this.f15136m = new byte[i5 * i10];
            this.f15135l = this.f15133i * i10;
        }
        this.f15137n = 0;
    }

    @Override // O1.e
    public final void h() {
        if (this.k) {
            if (this.f15137n > 0) {
                this.f15138o += r0 / this.f8807b.f8805d;
            }
            this.f15137n = 0;
        }
    }

    @Override // O1.e
    public final void i() {
        this.f15136m = Q1.x.f9729f;
    }
}
