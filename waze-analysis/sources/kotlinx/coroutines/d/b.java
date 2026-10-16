package kotlinx.coroutines.d;

import com.google.d.m.a.bm;
import com.google.d.m.a.bv;
import com.google.d.m.a.cf;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b<T> implements bm<T> {

    /* renamed from: a, reason: collision with root package name */
    private final br f51829a;

    /* renamed from: b, reason: collision with root package name */
    private final bv f51830b = bv.f();

    /* renamed from: c, reason: collision with root package name */
    private boolean f51831c;

    public b(br brVar) {
        this.f51829a = brVar;
    }

    private static final void c(Object obj) throws Throwable {
        if (obj instanceof a) {
            throw new CancellationException().initCause(((a) obj).f51828a);
        }
    }

    public final void a(Object obj) {
        this.f51830b.c(obj);
    }

    @Override // com.google.d.m.a.bm
    public final void addListener(Runnable runnable, Executor executor) {
        this.f51830b.addListener(runnable, executor);
    }

    public final void b(Throwable th) {
        boolean z = th instanceof CancellationException;
        bv bvVar = this.f51830b;
        if (z) {
            bvVar.c(new a((CancellationException) th));
        } else if (bvVar.d(th)) {
            this.f51831c = true;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.f51830b.cancel(z)) {
            return false;
        }
        this.f51829a.s(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws Throwable {
        T t = (T) this.f51830b.get();
        c(t);
        return t;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        bv bvVar = this.f51830b;
        if (bvVar.isCancelled()) {
            return true;
        }
        if (!isDone() || this.f51831c) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.f51831c = true;
        }
        return cf.s(bvVar) instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f51830b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        boolean zIsDone = isDone();
        bv bvVar = this.f51830b;
        if (zIsDone) {
            try {
                Object objS = cf.s(bvVar);
                if (objS instanceof a) {
                    sb.append("CANCELLED, cause=[" + ((a) objS).f51828a + "]");
                } else {
                    sb.append("SUCCESS, result=[" + objS + "]");
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[" + e2.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + bvVar + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) throws Throwable {
        T t = (T) this.f51830b.get(j2, timeUnit);
        c(t);
        return t;
    }
}
