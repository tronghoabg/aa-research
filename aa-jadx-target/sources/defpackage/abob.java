package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abob {
    public final int a;
    public final java.lang.Object b;

    public abob(java.nio.ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        this.a = byteBuffer.position();
    }

    public abob(java.lang.String str, int i) {
        this.b = str;
        this.a = i;
    }

    public abob(int i, defpackage.bal balVar) {
        this.a = i;
        this.b = balVar;
    }
}
