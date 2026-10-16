package defpackage;

import android.os.SystemClock;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes.dex */
public final class jex implements jer {
    private static final yph b = yph.c("CAR.SERVICE");
    private static final ygr c = yrm.o(jeq.c, new jeq[0]);
    private static final ygr d = yrm.o(jeq.f, jeq.c);
    private static final ygr e = yrm.o(jeq.b, jeq.f, jeq.c);
    private static final ygr f = ygr.p(1, 4);
    public final tmb a;
    private final Object g;
    private jeq h;
    private final ydx i;
    private final jfg j;

    public jex(jfg jfgVar) {
        tme tmeVar = new tme();
        this.g = new Object();
        this.h = jeq.a;
        this.a = tmeVar;
        this.j = jfgVar;
        ydx ydxVar = new ydx(10);
        this.i = ydxVar;
        ydxVar.add(new ConnectionState(Instant.now().toEpochMilli(), this.h.ordinal(), null, SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(ygr ygrVar) {
        Object obj = this.g;
        synchronized (obj) {
            if (ygrVar.contains(this.h)) {
                return;
            }
            if (f.contains(Integer.valueOf((int) acvz.a.gu().a()))) {
                synchronized (obj) {
                    yfq yfqVarH = yfq.o(this.i).h();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int size = yfqVarH.size();
                    CriticalError criticalError = null;
                    boolean z = false;
                    boolean z2 = false;
                    long j = 0;
                    long j2 = 0;
                    for (int i = 0; i < size; i++) {
                        ConnectionState connectionState = (ConnectionState) yfqVarH.get(i);
                        if (z) {
                            if (z2) {
                                break;
                            } else {
                                z2 = false;
                            }
                        }
                        int i2 = connectionState.b;
                        if (i2 == jeq.c.ordinal() && !z2) {
                            j = jElapsedRealtime - connectionState.d;
                            z2 = true;
                        } else if ((i2 == jeq.e.ordinal() || i2 == jeq.d.ordinal()) && !z) {
                            CriticalError criticalError2 = connectionState.c;
                            j2 = jElapsedRealtime - connectionState.d;
                            criticalError = criticalError2;
                            z = true;
                        }
                    }
                    if (criticalError == null) {
                        if (((int) acvz.a.gu().a()) == 1) {
                            ype ypeVar = (ype) ((ype) ((ype) b.h()).q(ypd.FULL)).ai(1969);
                            Boolean boolValueOf = Boolean.valueOf(j != 0);
                            zjc zjcVar = zjc.a;
                            ypeVar.M("Never entered DISCONNECTED state, ever entered connected state: %s, current state: %s", new zjd(zjcVar, boolValueOf), new zjd(zjcVar, Integer.valueOf(this.h.ordinal())));
                        }
                        this.j.d(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL, j, j2);
                    } else {
                        this.j.d(yze.b(criticalError.a), yzf.b(criticalError.b), j, j2);
                    }
                }
            }
            throw new IllegalStateException("OutOfCarLifecycle");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(defpackage.jeq r10, com.google.android.gms.car.diagnostics.CriticalError r11) {
        /*
            r9 = this;
            java.lang.Object r1 = r9.g
            monitor-enter(r1)
            jeq r0 = r9.h     // Catch: java.lang.Throwable -> Lb3
            r9.h = r10     // Catch: java.lang.Throwable -> Lb3
            ydx r9 = r9.i     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.car.diagnostics.ConnectionState r2 = new com.google.android.gms.car.diagnostics.ConnectionState     // Catch: java.lang.Throwable -> Lb3
            j$.time.Instant r3 = j$.time.Instant.now()     // Catch: java.lang.Throwable -> Lb3
            long r3 = r3.toEpochMilli()     // Catch: java.lang.Throwable -> Lb3
            int r5 = r10.ordinal()     // Catch: java.lang.Throwable -> Lb3
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb3
            r6 = r11
            r2.<init>(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb3
            r9.add(r2)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            int r9 = r0.ordinal()
            if (r9 == 0) goto L80
            r11 = 1
            if (r9 == r11) goto L6f
            r11 = 2
            if (r9 == r11) goto L68
            r11 = 3
            if (r9 == r11) goto L61
            r11 = 4
            if (r9 == r11) goto L50
            r11 = 5
            if (r9 != r11) goto L49
            jeq r9 = defpackage.jeq.c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9d
            jeq r9 = defpackage.jeq.d
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9d
            goto L88
        L49:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r10 = 0
            r9.<init>(r10, r10)
            throw r9
        L50:
            jeq r9 = defpackage.jeq.a
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9d
            jeq r9 = defpackage.jeq.b
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9d
            goto L88
        L61:
            jeq r9 = defpackage.jeq.e
            boolean r9 = r9.equals(r10)
            goto L86
        L68:
            jeq r9 = defpackage.jeq.d
            boolean r9 = r9.equals(r10)
            goto L86
        L6f:
            jeq r9 = defpackage.jeq.f
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9d
            jeq r9 = defpackage.jeq.d
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9d
            goto L88
        L80:
            jeq r9 = defpackage.jeq.b
            boolean r9 = r9.equals(r10)
        L86:
            if (r9 != 0) goto L9d
        L88:
            yph r9 = defpackage.jex.b
            yop r9 = r9.h()
            ype r9 = (defpackage.ype) r9
            r11 = 1971(0x7b3, float:2.762E-42)
            yop r9 = r9.ai(r11)
            ype r9 = (defpackage.ype) r9
            java.lang.String r11 = "Unexpected state transition: %s->%s"
            r9.M(r11, r0, r10)
        L9d:
            yph r9 = defpackage.jex.b
            yop r9 = r9.f()
            ype r9 = (defpackage.ype) r9
            r11 = 1970(0x7b2, float:2.76E-42)
            yop r9 = r9.ai(r11)
            ype r9 = (defpackage.ype) r9
            java.lang.String r11 = "Car connection state changed: %s->%s"
            r9.M(r11, r0, r10)
            return
        Lb3:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jex.i(jeq, com.google.android.gms.car.diagnostics.CriticalError):void");
    }

    @Override // defpackage.jer
    public final jeq a() {
        jeq jeqVar;
        synchronized (this.g) {
            jeqVar = this.h;
        }
        return jeqVar;
    }

    @Override // defpackage.jer
    public final void b() {
        h(c);
    }

    @Override // defpackage.jer
    public final void c() {
        h(e);
    }

    @Override // defpackage.jer
    public final void d() {
        h(d);
    }

    @Override // defpackage.jer
    public final void e(jeq jeqVar) {
        boolean z = false;
        if (jeqVar != jeq.e && jeqVar != jeq.d) {
            z = true;
        }
        woy.O(z, "newState cannot be DISCONNECTED or DISCONNECTING, please use updateState(newState, reason) instead.");
        i(jeqVar, null);
    }

    @Override // defpackage.jer
    public final void f(jeq jeqVar, CriticalError criticalError) {
        boolean z = true;
        if (jeqVar != jeq.e && jeqVar != jeq.d) {
            z = false;
        }
        woy.O(z, "newState must be DISCONNECTED or DISCONNECTING.");
        i(jeqVar, criticalError);
    }

    public final List g() {
        yfq yfqVarO;
        synchronized (this.g) {
            yfqVarO = yfq.o(this.i);
        }
        return yfqVarO;
    }
}
