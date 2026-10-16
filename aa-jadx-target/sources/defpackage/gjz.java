package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class gjz {
    private static java.lang.ref.Cleaner a;

    public static final android.net.Uri a(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        androidx.car.app.model.CarLocation carLocationA = gle.a(uri);
        if (carLocationA == null) {
            java.lang.String strB = gle.b(uri);
            if (strB == null) {
                return null;
            }
            gnb.b("CarApp.H", "Intent data set using query data");
            return android.net.Uri.parse("geo:0,0?q=".concat(afzh.J(strB, "\\s", "+")));
        }
        gnb.b("CarApp.H", "Intent data set using location [Latitude and Longitude] data");
        return android.net.Uri.parse("geo:" + carLocationA.getLatitude() + "," + carLocationA.getLongitude());
    }

    public static final void b(gah gahVar, defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-324087591);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(gahVar) : bveVarC.E(gahVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 147) != 146, i4 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarC = defpackage.awj.c(cgcVar, 1.0f);
            defpackage.cfu cfuVar = defpackage.cfs.a;
            defpackage.cty ctyVarB = defpackage.atp.b(cfuVar, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarC);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar2 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarB, affgVar2);
            defpackage.affg affgVar3 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            defpackage.affg affgVar4 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar4);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.affg affgVar5 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar5);
            defpackage.ca.I(gahVar, null, defpackage.ca.F(500, 0, null, 6), null, gpt.a, bveVarC, (i4 & 14) | 24968, 10);
            defpackage.atp.c(defpackage.awj.c(cgcVar, 1.0f).a(new defpackage.ajc(defpackage.ckd.h(defpackage.gvt.e(bveVarC).I(), 0.75f), defpackage.cky.a)), bveVarC, 0);
            defpackage.cgf cgfVarX = defpackage.asq.x(defpackage.awj.c(cgcVar, 1.0f).a(cgfVar), defpackage.asq.v(bveVarC));
            defpackage.cty ctyVarB2 = defpackage.atp.b(cfuVar, false);
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarX);
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB2, affgVar2);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar3);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar4);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar5);
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i4 >> 6) & 14));
            bwcVar.Y(true);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf((java.lang.Object) gahVar, (java.lang.Object) cgfVar, (java.lang.Object) affgVar, i, 17);
        }
    }

    public static final hkf c(fwn fwnVar) {
        return new hkf(defpackage.cjv.j(fwnVar.a), defpackage.cjv.j(fwnVar.b));
    }

    public static final fwn d(fwn fwnVar, defpackage.bve bveVar) {
        long j = defpackage.cjv.j(fwnVar.b);
        defpackage.ags agsVarF = defpackage.ca.F(500, 0, null, 6);
        return new fwn(defpackage.cjv.i(((defpackage.ckd) defpackage.adj.a(defpackage.cjv.j(fwnVar.a), agsVarF, bveVar, 48, 12).a()).a), defpackage.cjv.i(((defpackage.ckd) defpackage.adj.a(j, agsVarF, bveVar, 48, 12).a()).a));
    }

    public static final hkf e(hkf hkfVar, defpackage.bve bveVar) {
        defpackage.bwc bwcVar;
        bveVar.v(-156954969);
        hkf hkfVar2 = null;
        if (hkfVar == null) {
            bwcVar = (defpackage.bwc) bveVar;
        } else {
            defpackage.ags agsVarF = defpackage.ca.F(500, 0, null, 6);
            hkfVar2 = new hkf(((defpackage.ckd) defpackage.adj.a(hkfVar.e, agsVarF, bveVar, 48, 12).a()).a, ((defpackage.ckd) defpackage.adj.a(hkfVar.f, agsVarF, bveVar, 48, 12).a()).a);
            bwcVar = (defpackage.bwc) bveVar;
        }
        bwcVar.Y(false);
        return hkfVar2;
    }

    public static boolean f(java.io.File file) {
        boolean zF = true;
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            for (java.io.File file2 : file.listFiles()) {
                zF &= f(file2);
            }
        }
        return file.delete() & zF;
    }

    public static void g(defpackage.jfe jfeVar) {
        jfeVar.aj();
        jfeVar.al();
    }

    public static synchronized java.lang.ref.Cleaner h() {
        java.lang.ref.Cleaner cleaner = a;
        if (cleaner != null) {
            return cleaner;
        }
        java.lang.ref.Cleaner cleanerM = ag$.ExternalSyntheticApiModelOutline0.m();
        a = cleanerM;
        return cleanerM;
    }

    public static defpackage.itr i(android.media.AudioAttributes audioAttributes, android.media.AudioFormat audioFormat, int i) {
        try {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Constructor constructor = android.media.AudioRecord.class.getConstructor(android.media.AudioAttributes.class, android.media.AudioFormat.class, cls, cls);
                constructor.setAccessible(true);
                return new defpackage.itr((android.media.AudioRecord) constructor.newInstance(audioAttributes, audioFormat, java.lang.Integer.valueOf(i), 0));
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                e = e;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
                return null;
            }
        } catch (java.lang.IllegalAccessException e2) {
            e = e2;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
            return null;
        } catch (java.lang.InstantiationException e3) {
            e = e3;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            e = e4;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.itr.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
            return null;
        }
    }
}
