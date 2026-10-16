package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dod<V> implements defpackage.zhs<V> {
    static final dod.a b;
    public static final /* synthetic */ int c = 0;
    private static final java.lang.Object e;
    volatile dod.d listeners;
    volatile java.lang.Object value;
    volatile dod.h waiters;
    static final boolean a = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger d = java.util.logging.Logger.getLogger(defpackage.dod.class.getName());

    abstract class a {
        public abstract void a(dod.h hVar, dod.h hVar2);

        public abstract void b(dod.h hVar, java.lang.Thread thread);

        public abstract boolean c(defpackage.dod dodVar, dod.d dVar, dod.d dVar2);

        public abstract boolean d(defpackage.dod dodVar, java.lang.Object obj, java.lang.Object obj2);

        public abstract boolean e(defpackage.dod dodVar, dod.h hVar, dod.h hVar2);
    }

    final class b {
        static final dod.b a;
        static final dod.b b;
        final boolean c;
        final java.lang.Throwable d;

        static {
            if (defpackage.dod.a) {
                b = null;
                a = null;
            } else {
                b = new dod.b(false, null);
                a = new dod.b(true, null);
            }
        }

        public b(boolean z, java.lang.Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    final class c {
        static final dod.c a = new dod.c(new java.lang.Throwable() { // from class: dod.c.1
            @Override // java.lang.Throwable
            public final synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable b;

        public c(java.lang.Throwable th) {
            defpackage.dod.g(th);
            this.b = th;
        }
    }

    final class d {
        static final dod.d a = new dod.d(null, null);
        final java.lang.Runnable b;
        final java.util.concurrent.Executor c;
        dod.d next;

        public d(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    final class e extends dod.a {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<dod.h, java.lang.Thread> a;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<dod.h, dod.h> b;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<defpackage.dod, dod.h> c;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<defpackage.dod, dod.d> d;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<defpackage.dod, java.lang.Object> e;

        public e(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // dod.a
        public final void a(dod.h hVar, dod.h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // dod.a
        public final void b(dod.h hVar, java.lang.Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        @Override // dod.a
        public final boolean c(defpackage.dod dodVar, dod.d dVar, dod.d dVar2) {
            return defpackage.a.h(this.d, dodVar, dVar, dVar2);
        }

        @Override // dod.a
        public final boolean d(defpackage.dod dodVar, java.lang.Object obj, java.lang.Object obj2) {
            return defpackage.a.h(this.e, dodVar, obj, obj2);
        }

        @Override // dod.a
        public final boolean e(defpackage.dod dodVar, dod.h hVar, dod.h hVar2) {
            return defpackage.a.h(this.c, dodVar, hVar, hVar2);
        }
    }

    final class f<V> implements java.lang.Runnable {
        final defpackage.dod<V> a;
        final defpackage.zhs<? extends V> b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    final class g extends dod.a {
        @Override // dod.a
        public final void a(dod.h hVar, dod.h hVar2) {
            hVar.next = hVar2;
        }

        @Override // dod.a
        public final void b(dod.h hVar, java.lang.Thread thread) {
            hVar.thread = thread;
        }

        @Override // dod.a
        public final boolean c(defpackage.dod dodVar, dod.d dVar, dod.d dVar2) {
            synchronized (dodVar) {
                if (dodVar.listeners != dVar) {
                    return false;
                }
                dodVar.listeners = dVar2;
                return true;
            }
        }

        @Override // dod.a
        public final boolean d(defpackage.dod dodVar, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (dodVar) {
                if (dodVar.value != obj) {
                    return false;
                }
                dodVar.value = obj2;
                return true;
            }
        }

        @Override // dod.a
        public final boolean e(defpackage.dod dodVar, dod.h hVar, dod.h hVar2) {
            synchronized (dodVar) {
                if (dodVar.waiters != hVar) {
                    return false;
                }
                dodVar.waiters = hVar2;
                return true;
            }
        }
    }

    static {
        dod.a gVar;
        try {
            gVar = new dod.e(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(dod.h.class, java.lang.Thread.class, "thread"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(dod.h.class, dod.h.class, "next"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dod.class, dod.h.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dod.class, dod.d.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dod.class, java.lang.Object.class, "value"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            gVar = new dod.g();
        }
        b = gVar;
        if (th != null) {
            d.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new java.lang.Object();
    }

    protected dod() {
    }

    static java.lang.Object a(defpackage.zhs zhsVar) {
        if (zhsVar instanceof defpackage.dod) {
            java.lang.Object obj = ((defpackage.dod) zhsVar).value;
            if (!(obj instanceof dod.b)) {
                return obj;
            }
            dod.b bVar = (dod.b) obj;
            if (!bVar.c) {
                return obj;
            }
            java.lang.Throwable th = bVar.d;
            return th != null ? new dod.b(false, th) : dod.b.b;
        }
        boolean zIsCancelled = zhsVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return dod.b.b;
        }
        try {
            java.lang.Object objK = defpackage.a.K(zhsVar);
            return objK == null ? e : objK;
        } catch (java.util.concurrent.CancellationException e2) {
            return !zIsCancelled ? new dod.c(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zhsVar))), e2)) : new dod.b(false, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            return new dod.c(e3.getCause());
        } catch (java.lang.Throwable th2) {
            return new dod.c(th2);
        }
    }

    static void d(defpackage.dod dodVar) {
        dod.d dVar;
        dod.d dVar2;
        dod.d dVar3 = null;
        while (true) {
            dod.h hVar = dodVar.waiters;
            if (b.e(dodVar, hVar, dod.h.a)) {
                while (hVar != null) {
                    java.lang.Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                do {
                    dVar = dodVar.listeners;
                } while (!b.c(dodVar, dVar, dod.d.a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    java.lang.Runnable runnable = dVar2.b;
                    dod.d dVar4 = dVar2.next;
                    if (runnable instanceof dod.f) {
                        dod.f fVar = (dod.f) runnable;
                        dodVar = fVar.a;
                        if (dodVar.value == fVar) {
                            if (b.d(dodVar, fVar, a(fVar.b))) {
                                dVar3 = dVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, dVar2.c);
                    }
                    dVar2 = dVar4;
                }
                return;
            }
        }
    }

    static void g(java.lang.Object obj) {
        obj.getClass();
    }

    private final java.lang.String h(java.lang.Object obj) {
        return obj == this ? "this future" : java.lang.String.valueOf(obj);
    }

    private final void i(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objK = defpackage.a.K(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(objK));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void j(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e2) {
            d.log(java.util.logging.Level.SEVERE, defpackage.a.bK(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (java.lang.Throwable) e2);
        }
    }

    private final void k(dod.h hVar) {
        hVar.thread = null;
        while (true) {
            dod.h hVar2 = this.waiters;
            if (hVar2 != dod.h.a) {
                dod.h hVar3 = null;
                while (hVar2 != null) {
                    dod.h hVar4 = hVar2.next;
                    if (hVar2.thread != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.next = hVar4;
                        if (hVar3.thread == null) {
                        }
                    } else if (!b.e(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private static final java.lang.Object l(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof dod.b) {
            java.lang.Throwable th = ((dod.b) obj).d;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof dod.c) {
            throw new java.util.concurrent.ExecutionException(((dod.c) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String b() {
        java.lang.Object obj = this.value;
        if (obj instanceof dod.f) {
            return "setFuture=[" + h(((dod.f) obj).b) + "]";
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.zhs
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        dod.d dVar = this.listeners;
        if (dVar != dod.d.a) {
            dod.d dVar2 = new dod.d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (b.c(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != dod.d.a);
        }
        j(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dod.b bVar;
        java.lang.Object obj = this.value;
        if (!(obj instanceof dod.f) && !(obj == null)) {
            return false;
        }
        if (a) {
            bVar = new dod.b(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            bVar = z ? dod.b.a : dod.b.b;
        }
        boolean z2 = false;
        while (true) {
            if (b.d(this, obj, bVar)) {
                d(this);
                if (obj instanceof dod.f) {
                    defpackage.zhs<? extends V> zhsVar = ((dod.f) obj).b;
                    if (zhsVar instanceof defpackage.dod) {
                        this = (defpackage.dod) zhsVar;
                        obj = this.value;
                        if (!(obj == null) && !(obj instanceof dod.f)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        zhsVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.value;
            if (!(obj instanceof dod.f)) {
                return z2;
            }
        }
    }

    protected boolean e(java.lang.Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    protected boolean f(java.lang.Throwable th) {
        g(th);
        if (!b.d(this, null, new dod.c(th))) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof dod.f))) {
            return l(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            dod.h hVar = this.waiters;
            if (hVar != dod.h.a) {
                dod.h hVar2 = new dod.h();
                while (true) {
                    hVar2.a(hVar);
                    if (b.e(this, hVar, hVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                k(hVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof dod.f))) {
                                return l(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        k(hVar2);
                        break;
                    }
                    hVar = this.waiters;
                    if (hVar == dod.h.a) {
                    }
                }
            }
            return l(this.value);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof dod.f))) {
                return l(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                java.lang.String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(defpackage.a.bI(string, strConcat, " for "));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof dod.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        java.lang.Object obj = this.value;
        return (obj != null) & (!(obj instanceof dod.f));
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                strConcat = b();
            } catch (java.lang.RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e2.getClass())));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                i(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    final class h {
        static final dod.h a = new dod.h(null);
        volatile dod.h next;
        volatile java.lang.Thread thread;

        public h() {
            defpackage.dod.b.b(this, java.lang.Thread.currentThread());
        }

        final void a(dod.h hVar) {
            defpackage.dod.b.a(this, hVar);
        }

        public h(byte[] bArr) {
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof dod.f))) {
                return l(obj2);
            }
            dod.h hVar = this.waiters;
            if (hVar != dod.h.a) {
                dod.h hVar2 = new dod.h();
                do {
                    hVar2.a(hVar);
                    if (b.e(this, hVar, hVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                k(hVar2);
                                throw new java.lang.InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof dod.f))));
                        return l(obj);
                    }
                    hVar = this.waiters;
                } while (hVar != dod.h.a);
            }
            return l(this.value);
        }
        throw new java.lang.InterruptedException();
    }
}
