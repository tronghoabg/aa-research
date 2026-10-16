package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class adtc extends adqq {
    public static final Logger a = Logger.getLogger(adtc.class.getName());
    private static final adqq l = new adsz();
    public final String b;
    public final adjq c;
    public volatile boolean d;
    public List e;
    public adtb f;
    public adqq g;
    private final ScheduledFuture h;
    private final Executor i;
    private admc j;
    private adnq k;
    private adqq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected adtc(Executor executor, ScheduledExecutorService scheduledExecutorService, adjr adjrVar) {
        adtc adtcVar;
        long jB;
        String str;
        super(null, null);
        ScheduledFuture<?> scheduledFutureSchedule = null;
        this.e = new ArrayList();
        this.b = "name_resolver";
        executor.getClass();
        this.i = executor;
        scheduledExecutorService.getClass();
        adjq adjqVarK = adjq.k();
        this.c = adjqVarK;
        adjr adjrVarB = adjqVarK.b();
        if (adjrVar != null && (adjrVarB == null || adjrVar.e(adjrVarB))) {
            jB = adjrVar.b(TimeUnit.NANOSECONDS);
            str = "CallOptions";
        } else {
            if (adjrVarB == null) {
                adtcVar = this;
                adtcVar.h = scheduledFutureSchedule;
            }
            jB = adjrVarB.b(TimeUnit.NANOSECONDS);
            Logger logger = a;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jB)));
                if (adjrVar == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(adjrVar.b(TimeUnit.NANOSECONDS))));
                }
                logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
            }
            str = "Context";
        }
        long j = jB;
        adtcVar = this;
        scheduledFutureSchedule = scheduledExecutorService.schedule(new jor(adtcVar, j, str, 7), j, TimeUnit.NANOSECONDS);
        adtcVar.h = scheduledFutureSchedule;
    }

    private final void bc(Runnable runnable) {
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    @Override // defpackage.adqq
    public final void b(adqq adqqVar, admc admcVar) {
        adnq adnqVar;
        boolean z;
        admcVar.getClass();
        woy.aa(this.m == null, "already started");
        synchronized (this) {
            adqqVar.getClass();
            this.m = adqqVar;
            adnqVar = this.k;
            z = this.d;
            if (!z) {
                adtb adtbVar = new adtb(this, adqqVar);
                this.f = adtbVar;
                this.j = admcVar;
                adqqVar = adtbVar;
            }
        }
        if (adnqVar != null) {
            this.i.execute(new adta(this, adqqVar, adnqVar));
        } else if (z) {
            this.g.b(adqqVar, admcVar);
        }
    }

    public final void ba(adqq adqqVar) {
        adqq adqqVar2 = this.g;
        woy.ad(adqqVar2 == null, "realCall already set to %s", adqqVar2);
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.g = adqqVar;
    }

    public final void bb(adqq adqqVar) {
        admc admcVar = this.j;
        this.j = null;
        uze uzeVar = new uze((Object) this, (Object) adqqVar, (Object) admcVar, 11, (short[]) null);
        adjq adjqVar = this.c;
        adjq adjqVarA = adjqVar.a();
        try {
            uzeVar.run();
        } finally {
            adjqVar.f(adjqVarA);
        }
    }

    @Override // defpackage.adqq
    public final void i(String str, Throwable th) {
        adnq adnqVar = adnq.c;
        adnq adnqVarE = str != null ? adnqVar.e(str) : adnqVar.e("Call cancelled without message");
        if (th != null) {
            adnqVarE = adnqVarE.d(th);
        }
        l(adnqVarE, false);
    }

    @Override // defpackage.adqq
    public final void j() {
        bc(new adpo(this, 4, null));
    }

    public final void l(adnq adnqVar, boolean z) {
        adqq adqqVar;
        boolean z2;
        synchronized (this) {
            if (this.g == null) {
                ba(l);
                adqqVar = this.m;
                this.k = adnqVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                adqqVar = null;
                z2 = true;
            }
            if (z2) {
                bc(new adsy(this, adnqVar, 0));
            } else {
                if (adqqVar != null) {
                    this.i.execute(new adta(this, adqqVar, adnqVar));
                }
                bb(adqqVar);
                o();
            }
            k();
        }
    }

    @Override // defpackage.adqq
    public final void m(int i) {
        if (this.d) {
            this.g.m(i);
        } else {
            bc(new adtf(this, i, 1));
        }
    }

    @Override // defpackage.adqq
    public final void n(Object obj) {
        if (this.d) {
            this.g.n(obj);
        } else {
            bc(new adsy(this, obj, 2, (char[]) null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.e = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L42
            adtb r0 = r3.f     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.i
            adsx r2 = new adsx
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L42
            r3.e = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtc.o():void");
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("realCall", this.g);
        return xxgVarAo.toString();
    }

    protected void k() {
    }
}
