package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwy implements defpackage.rwu {
    private final java.lang.Object d = new java.lang.Object();
    private defpackage.rwt e = defpackage.rwt.a;
    private final defpackage.yfd f;
    private final defpackage.rxs g;
    private static final defpackage.yqk b = defpackage.omv.n("CAR.SERVICE");
    public static final defpackage.yhx a = defpackage.ysr.o(defpackage.rwt.c, new defpackage.rwt[0]);
    private static final defpackage.yhx c = defpackage.ysr.o(defpackage.rwt.b, defpackage.rwt.c);

    public rwy(defpackage.rxs rxsVar) {
        this.g = rxsVar;
        defpackage.yfd yfdVar = new defpackage.yfd(10);
        this.f = yfdVar;
        yfdVar.add(new com.google.android.gms.car.diagnostics.ConnectionState(java.lang.System.currentTimeMillis(), this.e.ordinal(), null, android.os.SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    private final void g(defpackage.rwt rwtVar, com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        defpackage.rwt rwtVar2;
        boolean zEquals;
        synchronized (this.d) {
            rwtVar2 = this.e;
            this.e = rwtVar;
            this.f.add(new com.google.android.gms.car.diagnostics.ConnectionState(java.lang.System.currentTimeMillis(), rwtVar.ordinal(), criticalError, android.os.SystemClock.elapsedRealtime()));
        }
        int iOrdinal = rwtVar2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zEquals = defpackage.rwt.d.equals(rwtVar);
                } else if (iOrdinal == 3) {
                    zEquals = defpackage.rwt.e.equals(rwtVar);
                } else {
                    if (iOrdinal != 4) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    if (!defpackage.rwt.a.equals(rwtVar) && !defpackage.rwt.b.equals(rwtVar)) {
                        b.h().ai(8472).M("Unexpected state transition: %s->%s", rwtVar2, rwtVar);
                    }
                }
            } else if (!defpackage.rwt.c.equals(rwtVar) && !defpackage.rwt.d.equals(rwtVar)) {
                b.h().ai(8472).M("Unexpected state transition: %s->%s", rwtVar2, rwtVar);
            }
            b.f().ai(8471).M("Car connection state changed: %s->%s", rwtVar2, rwtVar);
        }
        zEquals = defpackage.rwt.b.equals(rwtVar);
        if (!zEquals) {
            b.h().ai(8472).M("Unexpected state transition: %s->%s", rwtVar2, rwtVar);
        }
        b.f().ai(8471).M("Car connection state changed: %s->%s", rwtVar2, rwtVar);
    }

    @Override // defpackage.rwu
    public final defpackage.rwt a() {
        defpackage.rwt rwtVar;
        synchronized (this.d) {
            rwtVar = this.e;
        }
        return rwtVar;
    }

    @Override // defpackage.rwu
    public final java.util.List b() {
        defpackage.ygw ygwVarO;
        synchronized (this.d) {
            ygwVarO = defpackage.ygw.o(this.f);
        }
        return ygwVarO;
    }

    @Override // defpackage.rwu
    public final void c() {
        f(c);
    }

    @Override // defpackage.rwu
    public final void d(defpackage.rwt rwtVar) {
        boolean z = false;
        if (rwtVar != defpackage.rwt.e && rwtVar != defpackage.rwt.d) {
            z = true;
        }
        defpackage.ysr.aY(z, "newState cannot be DISCONNECTED or DISCONNECTING, please use updateState(newState, reason) instead.");
        g(rwtVar, null);
    }

    @Override // defpackage.rwu
    public final void e(defpackage.rwt rwtVar, com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        boolean z = true;
        if (rwtVar != defpackage.rwt.e && rwtVar != defpackage.rwt.d) {
            z = false;
        }
        defpackage.ysr.aY(z, "newState must be DISCONNECTED or DISCONNECTING.");
        g(rwtVar, criticalError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(defpackage.yhx yhxVar) {
        java.lang.Object obj = this.d;
        synchronized (obj) {
            if (yhxVar.contains(this.e)) {
                return;
            }
            if (adck.a.b().a()) {
                synchronized (obj) {
                    defpackage.ygw ygwVarH = defpackage.ygw.o(this.f).h();
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int size = ygwVarH.size();
                    com.google.android.gms.car.diagnostics.CriticalError criticalError = null;
                    long j = 0;
                    long j2 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        com.google.android.gms.car.diagnostics.ConnectionState connectionState = (com.google.android.gms.car.diagnostics.ConnectionState) ygwVarH.get(i);
                        if (z) {
                            if (z2) {
                                break;
                            } else {
                                z2 = false;
                            }
                        }
                        int i2 = connectionState.b;
                        if (i2 == defpackage.rwt.c.ordinal() && !z2) {
                            j = jElapsedRealtime - connectionState.d;
                            z2 = true;
                        } else if ((i2 == defpackage.rwt.e.ordinal() || i2 == defpackage.rwt.d.ordinal()) && !z) {
                            com.google.android.gms.car.diagnostics.CriticalError criticalError2 = connectionState.c;
                            j2 = jElapsedRealtime - connectionState.d;
                            criticalError = criticalError2;
                            z = true;
                        }
                    }
                    defpackage.rxs rxsVar = this.g;
                    if (criticalError != null) {
                        rxsVar.c(defpackage.zaj.b(criticalError.a), defpackage.zak.b(criticalError.b), j, j2);
                    } else {
                        rxsVar.c(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL, j, j2);
                    }
                }
            }
            throw new java.lang.IllegalStateException("OutOfCarLifecycle");
        }
    }
}
