package R8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class x implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10539a;

    /* renamed from: b, reason: collision with root package name */
    public final Number f10540b;

    public x() {
        this.f10539a = 1;
        this.f10540b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10539a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new w(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f10540b).getAndIncrement());
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f10540b).getAndIncrement());
                return thread;
        }
    }

    public x(AtomicLong atomicLong) {
        this.f10539a = 0;
        this.f10540b = atomicLong;
    }
}
