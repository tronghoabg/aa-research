package t6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import f6.C2581K;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import u6.AbstractC4256a;

/* renamed from: t6.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC4127C extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f45809a;

    /* renamed from: b, reason: collision with root package name */
    public final C2581K f45810b;

    /* renamed from: c, reason: collision with root package name */
    public Object f45811c;

    /* renamed from: d, reason: collision with root package name */
    public IOException f45812d;

    /* renamed from: e, reason: collision with root package name */
    public int f45813e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f45814f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45815g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f45816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4129E f45817i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4127C(C4129E c4129e, Looper looper, C2581K c2581k, InterfaceC4126B interfaceC4126B, int i5, long j8) {
        super(looper);
        this.f45817i = c4129e;
        this.f45810b = c2581k;
        this.f45811c = interfaceC4126B;
        this.f45809a = i5;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, t6.B] */
    public final void a(boolean z2) {
        this.f45816h = z2;
        this.f45812d = null;
        if (hasMessages(0)) {
            this.f45815g = true;
            removeMessages(0);
            if (!z2) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f45815g = true;
                    this.f45810b.f34907g = true;
                    Thread thread = this.f45814f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.f45817i.f45821b = null;
            SystemClock.elapsedRealtime();
            ?? r52 = this.f45811c;
            r52.getClass();
            r52.g(this.f45810b, true);
            this.f45811c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, t6.B] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f45816h) {
            return;
        }
        int i5 = message.what;
        if (i5 == 0) {
            this.f45812d = null;
            C4129E c4129e = this.f45817i;
            ExecutorService executorService = c4129e.f45820a;
            HandlerC4127C handlerC4127C = c4129e.f45821b;
            handlerC4127C.getClass();
            executorService.execute(handlerC4127C);
            return;
        }
        if (i5 == 3) {
            throw ((Error) message.obj);
        }
        this.f45817i.f45821b = null;
        SystemClock.elapsedRealtime();
        ?? r02 = this.f45811c;
        r02.getClass();
        if (this.f45815g) {
            r02.g(this.f45810b, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            try {
                r02.a(this.f45810b);
                return;
            } catch (RuntimeException e7) {
                AbstractC4256a.p("LoadTask", "Unexpected exception handling load completed", e7);
                this.f45817i.f45822c = new C4128D(e7);
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f45812d = iOException;
        int i11 = this.f45813e + 1;
        this.f45813e = i11;
        U5.f fVarB = r02.b(this.f45810b, iOException, i11);
        int i12 = fVarB.f12344a;
        if (i12 == 3) {
            this.f45817i.f45822c = this.f45812d;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f45813e = 1;
            }
            long jMin = fVarB.f12345b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f45813e - 1) * 1000, 5000);
            }
            C4129E c4129e2 = this.f45817i;
            AbstractC4256a.i(c4129e2.f45821b == null);
            c4129e2.f45821b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f45812d = null;
                c4129e2.f45820a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.f45815g;
                this.f45814f = Thread.currentThread();
            }
            if (!z2) {
                AbstractC4256a.b("load:".concat(this.f45810b.getClass().getSimpleName()));
                try {
                    this.f45810b.b();
                    AbstractC4256a.q();
                } catch (Throwable th) {
                    AbstractC4256a.q();
                    throw th;
                }
            }
            synchronized (this) {
                this.f45814f = null;
                Thread.interrupted();
            }
            if (this.f45816h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e7) {
            if (this.f45816h) {
                return;
            }
            obtainMessage(2, e7).sendToTarget();
        } catch (Exception e10) {
            if (this.f45816h) {
                return;
            }
            AbstractC4256a.p("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(2, new C4128D(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f45816h) {
                return;
            }
            AbstractC4256a.p("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(2, new C4128D(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f45816h) {
                AbstractC4256a.p("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
