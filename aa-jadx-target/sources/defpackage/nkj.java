package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkj extends defpackage.lhm {
    public static final defpackage.nke a = new defpackage.nke();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.RailHotseatLD");
    public static final defpackage.afhl c = new defpackage.nfw(defpackage.mkp.b, 4);
    public final defpackage.eqp i;
    public final defpackage.eqp k;
    public final defpackage.eqp l;
    public final defpackage.eqp m;
    public final defpackage.eqp n;
    public final defpackage.eqp o;
    public final defpackage.eqp p;
    private defpackage.afar u;
    private defpackage.eqp v;
    private defpackage.eqp w;
    private defpackage.eqp x;
    public final android.content.SharedPreferences d = ((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().b;
    private final defpackage.afar q = new defpackage.afay(new defpackage.djm(this, 20));
    public final defpackage.nnf e = new defpackage.nnf(null);
    private final defpackage.afar r = new defpackage.afay(new defpackage.njw(this, 1));
    private final defpackage.afar s = new defpackage.afay(new defpackage.njw(this, 0));
    private final defpackage.afar t = new defpackage.afay(new defpackage.njw(this, 2));
    public final defpackage.afar f = new defpackage.afay(new defpackage.nhn(3));
    public final defpackage.eqp g = ((defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class)).a(defpackage.mqg.MEDIA);
    public final defpackage.eqp h = ((defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class)).a(defpackage.mqg.PHONE);

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    public nkj() {
        defpackage.lhe lheVar = (defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class);
        defpackage.mqg mqgVar = defpackage.mqg.NAVIGATION;
        defpackage.eqp eqpVarA = lheVar.a(mqgVar);
        this.i = eqpVarA;
        defpackage.eqp eqpVarE = defpackage.mps.e();
        this.k = eqpVarE;
        eqpVarA.getClass();
        defpackage.ltq ltqVar = new defpackage.ltq(15);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.l = defpackage.tcu.a(eqpVarE, defpackage.ebo.f(eqpVarA, ltqVar));
        defpackage.yqm yqmVar = defpackage.mpj.a;
        defpackage.mpi mpiVar = ((defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class)).h;
        this.m = mpiVar;
        defpackage.ltq ltqVar2 = new defpackage.ltq(13);
        mpiVar.getClass();
        this.n = defpackage.ebo.f(defpackage.ebo.f(mpiVar, ltqVar2), new defpackage.nnp(mqgVar, 12));
        defpackage.eqp eqpVar = (defpackage.eqp) ((defpackage.ngb) defpackage.mkp.a.i(defpackage.ngb.class)).a;
        this.o = eqpVar;
        defpackage.ltq ltqVar3 = new defpackage.ltq(14);
        eqpVar.getClass();
        this.p = defpackage.ebo.f(defpackage.ebo.f(eqpVar, ltqVar3), new defpackage.ltq(16));
    }

    public static final boolean m(android.content.ComponentName componentName, defpackage.qsh qshVar) {
        return defpackage.nsn.e().g(componentName) && j$.util.Collection.-EL.stream(defpackage.ler.a().e(qshVar, defpackage.nze.a())).map(new defpackage.mjc(new defpackage.njy(5), 7)).anyMatch(new defpackage.mpw(new defpackage.njt(componentName, 10), 4));
    }

    public static final boolean o(defpackage.nti ntiVar) {
        return defpackage.nte.c().b().m() == ntiVar;
    }

    public static final void p(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL, zbdVar);
        rrvVarH.p(componentName);
        oimVarU.F(rrvVarH.l());
    }

    public static final defpackage.zbd q(defpackage.nkf nkfVar, boolean z) {
        defpackage.nkf nkfVar2 = defpackage.nkf.a;
        if (nkfVar == nkfVar2 && z) {
            return defpackage.zbd.Ia;
        }
        if (nkfVar == nkfVar2) {
            return defpackage.zbd.HR;
        }
        defpackage.nkf nkfVar3 = defpackage.nkf.d;
        if (nkfVar == nkfVar3 && z) {
            return defpackage.zbd.Ia;
        }
        if (nkfVar == nkfVar3) {
            return defpackage.zbd.HW;
        }
        defpackage.nkf nkfVar4 = defpackage.nkf.c;
        if (nkfVar == nkfVar4 && z) {
            return defpackage.zbd.HY;
        }
        if (nkfVar == nkfVar4) {
            return defpackage.zbd.HT;
        }
        if (nkfVar == defpackage.nkf.b) {
            return defpackage.zbd.HU;
        }
        if (nkfVar == defpackage.nkf.f) {
            return defpackage.zbd.If;
        }
        if (nkfVar == defpackage.nkf.e) {
            return defpackage.zbd.Ie;
        }
        if (nkfVar == defpackage.nkf.h) {
            return defpackage.zbd.Ig;
        }
        if (nkfVar == defpackage.nkf.g) {
            return defpackage.zbd.Ic;
        }
        java.util.Objects.toString(nkfVar);
        throw new java.lang.IllegalArgumentException("Can't create telemetry for type ".concat(nkfVar.toString()));
    }

    public static final android.content.ComponentName r(android.content.ComponentName componentName) {
        if (defpackage.kit.b().q()) {
            if (componentName != null) {
                defpackage.qsh qshVarE = defpackage.kit.b().e();
                qshVarE.getClass();
                if (!m(componentName, qshVarE)) {
                }
            }
            return null;
        }
        return componentName;
    }

    public static final android.content.ComponentName s() {
        if (defpackage.kit.b().q()) {
            return r(defpackage.maw.a(defpackage.kit.b().e(), true));
        }
        return null;
    }

    public static final boolean t() {
        if ((o(defpackage.nti.a) || o(defpackage.nti.g) || o(defpackage.nti.h)) && !defpackage.nte.c().b().H()) {
            return false;
        }
        defpackage.khg.u(new defpackage.wde("GH.RailHotseatLD", defpackage.zbe.RAIL, defpackage.zbd.eT, "Unable to stop main activity", new java.lang.Object[0]), new defpackage.niq(6));
        return true;
    }

    private final void u() {
        if (this.u == null) {
            this.u = defpackage.afga.cA(new defpackage.niw(this, 4));
        }
    }

    private static final defpackage.afau v(android.content.ComponentName componentName) {
        nvh nvhVar;
        java.lang.Object next;
        defpackage.ogu oguVar = defpackage.ogv.a;
        if (oguVar.c() && defpackage.kit.b().r()) {
            defpackage.mqj mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), new defpackage.mqi(componentName, (byte[]) null));
            if ((mqjVarA != null ? mqjVarA.b : null) == defpackage.mqg.PHONE) {
                defpackage.ogm ogmVarA = defpackage.ogm.a.a();
                android.content.ComponentName componentNameA = defpackage.mkt.b;
                if (defpackage.afga.f(componentName, componentNameA)) {
                    defpackage.mqj mqjVarA2 = oguVar.a().a();
                    if (mqjVarA2 != null) {
                        componentNameA = mqjVarA2.a();
                    } else {
                        componentNameA.getClass();
                    }
                } else {
                    componentNameA = componentName;
                }
                java.util.List list = (java.util.List) ogmVarA.d.e();
                if (list != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nuv) it.next()).c);
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!defpackage.afga.f(((nvh) next).f, componentNameA.getPackageName()));
                    nvhVar = (nvh) next;
                } else {
                    nvhVar = null;
                }
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nvhVar != null ? nvhVar.d : null;
                if (ghIcon != null) {
                    return new defpackage.afau(ghIcon, nvhVar.b);
                }
            }
        }
        return new defpackage.afau(com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName), null);
    }

    public final defpackage.eqp a(defpackage.eqp eqpVar, defpackage.nkf nkfVar, android.content.ComponentName componentName, boolean z) {
        return defpackage.tcu.u(defpackage.tcu.E(defpackage.tcu.e(eqpVar, this.o, defpackage.ogv.a.c() ? defpackage.ogm.a.a().d : defpackage.tcu.b, new defpackage.njx(this, componentName, nkfVar, z, 0))), defpackage.kfn.h());
    }

    public final defpackage.eqp b() {
        return (defpackage.eqp) this.s.a();
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        defpackage.eqp eqpVar;
        super.d();
        defpackage.afar afarVar = this.u;
        if (afarVar != null && (eqpVar = (defpackage.eqp) afarVar.a()) != null) {
            eqpVar.l(this);
        }
        this.u = null;
        this.v = null;
        this.x = null;
        this.w = null;
    }

    public final defpackage.eqp e() {
        return (defpackage.eqp) this.q.a();
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        defpackage.eqp eqpVar;
        super.eQ();
        android.content.SharedPreferences sharedPreferences = this.d;
        if (!sharedPreferences.getBoolean("RecentAppsMigratedToUserSettings", false)) {
            android.content.Context context = defpackage.mkp.a.c;
            context.getClass();
            android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences("RailHotseat_Pref_File", 0);
            java.lang.String string = sharedPreferences2.getString("RailHotseat_Recent_Apps_Key", null);
            java.lang.String string2 = sharedPreferences2.getString("RailHotseat_Previous_App_Component_Name_Key", null);
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            if (!sharedPreferences.contains("RailHotseat_Recent_Apps_Key") && string != null) {
                editorEdit.putString("RailHotseat_Recent_Apps_Key", string);
            }
            if (!sharedPreferences.contains("RailHotseat_Previous_App_Component_Name_Key") && string2 != null) {
                editorEdit.putString("RailHotseat_Previous_App_Component_Name_Key", string2);
            }
            editorEdit.putBoolean("RecentAppsMigratedToUserSettings", true);
            editorEdit.apply();
        }
        u();
        defpackage.afar afarVar = this.u;
        if (afarVar == null || (eqpVar = (defpackage.eqp) afarVar.a()) == null) {
            return;
        }
        eqpVar.eM(this, new defpackage.nol(new defpackage.njy(4), 1));
    }

    public final defpackage.eqp f() {
        return (defpackage.eqp) this.t.a();
    }

    public final defpackage.eqp g() {
        return (defpackage.eqp) this.r.a();
    }

    public final defpackage.eqp h(defpackage.eqp eqpVar) {
        eqpVar.getClass();
        if (this.v == null) {
            this.v = eqpVar;
        }
        u();
        defpackage.eqp eqpVar2 = this.x;
        if (eqpVar2 != null) {
            return eqpVar2;
        }
        defpackage.eqp eqpVar3 = defpackage.ogv.a.c() ? defpackage.ogm.a.a().d : defpackage.tcu.b;
        defpackage.eqp eqpVarA = defpackage.lje.b().a();
        eqpVarA.getClass();
        defpackage.afar afarVar = this.u;
        if (afarVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        defpackage.eqp eqpVarE = defpackage.tcu.E(defpackage.tcu.g(eqpVarA, eqpVar, (defpackage.eqp) afarVar.a(), this.o, eqpVar3, new defpackage.affj() { // from class: nka
            @Override // defpackage.affj
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                java.util.List list = (java.util.List) obj3;
                defpackage.mqj mqjVar = (defpackage.mqj) obj4;
                list.getClass();
                int i = true == defpackage.acyc.V() ? 3 : 1;
                defpackage.afct afctVar = new defpackage.afct(10);
                for (int i2 = 0; i2 < i; i2++) {
                    android.content.ComponentName componentName = (android.content.ComponentName) defpackage.afga.aC(list, i2);
                    if (zBooleanValue && i2 == 0) {
                        componentName = defpackage.mkt.v;
                    }
                    android.content.ComponentName componentName2 = componentName;
                    android.content.ComponentName componentNameA = mqjVar != null ? mqjVar.a() : null;
                    defpackage.nkj nkjVar = this.a;
                    defpackage.nkf nkfVar = defpackage.nkf.g;
                    bool.getClass();
                    afctVar.add(nkjVar.j(componentName2, componentNameA, nkfVar, false, bool.booleanValue()));
                }
                return afctVar.f();
            }
        }));
        this.x = eqpVarE;
        return eqpVarE;
    }

    public final defpackage.eqp i(defpackage.eqp eqpVar) {
        eqpVar.getClass();
        if (this.v == null) {
            this.v = eqpVar;
        }
        u();
        defpackage.eqp eqpVar2 = this.w;
        if (eqpVar2 != null) {
            return eqpVar2;
        }
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVarV = defpackage.tcu.v(defpackage.ebo.e(defpackage.tcu.v(h(eqpVar), new defpackage.njy(0))), new defpackage.njy(12));
        this.w = eqpVarV;
        return eqpVarV;
    }

    public final defpackage.nne j(android.content.ComponentName componentName, android.content.ComponentName componentName2, defpackage.nkf nkfVar, boolean z, boolean z2) {
        defpackage.mqj mqjVarA;
        if (componentName == null) {
            return defpackage.kfn.h();
        }
        if (defpackage.afga.f(componentName, componentName2)) {
            defpackage.afau afauVarV = v(componentName);
            return new defpackage.nne((com.google.android.apps.auto.components.graphics.icon.GhIcon) afauVarV.a, componentName, (com.google.android.apps.auto.components.graphics.icon.GhIcon) afauVarV.b, null, false, new njz(this, nkfVar, z, componentName));
        }
        boolean z3 = false;
        if (defpackage.lzm.c() && !z2 && (mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), new defpackage.mqi(componentName, (byte[]) null))) != null && mqjVarA.c) {
            z3 = true;
        }
        return k(componentName, nkfVar, false, z, z3);
    }

    public final defpackage.nne k(final android.content.ComponentName componentName, final defpackage.nkf nkfVar, final boolean z, final boolean z2, final boolean z3) {
        defpackage.afau afauVarV = v(componentName);
        return new defpackage.nne((com.google.android.apps.auto.components.graphics.icon.GhIcon) afauVarV.a, componentName, (com.google.android.apps.auto.components.graphics.icon.GhIcon) afauVarV.b, null, z3, new defpackage.afer() { // from class: nkd
            @Override // defpackage.afer
            public final java.lang.Object invoke() {
                if (z && !z3) {
                    defpackage.nkj.t();
                }
                boolean z4 = z2;
                defpackage.nkf nkfVar2 = nkfVar;
                android.content.ComponentName componentName2 = componentName;
                defpackage.mpk.a().i(new android.content.Intent().setComponent(componentName2));
                defpackage.nkj.p(defpackage.nkj.q(nkfVar2, z4), componentName2);
                return defpackage.afbk.a;
            }
        });
    }

    public final void l(java.util.List list) {
        android.content.SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.getClass();
        editorEdit.putString("RailHotseat_Recent_Apps_Key", defpackage.afga.bo(defpackage.afga.aX(list, 3), ",", null, null, new defpackage.njy(3), 30));
        editorEdit.apply();
    }

    public final void n(android.content.ComponentName componentName) {
        android.content.SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.getClass();
        editorEdit.putString("RailHotseat_Previous_App_Component_Name_Key", componentName.flattenToString());
        editorEdit.apply();
    }
}
