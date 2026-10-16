package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class k<V> extends s<V> {
    protected k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object f(bm bmVar) {
        Throwable thK;
        if (bmVar instanceof i) {
            Object dVar = ((k) bmVar).valueField;
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                if (dVar2.f8064c) {
                    Throwable th = dVar2.f8065d;
                    dVar = th != null ? new d(false, th) : d.f8063b;
                }
            }
            return Objects.requireNonNull(dVar);
        }
        if ((bmVar instanceof com.google.d.m.a.a.a) && (thK = ((com.google.d.m.a.a.a) bmVar).k()) != null) {
            return new g(thK);
        }
        boolean zIsCancelled = bmVar.isCancelled();
        if ((!f8089g) && zIsCancelled) {
            return Objects.requireNonNull(d.f8063b);
        }
        try {
            Object objG = g(bmVar);
            if (!zIsCancelled) {
                return h(objG);
            }
            return new d(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(bmVar)));
        } catch (Error | Exception e2) {
            return new g(e2);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new g(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(bmVar))), e3)) : new d(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new d(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(bmVar))), e4)) : new g(e4.getCause());
        }
    }

    private static Object g(Future future) {
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
                    cf.t();
                }
                throw th;
            }
        }
        if (z) {
            cf.t();
        }
        return obj;
    }

    private static Object h(Object obj) {
        return obj == null ? f8087e : obj;
    }

    static Object j(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((d) obj).f8065d);
            throw cancellationException;
        }
        if (obj instanceof g) {
            throw new ExecutionException(((g) obj).f8069b);
        }
        if (obj == f8087e) {
            return null;
        }
        return obj;
    }

    static boolean n(Object obj) {
        return !(obj instanceof e);
    }

    private final void x(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            if (objG == null) {
                sb.append("null");
            } else if (objG == this) {
                sb.append("this future");
            } else {
                sb.append(objG.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objG)));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(k kVar, boolean z) {
        h hVar = null;
        while (true) {
            kVar.u();
            if (z) {
                kVar.l();
            }
            kVar.b();
            h hVar2 = hVar;
            h hVarQ = kVar.q(h.f8070a);
            h hVar3 = hVar2;
            while (hVarQ != null) {
                h hVar4 = hVarQ.next;
                hVarQ.next = hVar3;
                hVar3 = hVarQ;
                hVarQ = hVar4;
            }
            while (hVar3 != null) {
                Runnable runnable = hVar3.f8071b;
                hVar = hVar3.next;
                Runnable runnable2 = (Runnable) Objects.requireNonNull(runnable);
                if (runnable2 instanceof e) {
                    e eVar = (e) runnable2;
                    kVar = eVar.f8066a;
                    if (kVar.valueField != eVar || !w(kVar, eVar, f(eVar.f8067b))) {
                    }
                } else {
                    z(runnable2, (Executor) Objects.requireNonNull(hVar3.f8072c));
                }
                hVar3 = hVar;
            }
            return;
            z = false;
        }
    }

    private static void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f8088f.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void addListener(Runnable runnable, Executor executor) {
        h hVar;
        com.google.d.b.an.C(runnable, "Runnable was null.");
        com.google.d.b.an.C(executor, "Executor was null.");
        if (!isDone() && (hVar = this.listenersField) != h.f8070a) {
            h hVar2 = new h(runnable, executor);
            do {
                hVar2.next = hVar;
                if (v(hVar, hVar2)) {
                    return;
                } else {
                    hVar = this.listenersField;
                }
            } while (hVar != h.f8070a);
        }
        z(runnable, executor);
    }

    protected void b() {
    }

    protected boolean c(Object obj) {
        if (!w(this, null, h(obj))) {
            return false;
        }
        y(this, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.valueField
            boolean r1 = r0 instanceof com.google.d.m.a.e
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5e
            boolean r1 = com.google.d.m.a.k.f8089g
            if (r1 == 0) goto L1f
            com.google.d.m.a.d r1 = new com.google.d.m.a.d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L2a
        L1f:
            if (r7 == 0) goto L24
            com.google.d.m.a.d r1 = com.google.d.m.a.d.f8062a
            goto L26
        L24:
            com.google.d.m.a.d r1 = com.google.d.m.a.d.f8063b
        L26:
            java.lang.Object r1 = j$.util.Objects.requireNonNull(r1)
        L2a:
            r4 = r2
        L2b:
            boolean r5 = w(r6, r0, r1)
            if (r5 == 0) goto L55
            y(r6, r7)
            boolean r6 = r0 instanceof com.google.d.m.a.e
            if (r6 == 0) goto L54
            com.google.d.m.a.e r0 = (com.google.d.m.a.e) r0
            com.google.d.m.a.bm<? extends V> r6 = r0.f8067b
            boolean r0 = r6 instanceof com.google.d.m.a.i
            if (r0 == 0) goto L51
            com.google.d.m.a.k r6 = (com.google.d.m.a.k) r6
            java.lang.Object r0 = r6.valueField
            if (r0 != 0) goto L48
            r4 = r3
            goto L49
        L48:
            r4 = r2
        L49:
            boolean r5 = r0 instanceof com.google.d.m.a.e
            r4 = r4 | r5
            if (r4 == 0) goto L50
            r4 = r3
            goto L2b
        L50:
            return r3
        L51:
            r6.cancel(r7)
        L54:
            return r3
        L55:
            java.lang.Object r0 = r6.valueField
            boolean r5 = n(r0)
            if (r5 == 0) goto L2b
            return r4
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.m.a.k.cancel(boolean):boolean");
    }

    protected boolean d(Throwable th) {
        if (!w(this, null, new g(th))) {
            return false;
        }
        y(this, false);
        return true;
    }

    protected boolean e(bm bmVar) {
        g gVar;
        com.google.d.b.an.B(bmVar);
        Object obj = this.valueField;
        if (obj == null) {
            if (bmVar.isDone()) {
                if (!w(this, null, f(bmVar))) {
                    return false;
                }
                y(this, false);
                return true;
            }
            e eVar = new e(this, bmVar);
            if (w(this, null, eVar)) {
                try {
                    bmVar.addListener(eVar, al.f7989a);
                } catch (Throwable th) {
                    try {
                        gVar = new g(th);
                    } catch (Error | Exception unused) {
                        gVar = g.f8068a;
                    }
                    w(this, eVar, gVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof d) {
            bmVar.cancel(((d) obj).f8064c);
        }
        return false;
    }

    public V get() {
        return (V) r();
    }

    public boolean isCancelled() {
        return this.valueField instanceof d;
    }

    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & n(obj);
    }

    @Override // com.google.d.m.a.a.a
    protected final Throwable k() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof g) {
            return ((g) obj).f8069b;
        }
        return null;
    }

    protected void l() {
    }

    final void m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(o());
        }
    }

    protected final boolean o() {
        Object obj = this.valueField;
        return (obj instanceof d) && ((d) obj).f8064c;
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
            x(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof e) {
                sb.append(", setFuture=[");
                bm<? extends V> bmVar = ((e) obj).f8067b;
                try {
                    if (bmVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(bmVar);
                    }
                } catch (Throwable th) {
                    cf.v(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = com.google.d.b.an.c(a());
                } catch (Throwable th2) {
                    cf.v(th2);
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
                x(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public V get(long j2, TimeUnit timeUnit) {
        return (V) s(j2, timeUnit);
    }
}
