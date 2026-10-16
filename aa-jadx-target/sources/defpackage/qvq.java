package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvq extends defpackage.ijw implements qvr {
    public final defpackage.qvl a;
    private final defpackage.stq b;
    private defpackage.qrl c;

    public qvq(defpackage.qvl qvlVar) {
        super("com.google.android.gms.car.ICarActivityStartListener");
        this.b = new defpackage.stq(android.os.Looper.getMainLooper());
        this.a = qvlVar;
    }

    private final void g() {
        if (this.c != null) {
            this.c = null;
            defpackage.rps.l(new defpackage.rev(this, 3));
        }
    }

    public final synchronized void a() {
        if (defpackage.rrx.e("GH.PrxyActStartLstnr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActStartLstnr", null, "Clearing local CarActivityStartListener %s", this.c);
        }
        g();
    }

    @java.lang.Deprecated
    public final synchronized void b(android.content.Intent intent) {
        if (this.c != null) {
            this.b.post(new ozv(8));
        } else if (defpackage.rrx.e("GH.PrxyActStartLstnr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActStartLstnr", null, "Trying to send onNewActivityRequestOnPrimaryDisplayAndRegion but there is no registered CarActivityStartListener. Intent: %s", intent);
        }
    }

    public final synchronized void c(defpackage.qrl qrlVar) throws android.os.RemoteException {
        if (defpackage.rrx.e("GH.PrxyActStartLstnr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActStartLstnr", null, "Registering local CarActivityStartListener %s", qrlVar);
        }
        if (this.c != null) {
            throw new java.lang.IllegalStateException("Attempted registration of multiple CarActivityStartListeners");
        }
        this.a.aK(this);
        this.c = qrlVar;
    }

    public final synchronized void d(defpackage.qrl qrlVar) {
        if (defpackage.rrx.e("GH.PrxyActStartLstnr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActStartLstnr", null, "Unregistering local CarActivityStartListener %s", qrlVar);
        }
        defpackage.qrl qrlVar2 = this.c;
        if (qrlVar2 != null && qrlVar2 != qrlVar) {
            throw new java.lang.IllegalStateException("Attempting to unregister wrong CarActivityStartListener");
        }
        g();
    }

    public final synchronized void e(final com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) {
        final defpackage.qrl qrlVar = this.c;
        if (qrlVar != null) {
            this.b.post(new java.lang.Runnable() { // from class: rew
                @Override // java.lang.Runnable
                public final void run() {
                    defpackage.zbe zbeVar;
                    defpackage.mpj mpjVar = (defpackage.mpj) qrlVar;
                    boolean zM = mpjVar.m();
                    com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo2 = activityLaunchInfo;
                    if (zM) {
                        ((defpackage.yqj) defpackage.mpj.a.l().ai((char) 5151)).y("Activity start when inactive, ignoring. %s", activityLaunchInfo2);
                        return;
                    }
                    defpackage.yqm yqmVar = defpackage.mpj.a;
                    ((defpackage.yqj) yqmVar.l().ai((char) 5150)).y("Projected activity start requested: %s", activityLaunchInfo2);
                    com.google.android.gms.car.display.CarRegionId carRegionId = activityLaunchInfo2.b;
                    defpackage.mpg mpgVarA = mpjVar.a(carRegionId);
                    if (!mpgVarA.a) {
                        defpackage.oim oimVarU = defpackage.omf.u();
                        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ACTIVITY_TRACKER, defpackage.zbd.qi);
                        rrvVarH.n(carRegionId);
                        oimVarU.F(rrvVarH.l());
                        mpgVarA.a = true;
                    }
                    android.content.Intent intent = activityLaunchInfo2.a;
                    defpackage.mpg mpgVarA2 = mpjVar.a(carRegionId);
                    android.content.ComponentName component = intent.getComponent();
                    component.getClass();
                    defpackage.mqi mqiVarB = defpackage.mpk.a().b(intent);
                    mqiVarB.getClass();
                    java.util.List list = mpjVar.d;
                    java.lang.String packageName = component.getPackageName();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((defpackage.mph) it.next()).e(intent, carRegionId);
                    }
                    defpackage.yhx yhxVar = mpjVar.c;
                    if (!yhxVar.contains(component)) {
                        android.content.ComponentName componentName = mqiVarB.a;
                        if (!yhxVar.contains(componentName) && (!packageName.equals("com.google.android.googlequicksearchbox") || (defpackage.laq.a().b() && !intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", false)))) {
                            defpackage.mqj mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), mqiVarB);
                            if (mqjVarA == null) {
                                if (!defpackage.mpj.b.contains(componentName.getPackageName()) && com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5144)).y("Ignoring non-launchable app target %s", mqiVarB);
                                    return;
                                }
                                mqjVarA = new defpackage.mqj(mqiVarB, defpackage.mqg.OTHER, false, false, false);
                            }
                            if (!defpackage.mkc.b().d(defpackage.kit.b().e(), packageName, defpackage.qqe.f) && (!defpackage.lzm.c() || !defpackage.mkc.b().d(defpackage.kit.b().e(), packageName, defpackage.qqe.j))) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5143)).y("Package %s is not allowed in full-screen mode - switching to overview", packageName);
                                defpackage.oim oimVarU2 = defpackage.omf.u();
                                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.FACET_BAR, defpackage.zbd.n);
                                rrvVarH2.g(packageName);
                                rrvVarH2.n(carRegionId);
                                oimVarU2.F(rrvVarH2.l());
                                defpackage.mqg mqgVar = mqjVarA.b;
                                if (component.equals(defpackage.lhc.a().a(mqgVar))) {
                                    defpackage.lhc.a().d(mqgVar);
                                }
                                android.content.Intent intent2 = new android.content.Intent();
                                defpackage.mqe.d();
                                android.content.ComponentName componentName2 = defpackage.mkt.z;
                                componentName2.getClass();
                                defpackage.mpk.a().i(intent2.setComponent(componentName2));
                                return;
                            }
                            defpackage.mqj mqjVar = mpgVarA2.c;
                            defpackage.mqg mqgVar2 = mqjVarA.b;
                            defpackage.mqg mqgVar3 = mqjVar == null ? defpackage.mqg.OTHER : mqjVar.b;
                            int iOrdinal = mqgVar2.ordinal();
                            if ((iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) && (mqgVar3 != mqgVar2 || (mqjVar != null && !mqjVar.a.equals(mqiVarB)))) {
                                defpackage.ntk ntkVarR = defpackage.lyd.r();
                                defpackage.kit.b().e();
                                if (ntkVarR.d(carRegionId)) {
                                    defpackage.ebo.n().P(defpackage.mpj.o(mqgVar2));
                                    ((defpackage.yqj) yqmVar.l().ai((char) 5158)).y("updateGsaWithNewCategory %s", mqgVar2);
                                }
                            }
                            if (!defpackage.mpj.n(mqjVarA, mpjVar.a(carRegionId).c)) {
                                int iOrdinal2 = mqgVar2.ordinal();
                                if (iOrdinal2 == 1) {
                                    zbeVar = defpackage.zbe.MAPS_FACET;
                                } else if (iOrdinal2 != 2) {
                                    zbeVar = iOrdinal2 != 3 ? defpackage.zbe.OEM_FACET : defpackage.zbe.MEDIA_FACET;
                                } else {
                                    zbeVar = defpackage.zbe.PHONE_FACET;
                                }
                                defpackage.oim oimVarU3 = defpackage.omf.u();
                                defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.b);
                                rrvVarH3.p(mqjVarA.a());
                                rrvVarH3.n(carRegionId);
                                oimVarU3.F(rrvVarH3.l());
                            }
                            mpjVar.i(mqjVarA, carRegionId);
                            long jElapsedRealtime = defpackage.mpj.n(mpgVarA2.c, mqjVarA) ? mpgVarA2.d : android.os.SystemClock.elapsedRealtime();
                            mpgVarA2.d = jElapsedRealtime;
                            mpgVarA2.c = mqjVarA;
                            mpgVarA2.b = carRegionId;
                            mpjVar.k(carRegionId, mqjVarA, jElapsedRealtime);
                            defpackage.mpj.l(mqjVarA, carRegionId, mpjVar.h);
                            defpackage.ntk ntkVarR2 = defpackage.lyd.r();
                            defpackage.kit.b().e();
                            if (ntkVarR2.d(carRegionId) && com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
                                java.lang.String packageName2 = componentName.getPackageName();
                                defpackage.ebo.n().z(packageName2);
                                ((defpackage.yqj) yqmVar.l().ai((char) 5157)).y("updateGsaWithNewApp %s", packageName2);
                                return;
                            }
                            return;
                        }
                    }
                    ((defpackage.yqj) yqmVar.l().ai(5141)).M("Ignoring start of %s in %s", intent, carRegionId);
                }
            });
        } else if (defpackage.rrx.e("GH.PrxyActStartLstnr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActStartLstnr", null, "Trying to send onActivityStartRequested but there is no registered CarActivityStartListener. %s", activityLaunchInfo);
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            android.content.Intent intent = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
            defpackage.ijx.d(parcel);
            f(intent);
        } else if (i == 2) {
            android.content.Intent intent2 = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
            defpackage.ijx.d(parcel);
            b(intent2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = (com.google.android.gms.car.ActivityLaunchInfo) defpackage.ijx.a(parcel, com.google.android.gms.car.ActivityLaunchInfo.CREATOR);
            defpackage.ijx.d(parcel);
            e(activityLaunchInfo);
        }
        return true;
    }

    @java.lang.Deprecated
    public final synchronized void f(android.content.Intent intent) {
        defpackage.qrl qrlVar = this.c;
        short[] sArr = null;
        if (qrlVar != null) {
            this.b.post(new defpackage.qnf(qrlVar, intent, 18, sArr));
        } else if (defpackage.rrx.e("GH.PrxyActStartLstnr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActStartLstnr", null, "Trying to send onActivityStartedOnPrimaryDisplayAndRegion but there is no registered CarActivityStartListener. Intent: %s", intent);
        }
    }

    public qvq() {
        throw null;
    }
}
