package T3;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11421a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11422b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11423c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11424d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11425e;

    public /* synthetic */ m(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.f11421a = 3;
        this.f11423c = executor;
        this.f11425e = cancellationToken;
        this.f11424d = cancellationTokenSource;
        this.f11422b = taskCompletionSource;
    }

    private final void b(Runnable runnable) {
        synchronized (this.f11422b) {
            try {
                ((ArrayDeque) this.f11423c).add(new com.applovin.impl.sdk.nativeAd.e(21, this, runnable));
                if (((Runnable) this.f11424d) == null) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(Runnable command) {
        AbstractC3340k.e(command, "command");
        synchronized (this.f11422b) {
            ((ArrayDeque) this.f11423c).offer(new com.applovin.impl.sdk.nativeAd.e(26, command, this));
            if (((Runnable) this.f11424d) == null) {
                e();
            }
        }
    }

    private final void f() {
        synchronized (this.f11422b) {
            try {
                Runnable runnable = (Runnable) ((ArrayDeque) this.f11423c).poll();
                this.f11424d = runnable;
                if (runnable != null) {
                    ((o) this.f11425e).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        boolean z2;
        synchronized (this.f11422b) {
            z2 = !((ArrayDeque) this.f11423c).isEmpty();
        }
        return z2;
    }

    public void e() {
        switch (this.f11421a) {
            case 0:
                Runnable runnable = (Runnable) ((ArrayDeque) this.f11423c).poll();
                this.f11424d = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.f11425e).execute(runnable);
                    return;
                }
                return;
            case 1:
                f();
                return;
            default:
                synchronized (this.f11422b) {
                    Object objPoll = ((ArrayDeque) this.f11423c).poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f11424d = runnable2;
                    if (objPoll != null) {
                        ((Executor) this.f11425e).execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11421a) {
            case 0:
                synchronized (this.f11422b) {
                    try {
                        ((ArrayDeque) this.f11423c).add(new L7.b(7, this, runnable));
                        if (((Runnable) this.f11424d) == null) {
                            e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                b(runnable);
                return;
            case 2:
                c(runnable);
                return;
            default:
                try {
                    ((Executor) this.f11423c).execute(runnable);
                    return;
                } catch (RuntimeException e7) {
                    if (((CancellationToken) this.f11425e).isCancellationRequested()) {
                        ((CancellationTokenSource) this.f11424d).cancel();
                    } else {
                        ((TaskCompletionSource) this.f11422b).setException(e7);
                    }
                    throw e7;
                }
        }
    }

    public m(Executor executor) {
        this.f11421a = 2;
        AbstractC3340k.e(executor, "executor");
        this.f11425e = executor;
        this.f11423c = new ArrayDeque();
        this.f11422b = new Object();
    }

    public m(ExecutorService executorService) {
        this.f11421a = 0;
        this.f11425e = executorService;
        this.f11423c = new ArrayDeque();
        this.f11422b = new Object();
    }

    public m(o oVar) {
        this.f11421a = 1;
        this.f11422b = new Object();
        this.f11423c = new ArrayDeque();
        this.f11425e = oVar;
    }
}
