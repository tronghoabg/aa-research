package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hys implements defpackage.hyq {
    private final /* synthetic */ int a;

    public hys(int i) {
        this.a = i;
    }

    @Override // defpackage.hyq
    public final java.lang.Class a() {
        return this.a != 0 ? java.nio.ByteBuffer.class : java.io.InputStream.class;
    }

    @Override // defpackage.hyq
    public final /* synthetic */ java.lang.Object b(byte[] bArr) {
        return this.a != 0 ? java.nio.ByteBuffer.wrap(bArr) : new java.io.ByteArrayInputStream(bArr);
    }
}
