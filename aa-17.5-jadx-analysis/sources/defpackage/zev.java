package defpackage;

import defpackage.zeu;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zev<V> extends zhm implements zgp<V> {
    static final Object k = new Object();
    static final zgo l = new zgo(zeu.class);
    static final boolean m;
    public static final a n;
    volatile zeu.d listenersField;
    volatile Object valueField;
    volatile e waitersField;

    abstract class a {
        public abstract zeu.d a(zev zevVar, zeu.d dVar);

        public abstract e b(zev zevVar, e eVar);

        public abstract void c(e eVar, e eVar2);

        public abstract void d(e eVar, Thread thread);

        public abstract boolean e(zev zevVar, zeu.d dVar, zeu.d dVar2);

        public abstract boolean f(zev zevVar, Object obj, Object obj2);

        public abstract boolean g(zev zevVar, e eVar, e eVar2);
    }

    /* loaded from: classes3.dex */
    final class b extends a {
        private static final AtomicReferenceFieldUpdater<e, Thread> a = AtomicReferenceFieldUpdater.newUpdater(e.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<e, e> b = AtomicReferenceFieldUpdater.newUpdater(e.class, e.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zev<?>, e> c = AtomicReferenceFieldUpdater.newUpdater(zev.class, e.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zev<?>, zeu.d> d = AtomicReferenceFieldUpdater.newUpdater(zev.class, zeu.d.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zev<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(zev.class, Object.class, "valueField");

        @Override // zev.a
        public final zeu.d a(zev zevVar, zeu.d dVar) {
            return d.getAndSet(zevVar, dVar);
        }

        @Override // zev.a
        public final e b(zev zevVar, e eVar) {
            return c.getAndSet(zevVar, eVar);
        }

        @Override // zev.a
        public final void c(e eVar, e eVar2) {
            b.lazySet(eVar, eVar2);
        }

        @Override // zev.a
        public final void d(e eVar, Thread thread) {
            a.lazySet(eVar, thread);
        }

        @Override // zev.a
        public final boolean e(zev zevVar, zeu.d dVar, zeu.d dVar2) {
            return defpackage.a.i(d, zevVar, dVar, dVar2);
        }

        @Override // zev.a
        public final boolean f(zev zevVar, Object obj, Object obj2) {
            return defpackage.a.i(e, zevVar, obj, obj2);
        }

        @Override // zev.a
        public final boolean g(zev zevVar, e eVar, e eVar2) {
            return defpackage.a.i(c, zevVar, eVar, eVar2);
        }
    }

    /* loaded from: classes3.dex */
    final class c extends a {
        @Override // zev.a
        public final zeu.d a(zev zevVar, zeu.d dVar) {
            zeu.d dVar2;
            synchronized (zevVar) {
                dVar2 = zevVar.listenersField;
                if (dVar2 != dVar) {
                    zevVar.listenersField = dVar;
                }
            }
            return dVar2;
        }

        @Override // zev.a
        public final e b(zev zevVar, e eVar) {
            e eVar2;
            synchronized (zevVar) {
                eVar2 = zevVar.waitersField;
                if (eVar2 != eVar) {
                    zevVar.waitersField = eVar;
                }
            }
            return eVar2;
        }

        @Override // zev.a
        public final void c(e eVar, e eVar2) {
            eVar.next = eVar2;
        }

        @Override // zev.a
        public final void d(e eVar, Thread thread) {
            eVar.thread = thread;
        }

        @Override // zev.a
        public final boolean e(zev zevVar, zeu.d dVar, zeu.d dVar2) {
            synchronized (zevVar) {
                if (zevVar.listenersField != dVar) {
                    return false;
                }
                zevVar.listenersField = dVar2;
                return true;
            }
        }

        @Override // zev.a
        public final boolean f(zev zevVar, Object obj, Object obj2) {
            synchronized (zevVar) {
                if (zevVar.valueField != obj) {
                    return false;
                }
                zevVar.valueField = obj2;
                return true;
            }
        }

        @Override // zev.a
        public final boolean g(zev zevVar, e eVar, e eVar2) {
            synchronized (zevVar) {
                if (zevVar.waitersField != eVar) {
                    return false;
                }
                zevVar.waitersField = eVar2;
                return true;
            }
        }
    }

    final class d extends a {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;
        public static final /* synthetic */ int g = 0;

        static {
            Unsafe unsafeM;
            try {
                try {
                    unsafeM = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    try {
                        unsafeM = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new zex());
                    } catch (Exception unused2) {
                        unsafeM = defpackage.a.M();
                    }
                }
                try {
                    c = unsafeM.objectFieldOffset(zev.class.getDeclaredField("waitersField"));
                    b = unsafeM.objectFieldOffset(zev.class.getDeclaredField("listenersField"));
                    d = unsafeM.objectFieldOffset(zev.class.getDeclaredField("valueField"));
                    e = unsafeM.objectFieldOffset(e.class.getDeclaredField("thread"));
                    f = unsafeM.objectFieldOffset(e.class.getDeclaredField("next"));
                    a = unsafeM;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Exception e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3);
            }
        }

        @Override // zev.a
        public final zeu.d a(zev zevVar, zeu.d dVar) {
            zeu.d dVar2;
            do {
                dVar2 = zevVar.listenersField;
                if (dVar == dVar2) {
                    break;
                }
            } while (!e(zevVar, dVar2, dVar));
            return dVar2;
        }

        @Override // zev.a
        public final e b(zev zevVar, e eVar) {
            e eVar2;
            do {
                eVar2 = zevVar.waitersField;
                if (eVar == eVar2) {
                    break;
                }
            } while (!g(zevVar, eVar2, eVar));
            return eVar2;
        }

        @Override // zev.a
        public final void c(e eVar, e eVar2) {
            a.putObject(eVar, f, eVar2);
        }

        @Override // zev.a
        public final void d(e eVar, Thread thread) {
            a.putObject(eVar, e, thread);
        }

        @Override // zev.a
        public final boolean e(zev zevVar, zeu.d dVar, zeu.d dVar2) {
            return zew.a(a, zevVar, b, dVar, dVar2);
        }

        @Override // zev.a
        public final boolean f(zev zevVar, Object obj, Object obj2) {
            return zew.a(a, zevVar, d, obj, obj2);
        }

        @Override // zev.a
        public final boolean g(zev zevVar, e eVar, e eVar2) {
            return zew.a(a, zevVar, c, eVar, eVar2);
        }
    }

    static {
        boolean z;
        a cVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        m = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                cVar = new d();
            } catch (Error | Exception e2) {
                try {
                    cVar = new b();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    cVar = new c();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                cVar = new b();
            } catch (NoClassDefFoundError unused2) {
                cVar = new c();
            }
        }
        th = null;
        th2 = null;
        n = cVar;
        if (th != null) {
            zgo zgoVar = l;
            zgoVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zgoVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void a(e eVar) {
        eVar.thread = null;
        while (true) {
            e eVar2 = this.waitersField;
            if (eVar2 != e.a) {
                e eVar3 = null;
                while (eVar2 != null) {
                    e eVar4 = eVar2.next;
                    if (eVar2.thread != null) {
                        eVar3 = eVar2;
                    } else if (eVar3 != null) {
                        eVar3.next = eVar4;
                        if (eVar3.thread == null) {
                            break;
                        }
                    } else if (!b(eVar2, eVar4)) {
                        break;
                    }
                    eVar2 = eVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean b(e eVar, e eVar2) {
        return n.g(this, eVar, eVar2);
    }

    public final Object s() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        boolean z = obj2 != null;
        int i = zeu.j;
        if (z && (!(obj2 instanceof zeu.b))) {
            return zeu.h(obj2);
        }
        e eVar = this.waitersField;
        if (eVar != e.a) {
            e eVar2 = new e();
            do {
                n.c(eVar2, eVar);
                if (b(eVar, eVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(eVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & (!(obj instanceof zeu.b))));
                    return zeu.h(obj);
                }
                eVar = this.waitersField;
            } while (eVar != e.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return zeu.h(obj3);
    }

    public final Object t(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && zeu.n(obj)) {
            return zeu.h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            e eVar = this.waitersField;
            if (eVar != e.a) {
                e eVar2 = new e();
                do {
                    n.c(eVar2, eVar);
                    if (b(eVar, eVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(eVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zeu.n(obj2)) {
                                return zeu.h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(eVar2);
                    } else {
                        eVar = this.waitersField;
                    }
                } while (eVar != e.a);
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return zeu.h(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zeu.n(obj4)) {
                return zeu.h(obj4);
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

    final class e {
        static final e a = new e(null);
        volatile e next;
        volatile Thread thread;

        public e() {
            zev.n.d(this, Thread.currentThread());
        }

        public e(byte[] bArr) {
        }
    }
}
