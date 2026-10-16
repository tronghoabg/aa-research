package com.google.d.m.a;

import androidx.credentials.provider.CredentialEntry;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class s<V> extends com.google.d.m.a.a.a implements bm<V> {

    /* renamed from: a, reason: collision with root package name */
    private static final l f8086a;

    /* renamed from: e, reason: collision with root package name */
    static final Object f8087e = new Object();

    /* renamed from: f, reason: collision with root package name */
    static final bl f8088f = new bl(k.class);

    /* renamed from: g, reason: collision with root package name */
    static final boolean f8089g;
    volatile h listenersField;
    volatile Object valueField;
    volatile r waitersField;

    static {
        boolean z;
        l nVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", CredentialEntry.FALSE_STRING));
        } catch (SecurityException unused) {
            z = false;
        }
        f8089g = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                nVar = new q();
            } catch (Error | Exception e2) {
                try {
                    nVar = new m();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    nVar = new n();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                nVar = new m();
            } catch (NoClassDefFoundError unused2) {
                nVar = new n();
            }
        }
        th = null;
        th2 = null;
        f8086a = nVar;
        if (th != null) {
            bl blVar = f8088f;
            blVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            blVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    s() {
    }

    private static void a(r rVar, r rVar2) {
        f8086a.c(rVar, rVar2);
    }

    private final void b(r rVar) {
        rVar.thread = null;
        while (true) {
            r rVar2 = this.waitersField;
            if (rVar2 != r.f8085a) {
                r rVar3 = null;
                while (rVar2 != null) {
                    r rVar4 = rVar2.next;
                    if (rVar2.thread != null) {
                        rVar3 = rVar2;
                    } else if (rVar3 != null) {
                        rVar3.next = rVar4;
                        if (rVar3.thread == null) {
                            break;
                        }
                    } else if (!c(rVar2, rVar4)) {
                        break;
                    }
                    rVar2 = rVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean c(r rVar, r rVar2) {
        return f8086a.g(this, rVar, rVar2);
    }

    static boolean w(s sVar, Object obj, Object obj2) {
        return f8086a.f(sVar, obj, obj2);
    }

    final h q(h hVar) {
        return f8086a.a(this, hVar);
    }

    final Object r() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && k.n(obj2)) {
            return k.j(obj2);
        }
        r rVar = this.waitersField;
        if (rVar != r.f8085a) {
            r rVar2 = new r();
            do {
                a(rVar2, rVar);
                if (c(rVar, rVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(rVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & k.n(obj)));
                    return k.j(obj);
                }
                rVar = this.waitersField;
            } while (rVar != r.f8085a);
        }
        return k.j(Objects.requireNonNull(this.valueField));
    }

    final Object s(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && k.n(obj)) {
            return k.j(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r rVar = this.waitersField;
            if (rVar != r.f8085a) {
                r rVar2 = new r();
                while (true) {
                    a(rVar2, rVar);
                    if (c(rVar, rVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(rVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && k.n(obj2)) {
                                return k.j(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(rVar2);
                    } else {
                        r rVar3 = this.waitersField;
                        if (rVar3 == r.f8085a) {
                            break;
                        }
                        rVar = rVar3;
                    }
                }
            }
            return k.j(Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            Object obj3 = this.valueField;
            if ((obj3 != null) && k.n(obj3)) {
                return k.j(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
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
        throw new TimeoutException(strConcat + " for " + string);
    }

    final void u() {
        for (r rVarB = f8086a.b(this, r.f8085a); rVarB != null; rVarB = rVarB.next) {
            Thread thread = rVarB.thread;
            if (thread != null) {
                rVarB.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final boolean v(h hVar, h hVar2) {
        return f8086a.e(this, hVar, hVar2);
    }
}
