package Ba;

import A7.C0237b0;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1456u;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.C1725n;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ya.m;

/* loaded from: classes4.dex */
public abstract class b implements Closeable, InterfaceC1456u {

    /* renamed from: e, reason: collision with root package name */
    public static final C1725n f1648e = new C1725n("MobileVisionBase", "");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1649a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final Ea.a f1650b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellationTokenSource f1651c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f1652d;

    public b(Ea.a aVar, Executor executor) {
        this.f1650b = aVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f1651c = cancellationTokenSource;
        this.f1652d = executor;
        ((AtomicInteger) aVar.f3602b).incrementAndGet();
        aVar.b(executor, e.f1664a, cancellationTokenSource.getToken()).addOnFailureListener(d.f1662a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @G(EnumC1449m.ON_DESTROY)
    public synchronized void close() {
        boolean z2 = true;
        if (this.f1649a.getAndSet(true)) {
            return;
        }
        this.f1651c.cancel();
        Ea.a aVar = this.f1650b;
        Executor executor = this.f1652d;
        if (((AtomicInteger) aVar.f3602b).get() <= 0) {
            z2 = false;
        }
        AbstractC1732v.l(z2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((C0237b0) aVar.f3601a).t(new m(1, aVar, taskCompletionSource), executor);
        taskCompletionSource.getTask();
    }
}
