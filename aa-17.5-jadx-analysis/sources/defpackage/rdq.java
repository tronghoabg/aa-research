package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class rdq implements rdl {
    public final Context a;
    public final rdp b;
    public final rdk d;
    public final wyd e;
    private zgp f;
    public final Handler c = new sss(Looper.getMainLooper());
    private final AtomicBoolean g = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[Catch: SecurityException -> 0x009a, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x009a, blocks: (B:3:0x003e, B:5:0x0048, B:7:0x0052, B:9:0x005c, B:15:0x0080, B:17:0x008c, B:13:0x0069), top: B:23:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rdq(android.content.Context r12, defpackage.rdk r13, defpackage.wyd r14) {
        /*
            r11 = this;
            r11.<init>()
            sss r0 = new sss
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r11.c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r11.g = r0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r2 = defpackage.qsy.a
            android.content.Intent r6 = r0.setComponent(r2)
            r11.a = r12
            r11.d = r13
            r11.e = r14
            rdp r7 = new rdp
            r7.<init>(r11)
            r11.b = r7
            rdo r13 = new rdo
            r13.<init>(r11, r1)
            zgp r13 = defpackage.dsg.w(r13)
            r11.f = r13
            dnw r13 = r7.a
            r13.getClass()
            java.lang.String r14 = "goldfish"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch: java.lang.SecurityException -> L9a
            boolean r14 = r0.equals(r14)     // Catch: java.lang.SecurityException -> L9a
            if (r14 != 0) goto L69
            java.lang.String r14 = "ranchu"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch: java.lang.SecurityException -> L9a
            boolean r14 = r0.equals(r14)     // Catch: java.lang.SecurityException -> L9a
            if (r14 != 0) goto L69
            java.lang.String r14 = "cutf_cvm"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch: java.lang.SecurityException -> L9a
            boolean r14 = r0.equals(r14)     // Catch: java.lang.SecurityException -> L9a
            if (r14 != 0) goto L69
            java.lang.String r14 = "starfish"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch: java.lang.SecurityException -> L9a
            boolean r14 = r0.equals(r14)     // Catch: java.lang.SecurityException -> L9a
            if (r14 == 0) goto L67
            goto L69
        L67:
            r4 = r12
            goto L80
        L69:
            spi r3 = defpackage.spi.a()     // Catch: java.lang.SecurityException -> L9a
            java.lang.Class r14 = r12.getClass()     // Catch: java.lang.SecurityException -> L9a
            java.lang.String r5 = r14.getName()     // Catch: java.lang.SecurityException -> L9a
            r9 = 0
            r10 = 0
            r8 = 129(0x81, float:1.81E-43)
            r4 = r12
            boolean r12 = r3.e(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.SecurityException -> L9a
            if (r12 == 0) goto L8c
        L80:
            spi r12 = defpackage.spi.a()     // Catch: java.lang.SecurityException -> L9a
            r14 = 129(0x81, float:1.81E-43)
            boolean r12 = r12.d(r4, r6, r7, r14)     // Catch: java.lang.SecurityException -> L9a
            if (r12 != 0) goto La4
        L8c:
            r11.h()     // Catch: java.lang.SecurityException -> L9a
            rch r12 = new rch     // Catch: java.lang.SecurityException -> L9a
            java.lang.String r14 = "Gearhead Car Startup Service not found, or process cannot bind."
            r12.<init>(r14)     // Catch: java.lang.SecurityException -> L9a
            r11.g(r12, r13)     // Catch: java.lang.SecurityException -> L9a
            goto La4
        L9a:
            r0 = move-exception
            r12 = r0
            rch r14 = new rch
            r14.<init>(r12)
            r11.g(r14, r13)
        La4:
            nwg r12 = new nwg
            r14 = 13
            r12.<init>(r11, r14)
            zfq r11 = defpackage.zfq.a
            r13.a(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdq.<init>(android.content.Context, rdk, wyd):void");
    }

    public static void e(Handler handler, Runnable runnable) {
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final synchronized zgp i() {
        return this.f;
    }

    @Override // defpackage.rdl
    @ResultIgnorabilityUnspecified
    public final synchronized qup a() {
        zgp zgpVar;
        zgp zgpVar2 = this.f;
        if (zgpVar2 == null || !zgpVar2.isDone()) {
            throw new IllegalStateException("Client is not connected yet.");
        }
        try {
            zgpVar = this.f;
            woy.ad(zgpVar.isDone(), "Future was expected to be done: %s", zgpVar);
        } catch (CancellationException | ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IllegalStateException) {
                throw new IllegalStateException("Client is not connected.", cause);
            }
            if (cause instanceof rci) {
                throw new IllegalStateException("Client connection failed.", cause);
            }
            throw new IllegalStateException("Client not connected.", cause);
        }
        return (qup) a.L(zgpVar);
    }

    @Override // defpackage.rdl
    public final zgp b() {
        zgp zgpVarI = i();
        kpi kpiVar = new kpi(2);
        zfq zfqVar = zfq.a;
        int i = zfb.c;
        zfa zfaVar = new zfa(zgpVarI, kpiVar);
        zgpVarI.c(zfaVar, yrm.aK(zfqVar, zfaVar));
        return zfaVar;
    }

    @Override // defpackage.rdl
    public final synchronized void c() {
        if (!this.g.compareAndSet(false, true)) {
            if (rrd.e("GH.GhCarClientCtor", 4)) {
                rrd.d(4, "GH.GhCarClientCtor", null, "GearheadCarClientConnector has already been disconnected.", new Object[0]);
            }
        } else {
            if (rrd.e("GH.GhCarClientCtor", 4)) {
                rrd.d(4, "GH.GhCarClientCtor", null, "Disconnecting GearheadCarClientConnector.", new Object[0]);
            }
            if (!this.f.isDone()) {
                this.f.cancel(true);
            }
            h();
            this.f = new zhc(new IllegalStateException("Client has been disconnected and cannot be used."));
        }
    }

    @Override // defpackage.rdl
    public final synchronized boolean d() {
        throw null;
    }

    public final synchronized void f(rci rciVar, dnw dnwVar) {
        zgp zgpVar = this.f;
        if (zgpVar == null) {
            this.f = new zhc(rciVar);
            return;
        }
        if (!zgpVar.isDone() && dnwVar != null) {
            dnwVar.d(rciVar);
            return;
        }
        if (oni.i(this.f)) {
            this.f = new zhc(rciVar);
        }
    }

    public final void g(rci rciVar, dnw dnwVar) {
        if (rrd.e("GH.GhCarClientCtor", 4)) {
            Throwable cause = rciVar.getCause();
            if (cause == null) {
                rrd.d(4, "GH.GhCarClientCtor", rciVar, "onConnectionFailure: %s", new zjd(zjc.a, rciVar.getMessage()));
            } else {
                String message = rciVar.getMessage();
                zjc zjcVar = zjc.a;
                rrd.d(4, "GH.GhCarClientCtor", rciVar, "onConnectionFailure: %s, caused by %s: %s", new zjd(zjcVar, message), new zjd(zjcVar, cause.getClass().getName()), new zjd(zjcVar, cause.getMessage()));
            }
        }
        f(rciVar, dnwVar);
        e(this.c, new qqy(this, rciVar, 7, (char[]) null));
    }

    public final void h() {
        if (rrd.e("GH.GhCarClientCtor", 4)) {
            rrd.d(4, "GH.GhCarClientCtor", null, "Unbinding service connection.", new Object[0]);
        }
        spi.a().c(this.a, this.b);
    }
}
