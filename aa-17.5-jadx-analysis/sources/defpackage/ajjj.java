package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ajjj implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ ajjm b;
    private final ftx c;

    public ajjj(ajjm ajjmVar, ftx ftxVar) {
        this.b = ajjmVar;
        this.c = ftxVar;
    }

    public final String a() {
        return this.b.b.a.b;
    }

    public final void b(ExecutorService executorService) {
        TimeZone timeZone = ajis.a;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                c(e);
                this.b.a.c.b(null, null, this);
            }
        } catch (Throwable th) {
            this.b.a.c.b(null, null, this);
            throw th;
        }
    }

    public final void c(RejectedExecutionException rejectedExecutionException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
        interruptedIOException.initCause(rejectedExecutionException);
        ajjm ajjmVar = this.b;
        ajjmVar.a(interruptedIOException);
        this.c.a(ajjmVar, interruptedIOException);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajhq ajhqVar;
        ajjm ajjmVar = this.b;
        String strB = ajjmVar.b();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName("OkHttp ".concat(strB));
        try {
            ajjmVar.d.d();
            boolean z = false;
            try {
                try {
                    try {
                        this.c.a.w(ajjmVar.d());
                        ajhqVar = ajjmVar.a.c;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            ajly ajlyVar = ajly.c;
                            String str = true != ajjmVar.m ? "" : "canceled ";
                            ajlyVar.d(a.bz(str + "call to " + ajjmVar.b(), "Callback failure for "), 4, e);
                        } else {
                            this.c.a(ajjmVar, e);
                        }
                        ajhqVar = ajjmVar.a.c;
                        ajhqVar.b(null, null, this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        ajjmVar.g();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.c.a(ajjmVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        ajhqVar = ajjmVar.a.c;
                        ajhqVar.b(null, null, this);
                    }
                } catch (Throwable th2) {
                    ajjmVar.a.c.b(null, null, this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            ajhqVar.b(null, null, this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
