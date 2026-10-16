package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class epv {
    public static final defpackage.epw a(defpackage.epx epxVar) {
        epxVar.getClass();
        int iOrdinal = epxVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return defpackage.epw.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return defpackage.epw.ON_STOP;
        }
        if (iOrdinal == 4) {
            return defpackage.epw.ON_PAUSE;
        }
        throw new defpackage.afas();
    }

    public static final defpackage.epw b(defpackage.epx epxVar) {
        epxVar.getClass();
        int iOrdinal = epxVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return defpackage.epw.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return defpackage.epw.ON_START;
        }
        if (iOrdinal == 3) {
            return defpackage.epw.ON_RESUME;
        }
        if (iOrdinal == 4) {
            return null;
        }
        throw new defpackage.afas();
    }

    public static final defpackage.esa c(defpackage.afar afarVar) {
        return (defpackage.esa) afarVar.a();
    }

    public static final defpackage.afar d(defpackage.afie afieVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.afer aferVar3) {
        afieVar.getClass();
        return new defpackage.eru(afieVar, aferVar, aferVar3, aferVar2);
    }

    public static final void e(defpackage.eqg eqgVar, defpackage.ese eseVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.eqg eqgVar2;
        defpackage.ese eseVar2;
        defpackage.affc affcVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(912823238);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(eqgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(eseVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean zE = bveVarC.E(eseVar) | ((i2 & 896) == 256) | bveVarC.E(eqgVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                eqgVar2 = eqgVar;
                eseVar2 = eseVar;
                affcVar2 = affcVar;
                defpackage.acn acnVar = new defpackage.acn(eqgVar2, eseVar2, affcVar2, 16, (int[]) null);
                bwcVar.ad(acnVar);
                objS = acnVar;
            } else {
                eqgVar2 = eqgVar;
                eseVar2 = eseVar;
                affcVar2 = affcVar;
            }
            defpackage.bvx.b(eqgVar2, eseVar2, (defpackage.affc) objS, bveVarC);
        } else {
            eqgVar2 = eqgVar;
            eseVar2 = eseVar;
            affcVar2 = affcVar;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf(eqgVar2, eseVar2, affcVar2, i, 3, (char[]) null);
        }
    }

    public static final void f(defpackage.epw epwVar, defpackage.eqg eqgVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-709389590);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != bveVarC.A(epwVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                eqgVar = (defpackage.eqg) bveVarC.f(defpackage.esf.a);
            } else {
                bveVarC.s();
            }
            bveVarC.l();
            if (epwVar == defpackage.epw.ON_DESTROY) {
                throw new java.lang.IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            defpackage.bys bysVarC = defpackage.bzd.c(aferVar, bveVarC);
            boolean zC = bveVarC.C(bysVarC) | ((i2 & 14) == 4) | bveVarC.E(eqgVar);
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.cij(eqgVar, epwVar, bysVarC, i4);
                bwcVar.ad(objS);
            }
            defpackage.bvx.c(eqgVar, (defpackage.affc) objS, bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.eqg eqgVar2 = eqgVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf(epwVar, eqgVar2, aferVar, i, 5, (char[]) null);
        }
    }

    public static final void g(java.lang.Object obj, defpackage.eqg eqgVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1220373486);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                eqgVar = (defpackage.eqg) bveVarC.f(defpackage.esf.a);
            } else {
                bveVarC.s();
            }
            bveVarC.l();
            boolean zC = bveVarC.C(obj) | bveVarC.C(eqgVar);
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.ese(eqgVar.getLifecycle());
                bwcVar.ad(objS);
            }
            e(eqgVar, (defpackage.ese) objS, affcVar, bveVarC, i2 & 896);
        } else {
            bveVarC.s();
        }
        defpackage.eqg eqgVar2 = eqgVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf(obj, eqgVar2, affcVar, i, 4);
        }
    }

    public static final defpackage.esa h(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429873);
            defpackage.esa esaVar = tag instanceof defpackage.esa ? (defpackage.esa) tag : null;
            if (esaVar != null) {
                return esaVar;
            }
            java.lang.Object objB = defpackage.edd.b(view);
            view = objB instanceof android.view.View ? (android.view.View) objB : null;
        }
        return null;
    }

    public static final void i(android.view.View view, defpackage.esa esaVar) {
        view.getClass();
        view.setTag(2131429873, esaVar);
    }

    public static /* synthetic */ java.lang.String j(int i) {
        if (i == 1) {
            return "AUDIO_FORMAT_UNSPECIFIED";
        }
        if (i != 2) {
            return i != 3 ? "AUDIO_FORMAT_48000_MONO" : "AUDIO_FORMAT_16000_MONO";
        }
        return "AUDIO_FORMAT_48000_STEREO";
    }

    public static final boolean k(android.content.Context context) {
        context.getClass();
        if (!defpackage.acve.a.fF().b()) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return context.getPackageManager().hasSystemFeature("android.software.activities_on_secondary_displays");
        }
        defpackage.ysr.bo(context.getPackageManager().hasSystemFeature("android.software.activities_on_secondary_displays"), "FEATURE_ACTIVITIES_ON_SECONDARY_DISPLAYS is missing on Android U+ device", new java.lang.Object[0]);
        return true;
    }

    public static final boolean l(com.google.android.gms.car.CarUiInfo carUiInfo) {
        return android.os.Build.VERSION.SDK_INT >= 36 && acxq.c() && carUiInfo != null && carUiInfo.b;
    }
}
