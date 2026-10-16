package e.c.c.b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a, reason: collision with root package name */
    final String f47891a;

    /* renamed from: b, reason: collision with root package name */
    final int f47892b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f47893c;

    public i(String str, int i2, boolean z) {
        this.f47891a = str;
        this.f47892b = i2;
        this.f47893c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f47891a + '-' + incrementAndGet();
        Thread hVar = this.f47893c ? new h(runnable, str) : new Thread(runnable, str);
        hVar.setPriority(this.f47892b);
        hVar.setDaemon(true);
        return hVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return "RxThreadFactory[" + this.f47891a + "]";
    }

    public i(String str, int i2) {
        this(str, i2, false);
    }

    public i(String str) {
        this(str, 5, false);
    }
}
