package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtq {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE");
    static final boolean b = true;

    public static int a(android.content.Context context, java.lang.String str) {
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7915).y("Checking permission: %s", str);
        if (packagesForUid == null || packagesForUid.length <= 0) {
            yqkVar.h().ai(7916).u("No package with that UID, denied!");
            return -1;
        }
        yqkVar.l().ai(7917).y("Checking package: %s", packagesForUid[0]);
        yqkVar.l().ai(7918).y("All packages: %s", java.util.Arrays.toString(packagesForUid));
        return defpackage.dmh.F(context, str, android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), packagesForUid[0]);
    }

    public static java.io.File b(android.content.Context context) {
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        java.io.File file = new java.io.File(context.getExternalFilesDir(null), "auto");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        a.h().ai(7922).u("Failed to create auto-specific file dir");
        return null;
    }

    public static java.util.List c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = new defpackage.xzd(new defpackage.xyx(new defpackage.xxo(':'))).b().g(str).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String[]) defpackage.ysr.at(defpackage.xzd.c(',').a(8).g((java.lang.String) it.next()), java.lang.String.class));
        }
        return arrayList;
    }

    public static void d() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("expecting main thread");
        }
    }

    public static boolean e(com.google.android.gms.car.CarInfo carInfo, java.lang.String str) {
        return f(c(str), carInfo);
    }

    public static boolean f(java.util.List list, com.google.android.gms.car.CarInfo carInfo) {
        if (carInfo == null) {
            a.h().ai(7923).u("Null car info");
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it.next();
            int length = strArr.length;
            if (length != 0) {
                if (strArr[0].isEmpty() || strArr[0].equals(carInfo.a)) {
                    if (length >= 2) {
                        if (strArr[1].isEmpty() || strArr[1].equals(carInfo.b)) {
                            if (length >= 3) {
                                if (!strArr[2].isEmpty()) {
                                    if (!strArr[2].equals(carInfo.e + "." + carInfo.f)) {
                                        continue;
                                    }
                                }
                                if (length >= 4) {
                                    if (strArr[3].isEmpty() || strArr[3].equals(carInfo.c)) {
                                        if (length >= 5) {
                                            if (strArr[4].isEmpty() || strArr[4].equals(carInfo.i)) {
                                                if (length >= 6) {
                                                    if (strArr[5].isEmpty() || strArr[5].equals(carInfo.j)) {
                                                        if (length >= 7) {
                                                            if (strArr[6].isEmpty() || strArr[6].equals(carInfo.k)) {
                                                                if (length >= 8 && !strArr[7].isEmpty() && !strArr[7].equals(carInfo.l)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
