package p8;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class r implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f43303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f43305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f43306d;

    public r(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f43303a = threadFactory;
        this.f43304b = str;
        this.f43305c = atomicLong;
        this.f43306d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f43303a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f43304b;
        if (str != null) {
            AtomicLong atomicLong = this.f43305c;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f43306d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
