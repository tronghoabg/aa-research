package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mam {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SecNavProvider");

    public static ComponentName a(qrn qrnVar, rji rjiVar, String str) {
        int i = 1;
        woy.ad(rjiVar.equals(rji.c) || rjiVar.equals(rji.b), "SecondaryDisplayNavigationAppProvider can not be used with CarDisplayType %s", rjiVar);
        List listB = mjv.b().b(qrnVar, new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_NAVIGATION"), rjiVar);
        yph yphVar = b;
        ((ype) yphVar.l().ai(4648)).M("For carDisplayType %s found navigation components: %s", rjiVar, listB);
        if (b(listB, str) == null && rjiVar.equals(rji.b)) {
            Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_NAVIGATION").addCategory("com.google.android.gms.car.category.CATEGORY_SECONDARY_REGION");
            nyj nyjVarD = nyj.d(nyi.a);
            ArrayList arrayListP = yrm.P(yrm.aj(mjv.b().c(qrnVar, new nyk(intentAddCategory, qpi.f, nyjVarD)), new ptu(i)));
            ((ype) yphVar.l().ai((char) 4652)).y("For secondary region of primary car display found navigation components: %s", arrayListP);
            ComponentName componentNameB = b(arrayListP, str);
            if (componentNameB == null) {
                componentNameB = (ComponentName) Collection.EL.stream(jzd.a().b(qrnVar, nyjVarD)).map(new lyd(7)).filter(new lou(str, 12)).findFirst().orElse(null);
            }
            if (componentNameB != null) {
                ((ype) yphVar.l().ai(4649)).M("For carDisplayType %s found secondaryRegion components: %s", rjiVar, componentNameB);
                return componentNameB;
            }
        }
        return b(listB, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ComponentName b(List list, String str) {
        yfl yflVar = new yfl(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (resolveInfo.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                ((ype) b.l().ai((char) 4647)).y("Found projection compatible navigation app: %s", componentName);
                yflVar.i(componentName);
            } else {
                ((ype) b.l().ai(4646)).y("Null serviceInfo for projection enabled provider %s", resolveInfo.serviceInfo);
            }
        }
        Stream streamFilter = Collection.EL.stream(yflVar.g()).filter(new lou(str, 13));
        int i = yfq.d;
        yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
        if (yfqVar.isEmpty()) {
            ((ype) b.l().ai((char) 4651)).y("No projection compatible navigation apps found in package %s", str);
            return null;
        }
        if (yfqVar.size() <= 1) {
            return (ComponentName) yfqVar.get(0);
        }
        ((ype) ((ype) b.g()).ai(4650)).M("Multiple navigation components are not supported [Package:%s, Components:%s]", str, yfqVar);
        return null;
    }
}
