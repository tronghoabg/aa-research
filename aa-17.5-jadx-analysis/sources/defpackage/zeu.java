package defpackage;

import defpackage.zev;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class zeu<V> extends zev<V> {
    public static final /* synthetic */ int j = 0;

    final class a {
        static final a a;
        static final a b;
        final boolean c;
        final Throwable d;

        static {
            if (zev.m) {
                b = null;
                a = null;
            } else {
                b = new a(false, null);
                a = new a(true, null);
            }
        }

        public a(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    final class b<V> implements Runnable {
        final zeu<V> a;
        final zgp<? extends V> b;

        public b(zeu zeuVar, zgp zgpVar) {
            this.a = zeuVar;
            this.b = zgpVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.valueField != this) {
                return;
            }
            zgp<? extends V> zgpVar = this.b;
            if (zev.n.f(this.a, this, zeu.i(zgpVar))) {
                zeu.k(this.a, false);
            }
        }
    }

    final class c {
        static final c a = new c(new Throwable() { // from class: zeu.c.1
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            th.getClass();
            this.b = th;
        }
    }

    interface e<V> extends zgp<V> {
    }

    abstract class f<V> extends zeu<V> implements e<V> {
    }

    private static Object d(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    yrm.aF();
                }
                throw th;
            }
        }
        if (z) {
            yrm.aF();
        }
        return obj;
    }

    private final void e(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            if (objD == null) {
                sb.append("null");
            } else if (objD == this) {
                sb.append("this future");
            } else {
                sb.append(objD.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objD)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            l.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e2);
        }
    }

    static Object h(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((a) obj).d);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(zgp zgpVar) {
        Throwable thJ;
        if (zgpVar instanceof e) {
            Object aVar = ((zeu) zgpVar).valueField;
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                if (aVar2.c) {
                    Throwable th = aVar2.d;
                    aVar = th != null ? new a(false, th) : a.b;
                }
            }
            aVar.getClass();
            return aVar;
        }
        if ((zgpVar instanceof zhm) && (thJ = ((zhm) zgpVar).j()) != null) {
            return new c(thJ);
        }
        boolean zIsCancelled = zgpVar.isCancelled();
        if ((!m) && zIsCancelled) {
            a aVar3 = a.b;
            aVar3.getClass();
            return aVar3;
        }
        try {
            Object objD = d(zgpVar);
            return zIsCancelled ? new a(false, new IllegalArgumentException(defpackage.a.bY(zgpVar, "get() did not throw CancellationException, despite reporting isCancelled() == true: "))) : objD == null ? k : objD;
        } catch (Error | Exception e2) {
            return new c(e2);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(zgpVar))), e3)) : new a(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new a(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(zgpVar))), e4)) : new c(e4.getCause());
        }
    }

    public static void k(zeu zeuVar, boolean z) {
        d dVar = null;
        while (true) {
            for (zev.e eVarB = zev.n.b(zeuVar, zev.e.a); eVarB != null; eVarB = eVarB.next) {
                Thread thread = eVarB.thread;
                if (thread != null) {
                    eVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zeuVar.l();
            }
            zeuVar.b();
            d dVar2 = dVar;
            d dVarA = zev.n.a(zeuVar, d.a);
            d dVar3 = dVar2;
            while (dVarA != null) {
                d dVar4 = dVarA.next;
                dVarA.next = dVar3;
                dVar3 = dVarA;
                dVarA = dVar4;
            }
            while (dVar3 != null) {
                Runnable runnable = dVar3.b;
                dVar = dVar3.next;
                runnable.getClass();
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    zeuVar = bVar.a;
                    if (zeuVar.valueField == bVar) {
                        if (zev.n.f(zeuVar, bVar, i(bVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.c;
                    executor.getClass();
                    f(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
            z = false;
        }
    }

    static boolean n(Object obj) {
        return !(obj instanceof b);
    }

    @Override // defpackage.zgp
    public void c(Runnable runnable, Executor executor) {
        d dVar;
        executor.getClass();
        if (!isDone() && (dVar = this.listenersField) != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (zev.n.e(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listenersField;
                }
            } while (dVar != d.a);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.valueField
            boolean r1 = r0 instanceof zeu.b
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5d
            boolean r1 = defpackage.zeu.m
            if (r1 == 0) goto L1f
            zeu$a r1 = new zeu$a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L29
        L1f:
            if (r7 == 0) goto L24
            zeu$a r1 = zeu.a.a
            goto L26
        L24:
            zeu$a r1 = zeu.a.b
        L26:
            r1.getClass()
        L29:
            r4 = r2
        L2a:
            zev$a r5 = defpackage.zev.n
            boolean r5 = r5.f(r6, r0, r1)
            if (r5 == 0) goto L56
            k(r6, r7)
            boolean r6 = r0 instanceof zeu.b
            if (r6 == 0) goto L55
            zeu$b r0 = (zeu.b) r0
            zgp<? extends V> r6 = r0.b
            boolean r0 = r6 instanceof zeu.e
            if (r0 == 0) goto L52
            zeu r6 = (defpackage.zeu) r6
            java.lang.Object r0 = r6.valueField
            if (r0 != 0) goto L49
            r4 = r3
            goto L4a
        L49:
            r4 = r2
        L4a:
            boolean r5 = r0 instanceof zeu.b
            r4 = r4 | r5
            if (r4 == 0) goto L51
            r4 = r3
            goto L2a
        L51:
            return r3
        L52:
            r6.cancel(r7)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r6.valueField
            boolean r5 = r0 instanceof zeu.b
            if (r5 != 0) goto L2a
            return r4
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeu.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String fO() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.valueField != null) & (!(r2 instanceof b));
    }

    @Override // defpackage.zhm
    public final Throwable j() {
        if (!(this instanceof e)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof c) {
            return ((c) obj).b;
        }
        return null;
    }

    public final void m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(q());
        }
    }

    public final boolean o(Object obj) {
        if (obj == null) {
            obj = k;
        }
        if (!zev.n.f(this, null, obj)) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean p(Throwable th) {
        if (!zev.n.f(this, null, new c(th))) {
            return false;
        }
        k(this, false);
        return true;
    }

    protected final boolean q() {
        Object obj = this.valueField;
        return (obj instanceof a) && ((a) obj).c;
    }

    public final void r(zgp zgpVar) {
        c cVar;
        zgpVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (zgpVar.isDone()) {
                if (zev.n.f(this, null, i(zgpVar))) {
                    k(this, false);
                    return;
                }
                return;
            }
            b bVar = new b(this, zgpVar);
            if (zev.n.f(this, null, bVar)) {
                try {
                    zgpVar.c(bVar, zfq.a);
                    return;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.a;
                    }
                    zev.n.f(this, bVar, cVar);
                    return;
                }
            }
            obj = this.valueField;
        }
        if (obj instanceof a) {
            zgpVar.cancel(((a) obj).c);
        }
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof b) {
                sb.append(", setFuture=[");
                zgp<? extends V> zgpVar = ((b) obj).b;
                try {
                    if (zgpVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zgpVar);
                    }
                } catch (Throwable th) {
                    yrm.aH(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = woy.ak(fO());
                } catch (Throwable th2) {
                    yrm.aH(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
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
    public Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return t(j2, timeUnit);
    }

    final class d {
        static final d a = new d();
        final Runnable b;
        final Executor c;
        d next;

        public d() {
            this.b = null;
            this.c = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    protected void b() {
    }

    protected void l() {
    }
}
