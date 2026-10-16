package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msl {
    private defpackage.noz d;
    private defpackage.dlr e;
    private java.util.EnumSet f;
    public static final defpackage.msj a = new defpackage.msj();
    private static final defpackage.yqm c = defpackage.yqm.c("GH.RndCnrMskCtlr");
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 17);

    public static final defpackage.msl a() {
        return a.a();
    }

    public final void b() {
        defpackage.noz nozVar = this.d;
        if (nozVar != null) {
            nozVar.d();
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0156  */
    /* JADX WARN: Code duplicated, block: B:46:0x019a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ee A[Catch: qst -> 0x0289, qsu -> 0x0297, TryCatch #3 {qst -> 0x0289, qsu -> 0x0297, blocks: (B:58:0x01cf, B:60:0x01ee, B:61:0x0224, B:63:0x022a, B:64:0x023c), top: B:77:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:63:0x022a A[Catch: qst -> 0x0289, qsu -> 0x0297, LOOP:1: B:61:0x0224->B:63:0x022a, LOOP_END, TryCatch #3 {qst -> 0x0289, qsu -> 0x0297, blocks: (B:58:0x01cf, B:60:0x01ee, B:61:0x0224, B:63:0x022a, B:64:0x023c), top: B:77:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public final void c(defpackage.qsh qshVar) {
        defpackage.yqm yqmVar;
        float f;
        java.util.EnumSet enumSetAllOf;
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        defpackage.dlr dlrVar;
        qshVar.getClass();
        if (!defpackage.acyc.a.fF().aG()) {
            defpackage.yqm yqmVar2 = defpackage.kit.a;
            if (!((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).r()) {
                ((defpackage.yqj) c.h()).u("Not connected to car, not showing");
                b();
                return;
            }
        }
        defpackage.yqm yqmVar3 = defpackage.kiv.a;
        com.google.android.gms.car.CarInfo carInfoB = ((defpackage.kiv) defpackage.mkp.a.i(defpackage.kiv.class)).b();
        defpackage.kjg kjgVar = new defpackage.kjg(qshVar, 5);
        defpackage.zbe zbeVar = defpackage.zbe.ROUNDED_CORNER_MASK;
        defpackage.zbd zbdVar = defpackage.zbd.JA;
        com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) defpackage.kgu.c(new defpackage.kjg((defpackage.sax) defpackage.kgu.c(kjgVar, "GH.RndCnrMskCtlr", zbeVar, zbdVar, false, "getCarDisplay: failed to get CarWindowManager", new java.lang.Object[0]), 6), "GH.RndCnrMskCtlr", zbeVar, zbdVar, false, "getCarDisplay: unable to get CarDisplay", new java.lang.Object[0]);
        if (carDisplay == null) {
            ((defpackage.yqj) c.h()).u("Unable to get CarDisplay, not showing");
            b();
            return;
        }
        if (carInfoB == null || defpackage.afga.f(carInfoB, defpackage.kiv.b)) {
            ((defpackage.yqj) c.f()).u("shouldRender carInfo is EMPTY_CAR_INFO, not rendering");
        } else {
            try {
                defpackage.xkd xkdVarB = defpackage.xkd.b(carDisplay.b);
                defpackage.absi absiVarK = defpackage.acqe.a.fF().k();
                int i = defpackage.kjm.a;
                for (defpackage.absh abshVar : absiVarK.b) {
                    defpackage.abph abphVar = new defpackage.abph(abshVar.d, defpackage.absh.a);
                    if (abphVar.isEmpty() || abphVar.contains(absj.b(xkdVarB.d))) {
                        defpackage.abor aborVarN = defpackage.absc.a.n();
                        defpackage.absb absbVar = abshVar.c;
                        if (absbVar == null) {
                            absbVar = defpackage.absb.a;
                        }
                        aborVarN.t();
                        defpackage.absc abscVar = (defpackage.absc) aborVarN.b;
                        absbVar.getClass();
                        defpackage.abpj abpjVar = abscVar.b;
                        if (!abpjVar.c()) {
                            int size = abpjVar.size();
                            abscVar.b = abpjVar.d(size + size);
                        }
                        abscVar.b.add(absbVar);
                        defpackage.absc abscVar2 = (defpackage.absc) aborVarN.q();
                        defpackage.yqm yqmVar4 = defpackage.kjl.a;
                        if (defpackage.kjl.g(carInfoB, abscVar2.b)) {
                            ((defpackage.yqj) c.f()).y("shouldRender rounded corner mask disabled for car %s", carInfoB.toString());
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).u("Error checking denylist, not rendering");
            }
            com.google.android.gms.car.display.CarDisplayId carDisplayId = carDisplay.a;
            if (!com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                if (defpackage.acyc.a.fF().bc()) {
                }
                yqmVar = c;
                defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.f();
                f = defpackage.msk.CORNER_RADIUS.b;
                yqjVar.y("Using standard corner radius %f", new defpackage.dlr(f));
                enumSetAllOf = java.util.EnumSet.allOf(defpackage.msm.class);
                enumSetAllOf.getClass();
                if (this.d != null) {
                    dlrVar = this.e;
                    if (dlrVar != null) {
                        return;
                    }
                    ((defpackage.yqj) yqmVar.f()).S("Mask params changed, restarting. Radius: %s -> %s, Corners: %s -> %s", this.e, new defpackage.dlr(f), this.f, enumSetAllOf);
                    b();
                }
                if (this.d != null) {
                    return;
                }
                defpackage.yqm yqmVar5 = defpackage.nte.a;
                carWindowLayoutParamsA = defpackage.nsu.a(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b(), defpackage.nta.C, new defpackage.ltq(8));
                if (carWindowLayoutParamsA != null) {
                    ((defpackage.yqj) yqmVar.f()).y("Showing RoundedCornerMaskController with radius %s", new defpackage.dlr(f));
                    android.graphics.Rect rectA = carDisplay.a();
                    defpackage.msn msnVar = new defpackage.msn();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putFloat("extra_corner_radius", f);
                    arrayList = new java.util.ArrayList(defpackage.afga.aj(enumSetAllOf, 10));
                    it = enumSetAllOf.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((defpackage.msm) it.next()).ordinal()));
                    }
                    bundle.putIntegerArrayList("extra_rounded_corners", new java.util.ArrayList<>(arrayList));
                    bundle.putFloat("extra_inset_left", rectA.left);
                    bundle.putFloat("extra_inset_top", rectA.top);
                    bundle.putFloat("extra_inset_right", rectA.right);
                    bundle.putFloat("extra_inset_bottom", rectA.bottom);
                    msnVar.setArguments(bundle);
                    this.d = defpackage.nsu.c().a(carWindowLayoutParamsA, "RoundedCornerMaskFragment", msnVar, (defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).b(qshVar);
                    this.e = new defpackage.dlr(f);
                    this.f = enumSetAllOf;
                    return;
                }
                return;
            }
            defpackage.yqm yqmVar6 = defpackage.nte.a;
            if (((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).i(carDisplayId)) {
                ((defpackage.yqj) c.f()).u("shouldRender rounded corner mask disabled for irregular display");
            } else {
                if (defpackage.acyc.a.fF().bc() || !defpackage.mru.b(carDisplay, carInfoB)) {
                    yqmVar = c;
                    defpackage.yqj yqjVar2 = (defpackage.yqj) yqmVar.f();
                    f = defpackage.msk.CORNER_RADIUS.b;
                    yqjVar2.y("Using standard corner radius %f", new defpackage.dlr(f));
                    enumSetAllOf = java.util.EnumSet.allOf(defpackage.msm.class);
                    enumSetAllOf.getClass();
                    if (this.d != null) {
                        dlrVar = this.e;
                        if (dlrVar != null && java.lang.Float.compare(dlrVar.a, f) == 0 && defpackage.afga.f(this.f, enumSetAllOf)) {
                            return;
                        }
                        ((defpackage.yqj) yqmVar.f()).S("Mask params changed, restarting. Radius: %s -> %s, Corners: %s -> %s", this.e, new defpackage.dlr(f), this.f, enumSetAllOf);
                        b();
                    }
                    if (this.d != null) {
                        return;
                    }
                    try {
                        defpackage.yqm yqmVar7 = defpackage.nte.a;
                        carWindowLayoutParamsA = defpackage.nsu.a(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b(), defpackage.nta.C, new defpackage.ltq(8));
                        if (carWindowLayoutParamsA != null) {
                            ((defpackage.yqj) yqmVar.f()).y("Showing RoundedCornerMaskController with radius %s", new defpackage.dlr(f));
                            android.graphics.Rect rectA2 = carDisplay.a();
                            defpackage.msn msnVar2 = new defpackage.msn();
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putFloat("extra_corner_radius", f);
                            arrayList = new java.util.ArrayList(defpackage.afga.aj(enumSetAllOf, 10));
                            it = enumSetAllOf.iterator();
                            while (it.hasNext()) {
                                arrayList.add(java.lang.Integer.valueOf(((defpackage.msm) it.next()).ordinal()));
                            }
                            bundle2.putIntegerArrayList("extra_rounded_corners", new java.util.ArrayList<>(arrayList));
                            bundle2.putFloat("extra_inset_left", rectA2.left);
                            bundle2.putFloat("extra_inset_top", rectA2.top);
                            bundle2.putFloat("extra_inset_right", rectA2.right);
                            bundle2.putFloat("extra_inset_bottom", rectA2.bottom);
                            msnVar2.setArguments(bundle2);
                            this.d = defpackage.nsu.c().a(carWindowLayoutParamsA, "RoundedCornerMaskFragment", msnVar2, (defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).b(qshVar);
                            this.e = new defpackage.dlr(f);
                            this.f = enumSetAllOf;
                            return;
                        }
                        return;
                    } catch (defpackage.qst e2) {
                        ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e2)).u("Unable to start RoundedCornerMaskController, CarNotConnectedException");
                        return;
                    } catch (defpackage.qsu e3) {
                        ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e3)).u("Unable to start RoundedCornerMaskController, CarNotSupportedException");
                        return;
                    }
                }
                ((defpackage.yqj) c.f()).y("shouldRender rounded corner mask disabled because backdrop is showing for %s", carDisplay);
            }
        }
        b();
    }
}
