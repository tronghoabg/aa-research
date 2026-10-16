package defpackage;

import android.os.SystemClock;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import java.util.List;

/* loaded from: classes.dex */
public final class rwf implements rwb {
    private final Object d = new Object();
    private rwa e = rwa.a;
    private final ydx f;
    private final rwz g;
    private static final ypf b = ols.R("CAR.SERVICE");
    public static final ygr a = yrm.o(rwa.c, new rwa[0]);
    private static final ygr c = yrm.o(rwa.b, rwa.c);

    public rwf(rwz rwzVar) {
        this.g = rwzVar;
        ydx ydxVar = new ydx(10);
        this.f = ydxVar;
        ydxVar.add(new ConnectionState(System.currentTimeMillis(), this.e.ordinal(), null, SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(defpackage.rwa r10, com.google.android.gms.car.diagnostics.CriticalError r11) {
        /*
            r9 = this;
            java.lang.Object r1 = r9.d
            monitor-enter(r1)
            rwa r0 = r9.e     // Catch: java.lang.Throwable -> L93
            r9.e = r10     // Catch: java.lang.Throwable -> L93
            ydx r9 = r9.f     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.car.diagnostics.ConnectionState r2 = new com.google.android.gms.car.diagnostics.ConnectionState     // Catch: java.lang.Throwable -> L93
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L93
            int r5 = r10.ordinal()     // Catch: java.lang.Throwable -> L93
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L93
            r6 = r11
            r2.<init>(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L93
            r9.add(r2)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L93
            int r9 = r0.ordinal()
            if (r9 == 0) goto L68
            r11 = 1
            if (r9 == r11) goto L57
            r11 = 2
            if (r9 == r11) goto L50
            r11 = 3
            if (r9 == r11) goto L49
            r11 = 4
            if (r9 != r11) goto L42
            rwa r9 = defpackage.rwa.a
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L81
            rwa r9 = defpackage.rwa.b
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L81
            goto L70
        L42:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r10 = 0
            r9.<init>(r10, r10)
            throw r9
        L49:
            rwa r9 = defpackage.rwa.e
            boolean r9 = r9.equals(r10)
            goto L6e
        L50:
            rwa r9 = defpackage.rwa.d
            boolean r9 = r9.equals(r10)
            goto L6e
        L57:
            rwa r9 = defpackage.rwa.c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L81
            rwa r9 = defpackage.rwa.d
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L81
            goto L70
        L68:
            rwa r9 = defpackage.rwa.b
            boolean r9 = r9.equals(r10)
        L6e:
            if (r9 != 0) goto L81
        L70:
            ypf r9 = defpackage.rwf.b
            yop r9 = r9.h()
            r11 = 8447(0x20ff, float:1.1837E-41)
            yop r9 = r9.ai(r11)
            java.lang.String r11 = "Unexpected state transition: %s->%s"
            r9.M(r11, r0, r10)
        L81:
            ypf r9 = defpackage.rwf.b
            yop r9 = r9.f()
            r11 = 8446(0x20fe, float:1.1835E-41)
            yop r9 = r9.ai(r11)
            java.lang.String r11 = "Car connection state changed: %s->%s"
            r9.M(r11, r0, r10)
            return
        L93:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L93
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwf.g(rwa, com.google.android.gms.car.diagnostics.CriticalError):void");
    }

    @Override // defpackage.rwb
    public final rwa a() {
        rwa rwaVar;
        synchronized (this.d) {
            rwaVar = this.e;
        }
        return rwaVar;
    }

    @Override // defpackage.rwb
    public final List b() {
        yfq yfqVarO;
        synchronized (this.d) {
            yfqVarO = yfq.o(this.f);
        }
        return yfqVarO;
    }

    @Override // defpackage.rwb
    public final void c() {
        f(c);
    }

    @Override // defpackage.rwb
    public final void d(rwa rwaVar) {
        boolean z = false;
        if (rwaVar != rwa.e && rwaVar != rwa.d) {
            z = true;
        }
        woy.O(z, "newState cannot be DISCONNECTED or DISCONNECTING, please use updateState(newState, reason) instead.");
        g(rwaVar, null);
    }

    @Override // defpackage.rwb
    public final void e(rwa rwaVar, CriticalError criticalError) {
        boolean z = true;
        if (rwaVar != rwa.e && rwaVar != rwa.d) {
            z = false;
        }
        woy.O(z, "newState must be DISCONNECTED or DISCONNECTING.");
        g(rwaVar, criticalError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ygr ygrVar) {
        Object obj = this.d;
        synchronized (obj) {
            if (ygrVar.contains(this.e)) {
                return;
            }
            if (adbl.a.gu().a()) {
                synchronized (obj) {
                    yfq yfqVarH = yfq.o(this.f).h();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int size = yfqVarH.size();
                    CriticalError criticalError = null;
                    long j = 0;
                    long j2 = 0;
                    boolean z = false;
                    boolean z2 = false;
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
                        if (i2 == rwa.c.ordinal() && !z2) {
                            j = jElapsedRealtime - connectionState.d;
                            z2 = true;
                        } else if ((i2 == rwa.e.ordinal() || i2 == rwa.d.ordinal()) && !z) {
                            CriticalError criticalError2 = connectionState.c;
                            j2 = jElapsedRealtime - connectionState.d;
                            criticalError = criticalError2;
                            z = true;
                        }
                    }
                    rwz rwzVar = this.g;
                    if (criticalError != null) {
                        rwzVar.c(yze.b(criticalError.a), yzf.b(criticalError.b), j, j2);
                    } else {
                        rwzVar.c(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL, j, j2);
                    }
                }
            }
            throw new IllegalStateException("OutOfCarLifecycle");
        }
    }
}
