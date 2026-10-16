package G5;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class z extends y {

    /* renamed from: i, reason: collision with root package name */
    public int[] f4492i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4493j;

    @Override // G5.y
    public final C0530k a(C0530k c0530k) throws C0531l {
        int[] iArr = this.f4492i;
        if (iArr == null) {
            return C0530k.f4421e;
        }
        if (c0530k.f4424c != 2) {
            throw new C0531l(c0530k);
        }
        int length = iArr.length;
        int i5 = c0530k.f4423b;
        boolean z2 = i5 != length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= i5) {
                throw new C0531l(c0530k);
            }
            z2 |= i11 != i10;
            i10++;
        }
        return z2 ? new C0530k(c0530k.f4422a, iArr.length, 2) : C0530k.f4421e;
    }

    @Override // G5.InterfaceC0532m
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.f4493j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f4485b.f4425d) * this.f4486c.f4425d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i5 * 2) + iPosition));
            }
            iPosition += this.f4485b.f4425d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // G5.y
    public final void g() {
        this.f4493j = this.f4492i;
    }

    @Override // G5.y
    public final void i() {
        this.f4493j = null;
        this.f4492i = null;
    }
}
