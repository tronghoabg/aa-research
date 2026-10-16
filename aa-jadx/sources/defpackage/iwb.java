package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iwb implements defpackage.iwq {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VIDEO");
    public android.media.MediaMuxer b;
    public int c;
    private boolean d = false;
    private final java.lang.String e;

    public iwb(android.content.Context context) throws java.io.IOException {
        android.text.format.Time time = new android.text.format.Time();
        time.setToNow();
        java.lang.String str = time.format("%Y-%m-%d-%H_%M_%S");
        java.io.File fileB = defpackage.ill.b(context);
        if (fileB == null) {
            throw new java.io.IOException("Failed to get directory");
        }
        java.lang.String absolutePath = new java.io.File(fileB, java.lang.String.valueOf(str).concat(".mp4")).getAbsolutePath();
        this.e = absolutePath;
        ((defpackage.yqj) a.l().ai(1428)).y("Saving video to: %s", absolutePath);
        this.b = new android.media.MediaMuxer(absolutePath, 0);
    }

    @Override // defpackage.iwq
    public final synchronized void a() {
        if (this.d) {
            this.b.release();
        }
    }

    @Override // defpackage.iwq
    public final synchronized void b(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        if (!this.d) {
            this.b.start();
            this.d = true;
        }
        this.b.writeSampleData(this.c, byteBuffer, bufferInfo);
    }
}
