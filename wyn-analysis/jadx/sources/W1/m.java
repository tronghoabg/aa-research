package W1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m extends O1.e {

    /* renamed from: i, reason: collision with root package name */
    public int[] f15013i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f15014j;

    @Override // O1.d
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.f15014j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f8807b.f8805d) * this.f8808c.f8805d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i5 * 2) + iPosition));
            }
            iPosition += this.f8807b.f8805d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // O1.e
    public final O1.b f(O1.b bVar) throws O1.c {
        int[] iArr = this.f15013i;
        if (iArr == null) {
            return O1.b.f8801e;
        }
        if (bVar.f8804c != 2) {
            throw new O1.c(bVar);
        }
        int length = iArr.length;
        int i5 = bVar.f8803b;
        boolean z2 = i5 != length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= i5) {
                throw new O1.c(bVar);
            }
            z2 |= i11 != i10;
            i10++;
        }
        return z2 ? new O1.b(bVar.f8802a, iArr.length, 2) : O1.b.f8801e;
    }

    @Override // O1.e
    public final void g() {
        this.f15014j = this.f15013i;
    }

    @Override // O1.e
    public final void i() {
        this.f15014j = null;
        this.f15013i = null;
    }
}
