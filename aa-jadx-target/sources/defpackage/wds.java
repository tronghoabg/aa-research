package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wds {
    private static final java.lang.Object f = new java.lang.Object();
    private static volatile java.util.Map g;
    public final java.lang.String a;
    public final defpackage.zir b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public wds(android.content.Context context, defpackage.wdt wdtVar) {
        this.a = wdtVar.c ? defpackage.way.d(context, wdtVar.b) : wdtVar.b;
        defpackage.zir zirVarB = defpackage.zir.b(wdtVar.d);
        this.b = zirVarB == null ? defpackage.zir.UNKNOWN : zirVarB;
        this.c = wdtVar.g;
        this.d = wdtVar.e;
        this.e = wdtVar.f;
    }

    public static java.util.Map a(android.content.Context context) {
        java.util.Map mapD;
        java.util.Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapD = g;
            if (mapD == null) {
                defpackage.yha yhaVar = new defpackage.yha(4);
                try {
                    java.lang.String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (java.lang.String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    java.io.InputStream inputStreamOpen = context.getAssets().open(defpackage.a.bA(str, "phenotype/"));
                                    try {
                                        defpackage.abox aboxVarC = defpackage.abox.C(defpackage.wdt.a, defpackage.abny.L(inputStreamOpen), defpackage.abol.a);
                                        defpackage.abox.U(aboxVarC);
                                        defpackage.wds wdsVar = new defpackage.wds(context, (defpackage.wdt) aboxVarC);
                                        yhaVar.f(wdsVar.a, wdsVar);
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                    } catch (java.lang.Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (java.lang.Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (defpackage.abpp e) {
                                    android.util.Log.e("PackageInfo", defpackage.a.bA(str, "Unable to read Phenotype PackageMetadata for "), e);
                                }
                            }
                        }
                    }
                } catch (java.io.IOException e2) {
                    android.util.Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                }
                mapD = yhaVar.d(true);
                g = mapD;
            }
        }
        return mapD;
    }
}
