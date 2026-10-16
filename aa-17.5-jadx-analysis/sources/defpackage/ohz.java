package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ohz implements ohs {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.Telemetry");
    private final oib c;
    private final ohr d;

    public ohz(Context context, Executor executor, jri jriVar, mkf mkfVar, Optional optional) {
        Optional.empty();
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (executor == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        ohy ohyVar = new ohy(context, executor, jriVar, mkfVar, optional);
        boolean z = true;
        if (!ActivityManager.isUserAMonkey() && !ActivityManager.isRunningInTestHarness()) {
            z = false;
        }
        this.c = new oib(ohyVar.a, ohyVar.b, ohyVar.c, ohyVar.d, z);
        this.d = (ohr) ohyVar.e.orElse(null);
    }

    private final void G(TelemetryEvent telemetryEvent) throws PackageManager.NameNotFoundException {
        this.c.b(telemetryEvent);
    }

    private final void H(int i, ComponentName componentName, Long l, CarRegionId carRegionId) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = zab.a.n();
        String strFlattenToString = componentName.flattenToString();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        strFlattenToString.getClass();
        zabVar.b |= 16384;
        zabVar.r = strFlattenToString;
        if (l != null) {
            long jLongValue = l.longValue();
            abnpVarN.t();
            zab zabVar2 = (zab) abnpVarN.b;
            zabVar2.b |= 4;
            zabVar2.f = jLongValue;
        }
        if (carRegionId != null) {
            abnpVarN.t();
            zab zabVar3 = (zab) abnpVarN.b;
            zabVar3.b |= 2097152;
            zabVar3.A = carRegionId.g;
            int i2 = carRegionId.h.b;
            abnpVarN.t();
            zab zabVar4 = (zab) abnpVarN.b;
            zabVar4.b |= 1048576;
            zabVar4.z = i2;
        }
        abnp abnpVarN2 = yxb.a.n();
        zab zabVar5 = (zab) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        zabVar5.getClass();
        yxbVar.o = zabVar5;
        yxbVar.b |= 4096;
        yxb yxbVar2 = (yxb) abnpVarN2.q();
        int i3 = i - 1;
        yxc yxcVar = i3 != 1 ? i3 != 3 ? i3 != 4 ? l != null ? yxc.FACET_PHONE_END : yxc.FACET_PHONE_START : l != null ? yxc.FACET_OEM_END : yxc.FACET_OEM_START : l != null ? yxc.FACET_MUSIC_END : yxc.FACET_MUSIC_START : l != null ? yxc.FACET_NAVIGATION_END : yxc.FACET_NAVIGATION_START;
        if (yxcVar == yxc.UNKNOWN_EVENT_TYPE) {
            ((ype) ((ype) b.h()).ai((char) 5948)).y("Invalid facet type: %s", wub.aL(i));
            yxcVar = yxc.COMPONENT_CONNECTION_EVENT;
        }
        G(new TelemetryEvent(yxcVar, yxbVar2));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void A(yyv yyvVar, String str) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 16, yyvVar);
        rquVarH.i = xxh.h(str);
        ebf.k(this, rquVarH);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void B(yyv yyvVar, yyw yywVar) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 3, yyvVar);
        rquVarH.i(yywVar);
        F(rquVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void C(yyv yyvVar, String str) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 14, yyvVar);
        if (str != null) {
            rquVarH.e(str);
        }
        ebf.k(this, rquVarH);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void D(yyv yyvVar, yyk yykVar) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 34, yyvVar);
        rquVarH.l = xxh.h(yykVar);
        ebf.k(this, rquVarH);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void E(UUID uuid, Boolean bool, zac zacVar, Integer num) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = zae.a.n();
        abnpVarN.t();
        zae zaeVar = (zae) abnpVarN.b;
        zaeVar.b |= 1;
        zaeVar.c = 1;
        bool.booleanValue();
        abnpVarN.t();
        zae zaeVar2 = (zae) abnpVarN.b;
        zaeVar2.b |= 2;
        zaeVar2.d = false;
        if (zacVar != null) {
            abnpVarN.t();
            zae zaeVar3 = (zae) abnpVarN.b;
            zaeVar3.e = zacVar;
            zaeVar3.b |= 4;
        }
        if (num != null) {
            num.intValue();
            abnpVarN.t();
            zae zaeVar4 = (zae) abnpVarN.b;
            zaeVar4.b |= 8;
            zaeVar4.f = 0;
        }
        abnp abnpVarN2 = yxb.a.n();
        yzj yzjVarS = aclh.s(uuid);
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzjVarS.getClass();
        yxbVar.C = yzjVarS;
        yxbVar.b |= 536870912;
        zae zaeVar5 = (zae) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar2 = (yxb) abnpVarN2.b;
        zaeVar5.getClass();
        yxbVar2.G = zaeVar5;
        yxbVar2.c |= 16;
        TelemetryEvent telemetryEvent = new TelemetryEvent(yxc.WIRELESS_START, (yxb) abnpVarN2.q());
        telemetryEvent.d();
        G(telemetryEvent);
    }

    @Override // defpackage.oht
    public final void F(rqy rqyVar) throws PackageManager.NameNotFoundException {
        abnp abnpVarG = rqyVar.g();
        ohr ohrVar = this.d;
        if (ohrVar != null) {
            rpu rpuVarA = ohrVar.a();
            Optional optionalI = rpuVarA.a.i();
            abnpVarG.getClass();
            imn imnVar = new imn(abnpVarG, 5);
            if (true == optionalI.isPresent()) {
                Object obj = optionalI.get();
                Object obj2 = imnVar.a;
                int iIntValue = ((Integer) obj).intValue();
                abnp abnpVar = (abnp) obj2;
                abnpVar.t();
                yxb yxbVar = (yxb) abnpVar.b;
                yxb yxbVar2 = yxb.a;
                yxbVar.b |= 524288;
                yxbVar.t = iIntValue;
            }
            Optional optionalI2 = rpuVarA.b.i();
            imn imnVar2 = new imn(abnpVarG, 6);
            if (true == optionalI2.isPresent()) {
                Object obj3 = optionalI2.get();
                Object obj4 = imnVar2.a;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                abnp abnpVar2 = (abnp) obj4;
                abnpVar2.t();
                yxb yxbVar3 = (yxb) abnpVar2.b;
                yxb yxbVar4 = yxb.a;
                yxbVar3.b |= 1048576;
                yxbVar3.u = zBooleanValue;
            }
            Optional optionalI3 = rpuVarA.c.i();
            imn imnVar3 = new imn(abnpVarG, 7);
            if (true == optionalI3.isPresent()) {
                Object obj5 = optionalI3.get();
                Object obj6 = imnVar3.a;
                int iIntValue2 = ((Integer) obj5).intValue();
                abnp abnpVar3 = (abnp) obj6;
                abnpVar3.t();
                yxb yxbVar5 = (yxb) abnpVar3.b;
                yxb yxbVar6 = yxb.a;
                yxbVar5.b |= 2097152;
                yxbVar5.v = iIntValue2;
            }
            Optional optionalI4 = rpuVarA.d.i();
            imn imnVar4 = new imn(abnpVarG, 8);
            if (true == optionalI4.isPresent()) {
                Object obj7 = optionalI4.get();
                Object obj8 = imnVar4.a;
                int i = ((yyf) obj7).l;
                abnp abnpVar4 = (abnp) obj8;
                abnpVar4.t();
                yxb yxbVar7 = (yxb) abnpVar4.b;
                yxb yxbVar8 = yxb.a;
                yxbVar7.b |= 4194304;
                yxbVar7.w = i;
            }
        }
        TelemetryEvent telemetryEvent = new TelemetryEvent(rqyVar.e(), (yxb) abnpVarG.q());
        telemetryEvent.c(rqyVar.d().d());
        G(telemetryEvent);
    }

    @Override // defpackage.ohs
    public final zgp a(rqy rqyVar) {
        TelemetryEvent telemetryEvent = new TelemetryEvent(rqyVar.e(), (yxb) rqyVar.g().q());
        telemetryEvent.c(rqyVar.d().d());
        oib oibVar = this.c;
        return wub.ac(new pfl(oibVar, telemetryEvent, 1, null), oibVar.c);
    }

    @Override // defpackage.ohs
    public final String b(yzz yzzVar) {
        return yzzVar.name();
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void c(List list) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = yys.a.n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strFlattenToString = ((ComponentName) it.next()).flattenToString();
            abnpVarN.t();
            yys yysVar = (yys) abnpVarN.b;
            strFlattenToString.getClass();
            aboh abohVar = yysVar.b;
            if (!abohVar.c()) {
                yysVar.b = abnv.I(abohVar);
            }
            yysVar.b.add(strFlattenToString);
        }
        abnp abnpVarN2 = yxb.a.n();
        yys yysVar2 = (yys) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yysVar2.getClass();
        yxbVar.R = yysVar2;
        yxbVar.c |= 262144;
        G(new TelemetryEvent(yxc.LAUNCHER_STATE, (yxb) abnpVarN2.q()));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void d(rqy rqyVar) throws PackageManager.NameNotFoundException {
        jrl jrlVar = jrl.PROJECTION;
        if (((jrl) mki.a.i(jrl.class)) != jrl.SHARED_SERVICE) {
            throw new IllegalStateException();
        }
        TelemetryEvent telemetryEvent = new TelemetryEvent(rqyVar.e(), (yxb) rqyVar.g().q());
        telemetryEvent.c(rqyVar.d().d());
        telemetryEvent.d();
        G(telemetryEvent);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void e(yzy yzyVar) throws PackageManager.NameNotFoundException {
        F(rrc.h(yxy.GEARHEAD, yzz.DRAWER, yzyVar).l());
    }

    @Override // defpackage.ohs
    public final /* synthetic */ void f(rqx rqxVar) {
        F(rqxVar.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void g(yzz yzzVar, int i, String str) throws PackageManager.NameNotFoundException {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzy.eE);
        abnp abnpVarC = rrbVarH.C();
        abnpVarC.t();
        yyl yylVar = (yyl) abnpVarC.b;
        yyl yylVar2 = yyl.a;
        yylVar.b |= 2;
        yylVar.d = i;
        if (str != null) {
            abnp abnpVarC2 = rrbVarH.C();
            abnpVarC2.t();
            yyl yylVar3 = (yyl) abnpVarC2.b;
            yylVar3.b |= 1;
            yylVar3.c = str;
        }
        F(rrbVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void h(boolean z) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = yxb.a.n();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yxbVar.b |= 256;
        yxbVar.l = z;
        G(new TelemetryEvent(yxc.COMPANION_TOGGLE_KNOWN_CARS, (yxb) abnpVarN.q()));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void i(yxc yxcVar) throws PackageManager.NameNotFoundException {
        G(new TelemetryEvent(yxcVar, yxb.a));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void j(List list) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = yys.a.n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strFlattenToString = ((ComponentName) it.next()).flattenToString();
            abnpVarN.t();
            yys yysVar = (yys) abnpVarN.b;
            strFlattenToString.getClass();
            aboh abohVar = yysVar.c;
            if (!abohVar.c()) {
                yysVar.c = abnv.I(abohVar);
            }
            yysVar.c.add(strFlattenToString);
        }
        abnp abnpVarN2 = yxb.a.n();
        yys yysVar2 = (yys) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yysVar2.getClass();
        yxbVar.R = yysVar2;
        yxbVar.c |= 262144;
        G(new TelemetryEvent(yxc.LAUNCHER_STATE, (yxb) abnpVarN2.q()));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void k(String str) throws PackageManager.NameNotFoundException {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.KEYBOARD_EXTERNAL, yzy.eG);
        if (str != null) {
            rrbVarH.j = xxh.h(str);
        }
        F(rrbVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void l(yzk yzkVar) throws PackageManager.NameNotFoundException {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.RATING_PROMPT, yzy.hR);
        rrbVarH.i = xxh.h(yzkVar);
        F(rrbVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void m(yzz yzzVar, yzy yzyVar, yzr yzrVar, yzq yzqVar, String str) throws PackageManager.NameNotFoundException {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzyVar);
        if (yzrVar != null) {
            rrbVarH.g = xxh.h(yzrVar);
        }
        rrbVarH.k = xxh.h(yzqVar);
        rrbVarH.g(str);
        F(rrbVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void n(List list) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 19, yyv.LOG_TESTCODES);
        rquVarH.k(list);
        ebf.k(this, rquVarH);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void o(yzz yzzVar, yzy yzyVar) throws PackageManager.NameNotFoundException {
        F(rrc.h(yxy.GEARHEAD, yzzVar, yzyVar).l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void p(yzz yzzVar, yzy yzyVar, ComponentName componentName, int i, int i2) throws PackageManager.NameNotFoundException {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzyVar);
        rrbVarH.A(i2);
        rrbVarH.t(i);
        rrbVarH.p(componentName);
        F(rrbVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void q(yzz yzzVar, yzy yzyVar, int i) throws PackageManager.NameNotFoundException {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzyVar);
        rrbVarH.z(i);
        F(rrbVarH.l());
    }

    @Override // defpackage.ohs
    public final void r(int i, ComponentName componentName, long j, CarRegionId carRegionId) throws PackageManager.NameNotFoundException {
        H(i, componentName, Long.valueOf(j), carRegionId);
    }

    @Override // defpackage.ohs
    public final void s(int i, ComponentName componentName, CarRegionId carRegionId) throws PackageManager.NameNotFoundException {
        H(i, componentName, null, carRegionId);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void t(ywj ywjVar, int i, int i2, Long l, int i3, String str, String str2, ywk ywkVar) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = ywi.a.n();
        abnpVarN.t();
        ywi ywiVar = (ywi) abnpVarN.b;
        ywiVar.b |= 1;
        ywiVar.c = ywjVar.ap;
        abnpVarN.t();
        ywi ywiVar2 = (ywi) abnpVarN.b;
        ywiVar2.b |= 128;
        ywiVar2.j = i2 - 1;
        abnpVarN.t();
        ywi ywiVar3 = (ywi) abnpVarN.b;
        ywiVar3.b |= 2;
        ywiVar3.d = i - 1;
        abnpVarN.t();
        ywi ywiVar4 = (ywi) abnpVarN.b;
        ywiVar4.b |= 8;
        ywiVar4.f = i3 - 1;
        abnpVarN.t();
        ywi ywiVar5 = (ywi) abnpVarN.b;
        ywiVar5.b |= 64;
        ywiVar5.i = ywkVar.p;
        if (l != null) {
            long jLongValue = l.longValue();
            abnpVarN.t();
            ywi ywiVar6 = (ywi) abnpVarN.b;
            ywiVar6.b |= 4;
            ywiVar6.e = jLongValue;
        }
        if (str != null) {
            abnpVarN.t();
            ywi ywiVar7 = (ywi) abnpVarN.b;
            ywiVar7.b |= 16;
            ywiVar7.g = str;
        }
        if (str2 != null) {
            abnpVarN.t();
            ywi ywiVar8 = (ywi) abnpVarN.b;
            ywiVar8.b |= 32;
            ywiVar8.h = str2;
        }
        abnp abnpVarN2 = yxb.a.n();
        ywi ywiVar9 = (ywi) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        ywiVar9.getClass();
        yxbVar.r = ywiVar9;
        yxbVar.b |= 32768;
        G(new TelemetryEvent(yxc.ASSISTANT, (yxb) abnpVarN2.q()));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void u(int i, int i2, Long l, int i3, String str, String str2, ywk ywkVar, ClientStateSnapshot clientStateSnapshot, int i4, List list) throws PackageManager.NameNotFoundException {
        String str3;
        String str4;
        ywk ywkVar2;
        String str5;
        String str6;
        String str7;
        ywi ywiVar = ywi.a;
        abnp abnpVarN = ywiVar.n();
        ywj ywjVar = ywj.LOGGING_SESSION_INFO;
        int i5 = ywjVar.ap;
        abnpVarN.t();
        ywi ywiVar2 = (ywi) abnpVarN.b;
        ywiVar2.b |= 1;
        ywiVar2.c = i5;
        abnpVarN.t();
        ywi ywiVar3 = (ywi) abnpVarN.b;
        ywiVar3.b |= 128;
        ywiVar3.j = i2 - 1;
        abnpVarN.t();
        ywi ywiVar4 = (ywi) abnpVarN.b;
        ywiVar4.b |= 2;
        ywiVar4.d = i - 1;
        abnpVarN.t();
        ywi ywiVar5 = (ywi) abnpVarN.b;
        ywiVar5.b |= 256;
        ywiVar5.k = i4;
        long jLongValue = l.longValue();
        abnpVarN.t();
        ywi ywiVar6 = (ywi) abnpVarN.b;
        ywiVar6.b |= 4;
        ywiVar6.e = jLongValue;
        if (i3 != 0) {
            abnpVarN.t();
            ywi ywiVar7 = (ywi) abnpVarN.b;
            ywiVar7.b |= 8;
            ywiVar7.f = i3 - 1;
        }
        if (str != null) {
            abnpVarN.t();
            ywi ywiVar8 = (ywi) abnpVarN.b;
            ywiVar8.b |= 16;
            ywiVar8.g = str;
        }
        if (str2 != null) {
            abnpVarN.t();
            ywi ywiVar9 = (ywi) abnpVarN.b;
            ywiVar9.b |= 32;
            ywiVar9.h = str2;
        }
        if (ywkVar != null) {
            abnpVarN.t();
            ywi ywiVar10 = (ywi) abnpVarN.b;
            ywiVar10.b |= 64;
            ywiVar10.i = ywkVar.p;
        }
        if (clientStateSnapshot != null) {
            List list2 = clientStateSnapshot.b;
            int size = list2 == null ? 0 : list2.size();
            abnpVarN.t();
            ywi ywiVar11 = (ywi) abnpVarN.b;
            ywiVar11.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ywiVar11.m = size;
            GearheadStateSnapshot gearheadStateSnapshot = clientStateSnapshot.c;
            if (gearheadStateSnapshot != null) {
                int i6 = gearheadStateSnapshot.b;
                abnpVarN.t();
                ywi ywiVar12 = (ywi) abnpVarN.b;
                ywiVar12.b |= 1024;
                ywiVar12.n = i6;
                boolean z = clientStateSnapshot.c.c;
                abnpVarN.t();
                ywi ywiVar13 = (ywi) abnpVarN.b;
                ywiVar13.b |= 2048;
                ywiVar13.o = z;
                str6 = clientStateSnapshot.c.h.g(1) ? (String) aav.a(clientStateSnapshot.c.h, 1) : null;
                str7 = clientStateSnapshot.c.h.g(2) ? (String) aav.a(clientStateSnapshot.c.h, 2) : null;
            } else {
                str6 = null;
                str7 = null;
            }
            String str8 = (String) new ntn(str6).i("Not Available");
            String str9 = (String) new ntn(str7).i("Not Available");
            abnpVarN.t();
            ywi ywiVar14 = (ywi) abnpVarN.b;
            ywiVar14.b |= 4096;
            ywiVar14.p = str8;
            abnpVarN.t();
            ywi ywiVar15 = (ywi) abnpVarN.b;
            ywiVar15.b |= 8192;
            ywiVar15.q = str9;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ywh ywhVar = (ywh) it.next();
            abnpVarN.t();
            ywi ywiVar16 = (ywi) abnpVarN.b;
            ywhVar.getClass();
            aboh abohVar = ywiVar16.l;
            if (!abohVar.c()) {
                ywiVar16.l = abnv.I(abohVar);
            }
            ywiVar16.l.add(ywhVar);
        }
        abnp abnpVarN2 = yxb.a.n();
        ywi ywiVar17 = (ywi) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        ywiVar17.getClass();
        yxbVar.r = ywiVar17;
        yxbVar.b |= 32768;
        yxb yxbVar2 = (yxb) abnpVarN2.q();
        ywi ywiVar18 = yxbVar2.r;
        if (ywiVar18 != null) {
            ywiVar = ywiVar18;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AssistantSession:\nAssistant Event: {\n");
        if ((ywiVar.b & 1) != 0) {
            sb.append("\tEvent Type: ");
            int i7 = ywiVar.c;
            if (i7 == 64) {
                ywjVar = ywj.SERVICE_CONNECTION_ATTEMPTED;
            } else if (i7 == 65) {
                ywjVar = ywj.SERVICE_CONNECTION_ATTEMPTED_DODGEBOOST;
            } else if (i7 == 100) {
                ywjVar = ywj.EXPAND_DEMAND_SPACE;
            } else if (i7 == 101) {
                ywjVar = ywj.COLLAPSE_DEMAND_SPACE;
            } else if (i7 != 200) {
                if (i7 != 300) {
                    switch (i7) {
                        case 0:
                            ywjVar = ywj.UNKNOWN_EVENT_TYPE;
                            break;
                        case 1:
                            ywjVar = ywj.VOICE_SESSION_STARTED;
                            break;
                        case 2:
                            ywjVar = ywj.VOICE_SESSION_START_REJECTED;
                            break;
                        case 3:
                            ywjVar = ywj.VOICE_SESSION_ENDED;
                            break;
                        case 4:
                            ywjVar = ywj.VOICE_SESSION_CANCELLED;
                            break;
                        case 5:
                            ywjVar = ywj.VOICE_SESSION_INTENT_RESULT;
                            break;
                        case 6:
                            ywjVar = ywj.VOICE_SESSION_ERROR;
                            break;
                        case 7:
                            ywjVar = ywj.VOICE_SESSION_PLATE_ERROR;
                            break;
                        case 8:
                            ywjVar = ywj.VOICE_SESSION_SKIPPED_BECAUSE_OF_ACTIVE_VOICE_CALL;
                            break;
                        default:
                            switch (i7) {
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                    ywjVar = ywj.SERVICE_DISCONNECTED;
                                    break;
                                case 51:
                                    ywjVar = ywj.SERVICE_PERMANENTLY_DISCONNECTED;
                                    break;
                                case 52:
                                    ywjVar = ywj.SERVICE_RECONNECTED;
                                    break;
                                case 53:
                                    ywjVar = ywj.SERVICE_UNAVAILABLE;
                                    break;
                                case 54:
                                    ywjVar = ywj.SERVICE_MISSING_PERMISSIONS;
                                    break;
                                case 55:
                                    ywjVar = ywj.SERVICE_POOR_NETWORK;
                                    break;
                                case 56:
                                    ywjVar = ywj.SERVICE_FAILED_TO_CLOSE;
                                    break;
                                case 57:
                                    ywjVar = ywj.SERVICE_BINDING_DIED;
                                    break;
                                case 58:
                                    ywjVar = ywj.SERVICE_CONNECTED;
                                    break;
                                case 59:
                                    ywjVar = ywj.SERVICE_CONNECTED_DODGEBOOST;
                                    break;
                                case 60:
                                    ywjVar = ywj.SERVICE_CLOSED;
                                    break;
                                case 61:
                                    ywjVar = ywj.SERVICE_CLOSED_DODGEBOOST;
                                    break;
                                default:
                                    switch (i7) {
                                        case 150:
                                            ywjVar = ywj.LOCALE_RETRIEVAL_FAILED;
                                            break;
                                        case 151:
                                            ywjVar = ywj.SERVICE_REBIND_FAILED;
                                            break;
                                        case 152:
                                            ywjVar = ywj.REPORT_VOICE_SESSION_CHANGE_TO_CAR_FAILED;
                                            break;
                                        case 153:
                                            ywjVar = ywj.CONFIGURE_CAR_API_FAILED;
                                            break;
                                        case 154:
                                            ywjVar = ywj.CAR_MESSAGE_MANAGER_UNINITIALIZED;
                                            break;
                                        default:
                                            switch (i7) {
                                                case 205:
                                                    ywjVar = ywj.VOICE_SESSION_FAILED_TO_CONFIGURE_CAR_API;
                                                    break;
                                                case 206:
                                                    ywjVar = ywj.VOICE_SESSION_FAILED_TO_REPORT_VOICE_SESSION_CHANGE_TO_CAR;
                                                    break;
                                                case 207:
                                                    ywjVar = ywj.VOICE_SESSION_MICROPHONE_NOT_OPENED_WITHIN_TIMEOUT;
                                                    break;
                                                case 208:
                                                    ywjVar = ywj.START_VOICE_SESSION_DIRECT_ACTION_INVALID_QUERY;
                                                    break;
                                                case 209:
                                                    ywjVar = ywj.START_VOICE_SESSION_ERROR_ASSISTANT_NULL;
                                                    break;
                                                case 210:
                                                    ywjVar = ywj.START_VOICE_SESSION_ERROR_CONTROLLER_NOT_STARTED;
                                                    break;
                                                case 211:
                                                    ywjVar = ywj.START_VOICE_SESSION_DEMAND_SPACE_ALREADY_OPEN;
                                                    break;
                                                case 212:
                                                    ywjVar = ywj.START_VOICE_SESSION_IGNORED_BECAUSE_IN_CALL;
                                                    break;
                                                case 213:
                                                    ywjVar = ywj.START_VOICE_SESSION_ASSISTANT_STATE_UNINITIALIZED;
                                                    break;
                                                case 214:
                                                    ywjVar = ywj.START_VOICE_SESSION_ASSISTANT_STATE_INITIALIZED_BUT_UNAVAILABLE;
                                                    break;
                                                case 215:
                                                    ywjVar = ywj.START_VOICE_SESSION_ASSISTANT_STATE_UNAVAILABLE;
                                                    break;
                                                case 216:
                                                    ywjVar = ywj.START_VOICE_SESSION_MISSING_MICROPHONE_PERMISSION;
                                                    break;
                                                case 217:
                                                    ywjVar = ywj.END_VOICE_SESSION_DEMAND_SPACE_ALREADY_CLOSED;
                                                    break;
                                                case 218:
                                                    ywjVar = ywj.START_TRANSCRIPTION_WITHOUT_CALLBACK;
                                                    break;
                                                case 219:
                                                    ywjVar = ywj.END_VOICE_SESSION_DEMAND_SPACE_RECENTLY_OPENED;
                                                    break;
                                                case 220:
                                                    ywjVar = ywj.END_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE;
                                                    break;
                                                case 221:
                                                    ywjVar = ywj.START_VOICE_SESSION_DEMAND_SPACE_PENDING_OPEN;
                                                    break;
                                                case 222:
                                                    ywjVar = ywj.START_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE;
                                                    break;
                                                default:
                                                    switch (i7) {
                                                        case 250:
                                                            ywjVar = ywj.PROCESS_INTENT_RESULT_GENERIC_EXCEPTION;
                                                            break;
                                                        case 251:
                                                            ywjVar = ywj.PROCESS_INTENT_RESULT_INTERRUPTED;
                                                            break;
                                                        case 252:
                                                            ywjVar = ywj.PROCESS_INTENT_RESULT_EXECUTION_EXCEPTION;
                                                            break;
                                                        case 253:
                                                            ywjVar = ywj.PROCESS_INTENT_RESULT_CANCELLED;
                                                            break;
                                                        default:
                                                            switch (i7) {
                                                                case 260:
                                                                    ywjVar = ywj.START_VOICE_SESSION_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 261:
                                                                    ywjVar = ywj.STOP_VOICE_SESSION_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 262:
                                                                    ywjVar = ywj.SEND_GEARHEAD_EVENT_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 263:
                                                                    ywjVar = ywj.MEDIA_REC_BIDI_STREAM_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 264:
                                                                    ywjVar = ywj.DODGEBOOST_GET_ASSISTANT_FEATURE_FLAGS_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 265:
                                                                    ywjVar = ywj.DODGEBOOST_CONNECTION_REMOTE_EXCEPTION;
                                                                    break;
                                                                case 266:
                                                                    ywjVar = ywj.DODGEBOOST_CONNECTION_COMPLETED;
                                                                    break;
                                                                default:
                                                                    switch (i7) {
                                                                        case 280:
                                                                            ywjVar = ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_UNKNOWN;
                                                                            break;
                                                                        case 281:
                                                                            ywjVar = ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_CLOSED;
                                                                            break;
                                                                        case 282:
                                                                            ywjVar = ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_OPEN;
                                                                            break;
                                                                        case 283:
                                                                            ywjVar = ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_UNAVAILABLE;
                                                                            break;
                                                                        case 284:
                                                                            ywjVar = ywj.DEMAND_SPACE_ALREADY_OPEN_ON_VOICE_SESSION_START;
                                                                            break;
                                                                        case 285:
                                                                            ywjVar = ywj.DEMAND_SPACE_ALREADY_CLOSED_ON_VOICE_SESSION_END;
                                                                            break;
                                                                        default:
                                                                            ywjVar = null;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    ywjVar = ywj.MEDIA_REC_BIDI_STREAM_RESPONSE_RECEIVED;
                }
            }
            sb.append(ywjVar.name());
            sb.append("\n");
        }
        if ((ywiVar.b & 2) != 0) {
            sb.append("\tVoice Session Trigger: ");
            int iAB = a.aB(ywiVar.d);
            switch (iAB) {
                case 1:
                    str5 = "UNKNOWN_TRIGGER";
                    break;
                case 2:
                    str5 = "ONSCREEN_UI";
                    break;
                case 3:
                    str5 = "HARDWARE_CONTROLLER";
                    break;
                case 4:
                    str5 = "HARDWARE_BUTTON_DEDICATED";
                    break;
                case 5:
                    str5 = "ASSISTANT_REQUESTED";
                    break;
                case 6:
                    str5 = "BOARDWALK_RAIL_MEDIA_REC";
                    break;
                case 7:
                    str5 = "ONSCREEN_UI_ASSISTANT_SUGGESTION";
                    break;
                case 8:
                    str5 = "ASSISTANT_PROACTIVE";
                    break;
                case 9:
                    str5 = "COOLWALK_MEDIA_PLAYER_DASHBOARD_MEDIA_REC";
                    break;
                case 10:
                    str5 = "COOLWALK_MEDIA_SUGGESTION_DASHBOARD_MEDIA_REC";
                    break;
                case 11:
                    str5 = "GMM_MIC_UI";
                    break;
                case 12:
                    str5 = "HARDWARE_BUTTON_DEDICATED_SHORT_PRESS";
                    break;
                default:
                    str5 = "null";
                    break;
            }
            if (iAB == 0) {
                throw null;
            }
            sb.append(str5);
            sb.append("\n");
        }
        if ((ywiVar.b & 4) != 0) {
            sb.append("\tSession Duration Millis: ");
            sb.append(ywiVar.e);
            sb.append("\n");
        }
        if ((ywiVar.b & 8) != 0) {
            sb.append("\tIntent Result Category: ");
            int iAv = a.av(ywiVar.f);
            String str10 = iAv != 1 ? iAv != 2 ? iAv != 3 ? iAv != 4 ? iAv != 5 ? "null" : "MESSAGING" : "TELEPHONE" : "MEDIA" : "NAVIGATION" : "UNKNOWN_INTENT_CATEGORY";
            if (iAv == 0) {
                throw null;
            }
            sb.append(str10);
            sb.append("\n");
        }
        if ((ywiVar.b & 16) != 0) {
            sb.append("\tIntent Result Target Package: ");
            sb.append(ywiVar.g);
            sb.append("\n");
        }
        if ((ywiVar.b & 32) != 0) {
            sb.append("\tIntent Result Action: ");
            sb.append(ywiVar.h);
            sb.append("\n");
        }
        if ((64 & ywiVar.b) != 0) {
            sb.append("\tSession Cancel Trigger: ");
            switch (ywiVar.i) {
                case 0:
                    ywkVar2 = ywk.UNKNOWN_CANCEL_TRIGGER;
                    break;
                case 1:
                    ywkVar2 = ywk.X_BUTTON_CLICKED;
                    break;
                case 2:
                    ywkVar2 = ywk.LOGO_CLICKED;
                    break;
                case 3:
                    ywkVar2 = ywk.SCRIM_CLICKED;
                    break;
                case 4:
                    ywkVar2 = ywk.BACK_BUTTON_CLICKED;
                    break;
                case 5:
                    ywkVar2 = ywk.HARDWARE_BUTTON_CLICKED;
                    break;
                case 6:
                    ywkVar2 = ywk.END_CALL_BUTTON_CLICKED;
                    break;
                case 7:
                    ywkVar2 = ywk.ROTARY_NUDGE;
                    break;
                case 8:
                    ywkVar2 = ywk.SCREEN_TURNED_OFF;
                    break;
                case 9:
                    ywkVar2 = ywk.FACET_SWITCHED;
                    break;
                case 10:
                    ywkVar2 = ywk.INTERRUPTED;
                    break;
                case 11:
                    ywkVar2 = ywk.RAIL_ICON_CLICKED;
                    break;
                case 12:
                    ywkVar2 = ywk.RESTART_ATTEMPTED;
                    break;
                case 13:
                    ywkVar2 = ywk.RESIZE;
                    break;
                case 14:
                    ywkVar2 = ywk.CANCELLED_USER_MAP_INTERACTION;
                    break;
                default:
                    ywkVar2 = null;
                    break;
            }
            sb.append(ywkVar2.name());
            sb.append("\n");
        }
        if ((ywiVar.b & 128) != 0) {
            sb.append("\tVoice Session Type: ");
            int iK = aclh.k(ywiVar.j);
            switch (iK) {
                case 1:
                    str4 = "UNKNOWN_TYPE";
                    break;
                case 2:
                    str4 = "GENERAL";
                    break;
                case 3:
                    str4 = "READ_MESSAGE";
                    break;
                case 4:
                    str4 = "REPLY_MESSAGE";
                    break;
                case 5:
                    str4 = "DIRECT_ACTION";
                    break;
                case 6:
                    str4 = "RECOMMENDATIONS";
                    break;
                case 7:
                    str4 = "TRANSCRIPTION";
                    break;
                case 8:
                    str4 = "SEND_MESSAGE";
                    break;
                case 9:
                    str4 = "PROACTIVE_READ_MESSAGE";
                    break;
                case 10:
                    str4 = "DEEPLINK";
                    break;
                case 11:
                    str4 = "SUMMARIZE_MESSAGE";
                    break;
                default:
                    str4 = "null";
                    break;
            }
            if (iK == 0) {
                throw null;
            }
            sb.append(str4);
            sb.append("\n");
        }
        if ((ywiVar.b & 256) != 0) {
            sb.append("\tApi Version: ");
            sb.append(ywiVar.k);
            sb.append("\n");
        }
        if ((ywiVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            sb.append("\tMessage Count: ");
            sb.append(ywiVar.m);
            sb.append("\n");
        }
        if ((ywiVar.b & 1024) != 0) {
            int iAt = a.at(ywiVar.n);
            if (iAt == 0) {
                iAt = 1;
            }
            int i8 = iAt - 1;
            String str11 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? "Unknown" : "Home" : "OEM" : "Media" : "Phone" : "Navigation";
            sb.append("\tCurrent Facet: ");
            sb.append(str11);
            sb.append("\n");
        }
        if ((ywiVar.b & 2048) != 0) {
            sb.append("\tIs Navigating: ");
            sb.append(ywiVar.o);
            sb.append("\n");
        }
        if ((ywiVar.b & 4096) != 0) {
            sb.append("\tDefault Media App: ");
            sb.append(ywiVar.p);
            sb.append("\n");
        }
        if ((ywiVar.b & 8192) != 0) {
            sb.append("\tDefault Navigation App: ");
            sb.append(ywiVar.q);
            sb.append("\n");
        }
        int size2 = ywiVar.l.size();
        if (size2 > 0) {
            sb.append("\tSession Events");
            sb.append(size2 > 100 ? a.bn(size2, " (last 100 of ", ")") : "");
            sb.append(": {\n");
            List<ywh> listSubList = ywiVar.l;
            if (size2 > 100) {
                listSubList = listSubList.subList(listSubList.size() - 100, listSubList.size());
            }
            for (ywh ywhVar2 : listSubList) {
                sb.append("\t\tSession Event: {\n");
                if ((ywhVar2.b & 1) != 0) {
                    sb.append("\t\t\tTime Since Assistant Session Start Millis: ");
                    sb.append(ywhVar2.c);
                    sb.append("\n");
                }
                if ((ywhVar2.b & 2) != 0) {
                    sb.append("\t\t\tEvent: ");
                    int iZ = zeb.z(ywhVar2.d);
                    if (iZ == 0) {
                        throw null;
                    }
                    sb.append(zeb.y(iZ));
                    sb.append("\n");
                }
                if ((ywhVar2.b & 4) != 0) {
                    sb.append("\t\t\tPlate State: ");
                    int iAs = a.as(ywhVar2.e);
                    switch (iAs) {
                        case 1:
                            str3 = "UNKNOWN_PLATE_STATE";
                            break;
                        case 2:
                            str3 = "ERROR";
                            break;
                        case 3:
                            str3 = "IDLE";
                            break;
                        case 4:
                            str3 = "LISTENING";
                            break;
                        case 5:
                            str3 = "RECORDING";
                            break;
                        case 6:
                            str3 = "THINKING";
                            break;
                        case 7:
                            str3 = "SPEAKING";
                            break;
                        default:
                            str3 = "null";
                            break;
                    }
                    if (iAs == 0) {
                        throw null;
                    }
                    sb.append(str3);
                    sb.append("\n");
                }
                if ((ywhVar2.b & 8) != 0) {
                    sb.append("\t\t\tPlate Message Type: ");
                    int iAp = a.ap(ywhVar2.f);
                    String str12 = iAp != 1 ? iAp != 2 ? iAp != 3 ? "null" : "CLEAR_MESSAGE" : "POOR_NETWORK" : "UNKNOWN_MESSAGE_TYPE";
                    if (iAp == 0) {
                        throw null;
                    }
                    sb.append(str12);
                    sb.append("\n");
                }
                sb.append("\t\t}\n");
            }
            sb.append("\t}\n");
        }
        sb.append("}");
        ((ype) ((ype) laj.a.f()).ai(3687)).t(sb);
        G(new TelemetryEvent(yxc.ASSISTANT, yxbVar2));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void v(int i, int i2, int i3) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 32, yyv.SYSTEM_UI_CONFIGURATION);
        abnp abnpVarN = yzs.a.n();
        abnpVarN.t();
        yzs yzsVar = (yzs) abnpVarN.b;
        yzsVar.b |= 1;
        yzsVar.c = i2;
        abnpVarN.t();
        yzs yzsVar2 = (yzs) abnpVarN.b;
        yzsVar2.b |= 2;
        yzsVar2.d = i;
        abnpVarN.t();
        yzs yzsVar3 = (yzs) abnpVarN.b;
        yzsVar3.b |= 4;
        yzsVar3.e = i3 - 1;
        yzs yzsVar4 = (yzs) abnpVarN.q();
        yzsVar4.getClass();
        rquVarH.k = new xxm(yzsVar4);
        F(rquVarH.l());
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void w(String str, int i, int i2, int i3) throws PackageManager.NameNotFoundException {
        abnp abnpVarN = yxd.a.n();
        abnpVarN.t();
        yxd yxdVar = (yxd) abnpVarN.b;
        str.getClass();
        yxdVar.b |= 1;
        yxdVar.c = str;
        abnpVarN.t();
        yxd yxdVar2 = (yxd) abnpVarN.b;
        yxdVar2.b |= 2;
        yxdVar2.d = i;
        abnpVarN.t();
        yxd yxdVar3 = (yxd) abnpVarN.b;
        yxdVar3.b |= 4;
        yxdVar3.e = i2 - 1;
        abnpVarN.t();
        yxd yxdVar4 = (yxd) abnpVarN.b;
        yxdVar4.b |= 8;
        yxdVar4.f = i3 - 1;
        yxd yxdVar5 = (yxd) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yxdVar5.getClass();
        yxbVar.m = yxdVar5;
        yxbVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        G(new TelemetryEvent(yxc.CARMENU_LATENCY, (yxb) abnpVarN2.q()));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void x(int i, yyv yyvVar) {
        ebf.k(this, rqv.h(yxy.GEARHEAD, i, yyvVar));
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void y(yyv yyvVar, String str) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 12, yyvVar);
        rquVarH.j = xxh.h(str);
        ebf.k(this, rquVarH);
    }

    @Override // defpackage.ohs
    @Deprecated
    public final void z(yyv yyvVar, String str, yyw yywVar) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 14, yyvVar);
        if (str != null) {
            rquVarH.e(str);
        }
        rquVarH.i(yywVar);
        ebf.k(this, rquVarH);
    }
}
