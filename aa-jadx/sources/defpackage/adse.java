package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adse implements defpackage.aebg {
    public final java.nio.ByteBuffer a;

    public adse(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.aebg
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.aebg
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.aebg
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.aebg
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
