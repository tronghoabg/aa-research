package M8;

import E4.RunnableC0432a;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f7558f = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7559a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f7560b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f7561c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f7562d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final L7.b f7563e = new L7.b(this, 2);

    public j(Executor executor) {
        AbstractC1732v.i(executor);
        this.f7559a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1732v.i(runnable);
        synchronized (this.f7560b) {
            int i5 = this.f7561c;
            if (i5 != 4 && i5 != 3) {
                long j8 = this.f7562d;
                RunnableC0432a runnableC0432a = new RunnableC0432a(1, runnable);
                this.f7560b.add(runnableC0432a);
                this.f7561c = 2;
                try {
                    this.f7559a.execute(this.f7563e);
                    if (this.f7561c != 2) {
                        return;
                    }
                    synchronized (this.f7560b) {
                        try {
                            if (this.f7562d == j8 && this.f7561c == 2) {
                                this.f7561c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f7560b) {
                        try {
                            int i10 = this.f7561c;
                            boolean z2 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f7560b.removeLastOccurrence(runnableC0432a)) {
                                z2 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z2) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f7560b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f7559a + "}";
    }
}
