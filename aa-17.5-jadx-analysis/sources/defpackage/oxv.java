package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class oxv extends oxu {
    private final rjj c;

    public oxv(eqa eqaVar, rjj rjjVar) {
        super(eqaVar);
        this.c = rjjVar;
    }

    @Override // defpackage.oxu
    public final Intent g() {
        return new Intent().setComponent(mpr.a().b(this.c).a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oxu
    public final Intent h() {
        ComponentName componentNameA;
        Intent intent = new Intent();
        mpr.a();
        qrn qrnVarE = kio.b().e();
        rjj rjjVar = this.c;
        int iOrdinal = rjjVar.ordinal();
        int i = 1;
        if (iOrdinal == 1) {
            componentNameA = map.a(qrnVarE, true);
            if (componentNameA == null) {
                ((ype) mpr.a.l().ai((char) 5172)).u("No default navigation app. Launching placeholder auxiliary navigation activity.");
                componentNameA = mpr.b;
            } else {
                ComponentName componentNameA2 = mam.a(qrnVarE, rji.c, componentNameA.getPackageName());
                if (componentNameA2 != null) {
                    ((ype) mpr.a.l().ai((char) 5171)).M("Auxiliary navigation service found for package %s. Launching auxiliary navigation activity %s.", componentNameA.getPackageName(), componentNameA2.flattenToShortString());
                    componentNameA = componentNameA2;
                } else if (!Collection.EL.stream(jzd.a().b(qrnVarE, nyj.a())).map(new miw(12)).anyMatch(new mqu(componentNameA, i))) {
                    if (map.c(componentNameA.getPackageName())) {
                        ((ype) mpr.a.l().ai((char) 5170)).y("No auxiliary navigation service found for package %s. Launching hard-coded GMM auxiliary navigation activity.", componentNameA.getPackageName());
                        componentNameA = new ComponentName(componentNameA.getPackageName(), "com.google.android.apps.gmm.car.LimitedGmmCarProjectionService");
                    } else {
                        ((ype) mpr.a.l().ai((char) 5169)).y("No auxiliary navigation service found for package %s. Launching gearhead auxiliary turn card activity on auxiliary navigation display.", componentNameA.getPackageName());
                        componentNameA = mpr.e;
                    }
                }
            }
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("No root component found for content type: ".concat(String.valueOf(String.valueOf(rjjVar))));
            }
            ComponentName componentNameA3 = map.a(qrnVarE, true);
            if (componentNameA3 == null) {
                ((ype) mpr.a.l().ai((char) 5175)).u("No default navigation app. Launching placeholder auxiliary turn card activity.");
                componentNameA = mpr.c;
            } else {
                rji rjiVar = rji.c;
                String packageName = componentNameA3.getPackageName();
                yph yphVar = olf.a;
                List<ResolveInfo> listB = mjv.b().b(qrnVarE, new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_TURN_CARD"), rjiVar);
                yph yphVar2 = olf.a;
                ((ype) yphVar2.l().ai(5998)).M("For carDisplayType %s found turn card components: %s", rjiVar, listB);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : listB) {
                    if (resolveInfo.serviceInfo != null) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        ((ype) yphVar2.l().ai((char) 5997)).y("Found projection compatible turn card app: %s", componentName);
                        arrayList.add(componentName);
                    } else {
                        ((ype) yphVar2.l().ai(5996)).y("Null serviceInfo for projection enabled provider %s", resolveInfo.serviceInfo);
                    }
                }
                yfq yfqVar = (yfq) Collection.EL.stream(yfq.o(arrayList)).filter(new mqu(packageName, 18)).collect(ycm.a);
                ComponentName componentName2 = null;
                if (yfqVar.isEmpty()) {
                    ((ype) yphVar2.l().ai((char) 6000)).u("No projection compatible turn card apps found");
                } else if (yfqVar.size() > 1) {
                    ((ype) ((ype) yphVar2.g()).ai(5999)).R("Multiple turn card components are not supported [Package:%s, CarDisplayType:%s, Components:%s]", packageName, rjiVar, yfqVar);
                } else {
                    componentName2 = (ComponentName) yfqVar.get(0);
                }
                if (componentName2 != null) {
                    ((ype) mpr.a.l().ai((char) 5174)).M("Auxiliary turn card service found for package %s. Launching auxiliary turn card activity %s.", componentNameA3.getPackageName(), componentName2.flattenToShortString());
                    componentNameA = componentName2;
                } else {
                    ((ype) mpr.a.l().ai((char) 5173)).y("No auxiliary turn card service found for package %s. Launching gearhead auxiliary turn card activity on auxiliary turn card display.", componentNameA3.getPackageName());
                    componentNameA = mpr.d;
                }
            }
        }
        return intent.setComponent(componentNameA);
    }

    @Override // defpackage.oxu
    protected final String i() {
        return String.format("AUXILIARY display with content type %s", this.c.name());
    }

    @Override // defpackage.oxu
    protected final tgs k() {
        return msd.a().g(this.c);
    }
}
