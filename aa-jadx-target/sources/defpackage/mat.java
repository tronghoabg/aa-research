package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mat {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.SecNavProvider");

    public static android.content.ComponentName a(defpackage.qsh qshVar, defpackage.rke rkeVar, java.lang.String str) {
        int i = 1;
        defpackage.ysr.bn(rkeVar.equals(defpackage.rke.c) || rkeVar.equals(defpackage.rke.b), "SecondaryDisplayNavigationAppProvider can not be used with CarDisplayType %s", rkeVar);
        java.util.List listB = defpackage.mkc.b().b(qshVar, new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_NAVIGATION"), rkeVar);
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai(4651)).M("For carDisplayType %s found navigation components: %s", rkeVar, listB);
        if (b(listB, str) == null && rkeVar.equals(defpackage.rke.b)) {
            android.content.Intent intentAddCategory = new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_NAVIGATION").addCategory("com.google.android.gms.car.category.CATEGORY_SECONDARY_REGION");
            defpackage.nze nzeVarD = defpackage.nze.d(defpackage.nzd.a);
            java.util.ArrayList arrayListP = defpackage.ysr.P(defpackage.ysr.aj(defpackage.mkc.b().c(qshVar, new defpackage.nzf(intentAddCategory, defpackage.qqe.f, nzeVarD)), new defpackage.pup(i)));
            ((defpackage.yqj) yqmVar.l().ai((char) 4655)).y("For secondary region of primary car display found navigation components: %s", arrayListP);
            android.content.ComponentName componentNameB = b(arrayListP, str);
            if (componentNameB == null) {
                componentNameB = (android.content.ComponentName) j$.util.Collection.-EL.stream(jzi.a().b(qshVar, nzeVarD)).map(new defpackage.lvg(8)).filter(new defpackage.lpa(str, 13)).findFirst().orElse((java.lang.Object) null);
            }
            if (componentNameB != null) {
                ((defpackage.yqj) yqmVar.l().ai(4652)).M("For carDisplayType %s found secondaryRegion components: %s", rkeVar, componentNameB);
                return componentNameB;
            }
        }
        return b(listB, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static android.content.ComponentName b(java.util.List list, java.lang.String str) {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) it.next();
            if (resolveInfo.serviceInfo != null) {
                android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                ((defpackage.yqj) b.l().ai((char) 4650)).y("Found projection compatible navigation app: %s", componentName);
                ygrVar.i(componentName);
            } else {
                ((defpackage.yqj) b.l().ai(4649)).y("Null serviceInfo for projection enabled provider %s", resolveInfo.serviceInfo);
            }
        }
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(ygrVar.g()).filter(new defpackage.lpa(str, 14));
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
        if (ygwVar.isEmpty()) {
            ((defpackage.yqj) b.l().ai((char) 4654)).y("No projection compatible navigation apps found in package %s", str);
            return null;
        }
        if (ygwVar.size() <= 1) {
            return (android.content.ComponentName) ygwVar.get(0);
        }
        ((defpackage.yqj) ((defpackage.yqj) b.g()).ai(4653)).M("Multiple navigation components are not supported [Package:%s, Components:%s]", str, ygwVar);
        return null;
    }
}
