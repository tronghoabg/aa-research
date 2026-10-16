package ya;

import A7.C0237b0;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import zg.C4680t;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48064c;

    public /* synthetic */ m(int i5, Object obj, Object obj2) {
        this.f48062a = i5;
        this.f48064c = obj;
        this.f48063b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48062a) {
            case 0:
                Callable callable = (Callable) this.f48064c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f48063b;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ua.a e7) {
                    taskCompletionSource.setException(e7);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(new ua.a("Internal error has occurred when executing ML Kit tasks", e10));
                    return;
                }
            case 1:
                Ea.a aVar = (Ea.a) this.f48064c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f48063b;
                int iDecrementAndGet = ((AtomicInteger) aVar.f3602b).decrementAndGet();
                AbstractC1732v.l(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    synchronized (aVar) {
                        Ea.a.f3630i = true;
                        aVar.f3632d.zzc();
                    }
                    ((AtomicBoolean) aVar.f3603c).set(false);
                }
                zzrr.zza();
                taskCompletionSource2.setResult(null);
                return;
            case 2:
                C0237b0 c0237b0 = (C0237b0) this.f48064c;
                AbstractC1732v.l(((Thread) ((AtomicReference) c0237b0.f815e).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.f48063b).run();
                    ((AtomicReference) c0237b0.f815e).set(null);
                    c0237b0.zzc();
                    return;
                } catch (Throwable th) {
                    try {
                        ((AtomicReference) c0237b0.f815e).set(null);
                        c0237b0.zzc();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                A6.h.A((C4680t) this.f48064c).resumeWith(Fe.e.z((Exception) this.f48063b));
                return;
        }
    }
}
