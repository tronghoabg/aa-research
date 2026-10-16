package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yts extends defpackage.ytr {
    java.nio.ByteBuffer a;
    final /* synthetic */ defpackage.ytt b;

    public yts(defpackage.ytt yttVar, int i) {
        this.b = yttVar;
        this.a = java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private final void g(int i) {
        if (this.a.remaining() >= i) {
            return;
        }
        int iCapacity = this.a.capacity();
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(java.lang.Math.max(iCapacity + iCapacity, this.a.position() + i)).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.a.flip();
        byteBufferOrder.put(this.a);
        this.a = byteBufferOrder;
    }

    @Override // defpackage.ytr, defpackage.yub
    public final void b(byte[] bArr, int i) {
        g(i);
        this.a.put(bArr, 0, i);
    }

    @Override // defpackage.ytr, defpackage.yub
    public final void c(int i) {
        g(4);
        this.a.putInt(i);
    }

    @Override // defpackage.ytr, defpackage.yub
    public final void d(long j) {
        g(8);
        this.a.putLong(j);
    }

    @Override // defpackage.yub
    public final defpackage.ytz l() {
        return this.b.d(this.a.array(), this.a.position());
    }
}
