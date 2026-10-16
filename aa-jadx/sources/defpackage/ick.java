package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ick implements defpackage.hvh {
    private final java.nio.ByteBuffer a;

    public ick(java.nio.ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.hvh
    public final /* bridge */ /* synthetic */ java.lang.Object a() throws java.io.IOException {
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.hvh
    public final void b() {
    }
}
