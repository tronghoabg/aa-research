package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oit implements defpackage.oim {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.Telemetry");
    private final defpackage.oiv c;
    private final defpackage.oil d;

    public oit(android.content.Context context, java.util.concurrent.Executor executor, defpackage.jrj jrjVar, defpackage.mkm mkmVar, j$.util.Optional optional) {
        j$.util.Optional.empty();
        if (context == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        if (executor == null) {
            throw new java.lang.NullPointerException("Null backgroundExecutor");
        }
        defpackage.ois oisVar = new defpackage.ois(context, executor, jrjVar, mkmVar, optional);
        boolean z = true;
        if (!android.app.ActivityManager.isUserAMonkey() && !android.app.ActivityManager.isRunningInTestHarness()) {
            z = false;
        }
        this.c = new defpackage.oiv(oisVar.a, oisVar.b, oisVar.c, oisVar.d, z);
        this.d = (defpackage.oil) oisVar.e.orElse((java.lang.Object) null);
    }

    private final void G(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        this.c.b(telemetryEvent);
    }

    private final void H(int i, android.content.ComponentName componentName, java.lang.Long l, com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.yyh yyhVar;
        defpackage.abor aborVarN = defpackage.zbg.a.n();
        java.lang.String strFlattenToString = componentName.flattenToString();
        aborVarN.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN.b;
        strFlattenToString.getClass();
        zbgVar.b |= 16384;
        zbgVar.r = strFlattenToString;
        if (l != null) {
            long jLongValue = l.longValue();
            aborVarN.t();
            defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN.b;
            zbgVar2.b |= 4;
            zbgVar2.f = jLongValue;
        }
        if (carRegionId != null) {
            aborVarN.t();
            defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN.b;
            zbgVar3.b |= 2097152;
            zbgVar3.A = carRegionId.g;
            int i2 = carRegionId.h.b;
            aborVarN.t();
            defpackage.zbg zbgVar4 = (defpackage.zbg) aborVarN.b;
            zbgVar4.b |= 1048576;
            zbgVar4.z = i2;
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.zbg zbgVar5 = (defpackage.zbg) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zbgVar5.getClass();
        yygVar.o = zbgVar5;
        yygVar.b |= 4096;
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN2.q();
        int i3 = i - 1;
        if (i3 == 1) {
            yyhVar = l != null ? defpackage.yyh.FACET_NAVIGATION_END : defpackage.yyh.FACET_NAVIGATION_START;
        } else if (i3 == 3) {
            yyhVar = l != null ? defpackage.yyh.FACET_MUSIC_END : defpackage.yyh.FACET_MUSIC_START;
        } else if (i3 != 4) {
            yyhVar = l != null ? defpackage.yyh.FACET_PHONE_END : defpackage.yyh.FACET_PHONE_START;
        } else {
            yyhVar = l != null ? defpackage.yyh.FACET_OEM_END : defpackage.yyh.FACET_OEM_START;
        }
        if (yyhVar == defpackage.yyh.UNKNOWN_EVENT_TYPE) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 5974)).y("Invalid facet type: %s", defpackage.ysr.dd(i));
            yyhVar = defpackage.yyh.COMPONENT_CONNECTION_EVENT;
        }
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(yyhVar, yygVar2));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void A(defpackage.zaa zaaVar, java.lang.String str) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 16, zaaVar);
        rroVarH.i = defpackage.xyn.h(str);
        defpackage.omf.v(this, rroVarH);
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void B(defpackage.zaa zaaVar, defpackage.zab zabVar) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 3, zaaVar);
        rroVarH.i(zabVar);
        F(rroVarH.l());
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void C(defpackage.zaa zaaVar, java.lang.String str) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 14, zaaVar);
        if (str != null) {
            rroVarH.e(str);
        }
        defpackage.omf.v(this, rroVarH);
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void D(defpackage.zaa zaaVar, defpackage.yzp yzpVar) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 34, zaaVar);
        rroVarH.l = defpackage.xyn.h(yzpVar);
        defpackage.omf.v(this, rroVarH);
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void E(java.util.UUID uuid, java.lang.Boolean bool, zbh zbhVar, java.lang.Integer num) {
        defpackage.abor aborVarN = defpackage.zbj.a.n();
        aborVarN.t();
        defpackage.zbj zbjVar = (defpackage.zbj) aborVarN.b;
        zbjVar.b |= 1;
        zbjVar.c = 1;
        bool.booleanValue();
        aborVarN.t();
        defpackage.zbj zbjVar2 = (defpackage.zbj) aborVarN.b;
        zbjVar2.b |= 2;
        zbjVar2.d = false;
        if (zbhVar != null) {
            aborVarN.t();
            defpackage.zbj zbjVar3 = (defpackage.zbj) aborVarN.b;
            zbjVar3.e = zbhVar;
            zbjVar3.b |= 4;
        }
        if (num != null) {
            num.intValue();
            aborVarN.t();
            defpackage.zbj zbjVar4 = (defpackage.zbj) aborVarN.b;
            zbjVar4.b |= 8;
            zbjVar4.f = 0;
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.zao zaoVarL = defpackage.acmj.l(uuid);
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zaoVarL.getClass();
        yygVar.C = zaoVarL;
        yygVar.b |= 536870912;
        defpackage.zbj zbjVar5 = (defpackage.zbj) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN2.b;
        zbjVar5.getClass();
        yygVar2.G = zbjVar5;
        yygVar2.c |= 16;
        com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent = new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.WIRELESS_START, (defpackage.yyg) aborVarN2.q());
        telemetryEvent.d();
        G(telemetryEvent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oin
    public final void F(defpackage.rrs rrsVar) throws rlo {
        defpackage.abor aborVarG = rrsVar.g();
        defpackage.oil oilVar = this.d;
        if (oilVar != null) {
            defpackage.rqo rqoVarA = oilVar.a();
            j$.util.Optional optionalI = rqoVarA.a.i();
            aborVarG.getClass();
            defpackage.imv imvVar = new defpackage.imv(aborVarG, 4);
            if (true == optionalI.isPresent()) {
                java.lang.Object obj = optionalI.get();
                java.lang.Object obj2 = imvVar.a;
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.abor aborVar = (defpackage.abor) obj2;
                aborVar.t();
                defpackage.yyg yygVar = (defpackage.yyg) aborVar.b;
                defpackage.yyg yygVar2 = defpackage.yyg.a;
                yygVar.b |= 524288;
                yygVar.t = iIntValue;
            }
            j$.util.Optional optionalI2 = rqoVarA.b.i();
            defpackage.imv imvVar2 = new defpackage.imv(aborVarG, 5);
            if (true == optionalI2.isPresent()) {
                java.lang.Object obj3 = optionalI2.get();
                java.lang.Object obj4 = imvVar2.a;
                boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                defpackage.abor aborVar2 = (defpackage.abor) obj4;
                aborVar2.t();
                defpackage.yyg yygVar3 = (defpackage.yyg) aborVar2.b;
                defpackage.yyg yygVar4 = defpackage.yyg.a;
                yygVar3.b |= 1048576;
                yygVar3.u = zBooleanValue;
            }
            j$.util.Optional optionalI3 = rqoVarA.c.i();
            defpackage.imv imvVar3 = new defpackage.imv(aborVarG, 6);
            if (true == optionalI3.isPresent()) {
                java.lang.Object obj5 = optionalI3.get();
                java.lang.Object obj6 = imvVar3.a;
                int iIntValue2 = ((java.lang.Integer) obj5).intValue();
                defpackage.abor aborVar3 = (defpackage.abor) obj6;
                aborVar3.t();
                defpackage.yyg yygVar5 = (defpackage.yyg) aborVar3.b;
                defpackage.yyg yygVar6 = defpackage.yyg.a;
                yygVar5.b |= 2097152;
                yygVar5.v = iIntValue2;
            }
            j$.util.Optional optionalI4 = rqoVarA.d.i();
            defpackage.imv imvVar4 = new defpackage.imv(aborVarG, 7);
            if (true == optionalI4.isPresent()) {
                java.lang.Object obj7 = optionalI4.get();
                java.lang.Object obj8 = imvVar4.a;
                int i = ((defpackage.yzk) obj7).l;
                defpackage.abor aborVar4 = (defpackage.abor) obj8;
                aborVar4.t();
                defpackage.yyg yygVar7 = (defpackage.yyg) aborVar4.b;
                defpackage.yyg yygVar8 = defpackage.yyg.a;
                yygVar7.b |= 4194304;
                yygVar7.w = i;
            }
        }
        com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent = new com.google.android.apps.auto.components.telemetry.TelemetryEvent(rrsVar.e(), (defpackage.yyg) aborVarG.q());
        telemetryEvent.c(rrsVar.d().d());
        G(telemetryEvent);
    }

    @Override // defpackage.oim
    public final defpackage.zhs a(defpackage.rrs rrsVar) {
        com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent = new com.google.android.apps.auto.components.telemetry.TelemetryEvent(rrsVar.e(), (defpackage.yyg) rrsVar.g().q());
        telemetryEvent.c(rrsVar.d().d());
        defpackage.oiv oivVar = this.c;
        return defpackage.ysr.ct(new pgj(oivVar, telemetryEvent, 1, (byte[]) null), oivVar.c);
    }

    @Override // defpackage.oim
    public final java.lang.String b(defpackage.zbe zbeVar) {
        return zbeVar.name();
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void c(java.util.List list) {
        defpackage.abor aborVarN = defpackage.yzx.a.n();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String strFlattenToString = ((android.content.ComponentName) it.next()).flattenToString();
            aborVarN.t();
            defpackage.yzx yzxVar = (defpackage.yzx) aborVarN.b;
            strFlattenToString.getClass();
            defpackage.abpj abpjVar = yzxVar.b;
            if (!abpjVar.c()) {
                yzxVar.b = defpackage.abox.I(abpjVar);
            }
            yzxVar.b.add(strFlattenToString);
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.yzx yzxVar2 = (defpackage.yzx) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yzxVar2.getClass();
        yygVar.R = yzxVar2;
        yygVar.c |= 262144;
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.LAUNCHER_STATE, (defpackage.yyg) aborVarN2.q()));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void d(defpackage.rrs rrsVar) {
        defpackage.jrm jrmVar = defpackage.jrm.PROJECTION;
        if (((defpackage.jrm) defpackage.mkp.a.i(defpackage.jrm.class)) != defpackage.jrm.SHARED_SERVICE) {
            throw new java.lang.IllegalStateException();
        }
        com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent = new com.google.android.apps.auto.components.telemetry.TelemetryEvent(rrsVar.e(), (defpackage.yyg) rrsVar.g().q());
        telemetryEvent.c(rrsVar.d().d());
        telemetryEvent.d();
        G(telemetryEvent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void e(defpackage.zbd zbdVar) throws rlo {
        F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.DRAWER, zbdVar).l());
    }

    @Override // defpackage.oim
    public final /* synthetic */ void f(defpackage.rrr rrrVar) {
        F(rrrVar.l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void g(defpackage.zbe zbeVar, int i, java.lang.String str) throws rlo {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.eE);
        defpackage.abor aborVarC = rrvVarH.C();
        aborVarC.t();
        defpackage.yzq yzqVar = (defpackage.yzq) aborVarC.b;
        defpackage.yzq yzqVar2 = defpackage.yzq.a;
        yzqVar.b |= 2;
        yzqVar.d = i;
        if (str != null) {
            defpackage.abor aborVarC2 = rrvVarH.C();
            aborVarC2.t();
            defpackage.yzq yzqVar3 = (defpackage.yzq) aborVarC2.b;
            yzqVar3.b |= 1;
            yzqVar3.c = str;
        }
        F(rrvVarH.l());
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void h(boolean z) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        yygVar.b |= 256;
        yygVar.l = z;
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.COMPANION_TOGGLE_KNOWN_CARS, (defpackage.yyg) aborVarN.q()));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void i(defpackage.yyh yyhVar) {
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(yyhVar, defpackage.yyg.a));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void j(java.util.List list) {
        defpackage.abor aborVarN = defpackage.yzx.a.n();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String strFlattenToString = ((android.content.ComponentName) it.next()).flattenToString();
            aborVarN.t();
            defpackage.yzx yzxVar = (defpackage.yzx) aborVarN.b;
            strFlattenToString.getClass();
            defpackage.abpj abpjVar = yzxVar.c;
            if (!abpjVar.c()) {
                yzxVar.c = defpackage.abox.I(abpjVar);
            }
            yzxVar.c.add(strFlattenToString);
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.yzx yzxVar2 = (defpackage.yzx) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yzxVar2.getClass();
        yygVar.R = yzxVar2;
        yygVar.c |= 262144;
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.LAUNCHER_STATE, (defpackage.yyg) aborVarN2.q()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void k(java.lang.String str) throws rlo {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.KEYBOARD_EXTERNAL, defpackage.zbd.eG);
        if (str != null) {
            rrvVarH.j = defpackage.xyn.h(str);
        }
        F(rrvVarH.l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void l(zap zapVar) throws rlo {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RATING_PROMPT, defpackage.zbd.hR);
        rrvVarH.i = defpackage.xyn.h(zapVar);
        F(rrvVarH.l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void m(defpackage.zbe zbeVar, defpackage.zbd zbdVar, defpackage.zaw zawVar, zav zavVar, java.lang.String str) throws rlo {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar);
        if (zawVar != null) {
            rrvVarH.g = defpackage.xyn.h(zawVar);
        }
        rrvVarH.k = defpackage.xyn.h(zavVar);
        rrvVarH.g(str);
        F(rrvVarH.l());
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void n(java.util.List list) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 19, defpackage.zaa.LOG_TESTCODES);
        rroVarH.k(list);
        defpackage.omf.v(this, rroVarH);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void o(defpackage.zbe zbeVar, defpackage.zbd zbdVar) throws rlo {
        F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar).l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void p(defpackage.zbe zbeVar, defpackage.zbd zbdVar, android.content.ComponentName componentName, int i, int i2) throws rlo {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar);
        rrvVarH.A(i2);
        rrvVarH.t(i);
        rrvVarH.p(componentName);
        F(rrvVarH.l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void q(defpackage.zbe zbeVar, defpackage.zbd zbdVar, int i) throws rlo {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar);
        rrvVarH.z(i);
        F(rrvVarH.l());
    }

    @Override // defpackage.oim
    public final void r(int i, android.content.ComponentName componentName, long j, com.google.android.gms.car.display.CarRegionId carRegionId) {
        H(i, componentName, java.lang.Long.valueOf(j), carRegionId);
    }

    @Override // defpackage.oim
    public final void s(int i, android.content.ComponentName componentName, com.google.android.gms.car.display.CarRegionId carRegionId) {
        H(i, componentName, null, carRegionId);
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void t(defpackage.yxo yxoVar, int i, int i2, java.lang.Long l, int i3, java.lang.String str, java.lang.String str2, defpackage.yxp yxpVar) {
        defpackage.abor aborVarN = defpackage.yxn.a.n();
        aborVarN.t();
        defpackage.yxn yxnVar = (defpackage.yxn) aborVarN.b;
        yxnVar.b |= 1;
        yxnVar.c = yxoVar.ap;
        aborVarN.t();
        defpackage.yxn yxnVar2 = (defpackage.yxn) aborVarN.b;
        yxnVar2.b |= 128;
        yxnVar2.j = i2 - 1;
        aborVarN.t();
        defpackage.yxn yxnVar3 = (defpackage.yxn) aborVarN.b;
        yxnVar3.b |= 2;
        yxnVar3.d = i - 1;
        aborVarN.t();
        defpackage.yxn yxnVar4 = (defpackage.yxn) aborVarN.b;
        yxnVar4.b |= 8;
        yxnVar4.f = i3 - 1;
        aborVarN.t();
        defpackage.yxn yxnVar5 = (defpackage.yxn) aborVarN.b;
        yxnVar5.b |= 64;
        yxnVar5.i = yxpVar.p;
        if (l != null) {
            long jLongValue = l.longValue();
            aborVarN.t();
            defpackage.yxn yxnVar6 = (defpackage.yxn) aborVarN.b;
            yxnVar6.b |= 4;
            yxnVar6.e = jLongValue;
        }
        if (str != null) {
            aborVarN.t();
            defpackage.yxn yxnVar7 = (defpackage.yxn) aborVarN.b;
            yxnVar7.b |= 16;
            yxnVar7.g = str;
        }
        if (str2 != null) {
            aborVarN.t();
            defpackage.yxn yxnVar8 = (defpackage.yxn) aborVarN.b;
            yxnVar8.b |= 32;
            yxnVar8.h = str2;
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.yxn yxnVar9 = (defpackage.yxn) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yxnVar9.getClass();
        yygVar.r = yxnVar9;
        yygVar.b |= 32768;
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.ASSISTANT, (defpackage.yyg) aborVarN2.q()));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void u(int i, int i2, java.lang.Long l, int i3, java.lang.String str, java.lang.String str2, defpackage.yxp yxpVar, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshot, int i4, java.util.List list) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        defpackage.yxp yxpVar2;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        defpackage.yxn yxnVar = defpackage.yxn.a;
        defpackage.abor aborVarN = yxnVar.n();
        defpackage.yxo yxoVar = defpackage.yxo.LOGGING_SESSION_INFO;
        int i5 = yxoVar.ap;
        aborVarN.t();
        defpackage.yxn yxnVar2 = (defpackage.yxn) aborVarN.b;
        yxnVar2.b |= 1;
        yxnVar2.c = i5;
        aborVarN.t();
        defpackage.yxn yxnVar3 = (defpackage.yxn) aborVarN.b;
        yxnVar3.b |= 128;
        yxnVar3.j = i2 - 1;
        aborVarN.t();
        defpackage.yxn yxnVar4 = (defpackage.yxn) aborVarN.b;
        yxnVar4.b |= 2;
        yxnVar4.d = i - 1;
        aborVarN.t();
        defpackage.yxn yxnVar5 = (defpackage.yxn) aborVarN.b;
        yxnVar5.b |= 256;
        yxnVar5.k = i4;
        long jLongValue = l.longValue();
        aborVarN.t();
        defpackage.yxn yxnVar6 = (defpackage.yxn) aborVarN.b;
        yxnVar6.b |= 4;
        yxnVar6.e = jLongValue;
        if (i3 != 0) {
            aborVarN.t();
            defpackage.yxn yxnVar7 = (defpackage.yxn) aborVarN.b;
            yxnVar7.b |= 8;
            yxnVar7.f = i3 - 1;
        }
        if (str != null) {
            aborVarN.t();
            defpackage.yxn yxnVar8 = (defpackage.yxn) aborVarN.b;
            yxnVar8.b |= 16;
            yxnVar8.g = str;
        }
        if (str2 != null) {
            aborVarN.t();
            defpackage.yxn yxnVar9 = (defpackage.yxn) aborVarN.b;
            yxnVar9.b |= 32;
            yxnVar9.h = str2;
        }
        if (yxpVar != null) {
            aborVarN.t();
            defpackage.yxn yxnVar10 = (defpackage.yxn) aborVarN.b;
            yxnVar10.b |= 64;
            yxnVar10.i = yxpVar.p;
        }
        if (clientStateSnapshot != null) {
            java.util.List list2 = clientStateSnapshot.b;
            int size = list2 == null ? 0 : list2.size();
            aborVarN.t();
            defpackage.yxn yxnVar11 = (defpackage.yxn) aborVarN.b;
            yxnVar11.b |= 512;
            yxnVar11.m = size;
            com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot gearheadStateSnapshot = clientStateSnapshot.c;
            if (gearheadStateSnapshot != null) {
                int i6 = gearheadStateSnapshot.b;
                aborVarN.t();
                defpackage.yxn yxnVar12 = (defpackage.yxn) aborVarN.b;
                yxnVar12.b |= 1024;
                yxnVar12.n = i6;
                boolean z = clientStateSnapshot.c.c;
                aborVarN.t();
                defpackage.yxn yxnVar13 = (defpackage.yxn) aborVarN.b;
                yxnVar13.b |= 2048;
                yxnVar13.o = z;
                str9 = clientStateSnapshot.c.h.g(1) ? (java.lang.String) defpackage.abc.a(clientStateSnapshot.c.h, 1) : null;
                str10 = clientStateSnapshot.c.h.g(2) ? (java.lang.String) defpackage.abc.a(clientStateSnapshot.c.h, 2) : null;
            } else {
                str9 = null;
                str10 = null;
            }
            java.lang.String str11 = (java.lang.String) new defpackage.nub(str9).i("Not Available");
            java.lang.String str12 = (java.lang.String) new defpackage.nub(str10).i("Not Available");
            aborVarN.t();
            defpackage.yxn yxnVar14 = (defpackage.yxn) aborVarN.b;
            yxnVar14.b |= 4096;
            yxnVar14.p = str11;
            aborVarN.t();
            defpackage.yxn yxnVar15 = (defpackage.yxn) aborVarN.b;
            yxnVar15.b |= 8192;
            yxnVar15.q = str12;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.yxm yxmVar = (defpackage.yxm) it.next();
            aborVarN.t();
            defpackage.yxn yxnVar16 = (defpackage.yxn) aborVarN.b;
            yxmVar.getClass();
            defpackage.abpj abpjVar = yxnVar16.l;
            if (!abpjVar.c()) {
                yxnVar16.l = defpackage.abox.I(abpjVar);
            }
            yxnVar16.l.add(yxmVar);
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.yxn yxnVar17 = (defpackage.yxn) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yxnVar17.getClass();
        yygVar.r = yxnVar17;
        yygVar.b |= 32768;
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN2.q();
        defpackage.yxn yxnVar18 = yygVar2.r;
        if (yxnVar18 != null) {
            yxnVar = yxnVar18;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AssistantSession:\nAssistant Event: {\n");
        if ((yxnVar.b & 1) != 0) {
            sb.append("\tEvent Type: ");
            int i7 = yxnVar.c;
            if (i7 == 64) {
                yxoVar = defpackage.yxo.SERVICE_CONNECTION_ATTEMPTED;
            } else if (i7 == 65) {
                yxoVar = defpackage.yxo.SERVICE_CONNECTION_ATTEMPTED_DODGEBOOST;
            } else if (i7 == 100) {
                yxoVar = defpackage.yxo.EXPAND_DEMAND_SPACE;
            } else if (i7 == 101) {
                yxoVar = defpackage.yxo.COLLAPSE_DEMAND_SPACE;
            } else if (i7 != 200) {
                if (i7 != 300) {
                    switch (i7) {
                        case defpackage.abnt.b /* 0 */:
                            yxoVar = defpackage.yxo.UNKNOWN_EVENT_TYPE;
                            break;
                        case 1:
                            yxoVar = defpackage.yxo.VOICE_SESSION_STARTED;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_START_REJECTED;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_ENDED;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_CANCELLED;
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_INTENT_RESULT;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_ERROR;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_PLATE_ERROR;
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            yxoVar = defpackage.yxo.VOICE_SESSION_SKIPPED_BECAUSE_OF_ACTIVE_VOICE_CALL;
                            break;
                        default:
                            switch (i7) {
                                case 50:
                                    yxoVar = defpackage.yxo.SERVICE_DISCONNECTED;
                                    break;
                                case 51:
                                    yxoVar = defpackage.yxo.SERVICE_PERMANENTLY_DISCONNECTED;
                                    break;
                                case 52:
                                    yxoVar = defpackage.yxo.SERVICE_RECONNECTED;
                                    break;
                                case 53:
                                    yxoVar = defpackage.yxo.SERVICE_UNAVAILABLE;
                                    break;
                                case 54:
                                    yxoVar = defpackage.yxo.SERVICE_MISSING_PERMISSIONS;
                                    break;
                                case 55:
                                    yxoVar = defpackage.yxo.SERVICE_POOR_NETWORK;
                                    break;
                                case 56:
                                    yxoVar = defpackage.yxo.SERVICE_FAILED_TO_CLOSE;
                                    break;
                                case 57:
                                    yxoVar = defpackage.yxo.SERVICE_BINDING_DIED;
                                    break;
                                case 58:
                                    yxoVar = defpackage.yxo.SERVICE_CONNECTED;
                                    break;
                                case 59:
                                    yxoVar = defpackage.yxo.SERVICE_CONNECTED_DODGEBOOST;
                                    break;
                                case 60:
                                    yxoVar = defpackage.yxo.SERVICE_CLOSED;
                                    break;
                                case 61:
                                    yxoVar = defpackage.yxo.SERVICE_CLOSED_DODGEBOOST;
                                    break;
                                default:
                                    switch (i7) {
                                        case 150:
                                            yxoVar = defpackage.yxo.LOCALE_RETRIEVAL_FAILED;
                                            break;
                                        case 151:
                                            yxoVar = defpackage.yxo.SERVICE_REBIND_FAILED;
                                            break;
                                        case 152:
                                            yxoVar = defpackage.yxo.REPORT_VOICE_SESSION_CHANGE_TO_CAR_FAILED;
                                            break;
                                        case 153:
                                            yxoVar = defpackage.yxo.CONFIGURE_CAR_API_FAILED;
                                            break;
                                        case 154:
                                            yxoVar = defpackage.yxo.CAR_MESSAGE_MANAGER_UNINITIALIZED;
                                            break;
                                        default:
                                            switch (i7) {
                                                case 205:
                                                    yxoVar = defpackage.yxo.VOICE_SESSION_FAILED_TO_CONFIGURE_CAR_API;
                                                    break;
                                                case 206:
                                                    yxoVar = defpackage.yxo.VOICE_SESSION_FAILED_TO_REPORT_VOICE_SESSION_CHANGE_TO_CAR;
                                                    break;
                                                case 207:
                                                    yxoVar = defpackage.yxo.VOICE_SESSION_MICROPHONE_NOT_OPENED_WITHIN_TIMEOUT;
                                                    break;
                                                case 208:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_DIRECT_ACTION_INVALID_QUERY;
                                                    break;
                                                case 209:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_ERROR_ASSISTANT_NULL;
                                                    break;
                                                case 210:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_ERROR_CONTROLLER_NOT_STARTED;
                                                    break;
                                                case 211:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_DEMAND_SPACE_ALREADY_OPEN;
                                                    break;
                                                case 212:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_IGNORED_BECAUSE_IN_CALL;
                                                    break;
                                                case 213:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_ASSISTANT_STATE_UNINITIALIZED;
                                                    break;
                                                case 214:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_ASSISTANT_STATE_INITIALIZED_BUT_UNAVAILABLE;
                                                    break;
                                                case 215:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_ASSISTANT_STATE_UNAVAILABLE;
                                                    break;
                                                case 216:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_MISSING_MICROPHONE_PERMISSION;
                                                    break;
                                                case 217:
                                                    yxoVar = defpackage.yxo.END_VOICE_SESSION_DEMAND_SPACE_ALREADY_CLOSED;
                                                    break;
                                                case 218:
                                                    yxoVar = defpackage.yxo.START_TRANSCRIPTION_WITHOUT_CALLBACK;
                                                    break;
                                                case 219:
                                                    yxoVar = defpackage.yxo.END_VOICE_SESSION_DEMAND_SPACE_RECENTLY_OPENED;
                                                    break;
                                                case 220:
                                                    yxoVar = defpackage.yxo.END_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE;
                                                    break;
                                                case 221:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_DEMAND_SPACE_PENDING_OPEN;
                                                    break;
                                                case 222:
                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE;
                                                    break;
                                                default:
                                                    switch (i7) {
                                                        case 250:
                                                            yxoVar = defpackage.yxo.PROCESS_INTENT_RESULT_GENERIC_EXCEPTION;
                                                            break;
                                                        case 251:
                                                            yxoVar = defpackage.yxo.PROCESS_INTENT_RESULT_INTERRUPTED;
                                                            break;
                                                        case 252:
                                                            yxoVar = defpackage.yxo.PROCESS_INTENT_RESULT_EXECUTION_EXCEPTION;
                                                            break;
                                                        case 253:
                                                            yxoVar = defpackage.yxo.PROCESS_INTENT_RESULT_CANCELLED;
                                                            break;
                                                        default:
                                                            switch (i7) {
                                                                case 260:
                                                                    yxoVar = defpackage.yxo.START_VOICE_SESSION_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 261:
                                                                    yxoVar = defpackage.yxo.STOP_VOICE_SESSION_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 262:
                                                                    yxoVar = defpackage.yxo.SEND_GEARHEAD_EVENT_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 263:
                                                                    yxoVar = defpackage.yxo.MEDIA_REC_BIDI_STREAM_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 264:
                                                                    yxoVar = defpackage.yxo.DODGEBOOST_GET_ASSISTANT_FEATURE_FLAGS_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 265:
                                                                    yxoVar = defpackage.yxo.DODGEBOOST_CONNECTION_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 266:
                                                                    yxoVar = defpackage.yxo.DODGEBOOST_CONNECTION_COMPLETED;
                                                                    break;
                                                                default:
                                                                    switch (i7) {
                                                                        case 280:
                                                                            yxoVar = defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_UNKNOWN;
                                                                            break;
                                                                        case 281:
                                                                            yxoVar = defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_CLOSED;
                                                                            break;
                                                                        case 282:
                                                                            yxoVar = defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_OPEN;
                                                                            break;
                                                                        case 283:
                                                                            yxoVar = defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_UNAVAILABLE;
                                                                            break;
                                                                        case 284:
                                                                            yxoVar = defpackage.yxo.DEMAND_SPACE_ALREADY_OPEN_ON_VOICE_SESSION_START;
                                                                            break;
                                                                        case 285:
                                                                            yxoVar = defpackage.yxo.DEMAND_SPACE_ALREADY_CLOSED_ON_VOICE_SESSION_END;
                                                                            break;
                                                                        default:
                                                                            yxoVar = null;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    yxoVar = defpackage.yxo.MEDIA_REC_BIDI_STREAM_RESPONSE_RECEIVED;
                }
            }
            sb.append(yxoVar.name());
            sb.append("\n");
        }
        if ((yxnVar.b & 2) != 0) {
            sb.append("\tVoice Session Trigger: ");
            int iAA = defpackage.a.aA(yxnVar.d);
            switch (iAA) {
                case 1:
                    str8 = "UNKNOWN_TRIGGER";
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    str8 = "ONSCREEN_UI";
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    str8 = "HARDWARE_CONTROLLER";
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    str8 = "HARDWARE_BUTTON_DEDICATED";
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    str8 = "ASSISTANT_REQUESTED";
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    str8 = "BOARDWALK_RAIL_MEDIA_REC";
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    str8 = "ONSCREEN_UI_ASSISTANT_SUGGESTION";
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    str8 = "ASSISTANT_PROACTIVE";
                    break;
                case 9:
                    str8 = "COOLWALK_MEDIA_PLAYER_DASHBOARD_MEDIA_REC";
                    break;
                case 10:
                    str8 = "COOLWALK_MEDIA_SUGGESTION_DASHBOARD_MEDIA_REC";
                    break;
                case 11:
                    str8 = "GMM_MIC_UI";
                    break;
                case 12:
                    str8 = "HARDWARE_BUTTON_DEDICATED_SHORT_PRESS";
                    break;
                default:
                    str8 = "null";
                    break;
            }
            if (iAA == 0) {
                throw null;
            }
            sb.append(str8);
            sb.append("\n");
        }
        if ((yxnVar.b & 4) != 0) {
            sb.append("\tSession Duration Millis: ");
            sb.append(yxnVar.e);
            sb.append("\n");
        }
        if ((yxnVar.b & 8) != 0) {
            sb.append("\tIntent Result Category: ");
            int iAu = defpackage.a.au(yxnVar.f);
            if (iAu == 1) {
                str7 = "UNKNOWN_INTENT_CATEGORY";
            } else if (iAu == 2) {
                str7 = "NAVIGATION";
            } else if (iAu == 3) {
                str7 = "MEDIA";
            } else if (iAu != 4) {
                str7 = iAu != 5 ? "null" : "MESSAGING";
            } else {
                str7 = "TELEPHONE";
            }
            if (iAu == 0) {
                throw null;
            }
            sb.append(str7);
            sb.append("\n");
        }
        if ((yxnVar.b & 16) != 0) {
            sb.append("\tIntent Result Target Package: ");
            sb.append(yxnVar.g);
            sb.append("\n");
        }
        if ((yxnVar.b & 32) != 0) {
            sb.append("\tIntent Result Action: ");
            sb.append(yxnVar.h);
            sb.append("\n");
        }
        if ((64 & yxnVar.b) != 0) {
            sb.append("\tSession Cancel Trigger: ");
            switch (yxnVar.i) {
                case defpackage.abnt.b /* 0 */:
                    yxpVar2 = defpackage.yxp.UNKNOWN_CANCEL_TRIGGER;
                    break;
                case 1:
                    yxpVar2 = defpackage.yxp.X_BUTTON_CLICKED;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    yxpVar2 = defpackage.yxp.LOGO_CLICKED;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    yxpVar2 = defpackage.yxp.SCRIM_CLICKED;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    yxpVar2 = defpackage.yxp.BACK_BUTTON_CLICKED;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    yxpVar2 = defpackage.yxp.HARDWARE_BUTTON_CLICKED;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    yxpVar2 = defpackage.yxp.END_CALL_BUTTON_CLICKED;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    yxpVar2 = defpackage.yxp.ROTARY_NUDGE;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    yxpVar2 = defpackage.yxp.SCREEN_TURNED_OFF;
                    break;
                case 9:
                    yxpVar2 = defpackage.yxp.FACET_SWITCHED;
                    break;
                case 10:
                    yxpVar2 = defpackage.yxp.INTERRUPTED;
                    break;
                case 11:
                    yxpVar2 = defpackage.yxp.RAIL_ICON_CLICKED;
                    break;
                case 12:
                    yxpVar2 = defpackage.yxp.RESTART_ATTEMPTED;
                    break;
                case 13:
                    yxpVar2 = defpackage.yxp.RESIZE;
                    break;
                case 14:
                    yxpVar2 = defpackage.yxp.CANCELLED_USER_MAP_INTERACTION;
                    break;
                default:
                    yxpVar2 = null;
                    break;
            }
            sb.append(yxpVar2.name());
            sb.append("\n");
        }
        if ((yxnVar.b & 128) != 0) {
            sb.append("\tVoice Session Type: ");
            int iD = defpackage.acmj.d(yxnVar.j);
            switch (iD) {
                case 1:
                    str6 = "UNKNOWN_TYPE";
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    str6 = "GENERAL";
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    str6 = "READ_MESSAGE";
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    str6 = "REPLY_MESSAGE";
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    str6 = "DIRECT_ACTION";
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    str6 = "RECOMMENDATIONS";
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    str6 = "TRANSCRIPTION";
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    str6 = "SEND_MESSAGE";
                    break;
                case 9:
                    str6 = "PROACTIVE_READ_MESSAGE";
                    break;
                case 10:
                    str6 = "DEEPLINK";
                    break;
                case 11:
                    str6 = "SUMMARIZE_MESSAGE";
                    break;
                default:
                    str6 = "null";
                    break;
            }
            if (iD == 0) {
                throw null;
            }
            sb.append(str6);
            sb.append("\n");
        }
        if ((yxnVar.b & 256) != 0) {
            sb.append("\tApi Version: ");
            sb.append(yxnVar.k);
            sb.append("\n");
        }
        if ((yxnVar.b & 512) != 0) {
            sb.append("\tMessage Count: ");
            sb.append(yxnVar.m);
            sb.append("\n");
        }
        if ((yxnVar.b & 1024) != 0) {
            int iAs = defpackage.a.as(yxnVar.n);
            if (iAs == 0) {
                iAs = 1;
            }
            int i8 = iAs - 1;
            if (i8 == 1) {
                str5 = "Navigation";
            } else if (i8 == 2) {
                str5 = "Phone";
            } else if (i8 == 3) {
                str5 = "Media";
            } else if (i8 != 4) {
                str5 = i8 != 5 ? "Unknown" : "Home";
            } else {
                str5 = "OEM";
            }
            sb.append("\tCurrent Facet: ");
            sb.append(str5);
            sb.append("\n");
        }
        if ((yxnVar.b & 2048) != 0) {
            sb.append("\tIs Navigating: ");
            sb.append(yxnVar.o);
            sb.append("\n");
        }
        if ((yxnVar.b & 4096) != 0) {
            sb.append("\tDefault Media App: ");
            sb.append(yxnVar.p);
            sb.append("\n");
        }
        if ((yxnVar.b & 8192) != 0) {
            sb.append("\tDefault Navigation App: ");
            sb.append(yxnVar.q);
            sb.append("\n");
        }
        int size2 = yxnVar.l.size();
        if (size2 > 0) {
            sb.append("\tSession Events");
            sb.append(size2 > 100 ? defpackage.a.bm(size2, " (last 100 of ", ")") : "");
            sb.append(": {\n");
            java.util.List<defpackage.yxm> listSubList = yxnVar.l;
            if (size2 > 100) {
                listSubList = listSubList.subList(listSubList.size() - 100, listSubList.size());
            }
            for (defpackage.yxm yxmVar2 : listSubList) {
                sb.append("\t\tSession Event: {\n");
                if ((yxmVar2.b & 1) != 0) {
                    sb.append("\t\t\tTime Since Assistant Session Start Millis: ");
                    sb.append(yxmVar2.c);
                    sb.append("\n");
                }
                if ((yxmVar2.b & 2) != 0) {
                    sb.append("\t\t\tEvent: ");
                    int iT = defpackage.ytn.t(yxmVar2.d);
                    if (iT == 0) {
                        throw null;
                    }
                    sb.append(defpackage.ytn.s(iT));
                    sb.append("\n");
                }
                if ((yxmVar2.b & 4) != 0) {
                    sb.append("\t\t\tPlate State: ");
                    int iAr = defpackage.a.ar(yxmVar2.e);
                    switch (iAr) {
                        case 1:
                            str4 = "UNKNOWN_PLATE_STATE";
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            str4 = "ERROR";
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            str4 = "IDLE";
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            str4 = "LISTENING";
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            str4 = "RECORDING";
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            str4 = "THINKING";
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            str4 = "SPEAKING";
                            break;
                        default:
                            str4 = "null";
                            break;
                    }
                    if (iAr == 0) {
                        throw null;
                    }
                    sb.append(str4);
                    sb.append("\n");
                }
                if ((yxmVar2.b & 8) != 0) {
                    sb.append("\t\t\tPlate Message Type: ");
                    int iAo = defpackage.a.ao(yxmVar2.f);
                    if (iAo == 1) {
                        str3 = "UNKNOWN_MESSAGE_TYPE";
                    } else if (iAo != 2) {
                        str3 = iAo != 3 ? "null" : "CLEAR_MESSAGE";
                    } else {
                        str3 = "POOR_NETWORK";
                    }
                    if (iAo == 0) {
                        throw null;
                    }
                    sb.append(str3);
                    sb.append("\n");
                }
                sb.append("\t\t}\n");
            }
            sb.append("\t}\n");
        }
        sb.append("}");
        ((defpackage.yqj) ((defpackage.yqj) defpackage.lao.a.f()).ai(3690)).t(sb);
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.ASSISTANT, yygVar2));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void v(int i, int i2, int i3) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 32, defpackage.zaa.SYSTEM_UI_CONFIGURATION);
        defpackage.abor aborVarN = defpackage.zax.a.n();
        aborVarN.t();
        defpackage.zax zaxVar = (defpackage.zax) aborVarN.b;
        zaxVar.b |= 1;
        zaxVar.c = i2;
        aborVarN.t();
        defpackage.zax zaxVar2 = (defpackage.zax) aborVarN.b;
        zaxVar2.b |= 2;
        zaxVar2.d = i;
        aborVarN.t();
        defpackage.zax zaxVar3 = (defpackage.zax) aborVarN.b;
        zaxVar3.b |= 4;
        zaxVar3.e = i3 - 1;
        defpackage.zax zaxVar4 = (defpackage.zax) aborVarN.q();
        zaxVar4.getClass();
        rroVarH.k = new defpackage.xys(zaxVar4);
        F(rroVarH.l());
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void w(java.lang.String str, int i, int i2, int i3) {
        defpackage.abor aborVarN = defpackage.yyi.a.n();
        aborVarN.t();
        defpackage.yyi yyiVar = (defpackage.yyi) aborVarN.b;
        str.getClass();
        yyiVar.b |= 1;
        yyiVar.c = str;
        aborVarN.t();
        defpackage.yyi yyiVar2 = (defpackage.yyi) aborVarN.b;
        yyiVar2.b |= 2;
        yyiVar2.d = i;
        aborVarN.t();
        defpackage.yyi yyiVar3 = (defpackage.yyi) aborVarN.b;
        yyiVar3.b |= 4;
        yyiVar3.e = i2 - 1;
        aborVarN.t();
        defpackage.yyi yyiVar4 = (defpackage.yyi) aborVarN.b;
        yyiVar4.b |= 8;
        yyiVar4.f = i3 - 1;
        defpackage.yyi yyiVar5 = (defpackage.yyi) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yyiVar5.getClass();
        yygVar.m = yyiVar5;
        yygVar.b |= 512;
        G(new com.google.android.apps.auto.components.telemetry.TelemetryEvent(defpackage.yyh.CARMENU_LATENCY, (defpackage.yyg) aborVarN2.q()));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void x(int i, defpackage.zaa zaaVar) {
        defpackage.omf.v(this, defpackage.rrp.h(defpackage.yzd.GEARHEAD, i, zaaVar));
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void y(defpackage.zaa zaaVar, java.lang.String str) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 12, zaaVar);
        rroVarH.j = defpackage.xyn.h(str);
        defpackage.omf.v(this, rroVarH);
    }

    @Override // defpackage.oim
    @java.lang.Deprecated
    public final void z(defpackage.zaa zaaVar, java.lang.String str, defpackage.zab zabVar) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 14, zaaVar);
        if (str != null) {
            rroVarH.e(str);
        }
        rroVarH.i(zabVar);
        defpackage.omf.v(this, rroVarH);
    }
}
