package We;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class n extends AtomicReferenceArray implements Runnable, Callable, Je.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15507b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15508c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f15509d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f15510e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f15511a;

    public n(Runnable runnable, Je.a aVar) {
        super(3);
        this.f15511a = runnable;
        lazySet(0, aVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f15510e) {
                return;
            }
            if (obj == f15508c) {
                future.cancel(false);
                return;
            } else if (obj == f15509d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // Je.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f15510e;
            if (obj6 == obj || obj6 == (obj4 = f15508c) || obj6 == (obj5 = f15509d)) {
                break;
            }
            boolean z2 = get(2) != Thread.currentThread();
            if (z2) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z2);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f15507b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((Je.a) obj2).c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean zCompareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = f15509d;
        Object obj5 = f15508c;
        Object obj6 = f15507b;
        Object obj7 = f15510e;
        lazySet(2, Thread.currentThread());
        try {
            this.f15511a.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((Je.a) obj2).c(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((Je.a) obj2).c(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
