package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iqw implements defpackage.jdo {
    private final /* synthetic */ int a;

    @Override // defpackage.jdo
    public final java.nio.ByteBuffer a(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            return i2 != 1 ? java.nio.ByteBuffer.allocate(i) : java.nio.ByteBuffer.allocate(i);
        }
        return java.nio.ByteBuffer.allocate(i);
    }
}
