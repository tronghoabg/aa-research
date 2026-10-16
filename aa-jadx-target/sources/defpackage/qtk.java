package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qtk implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qtk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.qtq.d();
                defpackage.qtm qtmVar = (defpackage.qtm) this.a;
                if (qtmVar.b) {
                    return;
                }
                qtmVar.b = true;
                if (qtmVar.a) {
                    qtmVar.a();
                    return;
                }
                return;
            case 1:
                try {
                    super/*qrd*/.c();
                    return;
                } catch (java.lang.IllegalStateException e) {
                    if (!android.text.TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.qub qubVar = (defpackage.qub) this.a;
                if (android.os.SystemClock.elapsedRealtime() - qubVar.h < 1800 || qubVar.f == null) {
                    return;
                }
                defpackage.qub.a.l().ai(7926).u("Location is stale.");
                qubVar.l.run();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.qub qubVar2 = (defpackage.qub) this.a;
                if (android.os.SystemClock.elapsedRealtime() - qubVar2.h < 1800) {
                    defpackage.qub.a.h().ai(7927).u("Fake location inject fired but it was up to date.");
                    return;
                }
                if (qubVar2.f != null && qubVar2.g.get()) {
                    qubVar2.f.removeSpeed();
                    qubVar2.f.setAccuracy(7.89f);
                    qubVar2.f.setElapsedRealtimeNanos(android.os.SystemClock.elapsedRealtimeNanos());
                    qubVar2.f.setTime(j$.time.Instant.now().toEpochMilli());
                    defpackage.qub.a.l().ai(7928).u("Force location update of the last known location.");
                    qubVar2.a(qubVar2.f);
                }
                qubVar2.c(qubVar2.l, 1000L);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.rbr) this.a).k = true;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                synchronized (defpackage.rcm.class) {
                    java.lang.Object obj = this.a;
                    if (((defpackage.rcm) obj).g.isEmpty() && ((defpackage.rcm) obj).h.isEmpty()) {
                        ((defpackage.rcm) obj).d.quit();
                        if (defpackage.rcm.a == obj) {
                            defpackage.rcm.a = null;
                        }
                    }
                    break;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.rem) this.a).h();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.qtv) this.a).f();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.rhn rhnVar = (defpackage.rhn) this.a;
                if (rhnVar.k) {
                    defpackage.rhn.a.f().ai(8062).u("Timeout check after cleanup");
                    return;
                } else {
                    rhnVar.g.name();
                    rhnVar.c(defpackage.rhj.EVENT_STATE_TIMEOUT);
                    return;
                }
            case 9:
                ((defpackage.ror) this.a).t();
                return;
            case 10:
                ((defpackage.ror) this.a).t();
                return;
            case 11:
                defpackage.ror rorVar = (defpackage.ror) this.a;
                if (rorVar.y()) {
                    if (rorVar.H && rorVar.r) {
                        defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s onProjectionResume not sent, activity is finishing", rorVar.t);
                    } else {
                        rorVar.n(5, false);
                    }
                    defpackage.qyu qyuVar = rorVar.i;
                    if (qyuVar != null) {
                        try {
                            qyuVar.o();
                            return;
                        } catch (android.os.RemoteException unused) {
                            rorVar.t();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 12:
                ((defpackage.rqv) this.a).c();
                return;
            case 13:
                defpackage.rvp rvpVar = (defpackage.rvp) ((defpackage.wyz) this.a).a;
                defpackage.rvl rvlVar = rvpVar.f;
                if (rvlVar != null) {
                    int i = rvpVar.e - 1;
                    rvpVar.e = i;
                    if (i != 0) {
                        defpackage.rvp.a.l().ai(8369).w("%d services remaining", i);
                        return;
                    } else {
                        rvpVar.f = null;
                        rvlVar.a();
                        return;
                    }
                }
                return;
            case 14:
                ((defpackage.rwj) this.a).b();
                return;
            case 15:
                ((defpackage.rwq) this.a).d.v();
                return;
            case 16:
                defpackage.ryn rynVar = (defpackage.ryn) this.a;
                wij wijVar = rynVar.g;
                if (wijVar != null) {
                    wijVar.a(!rynVar.f);
                }
                if (rynVar.f) {
                    return;
                }
                defpackage.ryn.a.f().ai(8546).u("Detected charge only");
                defpackage.omv.h(rynVar.b, "com.google.android.gms.car.USB_ISSUE_FOUND", defpackage.rst.a, null);
                rynVar.e = true;
                return;
            case 17:
                ((defpackage.rys) this.a).g(false);
                return;
            case 18:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    return;
                }
                java.lang.Object obj2 = this.a;
                defpackage.adcq adcqVar = defpackage.adcq.a;
                if (adcqVar.fF().q()) {
                    ((defpackage.rys) obj2).i();
                    return;
                } else {
                    ((defpackage.rys) obj2).g(adcqVar.fF().p());
                    return;
                }
            case 19:
                ((defpackage.rys) this.a).g(false);
                return;
            default:
                defpackage.rys rysVar = (defpackage.rys) this.a;
                defpackage.yhe yheVar = rysVar.d;
                if (!yheVar.containsKey(rysVar.g)) {
                    defpackage.rys.a.h().ai(8548).y("timeout handler ran for unexpected stage: %s", rysVar.g);
                    return;
                }
                defpackage.ryr ryrVar = (defpackage.ryr) yheVar.get(rysVar.g);
                defpackage.ypu ypuVarAi = defpackage.rys.a.f().ai(8558);
                defpackage.ryq ryqVar = rysVar.g;
                java.lang.Long lValueOf = java.lang.Long.valueOf(ryrVar.a());
                defpackage.rst rstVar = ryrVar.a;
                ypuVarAi.R("timed out at stage %s after %d milliseconds, publishing %s", ryqVar, lValueOf, rstVar);
                defpackage.omv.h(rysVar.f, "com.google.android.gms.car.USB_ISSUE_FOUND", rstVar, null);
                ryrVar.c.run();
                return;
        }
    }

    public qtk(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
