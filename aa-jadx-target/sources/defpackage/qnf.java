package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qnf implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public qnf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, rar] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, rgt] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object, raz] */
    /* JADX WARN: Type inference failed for: r12v57, types: [java.lang.Object, rdb] */
    /* JADX WARN: Type inference failed for: r12v58, types: [java.lang.Object, rdf] */
    /* JADX WARN: Type inference failed for: r12v65, types: [java.lang.Object, qrm] */
    /* JADX WARN: Type inference failed for: r12v66, types: [java.lang.Object, qrm] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        int i = 3;
        long j = 0;
        boolean z = true;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                qnh qnhVar = ((qng) this.a).b;
                if (qnhVar.v()) {
                    return;
                }
                qnhVar.p(3, "Connected to service after a timeout", (java.lang.Object) null, (java.lang.Object) null, (java.lang.Object) null);
                java.lang.Object obj = this.b;
                qmf.b();
                qnhVar.c = (qnx) obj;
                qnhVar.e();
                qmy qmyVarH = qnhVar.h();
                qmf.b();
                qmyVarH.a.w();
                return;
            case 1:
                ((qmy) this.a).a.d((qnw) this.b);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((qng) this.b).b.d((android.content.ComponentName) this.a);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((qqh) this.a).a((rgt) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.rib ribVar = ((defpackage.qsa) this.a).d;
                defpackage.yqk yqkVar = defpackage.rib.a;
                defpackage.ypu ypuVarAi = yqkVar.l().ai(8189);
                java.lang.Object obj2 = this.b;
                ypuVarAi.y("setAuthenticationData: auth data=%s", obj2);
                if (ribVar.n != 0) {
                    yqkVar.l().ai(8190).u("setAuthenticationData: This object wasn't initialized successfully");
                    return;
                } else {
                    ribVar.r = (java.lang.String) obj2;
                    defpackage.rbz.h(new defpackage.qth(ribVar, 20));
                    return;
                }
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqk yqkVar2 = defpackage.qsa.a;
                defpackage.ypu ypuVarAi2 = yqkVar2.l().ai(7696);
                ?? r3 = this.b;
                ypuVarAi2.y("handleIncomingMessage on main thread. handler=%s", r3);
                defpackage.qsa qsaVar = (defpackage.qsa) this.a;
                if (qsaVar.i) {
                    return;
                }
                if (qsaVar.g == null) {
                    yqkVar2.g().ai(7698).u("handleIncomingMessage: Channel not established yet");
                    return;
                } else if (qsaVar.b != 0) {
                    yqkVar2.g().ai(7697).u("handleIncomingMessage: Service not initialized");
                    return;
                } else {
                    r3.run();
                    return;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) this.b;
                if (countDownLatch.getCount() != 0) {
                    ((defpackage.qtj) this.a).o();
                    countDownLatch.countDown();
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.qub qubVar = (defpackage.qub) this.b;
                ((com.google.android.gms.car.CarSensorEvent) this.a).b(qubVar.j);
                android.location.Location location = qubVar.j;
                if (location.hasBearing() && (!location.hasSpeed() || location.getSpeed() <= 1.0f)) {
                    location.removeBearing();
                }
                if (location.hasSpeed()) {
                    if (qubVar.d) {
                        location.removeSpeed();
                    } else if (location.getSpeed() >= 70.0f || location.getSpeed() < 0.0f) {
                        defpackage.qub.a.l().ai(7933).u("Integration error: GPS speed seems invalid. Disabling.");
                        location.removeSpeed();
                        qubVar.d = true;
                    }
                }
                if (location.hasAccuracy()) {
                    if (qubVar.e) {
                        location.removeAccuracy();
                    } else if (location.getAccuracy() <= 1.0f || location.getAccuracy() >= 500.0f) {
                        defpackage.qub.a.l().ai(7931).u("Integration error: GPS accuracy is suspicious. Disabling.");
                        qubVar.e = true;
                        location.removeAccuracy();
                    }
                }
                if (!location.hasAccuracy()) {
                    location.setAccuracy(5.67f);
                }
                boolean z2 = qubVar.f != null;
                if (z2) {
                    long time = location.getTime() - qubVar.f.getTime();
                    z2 = time >= 500 && time < 2000;
                    j = time;
                }
                if (z2) {
                    float fDistanceTo = qubVar.f.distanceTo(location);
                    float fBearingTo = qubVar.f.bearingTo(location);
                    boolean z3 = fDistanceTo > 2.0f;
                    boolean z4 = location.hasSpeed() && location.getSpeed() < 1.0f;
                    if (!location.hasBearing()) {
                        if (!z4 && z3) {
                            location.setBearing(fBearingTo);
                        } else if (qubVar.f.hasBearing()) {
                            location.setBearing(qubVar.f.getBearing());
                        }
                    }
                    if (!location.hasSpeed() && z3) {
                        location.setSpeed((fDistanceTo / j) * 1000.0f);
                    }
                }
                android.location.Location location2 = qubVar.f;
                qubVar.f = location;
                qubVar.j = (android.location.Location) new defpackage.nub(location2).h(new rdw(1));
                qubVar.a(qubVar.f);
                if (qubVar.f.hasSpeed() && qubVar.f.getSpeed() > 0.5f) {
                    qubVar.g.set(false);
                }
                qubVar.h = android.os.SystemClock.elapsedRealtime();
                qubVar.d();
                qubVar.c(qubVar.k, qubVar.i.nextInt(400) + 1800);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    throw new java.lang.RuntimeException((java.lang.Throwable) atomicReference.get());
                }
                this.a.a();
                return;
            case 9:
                defpackage.rrx.d(5, "CAR.CLIENT.PLS", null, "Calling doProjectionTearDown from death recipient", new java.lang.Object[0]);
                ?? r0 = this.a;
                defpackage.rbw rbwVar = (defpackage.rbw) this.b;
                rbwVar.b(r0);
                defpackage.rrx.d(5, "CAR.CLIENT.PLS", null, "Calling doProjectionEnd from death recipient", new java.lang.Object[0]);
                rbwVar.a();
                defpackage.rrx.d(5, "CAR.CLIENT.PLS", null, "Calling doProjectionLost from death recipient", new java.lang.Object[0]);
                if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
                    defpackage.rrx.a("CAR.CLIENT.PLS", null, "Projection attempt recovery");
                }
                rbwVar.e();
                rbwVar.e = false;
                return;
            case 10:
                java.lang.Object obj3 = this.a;
                defpackage.rrx.d(5, "CAR.TOKEN", (java.lang.Throwable) obj3, "CarClient failed.", new java.lang.Object[0]);
                java.lang.Object obj4 = ((defpackage.ren) ((defpackage.rem) this.b).d).a;
                synchronized (((defpackage.qtv) obj4).f) {
                    if (!(obj3 instanceof rdc)) {
                        i = obj3 instanceof defpackage.rde ? 6 : 5;
                    }
                    defpackage.rcq rcqVar = ((defpackage.qtv) obj4).c;
                    rcp rcpVar = new rcp(i);
                    if (rcpVar.a == 2) {
                        z = false;
                    }
                    defpackage.ysr.bk(z, "legacyConnectionResult must be set iff failureReason is LEGACY_GMSCORE_FAILURE");
                    rcqVar.a(rcpVar);
                    break;
                }
                return;
            case 11:
                ((defpackage.shg) this.a).c((com.google.android.gms.car.display.CarDisplay) this.b);
                return;
            case 12:
                ?? r1 = this.b;
                ((defpackage.wyz) this.a).l((java.util.UUID) r1.getValue(), (com.google.android.gms.car.display.CarDisplayId) r1.getKey());
                return;
            case 13:
                this.a.a((com.google.android.gms.car.display.CarDisplayUiFeatures) this.b);
                return;
            case 14:
                this.b.a((com.google.android.gms.car.CarUiInfo) this.a);
                return;
            case 15:
                defpackage.yqm yqmVar = defpackage.mpj.a;
                java.util.Iterator it = ((defpackage.mpj) ((defpackage.wyz) this.b).a).d.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = (com.google.android.gms.car.ActivityLaunchInfo) this.a;
                    ((defpackage.mph) it.next()).b(activityLaunchInfo.a, activityLaunchInfo.b);
                }
                return;
            case 16:
                defpackage.yqm yqmVar2 = defpackage.mpj.a;
                java.util.Iterator it2 = ((defpackage.mpj) ((defpackage.wyz) this.b).a).d.iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo2 = (com.google.android.gms.car.ActivityLaunchInfo) this.a;
                    ((defpackage.mph) it2.next()).a(activityLaunchInfo2.a, activityLaunchInfo2.b);
                }
                return;
            case 17:
                defpackage.yqm yqmVar3 = defpackage.mpj.a;
                defpackage.mpj mpjVar = (defpackage.mpj) ((defpackage.wyz) this.b).a;
                java.util.Iterator it3 = mpjVar.d.iterator();
                while (true) {
                    java.lang.Object obj5 = this.a;
                    if (!it3.hasNext()) {
                        if (mpjVar.m()) {
                            ((defpackage.yqj) defpackage.mpj.a.l().ai((char) 5149)).y("Activity %s stopped when inactive, ignoring", obj5);
                            return;
                        }
                        com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo3 = (com.google.android.gms.car.ActivityLaunchInfo) obj5;
                        android.content.Intent intent = activityLaunchInfo3.a;
                        if ((intent.getFlags() & 4) != 0 && !defpackage.mkt.e.equals(intent.getComponent())) {
                            ((defpackage.yqj) defpackage.mpj.a.l().ai((char) 5148)).y("Ignoring stop of %s since it was due to non user action (video focus loss)", obj5);
                            return;
                        }
                        defpackage.mqi mqiVarB = defpackage.mpk.a().b(intent);
                        mqiVarB.getClass();
                        defpackage.yqm yqmVar4 = defpackage.mpj.a;
                        ((defpackage.yqj) yqmVar4.l().ai(5146)).M("Projected activity stopped: %s, appKey: %s", obj5, mqiVarB);
                        com.google.android.gms.car.display.CarRegionId carRegionId = activityLaunchInfo3.b;
                        defpackage.mpg mpgVarA = mpjVar.a(carRegionId);
                        defpackage.mqj mqjVar = mpgVarA.c;
                        if (mqjVar == null) {
                            return;
                        }
                        if (j$.util.Objects.equals(mqjVar.a(), mqiVarB.a)) {
                            ((defpackage.yqj) yqmVar4.l().ai((char) 5147)).y("Active activity %s stopped, removing active app for the region", obj5);
                            mpjVar.i(null, carRegionId);
                            mpgVarA.c = null;
                            mpgVarA.b = null;
                            mpjVar.k(carRegionId, null, mpjVar.a(carRegionId).d);
                            defpackage.mpj.l(null, carRegionId, mpjVar.h);
                            return;
                        }
                        return;
                    }
                    com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo4 = (com.google.android.gms.car.ActivityLaunchInfo) obj5;
                    ((defpackage.mph) it3.next()).f(activityLaunchInfo4.a, activityLaunchInfo4.b);
                }
                break;
            case 18:
                java.util.Iterator it4 = ((defpackage.mpj) this.b).d.iterator();
                while (it4.hasNext()) {
                    ((defpackage.mph) it4.next()).b((android.content.Intent) this.a, com.google.android.gms.car.display.CarRegionId.a);
                }
                return;
            case 19:
                this.b.e((android.content.Intent) this.a);
                return;
            default:
                this.b.e((android.content.Intent) this.a);
                return;
        }
    }

    public qnf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ qnf(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ qnf(java.lang.Object obj, java.lang.Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public qnf(java.util.concurrent.atomic.AtomicReference atomicReference, raz razVar, int i) {
        this.c = i;
        this.b = atomicReference;
        this.a = razVar;
    }
}
