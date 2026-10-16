package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jff implements defpackage.jez {
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.SERVICE");
    private static final defpackage.yhx c = defpackage.ysr.o(defpackage.jey.c, new defpackage.jey[0]);
    private static final defpackage.yhx d = defpackage.ysr.o(defpackage.jey.f, defpackage.jey.c);
    private static final defpackage.yhx e = defpackage.ysr.o(defpackage.jey.b, defpackage.jey.f, defpackage.jey.c);
    private static final defpackage.yhx f = defpackage.yhx.p(1, 4);
    public final defpackage.tmy a;
    private final java.lang.Object g;
    private defpackage.jey h;
    private final defpackage.yfd i;
    private final defpackage.jfo j;

    public jff(defpackage.jfo jfoVar) {
        defpackage.tnc tncVar = new defpackage.tnc();
        this.g = new java.lang.Object();
        this.h = defpackage.jey.a;
        this.a = tncVar;
        this.j = jfoVar;
        defpackage.yfd yfdVar = new defpackage.yfd(10);
        this.i = yfdVar;
        yfdVar.add(new com.google.android.gms.car.diagnostics.ConnectionState(j$.time.Instant.now().toEpochMilli(), this.h.ordinal(), null, android.os.SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(defpackage.yhx yhxVar) {
        java.lang.Object obj = this.g;
        synchronized (obj) {
            if (yhxVar.contains(this.h)) {
                return;
            }
            if (f.contains(java.lang.Integer.valueOf((int) defpackage.acxb.a.fF().a()))) {
                synchronized (obj) {
                    defpackage.ygw ygwVarH = defpackage.ygw.o(this.i).h();
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int size = ygwVarH.size();
                    com.google.android.gms.car.diagnostics.CriticalError criticalError = null;
                    boolean z = false;
                    boolean z2 = false;
                    long j = 0;
                    long j2 = 0;
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
                        if (i2 == defpackage.jey.c.ordinal() && !z2) {
                            j = jElapsedRealtime - connectionState.d;
                            z2 = true;
                        } else if ((i2 == defpackage.jey.e.ordinal() || i2 == defpackage.jey.d.ordinal()) && !z) {
                            com.google.android.gms.car.diagnostics.CriticalError criticalError2 = connectionState.c;
                            j2 = jElapsedRealtime - connectionState.d;
                            criticalError = criticalError2;
                            z = true;
                        }
                    }
                    if (criticalError == null) {
                        if (((int) defpackage.acxb.a.fF().a()) == 1) {
                            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).q(defpackage.yqi.FULL)).ai(1969);
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(j != 0);
                            defpackage.zke zkeVar = defpackage.zke.a;
                            yqjVar.M("Never entered DISCONNECTED state, ever entered connected state: %s, current state: %s", new defpackage.zkf(zkeVar, boolValueOf), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(this.h.ordinal())));
                        }
                        this.j.d(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL, j, j2);
                    } else {
                        this.j.d(defpackage.zaj.b(criticalError.a), defpackage.zak.b(criticalError.b), j, j2);
                    }
                }
            }
            throw new java.lang.IllegalStateException("OutOfCarLifecycle");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    private final void i(defpackage.jey jeyVar, com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        defpackage.jey jeyVar2;
        boolean zEquals;
        synchronized (this.g) {
            jeyVar2 = this.h;
            this.h = jeyVar;
            this.i.add(new com.google.android.gms.car.diagnostics.ConnectionState(j$.time.Instant.now().toEpochMilli(), jeyVar.ordinal(), criticalError, android.os.SystemClock.elapsedRealtime()));
        }
        int iOrdinal = jeyVar2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zEquals = defpackage.jey.d.equals(jeyVar);
                } else if (iOrdinal == 3) {
                    zEquals = defpackage.jey.e.equals(jeyVar);
                } else if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    if (!defpackage.jey.c.equals(jeyVar) && !defpackage.jey.d.equals(jeyVar)) {
                        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(1971)).M("Unexpected state transition: %s->%s", jeyVar2, jeyVar);
                    }
                } else if (!defpackage.jey.a.equals(jeyVar) && !defpackage.jey.b.equals(jeyVar)) {
                    ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(1971)).M("Unexpected state transition: %s->%s", jeyVar2, jeyVar);
                }
            } else if (!defpackage.jey.f.equals(jeyVar) && !defpackage.jey.d.equals(jeyVar)) {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(1971)).M("Unexpected state transition: %s->%s", jeyVar2, jeyVar);
            }
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai(1970)).M("Car connection state changed: %s->%s", jeyVar2, jeyVar);
        }
        zEquals = defpackage.jey.b.equals(jeyVar);
        if (!zEquals) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(1971)).M("Unexpected state transition: %s->%s", jeyVar2, jeyVar);
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai(1970)).M("Car connection state changed: %s->%s", jeyVar2, jeyVar);
    }

    @Override // defpackage.jez
    public final defpackage.jey a() {
        defpackage.jey jeyVar;
        synchronized (this.g) {
            jeyVar = this.h;
        }
        return jeyVar;
    }

    @Override // defpackage.jez
    public final void b() {
        h(c);
    }

    @Override // defpackage.jez
    public final void c() {
        h(e);
    }

    @Override // defpackage.jez
    public final void d() {
        h(d);
    }

    @Override // defpackage.jez
    public final void e(defpackage.jey jeyVar) {
        boolean z = false;
        if (jeyVar != defpackage.jey.e && jeyVar != defpackage.jey.d) {
            z = true;
        }
        defpackage.ysr.aY(z, "newState cannot be DISCONNECTED or DISCONNECTING, please use updateState(newState, reason) instead.");
        i(jeyVar, null);
    }

    @Override // defpackage.jez
    public final void f(defpackage.jey jeyVar, com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        boolean z = true;
        if (jeyVar != defpackage.jey.e && jeyVar != defpackage.jey.d) {
            z = false;
        }
        defpackage.ysr.aY(z, "newState must be DISCONNECTED or DISCONNECTING.");
        i(jeyVar, criticalError);
    }

    public final java.util.List g() {
        defpackage.ygw ygwVarO;
        synchronized (this.g) {
            ygwVarO = defpackage.ygw.o(this.i);
        }
        return ygwVarO;
    }
}
