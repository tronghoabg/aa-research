package defpackage;

import android.media.MediaCodec;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class iwk {
    public final yph c;
    public volatile boolean e;
    public iwg g;
    public MediaCodec j;
    protected iwi k;
    public volatile boolean f = false;
    public volatile boolean h = false;
    public volatile boolean i = false;
    protected final iwf d = d();

    protected iwk(String str, iwi iwiVar) {
        this.c = new yph(yqn.d("CAR.MEDIA.".concat(String.valueOf(str))));
        this.k = iwiVar;
    }

    protected int a() {
        return 20;
    }

    public abstract int b();

    public abstract MediaCodec c() throws IOException;

    protected iwf d() {
        return new iwj(this);
    }

    protected abstract String e();

    public abstract void g(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer);

    public abstract void h();

    public abstract void i();

    public synchronized void t() {
        ((ype) this.c.l().ai(1468)).u("stopEncoding");
        this.i = true;
        this.d.a();
        MediaCodec mediaCodec = this.j;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            this.j.release();
            this.j = null;
        }
        iwi iwiVar = this.k;
        if (iwiVar != null) {
            iwiVar.a();
            this.k = null;
        }
    }

    public final synchronized boolean u(iwg iwgVar) {
        return v(iwgVar, false);
    }

    public final synchronized boolean v(iwg iwgVar, boolean z) {
        this.f = false;
        this.g = iwgVar;
        this.e = z;
        this.h = true;
        this.i = false;
        return this.d.b();
    }

    public void f(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
    }
}
