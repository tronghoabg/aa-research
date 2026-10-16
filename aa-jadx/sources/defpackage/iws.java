package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class iws {
    public final defpackage.yqm c;
    public volatile boolean e;
    public defpackage.iwo g;
    public android.media.MediaCodec j;
    protected defpackage.iwq k;
    public volatile boolean f = false;
    public volatile boolean h = false;
    public volatile boolean i = false;
    protected final defpackage.iwn d = d();

    protected iws(java.lang.String str, defpackage.iwq iwqVar) {
        this.c = new defpackage.yqm(defpackage.yrs.d("CAR.MEDIA.".concat(java.lang.String.valueOf(str))));
        this.k = iwqVar;
    }

    protected int a() {
        return 20;
    }

    public abstract int b();

    public abstract android.media.MediaCodec c() throws java.io.IOException;

    protected defpackage.iwn d() {
        return new defpackage.iwr(this);
    }

    protected abstract java.lang.String e();

    public abstract void g(android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer);

    public abstract void h();

    public abstract void i();

    public synchronized void t() {
        ((defpackage.yqj) this.c.l().ai(1468)).u("stopEncoding");
        this.i = true;
        this.d.a();
        android.media.MediaCodec mediaCodec = this.j;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (java.lang.IllegalStateException unused) {
            }
            this.j.release();
            this.j = null;
        }
        defpackage.iwq iwqVar = this.k;
        if (iwqVar != null) {
            iwqVar.a();
            this.k = null;
        }
    }

    public final synchronized boolean u(defpackage.iwo iwoVar) {
        return v(iwoVar, false);
    }

    public final synchronized boolean v(defpackage.iwo iwoVar, boolean z) {
        this.f = false;
        this.g = iwoVar;
        this.e = z;
        this.h = true;
        this.i = false;
        return this.d.b();
    }

    public void f(android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
    }
}
