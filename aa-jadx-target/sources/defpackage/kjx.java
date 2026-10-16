package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kjx implements defpackage.lhn {
    public static final defpackage.kjv a = new defpackage.kjv();
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 1);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.CarControlManager");
    public defpackage.rjf d;
    public boolean e;
    private java.util.List g;
    private java.util.List h;
    private defpackage.eqp i;
    private java.util.Set j;
    private klq l;
    private final java.util.Map k = new android.util.ArrayMap();
    public boolean f = true;

    public static final defpackage.kjx f() {
        return a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object h(defpackage.kjx kjxVar, klx klxVar, java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        kjw kjwVar;
        if (afdkVar instanceof kjw) {
            kjwVar = (kjw) afdkVar;
            int i = kjwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kjwVar.c = i - Integer.MIN_VALUE;
            } else {
                kjwVar = new kjw(kjxVar, afdkVar);
            }
        } else {
            kjwVar = new kjw(kjxVar, afdkVar);
        }
        java.lang.Object objA = kjwVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = kjwVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(objA);
            aiut aiutVarB = defpackage.mks.a.b();
            defpackage.bqo bqoVar = new defpackage.bqo(kjxVar, klxVar, obj, (defpackage.afdk) null, 10);
            kjwVar.c = 1;
            objA = ahoc.a(aiutVarB, bqoVar, kjwVar);
            if (objA == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objA);
        }
        return ((defpackage.afaw) objA).a;
    }

    public final defpackage.eqp a() {
        defpackage.eqp eqpVar = this.i;
        if (eqpVar != null) {
            return eqpVar;
        }
        throw new java.lang.IllegalStateException("CarControlManager not initialized");
    }

    public final defpackage.eqp b(kkf kkfVar) {
        defpackage.eqp eqpVarA = kkfVar.a();
        if (!this.e) {
            ((defpackage.yqj) c.h()).u("CarControlManager not initialized, using a cached hvacPowerDependentPropertyIds");
        }
        java.util.Set set = this.j;
        if (set == null) {
            throw new java.lang.IllegalStateException("CarControlManager not initialized");
        }
        klx klxVar = kkfVar.a;
        int i = klxVar.a;
        if (set.contains(java.lang.Integer.valueOf(i))) {
            java.util.Iterator it = juc.f(i(), 354419984).iterator();
            java.lang.Object obj = null;
            boolean z = false;
            java.lang.Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                java.lang.Object next = it.next();
                if (klu.c(((kkf) next).a.b.a, klxVar.b)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
            kkf kkfVar2 = (kkf) obj;
            if (kkfVar2 == null) {
                ((defpackage.yqj) c.h()).B("Property %d is dependent on HVAC_POWER_ON, but the HVAC_POWER_ON property does not have expected area id: %d", i, klxVar.b.a());
            } else {
                defpackage.afdo afdoVar = defpackage.tcu.a;
                eqpVarA = defpackage.tcu.G(eqpVarA, kkfVar2.a(), new kbk(5));
            }
        }
        if (defpackage.a.X(i, 289408009)) {
            return eqpVarA;
        }
        kkf kkfVar3 = (kkf) defpackage.afga.aJ(juc.f(i(), 289408009));
        if (kkfVar3 == null) {
            ((defpackage.yqj) c.h()).u("Properties depend on ignition state, but ignition state property is not available.");
            return eqpVarA;
        }
        defpackage.afdo afdoVar2 = defpackage.tcu.a;
        return defpackage.tcu.G(eqpVarA, kkfVar3.a(), new kbk(6));
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.f) {
            m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kjp e(com.google.android.gms.car.control.CarControlGroup carControlGroup) {
        java.lang.Object kjqVar;
        java.lang.Object next;
        klx klxVar;
        com.google.android.gms.car.control.CarProperty carProperty;
        java.util.List<com.google.android.gms.car.control.CarControl> list = carControlGroup.b;
        list.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.car.control.CarControl carControl : list) {
            com.google.android.gms.car.control.CarControlGroup carControlGroup2 = carControl.c;
            if (carControlGroup2 != null) {
                kjqVar = e(carControlGroup2);
            } else {
                com.google.android.gms.car.control.CarPropertyControl carPropertyControl = carControl.a;
                java.lang.Object kjoVar = null;
                if (carPropertyControl != null) {
                    boolean z = carControl.d;
                    java.util.List list2 = carControl.e;
                    list2.getClass();
                    int i = carControl.f;
                    java.util.Iterator it = i().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        klxVar = ((kkf) next).a;
                        carProperty = carPropertyControl.a;
                        carProperty.getClass();
                    } while (!juq.d(klxVar, carProperty));
                    kkf kkfVar = (kkf) next;
                    if (kkfVar == null) {
                        defpackage.yqj yqjVar = (defpackage.yqj) c.h();
                        com.google.android.gms.car.control.CarProperty carProperty2 = carPropertyControl.a;
                        yqjVar.y("Creating fallback for unsupported property: %s", carProperty2);
                        carProperty2.getClass();
                        com.google.android.gms.car.control.CarAreaId carAreaId = carProperty2.b;
                        kkfVar = new kkf(new klx(carProperty2.a, jug.c(carAreaId.b, carAreaId.a)), new kkx((byte[]) null));
                    }
                    kkf kkfVar2 = kkfVar;
                    com.google.android.gms.car.control.CarAction carAction = carPropertyControl.b;
                    com.google.android.gms.car.control.CarProperty carProperty3 = carPropertyControl.c;
                    if (carProperty3 != null) {
                        for (java.lang.Object obj : i()) {
                            if (juq.d(((kkf) obj).a, carProperty3)) {
                                kjoVar = obj;
                                break;
                            }
                        }
                        kjoVar = (kkf) kjoVar;
                    }
                    kjqVar = new kjq(kkfVar2, carAction, kjoVar, z, list2, i);
                } else {
                    com.google.android.gms.car.control.CarAction carAction2 = carControl.b;
                    if (carAction2 != null) {
                        boolean z2 = carControl.d;
                        java.util.List list3 = carControl.e;
                        list3.getClass();
                        kjoVar = new kjo(carAction2, z2, list3, carControl.f);
                    }
                    kjqVar = kjoVar;
                }
            }
            if (kjqVar != null) {
                arrayList.add(kjqVar);
            }
        }
        return new kjp(carControlGroup.a, arrayList, defpackage.afce.a);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.d != null) {
            ((defpackage.yqj) c.f()).u("Start not initializing CarControlManager as it already exists");
            return;
        }
        defpackage.qsh qshVarE = defpackage.kit.b().e();
        qshVarE.getClass();
        k(qshVarE, true);
    }

    public final klq g() {
        if (!this.e) {
            ((defpackage.yqj) c.h()).u("CarControlManager not initialized, using a cached controlsHistoryManager");
        }
        klq klqVar = this.l;
        if (klqVar != null) {
            return klqVar;
        }
        throw new java.lang.IllegalStateException("CarControlManager not initialized");
    }

    public final java.util.List i() {
        if (!this.e) {
            ((defpackage.yqj) c.h()).u("CarControlManager not initialized, using a cached availableProperties");
        }
        java.util.List list = this.g;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("CarControlManager not initialized");
    }

    public final java.util.List j() {
        if (!this.e) {
            ((defpackage.yqj) c.h()).u("CarControlManager not initialized, using a cached supportedActions");
        }
        java.util.List list = this.h;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("CarControlManager not initialized");
    }

    public final void k(defpackage.qsh qshVar, boolean z) {
        if (this.d != null) {
            if (z) {
                ((defpackage.yqj) c.f()).u("Not setting up CarControlManager for lifetime start");
                return;
            } else {
                ((defpackage.yqj) c.f()).u("Not setting up CarControlManager, not for lifetime start");
                return;
            }
        }
        defpackage.yqm yqmVar = c;
        ((defpackage.yqj) yqmVar.f()).y("Setting up CarControlManager - forLifetimeStart? %s", java.lang.Boolean.valueOf(z));
        this.f = z;
        defpackage.zbe zbeVar = defpackage.zbe.CAR_CONTROLS;
        java.lang.Object objV = defpackage.khg.v(new defpackage.wde("GH.CarControlManager", zbeVar, defpackage.zbd.Mj, "Car not connected when getting CarControlManager.", new java.lang.Object[0]), new kjt(qshVar, 0));
        objV.getClass();
        this.d = (defpackage.rjf) objV;
        com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) defpackage.khg.v(new defpackage.wde("GH.CarControlManager", zbeVar, defpackage.zbd.zD, "Car not connected when getting CarControlManager.", new java.lang.Object[0]), new kjt(qshVar, 3));
        java.util.Map map = this.k;
        java.lang.String str = carInfo.d;
        java.lang.Object klqVar = map.get(str);
        if (klqVar == null) {
            klqVar = new klq(carInfo);
            map.put(str, klqVar);
        }
        this.l = (klq) klqVar;
        java.util.List list = (java.util.List) defpackage.khg.v(new defpackage.wde("GH.CarControlManager", zbeVar, defpackage.zbd.Mi, "Car not connected when getting available properties.", new java.lang.Object[0]), new kju(this));
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.f();
        int i = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((kkf) it.next()).a.a));
        }
        yqjVar.y("Initialized available properties: %s", arrayList);
        this.g = list;
        java.lang.Object objV2 = defpackage.khg.v(new defpackage.wde("GH.CarControlManager", zbeVar, defpackage.zbd.Mh, "Car not connected when getting supported actions.", new java.lang.Object[0]), new kjt(this, 2));
        objV2.getClass();
        this.h = (java.util.List) objV2;
        defpackage.rjf rjfVar = this.d;
        if (rjfVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        this.i = defpackage.ebo.f(new kjs(rjfVar), new defpackage.kgo(this, i));
        kkf kkfVar = (kkf) defpackage.afga.aB(juc.f(i(), 354419984));
        this.j = kkfVar != null ? defpackage.afga.bf(kkfVar.b.a()) : defpackage.afcg.a;
        this.e = true;
    }

    public final void l(int i) {
        com.google.android.gms.car.control.CarAction carAction = new com.google.android.gms.car.control.CarAction(i);
        ((defpackage.yqj) c.f()).y("Requesting HU to perform action %s.", carAction);
        defpackage.khg.v(new defpackage.wde("GH.CarControlManager", defpackage.zbe.CAR_CONTROLS, defpackage.zbd.Mg, "Car not connected when requesting action.", new java.lang.Object[0]), new hbb(this, i, carAction, 2));
    }

    public final void m() {
        this.d = null;
        this.e = false;
    }

    public final boolean n(int i) {
        if (this.h == null) {
            ((defpackage.yqj) c.h()).w("CarControlManager not initialized, carActionSupported(%s) returning false", i);
            return false;
        }
        java.util.List listJ = j();
        if (listJ.isEmpty()) {
            return false;
        }
        java.util.Iterator it = listJ.iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.car.control.CarAction) it.next()).a == i) {
                return true;
            }
        }
        return false;
    }
}
