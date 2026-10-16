package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sbk implements java.io.Closeable {
    private final /* synthetic */ int a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i == 0) {
            defpackage.yqk yqkVar = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
        } else if (i == 2 && defpackage.vbl.a()) {
            android.opengl.GLES32.glPopDebugGroup();
        }
    }

    public sbk(byte[] bArr, int i) {
        this.a = i;
    }
}
