package We;

import A7.RunnableC0307z;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f15512a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15513b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f15514c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f15515d = new ConcurrentHashMap();

    static {
        int i5;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        Properties properties = System.getProperties();
        boolean z2 = properties.containsKey("rx2.purge-enabled") ? Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled")) : true;
        if (z2 && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                i5 = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
            }
        } else {
            i5 = 1;
        }
        f15512a = z2;
        f15513b = i5;
        if (!z2) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f15514c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new l("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            RunnableC0307z runnableC0307z = new RunnableC0307z(4);
            long j8 = f15513b;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC0307z, j8, j8, TimeUnit.SECONDS);
            return;
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
