package p8;

import Va.M6;
import j$.util.Objects;
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
import q8.AbstractC3879a;

/* loaded from: classes4.dex */
public abstract class m extends AbstractC3879a implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f43291d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f43292e;

    /* renamed from: f, reason: collision with root package name */
    public static final ic.d f43293f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f43294g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f43295a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f43296b;

    /* renamed from: c, reason: collision with root package name */
    public volatile l f43297c;

    static {
        boolean z2;
        Throwable th;
        ic.d eVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        f43291d = z2;
        f43292e = new o();
        Throwable th2 = null;
        try {
            eVar = new k();
            th = null;
        } catch (Error | Exception e7) {
            th = e7;
            try {
                eVar = new d(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(m.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "a"));
            } catch (Error | Exception e10) {
                th2 = e10;
                eVar = new e();
            }
        }
        f43293f = eVar;
        if (th2 != null) {
            o oVar = f43292e;
            Logger loggerA = oVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            oVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f43294g = new Object();
    }

    public static void c(m mVar, boolean z2) {
        mVar.getClass();
        for (l lVarW = f43293f.w(mVar); lVarW != null; lVarW = lVarW.f43290b) {
            Thread thread = lVarW.f43289a;
            if (thread != null) {
                lVarW.f43289a = null;
                LockSupport.unpark(thread);
            }
        }
        if (z2) {
            mVar.g();
        }
        c cVarV = f43293f.v(mVar);
        c cVar = null;
        while (cVarV != null) {
            c cVar2 = cVarV.f43276c;
            cVarV.f43276c = cVar;
            cVar = cVarV;
            cVarV = cVar2;
        }
        while (cVar != null) {
            c cVar3 = cVar.f43276c;
            Runnable runnable = cVar.f43274a;
            Objects.requireNonNull(runnable);
            Executor executor = cVar.f43275b;
            Objects.requireNonNull(executor);
            d(runnable, executor);
            cVar = cVar3;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f43292e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C3774a) {
            RuntimeException runtimeException = ((C3774a) obj).f43271a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C3775b) {
            throw new ExecutionException(((C3775b) obj).f43272a);
        }
        if (obj == f43294g) {
            return null;
        }
        return obj;
    }

    public static Object f(m mVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = mVar.get();
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
            b(sb2, objF);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e7.getCause());
            sb2.append("]");
        } catch (Exception e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // p8.p
    public void addListener(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2;
        Fe.e.t(runnable, "Runnable was null.");
        Fe.e.t(executor, "Executor was null.");
        if (!isDone() && (cVar = this.f43296b) != (cVar2 = c.f43273d)) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f43276c = cVar;
                if (f43293f.h(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f43296b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        C3774a c3774a;
        Object obj = this.f43295a;
        if (obj != null) {
            return false;
        }
        if (f43291d) {
            c3774a = new C3774a(z2, new CancellationException("Future.cancel() was called."));
        } else {
            c3774a = z2 ? C3774a.f43269b : C3774a.f43270c;
            Objects.requireNonNull(c3774a);
        }
        if (!f43293f.i(this, obj, c3774a)) {
            return false;
        }
        c(this, z2);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f43295a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f43297c;
            l lVar2 = l.f43288c;
            if (lVar != lVar2) {
                l lVar3 = new l();
                do {
                    ic.d dVar = f43293f;
                    dVar.I(lVar3, lVar);
                    if (dVar.j(this, lVar, lVar3)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(lVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f43295a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(lVar3);
                    } else {
                        lVar = this.f43297c;
                    }
                } while (lVar != lVar2);
            }
            Object obj3 = this.f43295a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f43295a;
            if (obj4 != null) {
                return e(obj4);
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
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strF2 = strF + jConvert + StringUtils.SPACE + lowerCase;
                if (z2) {
                    strF2 = N0.a.f(strF2, ",");
                }
                strF = N0.a.f(strF2, StringUtils.SPACE);
            }
            if (z2) {
                strF = strF + nanos2 + " nanoseconds ";
            }
            string3 = N0.a.f(strF, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(N0.a.f(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(N0.a.g(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(l lVar) {
        lVar.f43289a = null;
        while (true) {
            l lVar2 = this.f43297c;
            if (lVar2 == l.f43288c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f43290b;
                if (lVar2.f43289a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f43290b = lVar4;
                    if (lVar3.f43289a == null) {
                        break;
                    }
                } else if (!f43293f.j(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f43295a instanceof C3774a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f43295a != null;
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                strH = h();
                if (Fe.c.D(strH)) {
                    strH = null;
                }
            } catch (Exception | StackOverflowError e7) {
                strH = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strH != null) {
                N0.a.r(sb2, ", info=[", strH, "]");
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                a(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void g() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f43295a;
            if (obj2 != null) {
                return e(obj2);
            }
            l lVar = this.f43297c;
            l lVar2 = l.f43288c;
            if (lVar != lVar2) {
                l lVar3 = new l();
                do {
                    ic.d dVar = f43293f;
                    dVar.I(lVar3, lVar);
                    if (dVar.j(this, lVar, lVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f43295a;
                            } else {
                                i(lVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    lVar = this.f43297c;
                } while (lVar != lVar2);
            }
            Object obj3 = this.f43295a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
