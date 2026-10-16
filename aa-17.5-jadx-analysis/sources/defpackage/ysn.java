package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
final class ysn extends ysm {
    ByteBuffer a;
    final /* synthetic */ yso b;

    public ysn(yso ysoVar, int i) {
        this.b = ysoVar;
        this.a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void g(int i) {
        if (this.a.remaining() >= i) {
            return;
        }
        int iCapacity = this.a.capacity();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(Math.max(iCapacity + iCapacity, this.a.position() + i)).order(ByteOrder.LITTLE_ENDIAN);
        this.a.flip();
        byteBufferOrder.put(this.a);
        this.a = byteBufferOrder;
    }

    @Override // defpackage.ysm, defpackage.ysw
    public final void b(byte[] bArr, int i) {
        g(i);
        this.a.put(bArr, 0, i);
    }

    @Override // defpackage.ysm, defpackage.ysw
    public final void c(int i) {
        g(4);
        this.a.putInt(i);
    }

    @Override // defpackage.ysm, defpackage.ysw
    public final void d(long j) {
        g(8);
        this.a.putLong(j);
    }

    @Override // defpackage.ysw
    public final ysu l() {
        return this.b.d(this.a.array(), this.a.position());
    }
}
