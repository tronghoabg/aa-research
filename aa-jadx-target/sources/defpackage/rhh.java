package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhh implements java.lang.Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public rhh(android.view.View view, int i, int i2) {
        this.c = i2;
        this.b = view;
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.Object, sec] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        int i;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.rhn rhnVar = (defpackage.rhn) this.b;
                if (rhnVar.g != defpackage.rhk.STATE_UNPAIRING || (i = this.a) != rhnVar.n) {
                    defpackage.rhn.a.f().ai(8057).K("Dropping delayed unpair %s %d", rhnVar.g.name(), this.a);
                    return;
                } else {
                    defpackage.rhn.a.f().ai(8058).u("Executing delayed unpair");
                    rhnVar.b(i);
                    return;
                }
            case 1:
                defpackage.qkk qkkVar = ((defpackage.qkl) this.b).b.b.b;
                defpackage.wfp.c();
                defpackage.yqm yqmVar = com.google.android.gearhead.service.SharedService.a;
                defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(7422);
                int i2 = this.a;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                defpackage.zke zkeVar = defpackage.zke.a;
                yqjVar.M("Processed event %s %s", new defpackage.zkf(zkeVar, numValueOf), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(qkkVar.a)));
                if (i2 != 0) {
                    defpackage.ysr.bk(qkkVar.a > 0, "Asymmetrical projection exit");
                    qkkVar.a--;
                    defpackage.kfn.g().d(defpackage.yyn.PROJECTION_MODE_ENDED);
                    if (qkkVar.a == 0) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 7424)).u("Process exit from shared car mode");
                        defpackage.ldx.a().b(false);
                        com.google.android.gearhead.service.SharedService sharedService = qkkVar.c;
                        if (!j$.util.Objects.equals(sharedService.d, "UNINITIALIZED_BLUETOOTH_ADDRESS") && !j$.util.Objects.equals(sharedService.e, "UNINITIALIZED_BLUETOOTH_ADDRESS")) {
                            defpackage.kfn.g().h();
                        }
                    }
                } else {
                    if (qkkVar.a == 0) {
                        if (!qkkVar.b) {
                            com.google.android.gearhead.service.SharedService sharedService2 = qkkVar.c;
                            defpackage.jzb.r().eQ();
                            defpackage.kzi.n().eQ();
                            defpackage.jzl.m().eQ();
                            defpackage.lcv.a().eQ();
                            com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager.a().eQ();
                            qkkVar.b = true;
                        }
                        ((defpackage.yqj) yqmVar.l().ai((char) 7423)).u("Processed event enter shared car mode");
                        defpackage.ldx.a().b(true);
                        com.google.android.gearhead.service.SharedService sharedService3 = qkkVar.c;
                        if (!j$.util.Objects.equals(sharedService3.d, "UNINITIALIZED_BLUETOOTH_ADDRESS") && !j$.util.Objects.equals(sharedService3.e, "UNINITIALIZED_BLUETOOTH_ADDRESS")) {
                            defpackage.kfn.g().i(sharedService3.d, sharedService3.e);
                            defpackage.kng kngVar = (defpackage.kng) defpackage.mkp.a.k(defpackage.kng.class);
                            kngVar.getClass();
                            kngVar.b(sharedService3.d);
                        }
                    }
                    defpackage.kfn.g().d(defpackage.yyn.PROJECTION_MODE_STARTED);
                    qkkVar.a++;
                }
                defpackage.ysr.aY(qkkVar.a >= 0, "Use count never goes < 0");
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.rhn rhnVar2 = (defpackage.rhn) this.b;
                if (rhnVar2.g == defpackage.rhk.STATE_UNPAIRING && this.a == rhnVar2.n) {
                    rhnVar2.c(defpackage.rhj.EVENT_STATE_TIMEOUT);
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.yqj) lhb.b.f()).w("Integrated overlay started for contentType=%d.", this.a);
                defpackage.mpk mpkVarA = defpackage.mpk.a();
                android.content.Intent component = new android.content.Intent().setComponent(defpackage.mkt.E);
                defpackage.qrh qrhVar = new defpackage.qrh();
                qrhVar.e = (com.google.android.gms.car.display.CarRegionId) ((defpackage.pyk) this.b).a;
                mpkVarA.k(component, qrhVar);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.rqm) this.b).b(this.a, true);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.rwq) this.b).d.e(this.a);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.rwq) this.b).d.u(this.a);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((sdn) ((defpackage.xei) this.b).a).l(this.a);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                this.b.i(this.a);
                return;
            case 9:
                defpackage.yqk yqkVar = sfx.a;
                ((defpackage.doe) this.b).d(new java.util.concurrent.TimeoutException("Timed out waiting for profile proxy: " + this.a));
                return;
            case 10:
                ((defpackage.snb) this.b).k(this.a);
                return;
            case 11:
                ((java.util.concurrent.atomic.AtomicInteger) ((defpackage.ndd) this.b).c).set(this.a);
                return;
            case 12:
                wki wkiVar = (wki) this.b;
                wkh wkhVar = wkiVar.a;
                if (wkhVar != null) {
                    wkhVar.a(this.a);
                    wkiVar.a = null;
                    return;
                }
                return;
            case 13:
                wki wkiVar2 = (wki) this.b;
                wkh wkhVar2 = wkiVar2.a;
                if (wkhVar2 != null) {
                    wkhVar2.a(this.a);
                    wkiVar2.a = null;
                    return;
                }
                return;
            case 14:
                wki wkiVar3 = (wki) this.b;
                wkh wkhVar3 = wkiVar3.a;
                if (wkhVar3 != null) {
                    wkhVar3.a(this.a);
                    wkiVar3.a = null;
                    return;
                }
                return;
            case 15:
                ((wox) this.b).f.ad(this.a);
                return;
            case 16:
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = (com.google.android.material.sidesheet.SideSheetBehavior) this.b;
                java.lang.ref.WeakReference weakReference = sideSheetBehavior.j;
                android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.C(view, this.a, false);
                    return;
                }
                return;
            case 17:
                ((android.view.View) this.b).setVisibility(this.a);
                return;
            case 18:
                zju zjuVar = (zju) this.b;
                if (zjuVar.h) {
                    return;
                }
                int i3 = this.a;
                if (zjuVar.e.e == 4) {
                    zjuVar.i.m(i3);
                    return;
                } else {
                    zjuVar.d += i3;
                    return;
                }
            case 19:
                java.lang.Object obj = this.b;
                zuy zuyVar = (zuy) obj;
                zuyVar.c.a();
                int i4 = this.a;
                synchronized (obj) {
                    if (i4 < ((zuy) obj).g) {
                        return;
                    }
                    if (zuyVar.d) {
                        zuyVar.d = false;
                        zuyVar.a();
                        return;
                    } else {
                        java.lang.String str = zuy.a;
                        if (zsr.e(str, 3)) {
                            android.util.Log.d(str, "onCameraChangeFinished called when camera is not in motion.");
                            return;
                        }
                        return;
                    }
                }
            default:
                aads aadsVar = (aads) this.b;
                aadsVar.c.c(aadsVar.g, this.a);
                return;
        }
    }

    public rhh(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ rhh(java.lang.Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
