package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zga<V> extends defpackage.zgb<V> {
    public static final /* synthetic */ int j = 0;

    final class a {
        static final zga.a a;
        static final zga.a b;
        final boolean c;
        final java.lang.Throwable d;

        static {
            if (defpackage.zgb.m) {
                b = null;
                a = null;
            } else {
                b = new zga.a(false, null);
                a = new zga.a(true, null);
            }
        }

        public a(boolean z, java.lang.Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    final class b<V> implements java.lang.Runnable {
        final defpackage.zga<V> a;
        final defpackage.zhs<? extends V> b;

        public b(defpackage.zga zgaVar, defpackage.zhs zhsVar) {
            this.a = zgaVar;
            this.b = zhsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.valueField != this) {
                return;
            }
            defpackage.zhs<? extends V> zhsVar = this.b;
            if (defpackage.zgb.n.f(this.a, this, defpackage.zga.i(zhsVar))) {
                defpackage.zga.k(this.a, false);
            }
        }
    }

    final class c {
        static final zga.c a = new zga.c(new java.lang.Throwable() { // from class: zga.c.1
            @Override // java.lang.Throwable
            public final java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable b;

        public c(java.lang.Throwable th) {
            th.getClass();
            this.b = th;
        }
    }

    interface e<V> extends defpackage.zhs<V> {
    }

    abstract class f<V> extends defpackage.zga<V> implements zga.e<V> {
    }

    private static java.lang.Object d(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    defpackage.ysr.cc();
                }
                throw th;
            }
        }
        if (z) {
            defpackage.ysr.cc();
        }
        return obj;
    }

    private final void e(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objD = d(this);
            sb.append("SUCCESS, result=[");
            if (objD == null) {
                sb.append("null");
            } else if (objD == this) {
                sb.append("this future");
            } else {
                sb.append(objD.getClass().getName());
                sb.append("@");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(objD)));
            }
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (java.lang.Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void f(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e2) {
            l.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (java.lang.Throwable) e2);
        }
    }

    static java.lang.Object h(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof zga.a) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(((zga.a) obj).d);
            throw cancellationException;
        }
        if (obj instanceof zga.c) {
            throw new java.util.concurrent.ExecutionException(((zga.c) obj).b);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object i(defpackage.zhs zhsVar) {
        java.lang.Throwable thJ;
        if (zhsVar instanceof zga.e) {
            java.lang.Object aVar = ((defpackage.zga) zhsVar).valueField;
            if (aVar instanceof zga.a) {
                zga.a aVar2 = (zga.a) aVar;
                if (aVar2.c) {
                    java.lang.Throwable th = aVar2.d;
                    aVar = th != null ? new zga.a(false, th) : zga.a.b;
                }
            }
            aVar.getClass();
            return aVar;
        }
        if ((zhsVar instanceof defpackage.zio) && (thJ = ((defpackage.zio) zhsVar).j()) != null) {
            return new zga.c(thJ);
        }
        boolean zIsCancelled = zhsVar.isCancelled();
        if ((!m) && zIsCancelled) {
            zga.a aVar3 = zga.a.b;
            aVar3.getClass();
            return aVar3;
        }
        try {
            java.lang.Object objD = d(zhsVar);
            if (zIsCancelled) {
                return new zga.a(false, new java.lang.IllegalArgumentException(defpackage.a.bX(zhsVar, "get() did not throw CancellationException, despite reporting isCancelled() == true: ")));
            }
            return objD == null ? k : objD;
        } catch (java.lang.Error | java.lang.Exception e2) {
            return new zga.c(e2);
        } catch (java.util.concurrent.CancellationException e3) {
            return !zIsCancelled ? new zga.c(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zhsVar))), e3)) : new zga.a(false, e3);
        } catch (java.util.concurrent.ExecutionException e4) {
            return zIsCancelled ? new zga.a(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zhsVar))), e4)) : new zga.c(e4.getCause());
        }
    }

    public static void k(defpackage.zga zgaVar, boolean z) {
        zga.d dVar = null;
        while (true) {
            for (zgb.d dVarB = defpackage.zgb.n.b(zgaVar, zgb.d.a); dVarB != null; dVarB = dVarB.next) {
                java.lang.Thread thread = dVarB.thread;
                if (thread != null) {
                    dVarB.thread = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            if (z) {
                zgaVar.l();
            }
            zgaVar.b();
            zga.d dVar2 = dVar;
            zga.d dVarA = defpackage.zgb.n.a(zgaVar, zga.d.a);
            zga.d dVar3 = dVar2;
            while (dVarA != null) {
                zga.d dVar4 = dVarA.next;
                dVarA.next = dVar3;
                dVar3 = dVarA;
                dVarA = dVar4;
            }
            while (dVar3 != null) {
                java.lang.Runnable runnable = dVar3.b;
                dVar = dVar3.next;
                runnable.getClass();
                if (runnable instanceof zga.b) {
                    zga.b bVar = (zga.b) runnable;
                    zgaVar = bVar.a;
                    if (zgaVar.valueField == bVar) {
                        if (defpackage.zgb.n.f(zgaVar, bVar, i(bVar.b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    java.util.concurrent.Executor executor = dVar3.c;
                    executor.getClass();
                    f(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    static boolean n(java.lang.Object obj) {
        return !(obj instanceof zga.b);
    }

    @Override // defpackage.zhs
    public void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        zga.d dVar;
        executor.getClass();
        if (!isDone() && (dVar = this.listenersField) != zga.d.a) {
            zga.d dVar2 = new zga.d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (defpackage.zgb.n.e(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listenersField;
                }
            } while (dVar != zga.d.a);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zga.a aVar;
        java.lang.Object obj = this.valueField;
        if (!(obj instanceof zga.b) && !(obj == null)) {
            return false;
        }
        if (m) {
            aVar = new zga.a(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            aVar = z ? zga.a.a : zga.a.b;
            aVar.getClass();
        }
        boolean z2 = false;
        while (true) {
            if (defpackage.zgb.n.f(this, obj, aVar)) {
                k(this, z);
                if (obj instanceof zga.b) {
                    defpackage.zhs<? extends V> zhsVar = ((zga.b) obj).b;
                    if (zhsVar instanceof zga.e) {
                        this = (defpackage.zga) zhsVar;
                        obj = this.valueField;
                        if (!(obj == null) && !(obj instanceof zga.b)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        zhsVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.valueField;
            if (!(obj instanceof zga.b)) {
                return z2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String eW() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zga.a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object obj = this.valueField;
        return (obj != null) & (!(obj instanceof zga.b));
    }

    @Override // defpackage.zio
    public final java.lang.Throwable j() {
        if (!(this instanceof zga.e)) {
            return null;
        }
        java.lang.Object obj = this.valueField;
        if (obj instanceof zga.c) {
            return ((zga.c) obj).b;
        }
        return null;
    }

    public final void m(java.util.concurrent.Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(q());
        }
    }

    public final boolean o(java.lang.Object obj) {
        if (obj == null) {
            obj = k;
        }
        if (!defpackage.zgb.n.f(this, null, obj)) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean p(java.lang.Throwable th) {
        if (!defpackage.zgb.n.f(this, null, new zga.c(th))) {
            return false;
        }
        k(this, false);
        return true;
    }

    protected final boolean q() {
        java.lang.Object obj = this.valueField;
        return (obj instanceof zga.a) && ((zga.a) obj).c;
    }

    public final void r(defpackage.zhs zhsVar) {
        zga.c cVar;
        zhsVar.getClass();
        java.lang.Object obj = this.valueField;
        if (obj == null) {
            if (zhsVar.isDone()) {
                if (defpackage.zgb.n.f(this, null, i(zhsVar))) {
                    k(this, false);
                    return;
                }
                return;
            }
            zga.b bVar = new zga.b(this, zhsVar);
            if (defpackage.zgb.n.f(this, null, bVar)) {
                try {
                    zhsVar.c(bVar, defpackage.zgt.INSTANCE);
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        cVar = new zga.c(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        cVar = zga.c.a;
                    }
                    defpackage.zgb.n.f(this, bVar, cVar);
                    return;
                }
            }
            obj = this.valueField;
        }
        if (obj instanceof zga.a) {
            zhsVar.cancel(((zga.a) obj).c);
        }
    }

    public java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            java.lang.Object obj = this.valueField;
            if (obj instanceof zga.b) {
                sb.append(", setFuture=[");
                defpackage.zhs<? extends V> zhsVar = ((zga.b) obj).b;
                try {
                    if (zhsVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zhsVar);
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.ysr.ce(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = defpackage.ysr.bu(eW());
                } catch (java.lang.Throwable th2) {
                    defpackage.ysr.ce(th2);
                    strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                e(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j2, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return t(j2, timeUnit);
    }

    final class d {
        static final zga.d a = new zga.d();
        final java.lang.Runnable b;
        final java.util.concurrent.Executor c;
        zga.d next;

        public d() {
            this.b = null;
            this.c = null;
        }

        public d(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    protected void b() {
    }

    protected void l() {
    }
}
