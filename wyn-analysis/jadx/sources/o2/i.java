package o2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import p2.ExecutorC3758a;

/* loaded from: classes.dex */
public final class i extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f41307a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41308b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41309c;

    /* renamed from: d, reason: collision with root package name */
    public h f41310d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f41311e;

    /* renamed from: f, reason: collision with root package name */
    public int f41312f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f41313g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41314h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f41315i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f41316j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Looper looper, j jVar, h hVar, int i5, long j8) {
        super(looper);
        this.f41316j = mVar;
        this.f41308b = jVar;
        this.f41310d = hVar;
        this.f41307a = i5;
        this.f41309c = j8;
    }

    public final void a(boolean z2) {
        this.f41315i = z2;
        this.f41311e = null;
        if (hasMessages(1)) {
            this.f41314h = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f41314h = true;
                    this.f41308b.g();
                    Thread thread = this.f41313g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.f41316j.f41321b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.f41310d;
            hVar.getClass();
            hVar.w(this.f41308b, jElapsedRealtime, jElapsedRealtime - this.f41309c, true);
            this.f41310d = null;
        }
    }

    public final void b() {
        SystemClock.elapsedRealtime();
        this.f41310d.getClass();
        this.f41311e = null;
        m mVar = this.f41316j;
        ExecutorC3758a executorC3758a = mVar.f41320a;
        i iVar = mVar.f41321b;
        iVar.getClass();
        executorC3758a.execute(iVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f41315i) {
            return;
        }
        int i5 = message.what;
        if (i5 == 1) {
            b();
            return;
        }
        if (i5 == 4) {
            throw ((Error) message.obj);
        }
        this.f41316j.f41321b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = jElapsedRealtime - this.f41309c;
        h hVar = this.f41310d;
        hVar.getClass();
        if (this.f41314h) {
            hVar.w(this.f41308b, jElapsedRealtime, j8, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                hVar.A(this.f41308b, jElapsedRealtime, j8);
                return;
            } catch (RuntimeException e7) {
                Q1.k.l("LoadTask", "Unexpected exception handling load completed", e7);
                this.f41316j.f41322c = new l(e7);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f41311e = iOException;
        int i11 = this.f41312f + 1;
        this.f41312f = i11;
        U5.f fVarE = hVar.E(this.f41308b, jElapsedRealtime, j8, iOException, i11);
        int i12 = fVarE.f12344a;
        if (i12 == 3) {
            this.f41316j.f41322c = this.f41311e;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f41312f = 1;
            }
            long jMin = fVarE.f12345b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f41312f - 1) * 1000, 5000);
            }
            m mVar = this.f41316j;
            Q1.k.g(mVar.f41321b == null);
            mVar.f41321b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.f41314h;
                this.f41313g = Thread.currentThread();
            }
            if (!z2) {
                Trace.beginSection("load:".concat(this.f41308b.getClass().getSimpleName()));
                try {
                    this.f41308b.load();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f41313g = null;
                Thread.interrupted();
            }
            if (this.f41315i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.f41315i) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (Exception e10) {
            if (this.f41315i) {
                return;
            }
            Q1.k.l("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new l(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f41315i) {
                return;
            }
            Q1.k.l("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new l(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f41315i) {
                Q1.k.l("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
