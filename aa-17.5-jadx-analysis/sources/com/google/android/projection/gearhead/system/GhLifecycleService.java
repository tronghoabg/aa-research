package com.google.android.projection.gearhead.system;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.system.GhLifecycleService;
import defpackage.acrz;
import defpackage.acxa;
import defpackage.kgq;
import defpackage.kgx;
import defpackage.kio;
import defpackage.kiy;
import defpackage.kja;
import defpackage.kjq;
import defpackage.ksf;
import defpackage.lah;
import defpackage.lds;
import defpackage.ldz;
import defpackage.lej;
import defpackage.lgw;
import defpackage.luk;
import defpackage.mfm;
import defpackage.mki;
import defpackage.mnb;
import defpackage.mnc;
import defpackage.mpl;
import defpackage.mpm;
import defpackage.mpy;
import defpackage.msd;
import defpackage.npc;
import defpackage.nsn;
import defpackage.nso;
import defpackage.nsr;
import defpackage.nss;
import defpackage.oig;
import defpackage.qrn;
import defpackage.qrz;
import defpackage.qsa;
import defpackage.qsw;
import defpackage.rbb;
import defpackage.rcs;
import defpackage.rdx;
import defpackage.sab;
import defpackage.sgk;
import defpackage.spu;
import defpackage.wer;
import defpackage.woy;
import defpackage.xfb;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class GhLifecycleService extends rbb {
    private static final yph g = yph.c("GH.GhLifecycleService");
    private boolean h;
    private boolean i = false;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
    @Override // defpackage.rbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.qrn r4) throws defpackage.qrz {
        /*
            r3 = this;
            defpackage.wer.c()
            yph r0 = com.google.android.projection.gearhead.system.GhLifecycleService.g
            yop r0 = r0.f()
            java.lang.String r1 = "onPostProjectionStart()"
            r2 = 10199(0x27d7, float:1.4292E-41)
            defpackage.a.bs(r0, r1, r2)
            acxa r0 = defpackage.acxa.a
            acxb r0 = r0.gu()
            boolean r0 = r0.aR()
            r1 = 1
            if (r0 != 0) goto L33
            yph r0 = defpackage.nsr.a
            mki r0 = defpackage.mki.a
            java.lang.Class<nsr> r2 = defpackage.nsr.class
            java.lang.Object r0 = r0.i(r2)
            nsr r0 = (defpackage.nsr) r0
            nso r0 = r0.b()
            boolean r0 = r0.D()
            if (r0 == 0) goto L42
        L33:
            r3.h = r1
            mki r0 = defpackage.mki.a
            java.lang.Class<mpj> r2 = defpackage.mpj.class
            java.lang.Object r0 = r0.i(r2)
            mpj r0 = (defpackage.mpj) r0
            r0.e(r4)
        L42:
            acrz r0 = defpackage.acrz.a
            acsa r0 = r0.gu()
            boolean r0 = r0.s()
            if (r0 == 0) goto L7b
            kse r0 = defpackage.ksf.a
            ksf r0 = r0.a()
            r0.f()
            lei r0 = defpackage.lej.a
            lej r0 = r0.a()
            boolean r0 = r0.g(r4)
            if (r0 == 0) goto L7b
            r3.i = r1
            oif r3 = defpackage.oig.a
            oig r3 = r3.a()
            yph r0 = defpackage.oig.c
            yop r0 = r0.f()
            ype r0 = (defpackage.ype) r0
            java.lang.String r1 = "onProjectionStart"
            r0.u(r1)
            r3.b(r4)
        L7b:
            mki r3 = defpackage.mki.a
            java.lang.Class<msd> r0 = defpackage.msd.class
            java.lang.Object r3 = r3.i(r0)
            msd r3 = (defpackage.msd) r3
            r3.e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.projection.gearhead.system.GhLifecycleService.c(qrn):void");
    }

    @Override // defpackage.rbb
    public final void d() {
        wer.c();
        ((ype) ((ype) g.f()).ai((char) 10202)).u("onProjectionEnd()");
        luk.b().b();
        if (this.h) {
            mpl.e().b();
            kjq kjqVarF = kjq.f();
            ((ype) kjq.c.f()).u("onLifecycleEnd");
            if (!kjqVarF.f) {
                kjqVarF.m();
            }
            npc.a.a().d.clear();
            this.h = false;
        }
        if (acrz.u()) {
            if (this.i) {
                oig oigVarA = oig.a();
                ((ype) oig.c.f()).u("onProjectionEnd");
                oigVarA.e();
                this.i = false;
            }
            ksf.b().e();
        }
        lej lejVarA = lej.a();
        lejVarA.d = null;
        lejVarA.e = null;
        msd.a().b();
        nsr nsrVarC = nsr.c();
        wer.c();
        if (nsrVarC.i != 2) {
            ((ype) ((ype) nsr.a.h()).ai((char) 5413)).u("DisplayLayoutManager stopped when not initialized, ignoring");
            return;
        }
        for (nss nssVar : nsrVarC.d) {
            wer.c();
            sab sabVar = nssVar.c;
            sgk sgkVar = nssVar.e;
            sgkVar.getClass();
            rdx rdxVar = sabVar.h;
            ((lah) rdxVar.b).F(new rcs(sgkVar, 4));
            nssVar.e = null;
            sgk sgkVar2 = nssVar.d;
            sgkVar2.getClass();
            ((lah) rdxVar.c).F(new rcs(sgkVar2, 7));
            nssVar.d = null;
        }
        if (nsrVarC.e) {
            ((mpy) mki.a.i(mpy.class)).d();
        }
        mnc.a().d(mnb.k);
        nsrVarC.i = 3;
    }

    @Override // defpackage.rbb
    public final void f() {
        wer.c();
        ((ype) ((ype) g.f()).ai((char) 10203)).u("onProjectionReady(). Notifying CarClientManager that projection is ready");
        kio.b().g();
    }

    @Override // defpackage.rbb
    public final void g(Bundle bundle, final qrn qrnVar) {
        wer.c();
        yph yphVar = g;
        ((ype) ((ype) yphVar.f()).ai((char) 10204)).y("onProjectionStart(config:%s)", bundle);
        yph yphVar2 = nsr.a;
        final nsr nsrVar = (nsr) mki.a.i(nsr.class);
        kiy kiyVar = new kiy() { // from class: xfd
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v15, types: [aezk, java.lang.Object] */
            @Override // defpackage.kiy
            public final void a() throws Resources.NotFoundException, qrz {
                int i;
                boolean zF;
                boolean z;
                yfq yfqVar;
                GhLifecycleService ghLifecycleService;
                boolean z2;
                GhLifecycleService ghLifecycleService2 = this.a;
                final nsr nsrVar2 = nsrVar;
                qrn qrnVar2 = qrnVar;
                int i2 = 0;
                try {
                    Context context = mki.a.c;
                    int iIntValue = ((Integer) kgq.c(new kja(ghLifecycleService2, 8), "GH.GhLifecycleService", yzz.LIFECYCLE_SERVICE, yzy.oW, false, "Car no longer connected.", new Object[0])).intValue();
                    synchronized (lfs.b) {
                        ((ype) ((ype) lfs.a.f()).ai(3888)).w("forDpi: Creating new app icon cache with DPI=%d", iIntValue);
                        Configuration configuration = new Configuration(context.getResources().getConfiguration());
                        configuration.densityDpi = iIntValue;
                        lfs.c = new lfs(new lft(context.createConfigurationContext(configuration)));
                    }
                    rjt rjtVar = (rjt) ghLifecycleService2.f.g("car_display_service");
                    xfc xfcVar = new xfc(ghLifecycleService2, 1);
                    xfc xfcVar2 = new xfc(ghLifecycleService2, i2);
                    lej lejVarA = lej.a.a();
                    lds ldsVar = ghLifecycleService2.f;
                    ldsVar.getClass();
                    acrz acrzVar = acrz.a;
                    if (acrzVar.gu().i()) {
                        try {
                            if (acrzVar.gu().c()) {
                                Boolean bool = lejVarA.e;
                                if (bool != null) {
                                    zF = bool.booleanValue();
                                } else {
                                    lej.c.l().u("Setting car control info from getHasPersistentCarControls");
                                    try {
                                        Object objG = ldsVar.g("car_control_service");
                                        lejVarA.b(objG instanceof rij ? (rij) objG : null);
                                    } catch (qsa unused) {
                                        lejVarA.b(null);
                                    } catch (Throwable unused2) {
                                    }
                                    zF = affa.f(lejVarA.e, true);
                                }
                                z = zF;
                            }
                            z = false;
                        } catch (qsa e) {
                            e = e;
                            i = 0;
                            tss.r("GH.GhLifecycleService", e, "not able to initialize DisplayLayout", new Object[i]);
                            return;
                        }
                    } else {
                        z = false;
                    }
                    wer.c();
                    nsrVar2.g = z;
                    int i3 = 2;
                    if (nsrVar2.i == 2) {
                        return;
                    }
                    nsrVar2.f = false;
                    Map map = nsrVar2.b;
                    map.clear();
                    nsrVar2.c = null;
                    List list = nsrVar2.d;
                    list.clear();
                    mki.a.f();
                    CarInfo carInfoC = ((raz) qrnVar2).a.c();
                    carInfoC.getClass();
                    yfq yfqVarA = rjtVar.a();
                    int size = yfqVarA.size();
                    int i4 = 0;
                    while (i4 < size) {
                        CarDisplay carDisplay = (CarDisplay) yfqVarA.get(i4);
                        Map map2 = map;
                        CarInfo carInfo = carInfoC;
                        CarDisplayId carDisplayId = carDisplay.a;
                        CarDisplayId carDisplayId2 = CarDisplayId.a;
                        if (carDisplayId2.equals(carDisplayId)) {
                            nsq nsqVar = nsrVar2.h;
                            if (nsqVar != null) {
                                if (((msc) nsqVar).e) {
                                    z2 = true;
                                } else {
                                    ((msc) nsqVar).a(carDisplay);
                                    z2 = ((msc) nsqVar).e;
                                }
                                nsrVar2.f = z2;
                            }
                            yfqVar = yfqVarA;
                            ghLifecycleService = ghLifecycleService2;
                            ((ype) ((ype) nsr.a.f()).ai((char) 5409)).y("Initial compat mode: %b", Boolean.valueOf(nsrVar2.f));
                        } else {
                            yfqVar = yfqVarA;
                            ghLifecycleService = ghLifecycleService2;
                        }
                        rji rjiVarA = rji.a(carDisplay.b);
                        Object objA = xfcVar.a(carDisplayId);
                        lds ldsVarB = xfcVar2.a.f.h(carDisplayId.b).b();
                        int i5 = i4;
                        int i6 = size;
                        sab sabVar = (sab) objA;
                        List list2 = list;
                        ghLifecycleService2 = ghLifecycleService;
                        xfc xfcVar3 = xfcVar2;
                        int i7 = 2;
                        nso nsoVar = new nso(ghLifecycleService2, carInfo, ldsVarB, sabVar, carDisplayId, rjiVarA, z, nsrVar2.f, qrnVar2);
                        sab sabVar2 = nsoVar.s;
                        nsoVar.y(sabVar2.d(), sabVar2.c());
                        map2.put(carDisplayId, nsoVar);
                        if (carDisplayId2.equals(carDisplayId)) {
                            nsrVar2.c = nsoVar.m();
                        }
                        nss nssVar = new nss(nsoVar, (sab) xfcVar.a(carDisplayId));
                        wer.c();
                        nssVar.e = new sgk(nssVar, qrnVar2, null);
                        sab sabVar3 = nssVar.c;
                        sgk sgkVar = nssVar.e;
                        rdx rdxVar = sabVar3.h;
                        ?? r5 = rdxVar.f;
                        ((rox) r5.a()).g(new rdu(rdxVar, sgkVar, i7));
                        nssVar.d = new sgk(nssVar, qrnVar2, null);
                        ((rox) r5.a()).g(new rdu(rdxVar, nssVar.d, 0));
                        list2.add(nssVar);
                        i4 = i5 + 1;
                        carInfoC = carInfo;
                        map = map2;
                        i3 = 2;
                        list = list2;
                        yfqVarA = yfqVar;
                        xfcVar2 = xfcVar3;
                        size = i6;
                    }
                    CarInfo carInfo2 = carInfoC;
                    nsrVar2.i = i3;
                    ((mpy) mki.a.i(mpy.class)).a();
                    nsrVar2.e = true;
                    int i8 = mnc.a;
                    ((mnc) mki.a.i(mnc.class)).b(mnb.k, new mnd() { // from class: nsp
                        @Override // defpackage.mnd
                        public final void h(PrintWriter printWriter) {
                            for (nso nsoVar2 : nsrVar2.b.values()) {
                                printWriter.println("------- " + String.valueOf(nsoVar2.o) + " -------");
                                printWriter.println("Type: ".concat(String.valueOf(String.valueOf(nsoVar2.q))));
                                printWriter.println("LayoutInfo: ".concat(String.valueOf(String.valueOf(nsoVar2.m))));
                                printWriter.println("carDisplay: ".concat(String.valueOf(String.valueOf(nsoVar2.t))));
                                printWriter.println("regionInfoMap: ".concat(nsoVar2.g.toString()));
                                printWriter.println("carActivitySystemLayoutTypesByRegion: ".concat(nsoVar2.h.toString()));
                                printWriter.println("regionToGroupMap: ".concat(nsoVar2.i.toString()));
                                printWriter.println("regionGroups: ".concat(nsoVar2.j.toString()));
                                printWriter.println("regionsCastingInsetsOnType: ".concat(nsoVar2.k.toString()));
                                printWriter.println("chromeWindows: ".concat(nsoVar2.l.toString()));
                            }
                        }
                    });
                    if (acxa.a.gu().ap()) {
                        yph yphVar3 = kiq.a;
                        ((kiq) mki.a.i(kiq.class)).d(carInfo2, nsr.class.getName());
                    }
                    if (nsrVar2.c != null) {
                        lej.a.a();
                        nsrVar2.b().D();
                    }
                } catch (qsa e2) {
                    e = e2;
                    i = 0;
                }
            }
        };
        yzz yzzVar = yzz.LIFECYCLE_SERVICE;
        yzy yzyVar = yzy.oR;
        int i = 0;
        int i2 = 1;
        kgq.c(new kja(kiyVar, i2), "GH.GhLifecycleService", yzzVar, yzyVar, false, "not able to initialize DisplayLayout", new Object[0]);
        kgq.c(new kja(new kiy() { // from class: xfa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.kiy
            public final void a() throws qrz {
                try {
                    lds ldsVar = this.a.f;
                    ldsVar.getClass();
                    rjt rjtVar = (rjt) ldsVar.g("car_display_service");
                    yph yphVar3 = mpr.a;
                    mpr mprVar = (mpr) mki.a.i(mpr.class);
                    wer.c();
                    yfq yfqVarA = rjtVar.a();
                    yfu yfuVar = new yfu(4);
                    int size = yfqVarA.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        CarDisplay carDisplay = (CarDisplay) yfqVarA.get(i3);
                        if (rji.c.equals(rji.a(carDisplay.b))) {
                            CarDisplayId carDisplayId = carDisplay.a;
                            int i4 = carDisplay.f;
                            yfuVar.e(carDisplayId, i4 >= rjj.values().length ? rjj.a : rjj.values()[i4]);
                        }
                    }
                    mprVar.f = yfuVar.d(true);
                    mprVar.g = true;
                } catch (qsa e) {
                    tss.r("GH.GhLifecycleService", e, "not able to initialize AuxiliaryDisplayConfiguration", new Object[0]);
                }
            }
        }, i2), "GH.GhLifecycleService", yzzVar, yzyVar, false, "not able to initialize AuxiliaryDisplayConfiguration", new Object[0]);
        ldz ldzVarA = ldz.a.a();
        ldzVarA.d = ldzVarA.d(qrnVar);
        if (acxa.a.gu().Y()) {
            ((lgw) mki.a.i(lgw.class)).f();
        }
        nso nsoVarB = nsrVar.b();
        bundle.putBoolean("use_car_activity_animations", true);
        lds ldsVar = (lds) kgq.c(new xfb(this, nsoVarB.o, i), "GH.GhLifecycleService", yzzVar, yzyVar, false, "not able to initialize DisplayLayout", new Object[0]);
        ldsVar.getClass();
        bundle.putBoolean("use_sticky_window_focus", ldsVar.e());
        nsn nsnVar = nsn.b;
        if (nsoVarB.G(nsnVar)) {
            qsw qswVarN = nsoVarB.n(nsnVar);
            qswVarN.getClass();
            bundle.putInt("assistant_activity_z", qswVarN.a().i);
        }
        nsn nsnVar2 = nsn.a;
        bundle.putParcelable("content_bounds", nsoVarB.h(nsnVar2));
        bundle.putParcelable("content_insets", nsoVarB.i(nsnVar2));
        wer.c();
        bundle.putByteArray("activity_layout_config", spu.k(mpm.b(qrnVar, nsrVar.e())));
        bundle.putInt("pillar_width", 0);
        ((ype) ((ype) yphVar.f()).ai((char) 10205)).y("onProjectionStart updated config:%s: ", bundle);
        byte[] byteArray = bundle.getByteArray("activity_layout_config");
        ((ype) yphVar.l().ai(10206)).M("onProjectionStart %s:%s", "activity_layout_config", byteArray != null ? (CarActivityLayoutConfig) spu.h(byteArray, CarActivityLayoutConfig.CREATOR) : null);
        bundle.putBundle("dynamic_configuration", mpm.d(qrnVar));
    }

    @Override // defpackage.rbb
    public final void h() {
        wer.c();
        ((ype) ((ype) g.f()).ai((char) 10207)).u("onProjectionTearDown()");
        kio.b().k();
    }

    @Override // defpackage.rbb
    public final boolean i() {
        if (acxa.aP()) {
            return this.d == null && !this.e;
        }
        return true;
    }

    @Override // defpackage.rbb
    public final void j(qrn qrnVar, Bundle bundle, kgx kgxVar) {
        wer.c();
        yph yphVar = g;
        ((ype) ((ype) yphVar.f()).ai((char) 10200)).y("onPreflightStart(params:%s). Running preflight checks", bundle);
        bundle.setClassLoader(getClassLoader());
        woy.aa(bundle.containsKey("connection_type"), "Missing connection-type");
        woy.aa(bundle.containsKey("legacy_frx_ran"), "Missing legacyFrxRan");
        woy.aa(bundle.containsKey("car_info"), "Missing CarInfoInternal");
        boolean z = bundle.getBoolean("legacy_frx_ran");
        int i = bundle.getInt("connection_type");
        ((ype) yphVar.l().ai(10201)).O("Preflight start, legacyFrxRan: %b, connectionType: %d", z, i);
        ((mfm) mki.a.i(mfm.class)).c(qrnVar, kgxVar, z, i, (CarInfoInternal) bundle.getParcelable("car_info"));
    }

    public final sab k(CarDisplayId carDisplayId) throws qrz, qsa {
        ((ype) g.l().ai((char) 10198)).y("Get CarWindowManager for %s", carDisplayId);
        lds ldsVar = this.f;
        ldsVar.getClass();
        return ((qrn) ldsVar.a).a().h(new CarDisplayId(carDisplayId.b));
    }
}
