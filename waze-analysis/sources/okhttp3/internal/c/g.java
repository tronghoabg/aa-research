package okhttp3.internal.c;

import e.a.h.ad;
import h.g.b.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.t;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f56014a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.g f56015b;

    /* renamed from: c, reason: collision with root package name */
    private volatile AtomicInteger f56016c;

    public g(j jVar, okhttp3.g gVar) {
        x.f(gVar, "responseCallback");
        this.f56014a = jVar;
        this.f56015b = gVar;
        this.f56016c = new AtomicInteger(0);
    }

    public final String a() {
        return this.f56014a.k().g().f();
    }

    public final AtomicInteger b() {
        return this.f56016c;
    }

    public final void c(ExecutorService executorService) {
        x.f(executorService, "executorService");
        byte[] bArr = okhttp3.internal.b.f55955a;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e2);
                j jVar = this.f56014a;
                InterruptedIOException interruptedIOException2 = interruptedIOException;
                jVar.f(interruptedIOException2);
                this.f56015b.a(jVar, interruptedIOException2);
                this.f56014a.j().u().d(this);
            }
        } catch (Throwable th) {
            this.f56014a.j().u().d(this);
            throw th;
        }
    }

    public final void d(g gVar) {
        x.f(gVar, "other");
        this.f56016c = gVar.f56016c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVarU;
        j jVar = this.f56014a;
        String strH = jVar.h();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName("OkHttp ".concat(strH));
        try {
            jVar.f56023e.l();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.j().u().d(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f56015b.b(jVar, jVar.l());
                tVarU = jVar.j().u();
            } catch (IOException e3) {
                e = e3;
                z = true;
                if (z) {
                    okhttp3.internal.g.g.f56287a.m("Callback failure for " + j.g(jVar), 4, e);
                } else {
                    this.f56015b.a(jVar, e);
                }
                tVarU = jVar.j().u();
                tVarU.d(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                jVar.c();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    ad.c(iOException, th);
                    this.f56015b.a(jVar, iOException);
                }
                throw th;
            }
            tVarU.d(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
