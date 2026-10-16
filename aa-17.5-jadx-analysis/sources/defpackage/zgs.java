package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface zgs extends ExecutorService {
    zgp c(Runnable runnable);

    zgp d(Callable callable);

    zgp e(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService
    List invokeAll(Collection collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException;
}
