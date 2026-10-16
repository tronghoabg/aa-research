package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class iei implements Future, iej, iev {
    private Object a;
    private ief b;
    private boolean c;
    private boolean d;
    private boolean e;
    private hwt f;

    private final synchronized Object i(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone() && !ify.h()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (!this.d) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.e) {
                throw new ExecutionException(this.f);
            }
            if (this.c) {
                throw new CancellationException();
            }
            if (!this.d) {
                throw new TimeoutException();
            }
        }
        return this.a;
    }

    @Override // defpackage.iev
    public final synchronized void b(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final synchronized void c(Object obj, ife ifeVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            ief iefVar = null;
            if (z) {
                ief iefVar2 = this.b;
                this.b = null;
                iefVar = iefVar2;
            }
            if (iefVar != null) {
                iefVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.iev
    public final synchronized ief d() {
        return this.b;
    }

    @Override // defpackage.iev
    public final void e(ieu ieuVar) {
        ieuVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.iej
    public final synchronized boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        this.e = true;
        this.f = hwtVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.iej
    public final synchronized boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.iev
    public final synchronized void h(ief iefVar) {
        this.b = iefVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.c && !this.d) {
            if (!this.e) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        ief iefVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            iefVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = CloudRecognizerProtocolStrings.SUCCESS;
            } else {
                str = "PENDING";
                iefVar = this.b;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (iefVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + iefVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.idh
    public final void j() {
    }

    @Override // defpackage.idh
    public final void k() {
    }

    @Override // defpackage.idh
    public final void l() {
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final void g(ieu ieuVar) {
    }
}
