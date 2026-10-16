package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class oys extends defpackage.oyr {
    private final defpackage.rkf c;

    public oys(defpackage.eqg eqgVar, defpackage.rkf rkfVar) {
        super(eqgVar);
        this.c = rkfVar;
    }

    @Override // defpackage.oyr
    public final android.content.Intent g() {
        return new android.content.Intent().setComponent(defpackage.mpy.a().b(this.c).a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oyr
    public final android.content.Intent h() {
        android.content.ComponentName componentNameA;
        android.content.Intent intent = new android.content.Intent();
        defpackage.mpy.a();
        defpackage.qsh qshVarE = defpackage.kit.b().e();
        defpackage.rkf rkfVar = this.c;
        int iOrdinal = rkfVar.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            componentNameA = defpackage.maw.a(qshVarE, true);
            if (componentNameA == null) {
                ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5174)).u("No default navigation app. Launching placeholder auxiliary navigation activity.");
                componentNameA = defpackage.mpy.b;
            } else {
                android.content.ComponentName componentNameA2 = defpackage.mat.a(qshVarE, defpackage.rke.c, componentNameA.getPackageName());
                if (componentNameA2 != null) {
                    ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5173)).M("Auxiliary navigation service found for package %s. Launching auxiliary navigation activity %s.", componentNameA.getPackageName(), componentNameA2.flattenToShortString());
                    componentNameA = componentNameA2;
                } else if (!j$.util.Collection.-EL.stream(jzi.a().b(qshVarE, defpackage.nze.a())).map(new mjb(13)).anyMatch(new defpackage.mpw(componentNameA, i))) {
                    if (defpackage.maw.c(componentNameA.getPackageName())) {
                        ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5172)).y("No auxiliary navigation service found for package %s. Launching hard-coded GMM auxiliary navigation activity.", componentNameA.getPackageName());
                        componentNameA = new android.content.ComponentName(componentNameA.getPackageName(), "com.google.android.apps.gmm.car.LimitedGmmCarProjectionService");
                    } else {
                        ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5171)).y("No auxiliary navigation service found for package %s. Launching gearhead auxiliary turn card activity on auxiliary navigation display.", componentNameA.getPackageName());
                        componentNameA = defpackage.mpy.e;
                    }
                }
            }
        } else {
            if (iOrdinal != 2) {
                throw new java.lang.IllegalArgumentException("No root component found for content type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rkfVar))));
            }
            android.content.ComponentName componentNameA3 = defpackage.maw.a(qshVarE, true);
            if (componentNameA3 == null) {
                ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5177)).u("No default navigation app. Launching placeholder auxiliary turn card activity.");
                componentNameA = defpackage.mpy.c;
            } else {
                defpackage.rke rkeVar = defpackage.rke.c;
                java.lang.String packageName = componentNameA3.getPackageName();
                defpackage.yqm yqmVar = defpackage.olx.a;
                java.util.List<android.content.pm.ResolveInfo> listB = defpackage.mkc.b().b(qshVarE, new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_TURN_CARD"), rkeVar);
                defpackage.yqm yqmVar2 = defpackage.olx.a;
                ((defpackage.yqj) yqmVar2.l().ai(6024)).M("For carDisplayType %s found turn card components: %s", rkeVar, listB);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.content.pm.ResolveInfo resolveInfo : listB) {
                    if (resolveInfo.serviceInfo != null) {
                        android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                        ((defpackage.yqj) yqmVar2.l().ai((char) 6023)).y("Found projection compatible turn card app: %s", componentName);
                        arrayList.add(componentName);
                    } else {
                        ((defpackage.yqj) yqmVar2.l().ai(6022)).y("Null serviceInfo for projection enabled provider %s", resolveInfo.serviceInfo);
                    }
                }
                defpackage.ygw ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(defpackage.ygw.o(arrayList)).filter(new defpackage.mpw(packageName, 19)).collect(defpackage.yds.a);
                android.content.ComponentName componentName2 = null;
                if (ygwVar.isEmpty()) {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 6026)).u("No projection compatible turn card apps found");
                } else if (ygwVar.size() > 1) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.g()).ai(6025)).R("Multiple turn card components are not supported [Package:%s, CarDisplayType:%s, Components:%s]", packageName, rkeVar, ygwVar);
                } else {
                    componentName2 = (android.content.ComponentName) ygwVar.get(0);
                }
                if (componentName2 != null) {
                    ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5176)).M("Auxiliary turn card service found for package %s. Launching auxiliary turn card activity %s.", componentNameA3.getPackageName(), componentName2.flattenToShortString());
                    componentNameA = componentName2;
                } else {
                    ((defpackage.yqj) defpackage.mpy.a.l().ai((char) 5175)).y("No auxiliary turn card service found for package %s. Launching gearhead auxiliary turn card activity on auxiliary turn card display.", componentNameA3.getPackageName());
                    componentNameA = defpackage.mpy.d;
                }
            }
        }
        return intent.setComponent(componentNameA);
    }

    @Override // defpackage.oyr
    protected final java.lang.String i() {
        return java.lang.String.format("AUXILIARY display with content type %s", this.c.name());
    }

    @Override // defpackage.oyr
    protected final defpackage.tho k() {
        return defpackage.msh.a().g(this.c);
    }
}
