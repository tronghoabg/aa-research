package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xgr implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xgr(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.b) {
            case 0:
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.projection.gearhead.system.RecoveryLifecycleService.g.h()).ai((char) 10280)).y("Reset method %s not supported on this version of Android", ((defpackage.rza) this.a).name());
                return;
            case 1:
                ((defpackage.xgj) this.a).a();
                return;
            case 2:
                this.a.cancel(false);
                return;
            case 3:
                defpackage.zju zjuVar = (defpackage.zju) this.a;
                if (zjuVar.h) {
                    return;
                }
                zjuVar.f = true;
                zjuVar.k();
                return;
            case 4:
                defpackage.zjq zjqVar = (defpackage.zjq) this.a;
                if (zjqVar.a) {
                    return;
                }
                zjqVar.c.h();
                return;
            case 5:
                ((defpackage.adrq) this.a).h();
                return;
            case 6:
                defpackage.zsc zscVar = (defpackage.zsc) this.a;
                new defpackage.zsb(zscVar).a(zscVar.f);
                return;
            case 7:
                defpackage.zsc zscVar2 = (defpackage.zsc) this.a;
                new defpackage.zsb(zscVar2).a(zscVar2.f);
                return;
            case 8:
                return;
            case 9:
                ((defpackage.zui) this.a).a.e(defpackage.epw.ON_RESUME);
                return;
            case 10:
                ((defpackage.zui) this.a).a.e(defpackage.epw.ON_PAUSE);
                return;
            case 11:
                ((defpackage.zuy) this.a).b();
                return;
            case 12:
                ((defpackage.zxt) this.a).d();
                return;
            case 13:
                defpackage.zvy zvyVar = (defpackage.zvy) this.a;
                if (zvyVar.a()) {
                    for (defpackage.zxd zxdVar : zvyVar.b) {
                        zxdVar.b = zxdVar.h(zxdVar.d);
                        zxdVar.d();
                    }
                    return;
                }
                return;
            case 14:
                ((defpackage.zwd) this.a).a();
                return;
            case 15:
                defpackage.zwp zwpVar = (defpackage.zwp) this.a;
                defpackage.vgr vgrVar = zwpVar.d;
                if (vgrVar != null) {
                    try {
                        vgrVar.e();
                    } catch (android.os.RemoteException e) {
                        throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
                    }
                    break;
                }
                defpackage.zww zwwVar = zwpVar.c;
                if (zwwVar != null) {
                    zwwVar.a();
                    return;
                }
                return;
            case 16:
                defpackage.aach aachVar = (defpackage.aach) this.a;
                defpackage.xzi xziVar = ((defpackage.zvt) aachVar.i).b;
                int i2 = defpackage.zws.a;
                ((defpackage.zsc) aachVar.d).b(new defpackage.aabx(xziVar, i));
                return;
            case 17:
                defpackage.zww zwwVar2 = (defpackage.zww) this.a;
                defpackage.sr srVar = zwwVar2.b;
                if (srVar != null) {
                    defpackage.erh erhVarI = srVar.I();
                    int iH = erhVarI != null ? srVar.H(erhVarI) : -1;
                    if (defpackage.zsr.e("INDOOR", 3)) {
                        android.util.Log.d("INDOOR", "onIndoorBuildingFocused: " + java.lang.String.valueOf(erhVarI) + ", " + iH);
                    }
                    zwwVar2.e(erhVarI, iH);
                    return;
                }
                return;
            case 18:
                ((defpackage.zww) this.a).b();
                return;
            case 19:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (((defpackage.zxn) obj).b && (((defpackage.zxn) obj).d != null || ((defpackage.zxn) obj).c != null)) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(2);
                        defpackage.vhm vhmVar = ((defpackage.zxn) obj).d;
                        if (vhmVar != null) {
                            arrayList.add(vhmVar);
                            ((defpackage.zxn) obj).d = null;
                        }
                        defpackage.vhm vhmVar2 = ((defpackage.zxn) obj).c;
                        if (vhmVar2 != null) {
                            arrayList.add(vhmVar2);
                            ((defpackage.zxn) obj).c = null;
                        }
                        java.lang.String str = defpackage.zxn.a;
                        if (defpackage.zsr.e(str, 2)) {
                            android.util.Log.v(str, "onMapLoaded");
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                ((defpackage.vhm) arrayList.get(i3)).a();
                            } catch (android.os.RemoteException e2) {
                                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
                            }
                        }
                        return;
                    }
                    return;
                }
            default:
                int i4 = defpackage.zxq.f;
                ((defpackage.zsi) this.a).b();
                return;
        }
    }
}
