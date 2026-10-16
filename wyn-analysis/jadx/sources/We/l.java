package We;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class l extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f15500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15501b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15502c;

    public l(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f15500a + '-' + incrementAndGet();
        Thread kVar = this.f15502c ? new k(str, runnable) : new Thread(runnable, str);
        kVar.setPriority(this.f15501b);
        kVar.setDaemon(true);
        return kVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return wg.b.c(new StringBuilder("RxThreadFactory["), this.f15500a, "]");
    }

    public l(String str, int i5, boolean z2) {
        this.f15500a = str;
        this.f15501b = i5;
        this.f15502c = z2;
    }
}
