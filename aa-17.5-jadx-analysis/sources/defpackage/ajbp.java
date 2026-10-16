package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class ajbp implements zgp {
    public final zhc a = new zhc();
    public boolean b;
    private final aivh c;

    public ajbp(aivh aivhVar) {
        this.c = aivhVar;
    }

    private static final void a(Object obj) throws Throwable {
        if (obj instanceof ajbo) {
            throw new CancellationException().initCause(((ajbo) obj).a);
        }
    }

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.a.cancel(z)) {
            return false;
        }
        this.c.s(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object objS = this.a.s();
        a(objS);
        return objS;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        zhc zhcVar = this.a;
        if (zhcVar.isCancelled()) {
            return true;
        }
        if (!isDone() || this.b) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.b = true;
        }
        return a.L(zhcVar) instanceof ajbo;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        boolean zIsDone = isDone();
        zhc zhcVar = this.a;
        if (zIsDone) {
            try {
                Object objL = a.L(zhcVar);
                if (objL instanceof ajbo) {
                    sb.append("CANCELLED, cause=[" + ((ajbo) objL).a + "]");
                } else {
                    sb.append(a.bm(objL, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + zhcVar + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object objT = this.a.t(j, timeUnit);
        a(objT);
        return objT;
    }
}
