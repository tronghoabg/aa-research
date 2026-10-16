package cf;

import He.i;
import He.j;
import Ze.c;
import Ze.d;
import Ze.e;
import Ze.f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: cf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1608b extends i implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f19851g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public static final C1607a[] f19852h = new C1607a[0];

    /* renamed from: i, reason: collision with root package name */
    public static final C1607a[] f19853i = new C1607a[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f19854a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f19855b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f19856c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f19857d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f19858e;

    /* renamed from: f, reason: collision with root package name */
    public long f19859f;

    public C1608b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f19856c = reentrantReadWriteLock.readLock();
        this.f19857d = reentrantReadWriteLock.writeLock();
        this.f19855b = new AtomicReference(f19852h);
        this.f19854a = new AtomicReference();
        this.f19858e = new AtomicReference();
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        if (this.f19858e.get() != null) {
            bVar.dispose();
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        Ne.b.a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f19858e.get() != null) {
            return;
        }
        Lock lock = this.f19857d;
        lock.lock();
        this.f19859f++;
        this.f19854a.lazySet(obj);
        lock.unlock();
        for (C1607a c1607a : (C1607a[]) this.f19855b.get()) {
            c1607a.b(this.f19859f, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // He.i
    public final void d(j jVar) {
        C1607a c1607a = new C1607a(jVar, this);
        jVar.a(c1607a);
        while (true) {
            AtomicReference atomicReference = this.f19855b;
            C1607a[] c1607aArr = (C1607a[]) atomicReference.get();
            if (c1607aArr == f19853i) {
                Throwable th = (Throwable) this.f19858e.get();
                if (th == d.f17085a) {
                    jVar.onComplete();
                    return;
                } else {
                    jVar.onError(th);
                    return;
                }
            }
            int length = c1607aArr.length;
            C1607a[] c1607aArr2 = new C1607a[length + 1];
            System.arraycopy(c1607aArr, 0, c1607aArr2, 0, length);
            c1607aArr2[length] = c1607a;
            while (!atomicReference.compareAndSet(c1607aArr, c1607aArr2)) {
                if (atomicReference.get() != c1607aArr) {
                    break;
                }
            }
            if (c1607a.f19849g) {
                e(c1607a);
                return;
            }
            if (c1607a.f19849g) {
                return;
            }
            synchronized (c1607a) {
                try {
                    if (c1607a.f19849g) {
                        return;
                    }
                    if (c1607a.f19845c) {
                        return;
                    }
                    C1608b c1608b = c1607a.f19844b;
                    Lock lock = c1608b.f19856c;
                    lock.lock();
                    c1607a.f19850h = c1608b.f19859f;
                    Object obj = c1608b.f19854a.get();
                    lock.unlock();
                    c1607a.f19846d = obj != null;
                    c1607a.f19845c = true;
                    if (obj == null || c1607a.test(obj)) {
                        return;
                    }
                    c1607a.a();
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(C1607a c1607a) {
        C1607a[] c1607aArr;
        while (true) {
            AtomicReference atomicReference = this.f19855b;
            C1607a[] c1607aArr2 = (C1607a[]) atomicReference.get();
            int length = c1607aArr2.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                } else if (c1607aArr2[i5] == c1607a) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 < 0) {
                return;
            }
            if (length == 1) {
                c1607aArr = f19852h;
            } else {
                C1607a[] c1607aArr3 = new C1607a[length - 1];
                System.arraycopy(c1607aArr2, 0, c1607aArr3, 0, i5);
                System.arraycopy(c1607aArr2, i5 + 1, c1607aArr3, i5, (length - i5) - 1);
                c1607aArr = c1607aArr3;
            }
            while (!atomicReference.compareAndSet(c1607aArr2, c1607aArr)) {
                if (atomicReference.get() != c1607aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // He.j
    public final void onComplete() {
        AtomicReference atomicReference = this.f19858e;
        c cVar = d.f17085a;
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        f fVar = f.f17087a;
        AtomicReference atomicReference2 = this.f19855b;
        C1607a[] c1607aArr = f19853i;
        C1607a[] c1607aArr2 = (C1607a[]) atomicReference2.getAndSet(c1607aArr);
        if (c1607aArr2 != c1607aArr) {
            Lock lock = this.f19857d;
            lock.lock();
            this.f19859f++;
            this.f19854a.lazySet(fVar);
            lock.unlock();
        }
        for (C1607a c1607a : c1607aArr2) {
            c1607a.b(this.f19859f, fVar);
        }
    }

    @Override // He.j
    public final void onError(Throwable th) {
        Ne.b.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f19858e;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                S3.f.A(th);
                return;
            }
        }
        e eVar = new e(th);
        AtomicReference atomicReference2 = this.f19855b;
        C1607a[] c1607aArr = f19853i;
        C1607a[] c1607aArr2 = (C1607a[]) atomicReference2.getAndSet(c1607aArr);
        if (c1607aArr2 != c1607aArr) {
            Lock lock = this.f19857d;
            lock.lock();
            this.f19859f++;
            this.f19854a.lazySet(eVar);
            lock.unlock();
        }
        for (C1607a c1607a : c1607aArr2) {
            c1607a.b(this.f19859f, eVar);
        }
    }
}
