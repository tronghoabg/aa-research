package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class wcw {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final zhp b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public wcw(Context context, wcx wcxVar) {
        this.a = wcxVar.c ? wac.d(context, wcxVar.b) : wcxVar.b;
        zhp zhpVarB = zhp.b(wcxVar.d);
        this.b = zhpVarB == null ? zhp.UNKNOWN : zhpVarB;
        this.c = wcxVar.g;
        this.d = wcxVar.e;
        this.e = wcxVar.f;
    }

    public static Map a(Context context) {
        Map mapD;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapD = g;
            if (mapD == null) {
                yfu yfuVar = new yfu(4);
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open(a.bz(str, "phenotype/"));
                                    try {
                                        abnv abnvVarC = abnv.C(wcx.a, abmw.N(inputStreamOpen), abnj.a);
                                        abnv.U(abnvVarC);
                                        wcw wcwVar = new wcw(context, (wcx) abnvVarC);
                                        yfuVar.e(wcwVar.a, wcwVar);
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (abon e) {
                                    Log.e("PackageInfo", a.bz(str, "Unable to read Phenotype PackageMetadata for "), e);
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                }
                mapD = yfuVar.d(true);
                g = mapD;
            }
        }
        return mapD;
    }
}
