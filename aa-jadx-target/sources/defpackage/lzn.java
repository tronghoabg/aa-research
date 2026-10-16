package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lzn extends defpackage.nzc {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.GhNavAppManager");
    public final java.util.List a;
    private defpackage.yhx d;
    private defpackage.yhx e;
    private boolean f;

    public lzn() {
        super("Navigation");
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
        this.f = false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e0 A[Catch: NameNotFoundException -> 0x0117, TryCatch #0 {NameNotFoundException -> 0x0117, blocks: (B:10:0x004e, B:12:0x0054, B:14:0x0058, B:16:0x0062, B:17:0x0078, B:19:0x007e, B:28:0x00a6, B:22:0x0090, B:24:0x0094, B:27:0x00a0, B:29:0x00ad, B:31:0x00b4, B:30:0x00b2, B:32:0x00b7, B:34:0x00bd, B:36:0x00c1, B:38:0x00cb, B:40:0x00d8, B:39:0x00d6, B:41:0x00da, B:43:0x00e0, B:44:0x00e6, B:46:0x00ec, B:48:0x00fa), top: B:82:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec A[Catch: NameNotFoundException -> 0x0117, TryCatch #0 {NameNotFoundException -> 0x0117, blocks: (B:10:0x004e, B:12:0x0054, B:14:0x0058, B:16:0x0062, B:17:0x0078, B:19:0x007e, B:28:0x00a6, B:22:0x0090, B:24:0x0094, B:27:0x00a0, B:29:0x00ad, B:31:0x00b4, B:30:0x00b2, B:32:0x00b7, B:34:0x00bd, B:36:0x00c1, B:38:0x00cb, B:40:0x00d8, B:39:0x00d6, B:41:0x00da, B:43:0x00e0, B:44:0x00e6, B:46:0x00ec, B:48:0x00fa), top: B:82:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0125 A[SYNTHETIC] */
    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yqm yqmVar;
        java.util.Iterator<E> it;
        defpackage.lzt lztVar;
        defpackage.yhx yhxVarN;
        int iIntValue;
        defpackage.lzt lztVar2;
        android.content.pm.PackageManager packageManager = defpackage.mkp.a.c.getPackageManager();
        android.content.Intent intentAddCategory = new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_NAVIGATION");
        defpackage.mkj mkjVarB = defpackage.mkc.b();
        defpackage.rke rkeVar = defpackage.rke.a;
        java.util.List<android.content.pm.ResolveInfo> listB = mkjVarB.b(qshVar, intentAddCategory, rkeVar);
        ((defpackage.yqj) c.l().ai((char) 4508)).M("For carDisplayType %s found legacy navigation apps: %s", rkeVar, listB);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.ResolveInfo resolveInfo : listB) {
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str = resolveInfo.serviceInfo.packageName;
                packageManager.getClass();
                if (str != null) {
                    try {
                        android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                        if (packageInfo != null) {
                            defpackage.yhx yhxVar = this.d;
                            if (yhxVar == null) {
                                java.lang.String strC = defpackage.acqb.c();
                                if (android.text.TextUtils.isEmpty(strC)) {
                                    yhxVarN = defpackage.ynd.a;
                                } else {
                                    java.util.List listI = defpackage.xzd.c(',').i(strC);
                                    java.util.HashSet hashSetR = defpackage.ysr.r(listI.size());
                                    java.util.Iterator it2 = listI.iterator();
                                    while (it2.hasNext()) {
                                        java.lang.String[] strArrSplit = ((java.lang.String) it2.next()).split(":", 2);
                                        int length = strArrSplit.length;
                                        if (length == 0) {
                                            lztVar2 = null;
                                        } else {
                                            java.lang.String str2 = strArrSplit[0];
                                            if (length > 1) {
                                                try {
                                                    iIntValue = java.lang.Integer.decode(strArrSplit[1]).intValue();
                                                } catch (java.lang.NumberFormatException unused) {
                                                    iIntValue = 0;
                                                }
                                            } else {
                                                iIntValue = 0;
                                            }
                                            lztVar2 = new defpackage.lzt(str2, iIntValue);
                                        }
                                        lztVar2.getClass();
                                        hashSetR.add(lztVar2);
                                    }
                                    yhxVarN = defpackage.yhx.n(hashSetR);
                                }
                                yhxVar = yhxVarN;
                                this.d = yhxVar;
                            }
                            if (yhxVar.isEmpty()) {
                                defpackage.yhx yhxVarO = this.e;
                                if (yhxVarO == null) {
                                    java.lang.String strD = defpackage.acqb.d();
                                    yhxVarO = !android.text.TextUtils.isEmpty(strD) ? defpackage.yhx.o(strD.split(",")) : defpackage.ynd.a;
                                    this.e = yhxVarO;
                                }
                                if (yhxVarO.contains(str)) {
                                    int i = packageInfo.versionCode;
                                    it = yhxVar.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            lztVar = (defpackage.lzt) it.next();
                                            if (str.equals(lztVar.a)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                int i2 = packageInfo.versionCode;
                                it = yhxVar.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        lztVar = (defpackage.lzt) it.next();
                                        if (str.equals(lztVar.a) || i2 < lztVar.b) {
                                        }
                                    }
                                }
                            }
                            android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                            ((defpackage.yqj) c.l().ai((char) 4504)).y("Found projection compatible navigation app: %s", componentName);
                            arrayList.add(componentName);
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 4509)).u("Unable to resolve package versionCode");
                    }
                }
            }
            ((defpackage.yqj) c.l().ai(4503)).y("Package %s is projection enabled provider but not available", resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo.packageName : "null serviceInfo");
        }
        if (arrayList.isEmpty()) {
            ((defpackage.yqj) c.l().ai((char) 4502)).u("No projection compatible navigation apps found");
        }
        java.util.List list = (java.util.List) j$.util.Collection.-EL.stream(arrayList).map(new defpackage.lvg(5)).collect(j$.util.stream.Collectors.toList());
        java.util.Iterator it3 = this.a.iterator();
        while (it3.hasNext()) {
            list.addAll(((defpackage.nzc) it3.next()).b(qshVar, nzeVar));
        }
        java.lang.String strD2 = defpackage.lfr.c().d();
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                i3 = -1;
                break;
            }
            if (((defpackage.mqj) list.get(i3)).a().getPackageName().equals(strD2)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            yqmVar = c;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4507)).y("Default map app is not available: %s", strD2);
        } else {
            defpackage.yqm yqmVar2 = c;
            ((defpackage.yqj) yqmVar2.l().ai((char) 4505)).y("Moving %s to first slot of available apps", strD2);
            java.util.Collections.swap(list, 0, i3);
            yqmVar = yqmVar2;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 4506)).y("Filtered and sorted navigation apps : %s", list);
        if (!this.f) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MAPS_FACET, defpackage.zbd.qZ);
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new defpackage.lvg(6));
            int i4 = defpackage.ygw.d;
            rrvVarH.q((java.util.Collection) map.collect(defpackage.yds.a));
            oimVarU.F(rrvVarH.l());
            this.f = true;
        }
        return defpackage.ygw.o(list);
    }
}
