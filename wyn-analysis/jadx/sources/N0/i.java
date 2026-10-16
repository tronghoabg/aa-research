package N0;

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
public abstract class i implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8009d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f8010e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.b f8011f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8012g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f8013a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f8014b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f8015c;

    static {
        android.support.v4.media.session.b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f8011f = gVar;
        if (th != null) {
            f8010e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8012g = new Object();
    }

    public static void c(i iVar) {
        h hVar;
        e eVar;
        e eVar2;
        e eVar3;
        do {
            hVar = iVar.f8015c;
        } while (!f8011f.M(iVar, hVar, h.f8006c));
        while (true) {
            eVar = null;
            if (hVar == null) {
                break;
            }
            Thread thread = hVar.f8007a;
            if (thread != null) {
                hVar.f8007a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f8008b;
        }
        iVar.b();
        do {
            eVar2 = iVar.f8014b;
        } while (!f8011f.K(iVar, eVar2, e.f7997d));
        while (true) {
            eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                break;
            }
            eVar2 = eVar.f8000c;
            eVar.f8000c = eVar3;
        }
        while (eVar3 != null) {
            e eVar4 = eVar3.f8000c;
            d(eVar3.f7998a, eVar3.f7999b);
            eVar3 = eVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f8010e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f7994b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f7996a);
        }
        if (obj == f8012g) {
            return null;
        }
        return obj;
    }

    public static Object f(i iVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = iVar.get();
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
        e eVar = this.f8014b;
        e eVar2 = e.f7997d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f8000c = eVar;
                if (f8011f.K(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.f8014b;
                }
            } while (eVar != eVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f8013a;
        if (obj != null) {
            return false;
        }
        if (!f8011f.L(this, obj, f8009d ? new b(z2, new CancellationException("Future.cancel() was called.")) : z2 ? b.f7991c : b.f7992d)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8013a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f8015c;
            h hVar2 = h.f8006c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    android.support.v4.media.session.b bVar = f8011f;
                    bVar.n0(hVar3, hVar);
                    if (bVar.M(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8013a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar3);
                    } else {
                        hVar = this.f8015c;
                    }
                } while (hVar != hVar2);
            }
            return e(this.f8013a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8013a;
            if (obj3 != null) {
                return e(obj3);
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
            String strF = a.f(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strF2 = strF + jConvert + StringUtils.SPACE + lowerCase;
                if (z2) {
                    strF2 = a.f(strF2, ",");
                }
                strF = a.f(strF2, StringUtils.SPACE);
            }
            if (z2) {
                strF = strF + nanos2 + " nanoseconds ";
            }
            string3 = a.f(strF, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.f(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(a.g(string3, " for ", string));
    }

    public final void h(h hVar) {
        hVar.f8007a = null;
        while (true) {
            h hVar2 = this.f8015c;
            if (hVar2 == h.f8006c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f8008b;
                if (hVar2.f8007a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f8008b = hVar4;
                    if (hVar3.f8007a == null) {
                        break;
                    }
                } else if (!f8011f.M(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = f8012g;
        }
        if (!f8011f.L(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8013a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8013a != null;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!f8011f.L(this, null, new d(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f8013a instanceof b) {
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
                a.r(sb2, "PENDING, info=[", strG, "]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8013a;
            if (obj2 != null) {
                return e(obj2);
            }
            h hVar = this.f8015c;
            h hVar2 = h.f8006c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    android.support.v4.media.session.b bVar = f8011f;
                    bVar.n0(hVar3, hVar);
                    if (bVar.M(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8013a;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    hVar = this.f8015c;
                } while (hVar != hVar2);
            }
            return e(this.f8013a);
        }
        throw new InterruptedException();
    }
}
