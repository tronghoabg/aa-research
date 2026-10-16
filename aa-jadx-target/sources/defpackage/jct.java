package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jct implements java.lang.Runnable {
    public volatile boolean a = true;
    private final defpackage.jcs b;
    private final java.nio.ByteBuffer c;

    public jct(defpackage.jcs jcsVar, java.nio.ByteBuffer byteBuffer) {
        this.b = jcsVar;
        this.c = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.b.e();
        }
        this.b.g(this.c);
    }
}
