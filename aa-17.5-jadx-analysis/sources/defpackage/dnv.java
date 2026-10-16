package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class dnv<V> implements zgp<V> {
    static final a b;
    public static final /* synthetic */ int c = 0;
    private static final Object e;
    volatile d listeners;
    volatile Object value;
    volatile h waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(dnv.class.getName());

    abstract class a {
        public abstract void a(h hVar, h hVar2);

        public abstract void b(h hVar, Thread thread);

        public abstract boolean c(dnv dnvVar, d dVar, d dVar2);

        public abstract boolean d(dnv dnvVar, Object obj, Object obj2);

        public abstract boolean e(dnv dnvVar, h hVar, h hVar2);
    }

    final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (dnv.a) {
                b = null;
                a = null;
            } else {
                b = new b(false, null);
                a = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    final class c {
        static final c a = new c(new Throwable() { // from class: dnv.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            dnv.g(th);
            this.b = th;
        }
    }

    final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d next;

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    final class e extends a {
        final AtomicReferenceFieldUpdater<h, Thread> a;
        final AtomicReferenceFieldUpdater<h, h> b;
        final AtomicReferenceFieldUpdater<dnv, h> c;
        final AtomicReferenceFieldUpdater<dnv, d> d;
        final AtomicReferenceFieldUpdater<dnv, Object> e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // dnv.a
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // dnv.a
        public final void b(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        @Override // dnv.a
        public final boolean c(dnv dnvVar, d dVar, d dVar2) {
            return defpackage.a.i(this.d, dnvVar, dVar, dVar2);
        }

        @Override // dnv.a
        public final boolean d(dnv dnvVar, Object obj, Object obj2) {
            return defpackage.a.i(this.e, dnvVar, obj, obj2);
        }

        @Override // dnv.a
        public final boolean e(dnv dnvVar, h hVar, h hVar2) {
            return defpackage.a.i(this.c, dnvVar, hVar, hVar2);
        }
    }

    final class f<V> implements Runnable {
        final dnv<V> a;
        final zgp<? extends V> b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    final class g extends a {
        @Override // dnv.a
        public final void a(h hVar, h hVar2) {
            hVar.next = hVar2;
        }

        @Override // dnv.a
        public final void b(h hVar, Thread thread) {
            hVar.thread = thread;
        }

        @Override // dnv.a
        public final boolean c(dnv dnvVar, d dVar, d dVar2) {
            synchronized (dnvVar) {
                if (dnvVar.listeners != dVar) {
                    return false;
                }
                dnvVar.listeners = dVar2;
                return true;
            }
        }

        @Override // dnv.a
        public final boolean d(dnv dnvVar, Object obj, Object obj2) {
            synchronized (dnvVar) {
                if (dnvVar.value != obj) {
                    return false;
                }
                dnvVar.value = obj2;
                return true;
            }
        }

        @Override // dnv.a
        public final boolean e(dnv dnvVar, h hVar, h hVar2) {
            synchronized (dnvVar) {
                if (dnvVar.waiters != hVar) {
                    return false;
                }
                dnvVar.waiters = hVar2;
                return true;
            }
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "next"), AtomicReferenceFieldUpdater.newUpdater(dnv.class, h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(dnv.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(dnv.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        b = gVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    protected dnv() {
    }

    static Object a(zgp zgpVar) {
        if (zgpVar instanceof dnv) {
            Object obj = ((dnv) zgpVar).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.c) {
                return obj;
            }
            Throwable th = bVar.d;
            return th != null ? new b(false, th) : b.b;
        }
        boolean zIsCancelled = zgpVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return b.b;
        }
        try {
            Object objL = defpackage.a.L(zgpVar);
            return objL == null ? e : objL;
        } catch (CancellationException e2) {
            return !zIsCancelled ? new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(zgpVar))), e2)) : new b(false, e2);
        } catch (ExecutionException e3) {
            return new c(e3.getCause());
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    static void d(dnv dnvVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = dnvVar.waiters;
            if (b.e(dnvVar, hVar, h.a)) {
                while (hVar != null) {
                    Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                do {
                    dVar = dnvVar.listeners;
                } while (!b.c(dnvVar, dVar, d.a));
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
                    Runnable runnable = dVar2.b;
                    d dVar4 = dVar2.next;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        dnvVar = fVar.a;
                        if (dnvVar.value == fVar) {
                            if (b.d(dnvVar, fVar, a(fVar.b))) {
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

    static void g(Object obj) {
        obj.getClass();
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void i(StringBuilder sb) {
        try {
            Object objL = defpackage.a.L(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(objL));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, defpackage.a.bL(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void k(h hVar) {
        hVar.thread = null;
        while (true) {
            h hVar2 = this.waiters;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.next;
                    if (hVar2.thread != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.next = hVar4;
                        if (hVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, hVar2, hVar4)) {
                        break;
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object l(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof f) {
            return "setFuture=[" + h(((f) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.listeners;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (b.c(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.a);
        }
        j(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.value
            boolean r1 = r0 instanceof dnv.f
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5a
            boolean r1 = defpackage.dnv.a
            if (r1 == 0) goto L1f
            dnv$b r1 = new dnv$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            dnv$b r1 = dnv.b.a
            goto L26
        L24:
            dnv$b r1 = dnv.b.b
        L26:
            r4 = r2
        L27:
            dnv$a r5 = defpackage.dnv.b
            boolean r5 = r5.d(r6, r0, r1)
            if (r5 == 0) goto L53
            d(r6)
            boolean r6 = r0 instanceof dnv.f
            if (r6 == 0) goto L52
            dnv$f r0 = (dnv.f) r0
            zgp<? extends V> r6 = r0.b
            boolean r0 = r6 instanceof defpackage.dnv
            if (r0 == 0) goto L4f
            dnv r6 = (defpackage.dnv) r6
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L46
            r4 = r3
            goto L47
        L46:
            r4 = r2
        L47:
            boolean r5 = r0 instanceof dnv.f
            r4 = r4 | r5
            if (r4 == 0) goto L4e
            r4 = r3
            goto L27
        L4e:
            return r3
        L4f:
            r6.cancel(r7)
        L52:
            return r3
        L53:
            java.lang.Object r0 = r6.value
            boolean r5 = r0 instanceof dnv.f
            if (r5 != 0) goto L27
            return r4
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnv.cancel(boolean):boolean");
    }

    protected boolean e(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    protected boolean f(Throwable th) {
        g(th);
        if (!b.d(this, null, new c(th))) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof f))) {
            return l(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.waiters;
            if (hVar != h.a) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (b.e(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return l(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(hVar2);
                    } else {
                        hVar = this.waiters;
                    }
                } while (hVar != h.a);
            }
            return l(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return l(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
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
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(defpackage.a.bJ(string, strConcat, " for "));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r2 instanceof f));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
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
        static final h a = new h(null);
        volatile h next;
        volatile Thread thread;

        public h() {
            dnv.b.b(this, Thread.currentThread());
        }

        final void a(h hVar) {
            dnv.b.a(this, hVar);
        }

        public h(byte[] bArr) {
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return l(obj2);
            }
            h hVar = this.waiters;
            if (hVar != h.a) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (b.e(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                k(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return l(obj);
                    }
                    hVar = this.waiters;
                } while (hVar != h.a);
            }
            return l(this.value);
        }
        throw new InterruptedException();
    }
}
