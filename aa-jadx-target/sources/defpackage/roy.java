package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class roy {
    public final java.lang.Object a;

    public roy(java.lang.Object obj) {
        this.a = obj;
    }

    public static defpackage.zhs c(defpackage.swx swxVar) {
        defpackage.zhs zhsVarBQ = defpackage.sqs.bQ(swxVar);
        defpackage.whh whhVar = new defpackage.whh(1);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        int i = defpackage.zfz.d;
        defpackage.zfx zfxVar = new defpackage.zfx(zhsVarBQ, defpackage.sls.class, whhVar);
        zhsVarBQ.c(zfxVar, defpackage.ysr.ch(zgtVar, zfxVar));
        return zfxVar;
    }

    public final boolean a() {
        return ((com.google.android.gms.carsetup.CarInfoInternal) this.a).o;
    }

    public final defpackage.zhs b(java.lang.String str) {
        str.getClass();
        return c(((defpackage.svo) this.a).a(str));
    }

    public final defpackage.zhs d(wdw wdwVar) {
        java.lang.String str;
        java.lang.String simpleName = defpackage.svs.class.getSimpleName();
        defpackage.slw slwVar = (defpackage.slw) this.a;
        sno snoVarS = slwVar.s(wdwVar, simpleName);
        java.lang.String strA = defpackage.sqr.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + java.lang.System.identityHashCode(defpackage.svs.class);
        }
        qpm qpmVar = new qpm(str, snoVarS, 10);
        qqv qqvVar = new qqv(11);
        snu snuVar = new snu();
        snuVar.c = snoVarS;
        snuVar.a = qpmVar;
        snuVar.b = qqvVar;
        snuVar.d = new com.google.android.gms.common.Feature[]{defpackage.svg.d};
        snuVar.e = false;
        return c(slwVar.x(snuVar.a()));
    }

    public final java.lang.String e(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        defpackage.aba abaVar;
        if (uri != null) {
            abaVar = (defpackage.aba) ((defpackage.aba) this.a).get(uri.toString());
        } else {
            abaVar = null;
        }
        if (abaVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(java.lang.String.valueOf(str2));
        }
        return (java.lang.String) abaVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rcz] */
    public final defpackage.erh f() throws defpackage.qst {
        com.google.android.gms.car.CarInfo carInfoC = this.a.c();
        carInfoC.getClass();
        return new defpackage.erh(carInfoC);
    }
}
