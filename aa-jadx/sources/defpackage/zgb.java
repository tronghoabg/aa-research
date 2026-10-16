package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class zgb<V> extends defpackage.zio implements defpackage.zhs<V> {
    static final java.lang.Object k = new java.lang.Object();
    static final defpackage.zhr l = new defpackage.zhr(defpackage.zga.class);
    static final boolean m;
    public static final zgb.a n;
    volatile zga.d listenersField;
    volatile java.lang.Object valueField;
    volatile zgb.d waitersField;

    abstract class a {
        public abstract zga.d a(defpackage.zgb zgbVar, zga.d dVar);

        public abstract zgb.d b(defpackage.zgb zgbVar, zgb.d dVar);

        public abstract void c(zgb.d dVar, zgb.d dVar2);

        public abstract void d(zgb.d dVar, java.lang.Thread thread);

        public abstract boolean e(defpackage.zgb zgbVar, zga.d dVar, zga.d dVar2);

        public abstract boolean f(defpackage.zgb zgbVar, java.lang.Object obj, java.lang.Object obj2);

        public abstract boolean g(defpackage.zgb zgbVar, zgb.d dVar, zgb.d dVar2);
    }

    /* JADX INFO: loaded from: classes3.dex */
    final class b extends zgb.a {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<zgb.d, java.lang.Thread> a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(zgb.d.class, java.lang.Thread.class, "thread");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<zgb.d, zgb.d> b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(zgb.d.class, zgb.d.class, "next");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super defpackage.zgb<?>, zgb.d> c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.zgb.class, zgb.d.class, "waitersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super defpackage.zgb<?>, zga.d> d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.zgb.class, zga.d.class, "listenersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super defpackage.zgb<?>, java.lang.Object> e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.zgb.class, java.lang.Object.class, "valueField");

        @Override // zgb.a
        public final zga.d a(defpackage.zgb zgbVar, zga.d dVar) {
            return d.getAndSet(zgbVar, dVar);
        }

        @Override // zgb.a
        public final zgb.d b(defpackage.zgb zgbVar, zgb.d dVar) {
            return c.getAndSet(zgbVar, dVar);
        }

        @Override // zgb.a
        public final void c(zgb.d dVar, zgb.d dVar2) {
            b.lazySet(dVar, dVar2);
        }

        @Override // zgb.a
        public final void d(zgb.d dVar, java.lang.Thread thread) {
            a.lazySet(dVar, thread);
        }

        @Override // zgb.a
        public final boolean e(defpackage.zgb zgbVar, zga.d dVar, zga.d dVar2) {
            return defpackage.a.h(d, zgbVar, dVar, dVar2);
        }

        @Override // zgb.a
        public final boolean f(defpackage.zgb zgbVar, java.lang.Object obj, java.lang.Object obj2) {
            return defpackage.a.h(e, zgbVar, obj, obj2);
        }

        @Override // zgb.a
        public final boolean g(defpackage.zgb zgbVar, zgb.d dVar, zgb.d dVar2) {
            return defpackage.a.h(c, zgbVar, dVar, dVar2);
        }
    }

    final class c extends zgb.a {
        static final sun.misc.Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;
        public static final /* synthetic */ int g = 0;

        static {
            sun.misc.Unsafe unsafeL;
            try {
                try {
                    unsafeL = sun.misc.Unsafe.getUnsafe();
                } catch (java.lang.SecurityException unused) {
                    try {
                        unsafeL = (sun.misc.Unsafe) java.lang.Class.forName("java.security.AccessController").getMethod("doPrivileged", java.security.PrivilegedExceptionAction.class).invoke(null, new defpackage.zgd());
                    } catch (java.lang.Exception unused2) {
                        unsafeL = defpackage.a.L();
                    }
                }
                try {
                    c = unsafeL.objectFieldOffset(defpackage.zgb.class.getDeclaredField("waitersField"));
                    b = unsafeL.objectFieldOffset(defpackage.zgb.class.getDeclaredField("listenersField"));
                    d = unsafeL.objectFieldOffset(defpackage.zgb.class.getDeclaredField("valueField"));
                    e = unsafeL.objectFieldOffset(zgb.d.class.getDeclaredField("thread"));
                    f = unsafeL.objectFieldOffset(zgb.d.class.getDeclaredField("next"));
                    a = unsafeL;
                } catch (java.lang.NoSuchFieldException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            } catch (java.lang.Exception e3) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e3);
            }
        }

        @Override // zgb.a
        public final zga.d a(defpackage.zgb zgbVar, zga.d dVar) {
            zga.d dVar2;
            do {
                dVar2 = zgbVar.listenersField;
                if (dVar == dVar2) {
                    break;
                }
            } while (!e(zgbVar, dVar2, dVar));
            return dVar2;
        }

        @Override // zgb.a
        public final zgb.d b(defpackage.zgb zgbVar, zgb.d dVar) {
            zgb.d dVar2;
            do {
                dVar2 = zgbVar.waitersField;
                if (dVar == dVar2) {
                    break;
                }
            } while (!g(zgbVar, dVar2, dVar));
            return dVar2;
        }

        @Override // zgb.a
        public final void c(zgb.d dVar, zgb.d dVar2) {
            a.putObject(dVar, f, dVar2);
        }

        @Override // zgb.a
        public final void d(zgb.d dVar, java.lang.Thread thread) {
            a.putObject(dVar, e, thread);
        }

        @Override // zgb.a
        public final boolean e(defpackage.zgb zgbVar, zga.d dVar, zga.d dVar2) {
            return defpackage.zgc.a(a, zgbVar, b, dVar, dVar2);
        }

        @Override // zgb.a
        public final boolean f(defpackage.zgb zgbVar, java.lang.Object obj, java.lang.Object obj2) {
            return defpackage.zgc.a(a, zgbVar, d, obj, obj2);
        }

        @Override // zgb.a
        public final boolean g(defpackage.zgb zgbVar, zgb.d dVar, zgb.d dVar2) {
            return defpackage.zgc.a(a, zgbVar, c, dVar, dVar2);
        }
    }

    static {
        boolean z;
        zgb.a bVar;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        m = z;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                bVar = new zgb.c();
            } catch (java.lang.Error | java.lang.Exception unused2) {
                bVar = new zgb.b();
            }
        } else {
            bVar = new zgb.b();
        }
        n = bVar;
    }

    private final void a(zgb.d dVar) {
        dVar.thread = null;
        while (true) {
            zgb.d dVar2 = this.waitersField;
            if (dVar2 != zgb.d.a) {
                zgb.d dVar3 = null;
                while (dVar2 != null) {
                    zgb.d dVar4 = dVar2.next;
                    if (dVar2.thread != null) {
                        dVar3 = dVar2;
                    } else if (dVar3 != null) {
                        dVar3.next = dVar4;
                        if (dVar3.thread == null) {
                        }
                    } else if (!b(dVar2, dVar4)) {
                    }
                    dVar2 = dVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean b(zgb.d dVar, zgb.d dVar2) {
        return n.g(this, dVar, dVar2);
    }

    public final java.lang.Object s() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.valueField;
        boolean z = obj2 != null;
        int i = defpackage.zga.j;
        if (z && (!(obj2 instanceof zga.b))) {
            return defpackage.zga.h(obj2);
        }
        zgb.d dVar = this.waitersField;
        if (dVar != zgb.d.a) {
            zgb.d dVar2 = new zgb.d();
            do {
                n.c(dVar2, dVar);
                if (b(dVar, dVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            a(dVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & (!(obj instanceof zga.b))));
                    return defpackage.zga.h(obj);
                }
                dVar = this.waitersField;
            } while (dVar != zgb.d.a);
        }
        java.lang.Object obj3 = this.valueField;
        obj3.getClass();
        return defpackage.zga.h(obj3);
    }

    public final java.lang.Object t(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && defpackage.zga.n(obj)) {
            return defpackage.zga.h(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zgb.d dVar = this.waitersField;
            if (dVar != zgb.d.a) {
                zgb.d dVar2 = new zgb.d();
                while (true) {
                    n.c(dVar2, dVar);
                    if (b(dVar, dVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                a(dVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.valueField;
                            if ((obj2 != null) && defpackage.zga.n(obj2)) {
                                return defpackage.zga.h(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        a(dVar2);
                        break;
                    }
                    dVar = this.waitersField;
                    if (dVar == zgb.d.a) {
                    }
                }
            }
            java.lang.Object obj3 = this.valueField;
            obj3.getClass();
            return defpackage.zga.h(obj3);
        }
        while (nanos > 0) {
            java.lang.Object obj4 = this.valueField;
            if ((obj4 != null) && defpackage.zga.n(obj4)) {
                return defpackage.zga.h(obj4);
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

    final class d {
        static final zgb.d a = new zgb.d(null);
        volatile zgb.d next;
        volatile java.lang.Thread thread;

        public d() {
            defpackage.zgb.n.d(this, java.lang.Thread.currentThread());
        }

        public d(byte[] bArr) {
        }
    }
}
