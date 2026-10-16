package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ytu extends defpackage.ytr {
    public final java.nio.ByteBuffer a = java.nio.ByteBuffer.allocate(23).order(java.nio.ByteOrder.LITTLE_ENDIAN);

    protected ytu() {
    }

    private final void k() {
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            i(byteBuffer);
        }
        byteBuffer.compact();
    }

    @Override // defpackage.ytr, defpackage.yub
    public final void b(byte[] bArr, int i) {
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr, 0, i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        java.nio.ByteBuffer byteBuffer = this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            h();
            return;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        k();
        while (byteBufferOrder.remaining() >= 16) {
            i(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
    }

    protected abstract defpackage.ytz g();

    public final void h() {
        if (this.a.remaining() < 8) {
            k();
        }
    }

    protected abstract void i(java.nio.ByteBuffer byteBuffer);

    protected void j(java.nio.ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.yub
    public final defpackage.ytz l() {
        k();
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            j(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return g();
    }
}
