package U3;

import Va.M6;
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
import org.apache.tika.utils.StringUtils;
import p8.p;

/* loaded from: classes.dex */
public abstract class h implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12260d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f12261e = Logger.getLogger(h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final xg.g f12262f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f12263g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f12264a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f12265b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f12266c;

    static {
        xg.g fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f12262f = fVar;
        if (th != null) {
            f12261e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12263g = new Object();
    }

    public static void b(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f12266c;
            if (f12262f.o(hVar, gVar, g.f12257c)) {
                while (gVar != null) {
                    Thread thread = gVar.f12258a;
                    if (thread != null) {
                        gVar.f12258a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f12259b;
                }
                do {
                    cVar = hVar.f12265b;
                } while (!f12262f.m(hVar, cVar, c.f12246d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f12249c;
                    cVar3.f12249c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f12249c;
                    Runnable runnable = cVar2.f12247a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f12255a;
                        if (hVar.f12264a == eVar) {
                            if (f12262f.n(hVar, eVar, e(eVar.f12256b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, cVar2.f12248b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f12261e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f12243b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f12245a);
        }
        if (obj == f12263g) {
            return null;
        }
        return obj;
    }

    public static Object e(p pVar) {
        if (pVar instanceof h) {
            Object obj = ((h) pVar).f12264a;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            return aVar.f12242a ? aVar.f12243b != null ? new a(false, aVar.f12243b) : a.f12241d : obj;
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f12260d) && zIsCancelled) {
            return a.f12241d;
        }
        try {
            Object objF = f(pVar);
            return objF == null ? f12263g : objF;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new a(false, e7);
            }
            return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e7));
        } catch (ExecutionException e10) {
            return new b(e10.getCause());
        } catch (Throwable th) {
            return new b(th);
        }
    }

    public static Object f(p pVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = pVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objF = f(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objF == this ? "this future" : String.valueOf(objF));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e7.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // p8.p
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f12265b;
        c cVar2 = c.f12246d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f12249c = cVar;
                if (f12262f.m(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f12265b;
                }
            } while (cVar != cVar2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12264a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof U3.e
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = U3.h.f12260d
            if (r3 == 0) goto L1f
            U3.a r3 = new U3.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            U3.a r3 = U3.a.f12240c
            goto L26
        L24:
            U3.a r3 = U3.a.f12241d
        L26:
            r4 = r7
            r5 = r2
        L28:
            xg.g r6 = U3.h.f12262f
            boolean r6 = r6.n(r4, r0, r3)
            if (r6 == 0) goto L54
            b(r4)
            boolean r4 = r0 instanceof U3.e
            if (r4 == 0) goto L53
            U3.e r0 = (U3.e) r0
            p8.p r0 = r0.f12256b
            boolean r4 = r0 instanceof U3.h
            if (r4 == 0) goto L50
            r4 = r0
            U3.h r4 = (U3.h) r4
            java.lang.Object r0 = r4.f12264a
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof U3.e
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f12264a
            boolean r6 = r0 instanceof U3.e
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.h.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f12264a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            p pVar = ((e) obj).f12256b;
            return wg.b.c(sb2, pVar == this ? "this future" : String.valueOf(pVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12264a;
        if ((obj != null) && (!(obj instanceof e))) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f12266c;
            g gVar2 = g.f12257c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                z2 = true;
                do {
                    xg.g gVar4 = f12262f;
                    gVar4.J(gVar3, gVar);
                    if (gVar4.o(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12264a;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar = this.f12266c;
                    }
                } while (gVar != gVar2);
            }
            return d(this.f12264a);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.f12264a;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof e))) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbU = M6.u(j8, "Waited ", StringUtils.SPACE);
        sbU.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbU.toString();
        if (nanos + 1000 < 0) {
            String strF = N0.a.f(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z10 = (jConvert == 0 || nanos2 > 1000) ? z2 : false;
            if (jConvert > 0) {
                String strF2 = strF + jConvert + StringUtils.SPACE + lowerCase;
                if (z10) {
                    strF2 = N0.a.f(strF2, ",");
                }
                strF = N0.a.f(strF2, StringUtils.SPACE);
            }
            if (z10) {
                strF = strF + nanos2 + " nanoseconds ";
            }
            string3 = N0.a.f(strF, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(N0.a.f(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(N0.a.g(string3, " for ", string));
    }

    public final void h(g gVar) {
        gVar.f12258a = null;
        while (true) {
            g gVar2 = this.f12266c;
            if (gVar2 == g.f12257c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f12259b;
                if (gVar2.f12258a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f12259b = gVar4;
                    if (gVar3.f12258a == null) {
                        break;
                    }
                } else if (!f12262f.o(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12264a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f12264a != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f12264a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e7) {
                strG = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                N0.a.r(sb2, "PENDING, info=[", strG, "]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12264a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return d(obj2);
            }
            g gVar = this.f12266c;
            g gVar2 = g.f12257c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    xg.g gVar4 = f12262f;
                    gVar4.J(gVar3, gVar);
                    if (gVar4.o(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12264a;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return d(obj);
                    }
                    gVar = this.f12266c;
                } while (gVar != gVar2);
            }
            return d(this.f12264a);
        }
        throw new InterruptedException();
    }
}
