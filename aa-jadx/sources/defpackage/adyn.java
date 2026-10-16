package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adyn extends defpackage.adsj {
    final java.nio.ByteBuffer a;

    public adyn(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final boolean d() {
        return true;
    }

    @Override // defpackage.adyk
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.adyk
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.adyk
    public final /* bridge */ /* synthetic */ defpackage.adyk g(int i) {
        a(i);
        java.nio.ByteBuffer byteBuffer = this.a;
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new defpackage.adyn(byteBufferDuplicate);
    }

    @Override // defpackage.adyk
    public final void i(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        a(i);
        java.nio.ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.adyk
    public final void j(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.adyk
    public final void k(int i) {
        a(i);
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
