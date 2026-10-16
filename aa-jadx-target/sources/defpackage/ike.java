package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ike extends defpackage.rjh implements defpackage.jbv, defpackage.iyt {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.CarControlService");
    private volatile boolean d;
    private final defpackage.jez e;
    private iyu f;
    private final defpackage.ynk g = new defpackage.ygf(null);
    private final java.util.Map h = new java.util.HashMap();
    public final java.util.Set b = new java.util.HashSet();
    public final java.util.Map c = new j$.util.concurrent.ConcurrentHashMap();
    private final java.util.List i = new java.util.ArrayList();
    private final java.util.Set j = new java.util.HashSet();
    private final java.util.Map k = new java.util.HashMap();
    private final defpackage.ynk l = new defpackage.ygf(null);
    private final java.util.List m = new java.util.ArrayList();
    private final java.lang.String n = java.lang.Integer.toHexString(hashCode());

    public ike(defpackage.jez jezVar) {
        this.e = jezVar;
    }

    public static final xhj A(com.google.android.gms.car.control.CarProperty carProperty) {
        defpackage.abor aborVarN = xhj.a.n();
        int i = carProperty.a;
        aborVarN.t();
        xhj xhjVar = aborVarN.b;
        xhjVar.b |= 1;
        xhjVar.c = i;
        com.google.android.gms.car.control.CarAreaId carAreaId = carProperty.b;
        int i2 = carAreaId.a;
        int i3 = carAreaId.b;
        defpackage.abor aborVarN2 = xhk.f.n();
        int i4 = 0;
        int i5 = 2;
        if (i3 == 0) {
            aborVarN2.t();
            xhk xhkVar = aborVarN2.b;
            xhkVar.h = 0;
            xhkVar.g |= 1;
        } else if (i3 != 2) {
            int i6 = 3;
            if (i3 != 3) {
                int i7 = 4;
                if (i3 != 4) {
                    int i8 = 5;
                    if (i3 == 5) {
                        j$.lang.Iterable.-EL.forEach(D(i2, xhe.values()), new defpackage.ikd(aborVarN2, i7));
                    } else {
                        if (i3 != 6) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i3, "Unexpected area type: "));
                        }
                        j$.lang.Iterable.-EL.forEach(D(i2, xhg.values()), new defpackage.ikd(aborVarN2, i8));
                    }
                } else {
                    j$.lang.Iterable.-EL.forEach(D(i2, xhd.values()), new defpackage.ikd(aborVarN2, i6));
                }
            } else {
                j$.lang.Iterable.-EL.forEach(D(i2, xhf.values()), new defpackage.ikd(aborVarN2, i5));
            }
        } else {
            j$.lang.Iterable.-EL.forEach(D(i2, xhh.values()), new defpackage.ikd(aborVarN2, i4));
        }
        xhk xhkVarQ = aborVarN2.q();
        aborVarN.t();
        xhj xhjVar2 = aborVarN.b;
        xhkVarQ.getClass();
        xhjVar2.d = xhkVarQ;
        xhjVar2.b |= 2;
        return aborVarN.q();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    private final com.google.android.gms.car.control.CarControlGroup B(xje xjeVar) {
        com.google.android.gms.car.control.CarAction carAction;
        j$.util.Optional optionalOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<E> it = xjeVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                int iM = defpackage.wpv.M(xjeVar.c);
                return new com.google.android.gms.car.control.CarControlGroup(defpackage.adrq.B(iM != 0 ? iM : 2), arrayList);
            }
            xjd xjdVar = (xjd) it.next();
            boolean z = (xjdVar.c & 1) != 0 ? xjdVar.f : true;
            int iAy = defpackage.a.ay(xjdVar.h);
            if (iAy == 0) {
                iAy = 2;
            }
            int iX = defpackage.adrq.x(iAy);
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(new defpackage.abph(xjdVar.g, xjd.a)).map(new defpackage.ikc(3));
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVar = (defpackage.ygw) map.collect(defpackage.yds.a);
            int iOrdinal = xjc.a(xjdVar.d).ordinal();
            if (iOrdinal == 0) {
                xhm xhmVar = xjdVar.d == 1 ? (xhm) xjdVar.e : xhm.a;
                xhj xhjVar = xhmVar.c;
                if (xhjVar == null) {
                    xhjVar = xhj.a;
                }
                java.util.List list = this.m;
                com.google.android.gms.car.control.CarProperty carPropertyZ = z(xhjVar);
                list.add(carPropertyZ);
                if (carPropertyZ.a == 358614275 && j$.util.Collection.-EL.stream(this.i).anyMatch(new defpackage.hmj(2))) {
                    defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(114);
                    com.google.android.gms.car.control.CarAreaId carAreaId = carPropertyZ.b;
                    yqjVar.w("Replacing HVAC_TEMPERATURE_SET temperature control property with HMG_HVAC_TEMPERATURE_SET_CELSIUS for area id %d", carAreaId.a);
                    carPropertyZ = new com.google.android.gms.car.control.CarProperty(627081341, carAreaId);
                }
                if (!y(carPropertyZ)) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(113)).D("Car property control with id %s and area id %s is not supported by HU.", carPropertyZ.a, carPropertyZ.b);
                }
                com.google.android.gms.car.control.CarProperty carPropertyZ2 = null;
                if ((2 & xhmVar.b) != 0) {
                    xhb xhbVar = xhmVar.d;
                    if (xhbVar == null) {
                        xhbVar = xhb.a;
                    }
                    carAction = new com.google.android.gms.car.control.CarAction(xhbVar.c);
                } else {
                    carAction = null;
                }
                if ((xhmVar.b & 4) != 0) {
                    xhj xhjVar2 = xhmVar.e;
                    if (xhjVar2 == null) {
                        xhjVar2 = xhj.a;
                    }
                    carPropertyZ2 = z(xhjVar2);
                }
                optionalOf = j$.util.Optional.of(new com.google.android.gms.car.control.CarControl(new com.google.android.gms.car.control.CarPropertyControl(carPropertyZ, carAction, carPropertyZ2), (com.google.android.gms.car.control.CarAction) null, (com.google.android.gms.car.control.CarControlGroup) null, z, ygwVar, iX));
            } else if (iOrdinal == 1) {
                xhb xhbVar2 = (xjdVar.d == 2 ? (xja) xjdVar.e : xja.a).c;
                if (xhbVar2 == null) {
                    xhbVar2 = xhb.a;
                }
                optionalOf = j$.util.Optional.of(new com.google.android.gms.car.control.CarControl((com.google.android.gms.car.control.CarPropertyControl) null, new com.google.android.gms.car.control.CarAction(xhbVar2.c), (com.google.android.gms.car.control.CarControlGroup) null, z, ygwVar, iX));
            } else {
                if (iOrdinal != 2) {
                    ((defpackage.yqj) a.l().ai('p')).y("CarControl has unsupported type: %s", xjdVar);
                    throw new java.lang.IllegalArgumentException("Car Control Type must be set");
                }
                optionalOf = j$.util.Optional.of(new com.google.android.gms.car.control.CarControl((com.google.android.gms.car.control.CarPropertyControl) null, (com.google.android.gms.car.control.CarAction) null, B(xjdVar.d == 3 ? (xje) xjdVar.e : xje.a), z, ygwVar, iX));
            }
            defpackage.ilx ilxVar = new defpackage.ilx(arrayList, 1);
            optionalOf.isPresent();
            ilxVar.a.add(optionalOf.get());
        }
    }

    private static com.google.android.gms.car.control.CarPropertyConfig C(xhl xhlVar, java.lang.Class cls) {
        int i = xhlVar.c;
        int i2 = xhlVar.g;
        int i3 = xhlVar.d;
        int i4 = xhlVar.e;
        new java.util.ArrayList();
        new java.util.ArrayList();
        new java.util.ArrayList();
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(xhlVar.f).map(new defpackage.ikc(2));
        int i5 = defpackage.ygw.d;
        j$.util.stream.Collector collector = defpackage.yds.a;
        return new com.google.android.gms.car.control.CarPropertyConfig(i, i2, i3, i4, new java.util.ArrayList((java.util.List) map.collect(collector)), new java.util.ArrayList((java.util.List) j$.util.Collection.-EL.stream(xhlVar.i).map(new defpackage.gjt(cls, 2)).collect(collector)), new java.util.ArrayList(xhlVar.h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static defpackage.ygw D(int i, java.lang.Enum[] enumArr) {
        if (i == 0) {
            return defpackage.ygw.q(0);
        }
        int i2 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (java.lang.Object[] objArr : enumArr) {
            try {
                defpackage.abpb abpbVar = (defpackage.abpb) objArr;
                if ((abpbVar.a() & i) != 0) {
                    ygrVar.i(java.lang.Integer.valueOf(abpbVar.a()));
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return ygrVar.g();
    }

    private final void E() {
        this.e.d();
        if (!this.d) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
    }

    private final synchronized void F(com.google.android.gms.car.control.CarControlGroup carControlGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (rjl rjlVar : this.l.c(java.lang.Integer.valueOf(carControlGroup.a))) {
            try {
                rjlVar.e(carControlGroup);
            } catch (android.os.RemoteException unused) {
                arrayList.add(rjlVar);
            }
        }
        this.l.c(java.lang.Integer.valueOf(carControlGroup.a)).removeAll(arrayList);
    }

    private final synchronized void G(com.google.android.gms.car.control.CarPropertyState carPropertyState) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (rjr rjrVar : this.g.c(carPropertyState.a)) {
            try {
                rjrVar.e(carPropertyState);
            } catch (android.os.RemoteException unused) {
                arrayList.add(rjrVar);
            }
        }
        this.g.c(carPropertyState.a).removeAll(arrayList);
    }

    private final synchronized void H(java.util.List list) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 129)).y("Received the following car controls on service discovery: %s", list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            xjd xjdVar = (xjd) it.next();
            defpackage.ysr.aN(xjc.a(xjdVar.d).equals(xjc.c), "Expected top-level control to be of type CarControlGroup but was %s", xjc.a(xjdVar.d));
            com.google.android.gms.car.control.CarControlGroup carControlGroupB = B(xjdVar.d == 3 ? (xje) xjdVar.e : xje.a);
            this.k.put(java.lang.Integer.valueOf(carControlGroupB.a), carControlGroupB);
        }
    }

    private final void I(java.util.List list) {
        iyu iyuVar = this.f;
        defpackage.abor aborVarN = xon.a.n();
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new defpackage.ikc(0));
        int i = defpackage.ygw.d;
        java.lang.Iterable iterable = (java.lang.Iterable) map.collect(defpackage.yds.a);
        aborVarN.t();
        xon xonVar = aborVarN.b;
        defpackage.abpj abpjVar = xonVar.b;
        if (!abpjVar.c()) {
            xonVar.b = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, xonVar.b);
        xon xonVarQ = aborVarN.q();
        iyu.a.f().ai(1646).y("Sending RegisterCarPropertyListenersRequest: %s", xonVarQ);
        iyuVar.k(32771, xonVarQ);
    }

    public static java.lang.Object g(xhr xhrVar, java.lang.Class cls) {
        if (cls == java.lang.Integer.class) {
            return cls.cast(java.lang.Integer.valueOf(xhrVar.b == 1 ? ((java.lang.Integer) xhrVar.c).intValue() : 0));
        }
        if (cls == java.lang.Boolean.class) {
            return cls.cast(java.lang.Boolean.valueOf(xhrVar.b == 3 ? ((java.lang.Boolean) xhrVar.c).booleanValue() : false));
        }
        if (cls == java.lang.Float.class) {
            return cls.cast(java.lang.Float.valueOf(xhrVar.b == 2 ? ((java.lang.Float) xhrVar.c).floatValue() : 0.0f));
        }
        if (cls == java.lang.Float[].class) {
            return cls.cast((xhrVar.b == 8 ? (xho) xhrVar.c : xho.a).b.toArray(new java.lang.Float[0]));
        }
        if (cls == java.lang.Integer[].class) {
            return cls.cast((xhrVar.b == 6 ? (xhp) xhrVar.c : xhp.a).b.toArray(new java.lang.Integer[0]));
        }
        if (cls == java.lang.Long.class) {
            return cls.cast(java.lang.Long.valueOf(xhrVar.b == 4 ? ((java.lang.Long) xhrVar.c).longValue() : 0L));
        }
        if (cls == java.lang.Long[].class) {
            return cls.cast((xhrVar.b == 7 ? (xhq) xhrVar.c : xhq.a).b.toArray(new java.lang.Long[0]));
        }
        if (cls == java.lang.String.class) {
            return cls.cast(xhrVar.b == 5 ? (java.lang.String) xhrVar.c : "");
        }
        throw new java.lang.IllegalArgumentException("RawCarProperty does not support given type");
    }

    public static final com.google.android.gms.car.control.CarProperty z(xhj xhjVar) {
        int i = xhjVar.c;
        xhk xhkVar = xhjVar.d;
        if (xhkVar == null) {
            xhkVar = xhk.f;
        }
        return new com.google.android.gms.car.control.CarProperty(i, com.google.android.gms.car.control.CarAreaId.a(xhkVar));
    }

    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        com.google.android.gms.car.control.CarPropertyConfig carPropertyConfigC;
        if ((xpaVar.b & 16384) == 0) {
            return null;
        }
        defpackage.xjg xjgVar = xpaVar.m;
        if (xjgVar == null) {
            xjgVar = defpackage.xjg.a;
        }
        defpackage.abpj<xhl> abpjVar = xjgVar.b;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 132)).y("Received car properties on service discovery: %s", abpjVar);
        for (xhl xhlVar : abpjVar) {
            xhn xhnVarB = xhn.b(xhlVar.c);
            if (xhnVarB == null) {
                xhnVarB = xhn.C;
            }
            int i = 2;
            if (xhnVarB == xhn.A) {
                if (xhlVar.i.isEmpty()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 140)).u("Adding AreaIdConfig to HMG_CAR_ALERTS_COUNT CarPropertyConfig");
                    defpackage.abor aborVarK = xhlVar.K();
                    defpackage.abor aborVarN = xha.a.n();
                    defpackage.abor aborVarN2 = xhk.f.n();
                    aborVarN2.t();
                    xhk xhkVar = aborVarN2.b;
                    xhkVar.h = 0;
                    xhkVar.g |= 1;
                    aborVarN.t();
                    xha xhaVar = aborVarN.b;
                    xhk xhkVarQ = aborVarN2.q();
                    xhkVarQ.getClass();
                    xhaVar.c = xhkVarQ;
                    xhaVar.b |= 1;
                    xhr xhrVar = xhr.a;
                    defpackage.abor aborVarN3 = xhrVar.n();
                    aborVarN3.t();
                    xhr xhrVar2 = aborVarN3.b;
                    xhrVar2.b = 1;
                    xhrVar2.c = 0;
                    aborVarN.t();
                    xha xhaVar2 = aborVarN.b;
                    xhr xhrVarQ = aborVarN3.q();
                    xhrVarQ.getClass();
                    xhaVar2.e = xhrVarQ;
                    xhaVar2.b |= 4;
                    defpackage.abor aborVarN4 = xhrVar.n();
                    aborVarN4.t();
                    xhr xhrVar3 = aborVarN4.b;
                    xhrVar3.b = 1;
                    xhrVar3.c = Integer.MAX_VALUE;
                    aborVarN.t();
                    xha xhaVar3 = aborVarN.b;
                    xhr xhrVarQ2 = aborVarN4.q();
                    xhrVarQ2.getClass();
                    xhaVar3.d = xhrVarQ2;
                    xhaVar3.b |= 2;
                    aborVarK.t();
                    xhl xhlVar2 = aborVarK.b;
                    xha xhaVarQ = aborVarN.q();
                    xhaVarQ.getClass();
                    xhlVar2.b();
                    xhlVar2.i.add(xhaVarQ);
                    xhlVar = (xhl) aborVarK.q();
                } else {
                    ((defpackage.yqj) yqmVar.l().ai((char) 141)).u("HMG_CAR_ALERTS_COUNT CarPropertyConfig has AreaIdConfig, not modifying");
                }
            }
            switch (xhlVar.d) {
                case defpackage.abnt.b /* 0 */:
                    break;
                case 1:
                    i = 3;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    i = 4;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    i = 5;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    i = 6;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    i = 7;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = 8;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    i = 9;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    i = 10;
                    break;
                default:
                    i = 0;
                    break;
            }
            switch ((i != 0 ? i : 1) - 2) {
                case 1:
                    carPropertyConfigC = C(xhlVar, java.lang.Integer.class);
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    carPropertyConfigC = C(xhlVar, java.lang.Boolean.class);
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    carPropertyConfigC = C(xhlVar, java.lang.Float.class);
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    carPropertyConfigC = C(xhlVar, java.lang.Long.class);
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    carPropertyConfigC = C(xhlVar, java.lang.String.class);
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    carPropertyConfigC = C(xhlVar, java.lang.Float[].class);
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    carPropertyConfigC = C(xhlVar, java.lang.Integer[].class);
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    carPropertyConfigC = C(xhlVar, java.lang.Long[].class);
                    break;
                default:
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai('s')).y("Skipping createCarPropertyConfigFromProto for config %s, unsupported type", xhlVar);
                    carPropertyConfigC = null;
                    break;
            }
            if (carPropertyConfigC != null) {
                this.i.add(carPropertyConfigC);
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(133)).y("Storing the following car properties: %s", this.i);
        defpackage.xjg xjgVar2 = xpaVar.m;
        if (xjgVar2 == null) {
            xjgVar2 = defpackage.xjg.a;
        }
        H(xjgVar2.c);
        defpackage.xjg xjgVar3 = xpaVar.m;
        if (xjgVar3 == null) {
            xjgVar3 = defpackage.xjg.a;
        }
        defpackage.abpj abpjVar2 = xjgVar3.d;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 130)).y("Received supported car actions on service discovery: %s", abpjVar2);
        java.util.Iterator<E> it = abpjVar2.iterator();
        while (it.hasNext()) {
            xhb xhbVar = ((xhc) it.next()).c;
            if (xhbVar == null) {
                xhbVar = xhb.a;
            }
            int i2 = xhbVar.c;
            if (defpackage.wpv.N(i2) == 0) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 131)).w("Unrecognized action ID: %d", i2);
            } else {
                this.j.add(new com.google.android.gms.car.control.CarAction(i2));
            }
        }
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new iyu(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.rji
    public final synchronized com.google.android.gms.car.control.CarPropertyState f(com.google.android.gms.car.control.CarProperty carProperty) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(116)).M("@%s getCarPropertyState for %s", this.n, carProperty);
        E();
        return (com.google.android.gms.car.control.CarPropertyState) this.h.get(carProperty);
    }

    public final java.util.List h(com.google.android.gms.car.control.CarControlGroup carControlGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.car.control.CarControl carControl : carControlGroup.b) {
            com.google.android.gms.car.control.CarPropertyControl carPropertyControl = carControl.a;
            if (carPropertyControl != null) {
                arrayList.add(carPropertyControl.a);
            } else {
                com.google.android.gms.car.control.CarControlGroup carControlGroup2 = carControl.c;
                if (carControlGroup2 != null) {
                    arrayList.addAll(h(carControlGroup2));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.rji
    public final synchronized java.util.List i() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(117)).y("@%s getRequestedCarControlGroups", this.n);
        E();
        return defpackage.ygw.o(this.k.values());
    }

    @Override // defpackage.rji
    public final java.util.List j() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(118)).y("@%s getSupportedCarActions", this.n);
        E();
        return defpackage.ygw.o(this.j);
    }

    @Override // defpackage.rji
    public final java.util.List k() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(119)).y("@%s getSupportedCarProperties", this.n);
        E();
        return defpackage.ygw.o(this.i);
    }

    @Override // defpackage.rji
    public final synchronized void l() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(111)).y("@%s clearRegisteredPropertyListeners", this.n);
        this.b.clear();
        this.g.q();
    }

    @Override // defpackage.izd
    public final synchronized void m(java.io.PrintWriter printWriter) {
        printWriter.println("**CarControlService**");
        printWriter.println("@".concat(java.lang.String.valueOf(this.n)));
        printWriter.println("Supported Car Properties: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.i))));
        printWriter.println("Registered Car Properties: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b))));
        printWriter.println("Car Property State: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.h))));
        printWriter.println("Car Property to Listener Map: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.g))));
        printWriter.println("Ongoing Set Car Property Requests: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.c))));
        printWriter.println("Requested Car Controls: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.k))));
        printWriter.println("Supported Car Actions: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.j))));
        printWriter.println("All requested Car Properties from Car Controls: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.m))));
    }

    @Override // defpackage.rji
    public final void n(com.google.android.gms.car.control.CarAction carAction) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(120)).y("@%s onCarAction", this.n);
        iyu iyuVar = this.f;
        defpackage.abor aborVarN = xjb.a.n();
        defpackage.abor aborVarN2 = xhb.a.n();
        int iN = defpackage.wpv.N(carAction.a);
        if (iN == 0) {
            throw null;
        }
        aborVarN2.t();
        xhb xhbVar = aborVarN2.b;
        xhbVar.c = defpackage.adrq.A(iN);
        xhbVar.b |= 1;
        xhb xhbVarQ = aborVarN2.q();
        aborVarN.t();
        xjb xjbVar = aborVarN.b;
        xhbVarQ.getClass();
        xjbVar.c = xhbVarQ;
        xjbVar.b |= 1;
        xjb xjbVarQ = aborVarN.q();
        iyu.a.f().ai(1645).y("Sending CarActionNotification: %s", xjbVarQ);
        iyuVar.k(32774, xjbVarQ);
    }

    @Override // defpackage.iyt
    public final synchronized void o(xje xjeVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai('y')).y("Received updated CarControlGroup : %s", xjeVar);
        com.google.android.gms.car.control.CarControlGroup carControlGroupB = B(xjeVar);
        this.k.put(java.lang.Integer.valueOf(carControlGroupB.a), carControlGroupB);
        F(carControlGroupB);
    }

    @Override // defpackage.iyt
    public final synchronized void p(xjo xjoVar) {
        com.google.android.gms.car.control.CarPropertyValue carPropertyValue;
        int i;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai('z')).y("Received onCarPropertyChangeEvent %s", xjoVar);
        xhj xhjVar = xjoVar.c;
        if (xhjVar == null) {
            xhjVar = xhj.a;
        }
        com.google.android.gms.car.control.CarProperty carPropertyZ = z(xhjVar);
        if (xjoVar.e == 1) {
            xhr xhrVar = xjoVar.d;
            if (xhrVar == null) {
                xhrVar = xhr.a;
            }
            int i2 = xhrVar.b;
            switch (i2) {
                case defpackage.abnt.b /* 0 */:
                    i = 9;
                    break;
                case 1:
                    i = 1;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    i = 2;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    i = 3;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    i = 4;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    i = 5;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = 6;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    i = 7;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    i = 8;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            switch (i - 1) {
                case defpackage.abnt.b /* 0 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue(java.lang.Integer.valueOf(i2 == 1 ? ((java.lang.Integer) xhrVar.c).intValue() : 0));
                    break;
                case 1:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue(java.lang.Float.valueOf(i2 == 2 ? ((java.lang.Float) xhrVar.c).floatValue() : 0.0f));
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue(java.lang.Boolean.valueOf(i2 == 3 ? ((java.lang.Boolean) xhrVar.c).booleanValue() : false));
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue(java.lang.Long.valueOf(i2 == 4 ? ((java.lang.Long) xhrVar.c).longValue() : 0L));
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue(i2 == 5 ? (java.lang.String) xhrVar.c : "");
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue((java.lang.Integer[]) (i2 == 6 ? (xhp) xhrVar.c : xhp.a).b.toArray(new java.lang.Integer[0]));
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue((java.lang.Long[]) (i2 == 7 ? (xhq) xhrVar.c : xhq.a).b.toArray(new java.lang.Long[0]));
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue((java.lang.Float[]) (i2 == 8 ? (xho) xhrVar.c : xho.a).b.toArray(new java.lang.Float[0]));
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Car Property Value must be set");
            }
        } else {
            carPropertyValue = new com.google.android.gms.car.control.CarPropertyValue((java.lang.Object) null);
        }
        com.google.android.gms.car.control.CarPropertyState carPropertyState = new com.google.android.gms.car.control.CarPropertyState(carPropertyZ, carPropertyValue, xjoVar.e);
        ((defpackage.yqj) yqmVar.l().ai('{')).y("Converted CarPropertyChangeEvent to CarPropertyState: %s", carPropertyState);
        java.util.Map map = this.h;
        xhj xhjVar2 = xjoVar.c;
        if (xhjVar2 == null) {
            xhjVar2 = xhj.a;
        }
        map.put(z(xhjVar2), carPropertyState);
        G(carPropertyState);
    }

    @Override // defpackage.izd
    public final synchronized void q() {
        this.d = false;
        this.h.clear();
        this.b.clear();
        this.c.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.m.clear();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(124)).y("Disconnected @%s", this.n);
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        defpackage.ygw ygwVar;
        this.f = (iyu) jbqVar;
        this.d = true;
        synchronized (this) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(this.k.values()).flatMap(new defpackage.gjt(this, 3)).filter(new defpackage.ghv(this, 2));
            int i = defpackage.ygw.d;
            ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            this.b.addAll(ygwVar);
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 136)).y("Registering listeners for car control properties: %s", ygwVar);
        I(ygwVar);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(125)).y("Connected @%s", this.n);
    }

    @Override // defpackage.iyt
    public final synchronized void s(java.util.List list) {
        ((defpackage.yqj) a.l().ai('~')).u("Received response from HU on car property listener registration status.");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            xjp xjpVar = (xjp) it.next();
            defpackage.xls xlsVarB = defpackage.xls.b(xjpVar.d);
            if (xlsVarB == null) {
                xlsVarB = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
            }
            if (xlsVarB == defpackage.xls.STATUS_CAR_PROPERTY_LISTENER_REGISTRATION_FAILED) {
                xhj xhjVar = xjpVar.c;
                if (xhjVar == null) {
                    xhjVar = xhj.a;
                }
                com.google.android.gms.car.control.CarProperty carPropertyZ = z(xhjVar);
                com.google.android.gms.car.control.CarPropertyState carPropertyState = new com.google.android.gms.car.control.CarPropertyState(carPropertyZ, new com.google.android.gms.car.control.CarPropertyValue((java.lang.Object) null), 2);
                this.h.put(carPropertyZ, carPropertyState);
                G(carPropertyState);
            }
        }
    }

    @Override // defpackage.rji
    public final synchronized void t(int i, rjl rjlVar) {
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(134);
        java.lang.String str = this.n;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        yqjVar.R("@%s registerCarControlGroupUpdateListener(%s, %s)", str, numValueOf, rjlVar);
        this.l.t(numValueOf, rjlVar);
        java.util.Map map = this.k;
        if (map.containsKey(numValueOf)) {
            try {
                com.google.android.gms.car.control.CarControlGroup carControlGroup = (com.google.android.gms.car.control.CarControlGroup) map.get(numValueOf);
                carControlGroup.getClass();
                rjlVar.e(carControlGroup);
            } catch (android.os.RemoteException unused) {
                this.l.C(java.lang.Integer.valueOf(i), rjlVar);
            }
        }
    }

    @Override // defpackage.rji
    public final synchronized void u(rjr rjrVar, java.util.List list) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(135)).M("@%s Registering car property update listener for properties %s", this.n, list);
        E();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.car.control.CarProperty carProperty = (com.google.android.gms.car.control.CarProperty) it.next();
            this.g.t(carProperty, rjrVar);
            if (this.b.contains(carProperty)) {
                java.util.Map map = this.h;
                if (map.get(carProperty) != null) {
                    try {
                        rjrVar.e((com.google.android.gms.car.control.CarPropertyState) map.get(carProperty));
                    } catch (android.os.RemoteException unused) {
                        this.g.C(carProperty, rjrVar);
                    }
                }
            } else {
                arrayList.add(carProperty);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        I(arrayList);
        this.b.addAll(arrayList);
    }

    @Override // defpackage.rji
    public final void v(com.google.android.gms.car.control.CarProperty carProperty, com.google.android.gms.car.control.CarPropertyValue carPropertyValue, rjo rjoVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(137)).R("@%s Received set car property request for %s to %s", this.n, carProperty, carPropertyValue);
        E();
        java.lang.Object obj = carPropertyValue.a;
        obj.getClass();
        defpackage.abor aborVarN = xhr.a.n();
        if (obj instanceof java.lang.Boolean) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            bool.booleanValue();
            aborVarN.t();
            xhr xhrVar = aborVarN.b;
            xhrVar.b = 3;
            xhrVar.c = bool;
        } else if (obj instanceof java.lang.Integer) {
            java.lang.Integer num = (java.lang.Integer) obj;
            num.intValue();
            aborVarN.t();
            xhr xhrVar2 = aborVarN.b;
            xhrVar2.b = 1;
            xhrVar2.c = num;
        } else if (obj instanceof java.lang.Float) {
            java.lang.Float f = (java.lang.Float) obj;
            f.floatValue();
            aborVarN.t();
            xhr xhrVar3 = aborVarN.b;
            xhrVar3.b = 2;
            xhrVar3.c = f;
        } else if (obj instanceof java.lang.Long) {
            java.lang.Long l = (java.lang.Long) obj;
            l.longValue();
            aborVarN.t();
            xhr xhrVar4 = aborVarN.b;
            xhrVar4.b = 4;
            xhrVar4.c = l;
        } else if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            aborVarN.t();
            xhr xhrVar5 = aborVarN.b;
            str.getClass();
            xhrVar5.b = 5;
            xhrVar5.c = str;
        } else if (obj instanceof java.lang.Integer[]) {
            defpackage.abor aborVarN2 = xhp.a.n();
            aborVarN2.J(java.util.Arrays.asList((java.lang.Integer[]) obj));
            aborVarN.t();
            xhr xhrVar6 = aborVarN.b;
            xhp xhpVarQ = aborVarN2.q();
            xhpVarQ.getClass();
            xhrVar6.c = xhpVarQ;
            xhrVar6.b = 6;
        } else if (obj instanceof java.lang.Float[]) {
            defpackage.abor aborVarN3 = xho.a.n();
            java.util.List listAsList = java.util.Arrays.asList((java.lang.Float[]) obj);
            aborVarN3.t();
            xho xhoVar = aborVarN3.b;
            abpe abpeVar = xhoVar.b;
            if (!abpeVar.c()) {
                xhoVar.b = defpackage.abox.F(abpeVar);
            }
            defpackage.abnf.i(listAsList, xhoVar.b);
            aborVarN.t();
            xhr xhrVar7 = aborVarN.b;
            xho xhoVarQ = aborVarN3.q();
            xhoVarQ.getClass();
            xhrVar7.c = xhoVarQ;
            xhrVar7.b = 8;
        } else {
            if (!(obj instanceof java.lang.Long[])) {
                throw new java.lang.IllegalArgumentException("CarPropertyValue is not of a supported type");
            }
            defpackage.abor aborVarN4 = xhq.a.n();
            java.util.List listAsList2 = java.util.Arrays.asList((java.lang.Long[]) obj);
            aborVarN4.t();
            xhq xhqVar = aborVarN4.b;
            defpackage.abpi abpiVar = xhqVar.b;
            if (!abpiVar.c()) {
                xhqVar.b = defpackage.abox.H(abpiVar);
            }
            defpackage.abnf.i(listAsList2, xhqVar.b);
            aborVarN.t();
            xhr xhrVar8 = aborVarN.b;
            xhq xhqVarQ = aborVarN4.q();
            xhqVarQ.getClass();
            xhrVar8.c = xhqVarQ;
            xhrVar8.b = 7;
        }
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        iyu iyuVar = this.f;
        iyuVar.getClass();
        defpackage.abor aborVarN5 = xpe.a.n();
        xhj xhjVarA = A(carProperty);
        aborVarN5.t();
        xpe xpeVar = aborVarN5.b;
        xhjVarA.getClass();
        xpeVar.c = xhjVarA;
        xpeVar.b |= 1;
        aborVarN5.t();
        xpe xpeVar2 = aborVarN5.b;
        xhr xhrVarQ = aborVarN.q();
        xhrVarQ.getClass();
        xpeVar2.d = xhrVarQ;
        xpeVar2.b |= 2;
        java.lang.String string = uuidRandomUUID.toString();
        aborVarN5.t();
        xpe xpeVar3 = aborVarN5.b;
        string.getClass();
        xpeVar3.b = 4 | xpeVar3.b;
        xpeVar3.e = string;
        xpe xpeVarQ = aborVarN5.q();
        iyu.a.f().ai(1647).y("Sending SetCarPropertyValueRequest: %s", xpeVarQ);
        iyuVar.k(32769, xpeVarQ);
        if (rjoVar != null) {
            this.c.put(uuidRandomUUID, rjoVar);
        }
    }

    @Override // defpackage.rji
    public final synchronized void w(rjl rjlVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(138)).M("@%s unregisterCarControlGroupUpdateListener(%s)", this.n, rjlVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ynk ynkVar = this.l;
        for (java.util.Map.Entry entry : ynkVar.u()) {
            if (((rjl) entry.getValue()).equals(rjlVar)) {
                arrayList.add((java.lang.Integer) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.Integer num = (java.lang.Integer) arrayList.get(i);
            num.intValue();
            ynkVar.C(num, rjlVar);
        }
    }

    @Override // defpackage.rji
    public final synchronized void x(rjr rjrVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(139)).M("@%s Unregistering car property update listener: %s", this.n, rjrVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ynk ynkVar = this.g;
        for (java.util.Map.Entry entry : ynkVar.u()) {
            if (((rjr) entry.getValue()).equals(rjrVar)) {
                arrayList.add((com.google.android.gms.car.control.CarProperty) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ynkVar.C((com.google.android.gms.car.control.CarProperty) arrayList.get(i), rjrVar);
        }
    }

    public final boolean y(com.google.android.gms.car.control.CarProperty carProperty) {
        return j$.util.Collection.-EL.stream(this.i).anyMatch(new defpackage.ghv(carProperty, 3));
    }
}
