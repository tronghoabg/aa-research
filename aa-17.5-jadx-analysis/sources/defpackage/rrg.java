package defpackage;

import android.media.MediaCodec;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class rrg {
    public static final ypf f = ols.R("CAR.MEDIA");
    private Thread b;
    public erb i;
    public ykd j;
    private volatile boolean a = false;
    protected volatile boolean g = false;
    public volatile boolean h = false;

    protected rrg() {
    }

    protected abstract String a();

    protected abstract void b();

    protected abstract void c();

    protected abstract erb d() throws IOException;

    public final synchronized void e() {
        f.l().ai(8217).u("stopEncoding");
        this.h = true;
        Thread thread = this.b;
        if (thread != null) {
            try {
                thread.join(3000L);
            } catch (InterruptedException unused) {
            }
            if (this.b.isAlive()) {
                f.h().ai(8218).u("Encoding thread did not quit!");
                this.a = true;
            }
            this.b = null;
        }
        erb erbVar = this.i;
        if (erbVar != null) {
            try {
                ((MediaCodec) erbVar.a).stop();
            } catch (IllegalStateException unused2) {
            }
            ((MediaCodec) this.i.a).release();
            this.i = null;
        }
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void f(ykd ykdVar) {
        int i = 0;
        this.a = false;
        this.j = ykdVar;
        this.g = true;
        this.h = false;
        Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new rrf(this, semaphore), a());
        this.b = thread;
        thread.start();
        try {
            ypf ypfVar = f;
            ypfVar.l().ai(8213).u("wait for encoder init");
            boolean z = false;
            while (true) {
                i++;
                if (i > 20 || z) {
                    break;
                }
                if (semaphore.tryAcquire(500L, TimeUnit.MILLISECONDS)) {
                    z = true;
                } else if (!this.b.isAlive()) {
                    break;
                }
            }
            if (z) {
                ypfVar.l().ai(8214).u("encoder init done");
            } else {
                ypfVar.h().ai(8216).E("failed to start encoding %d %b", i, this.b.isAlive());
            }
        } catch (InterruptedException e) {
            f.h().p(e).ai(8215).u("InterruptedException while starting encoding");
        }
    }
}
