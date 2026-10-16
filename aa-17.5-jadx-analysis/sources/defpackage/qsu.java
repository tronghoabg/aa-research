package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.car.CarInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qsu {
    public static final ypf a = ols.R("CAR.SERVICE");
    static final boolean b = true;

    public static int a(Context context, String str) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        ypf ypfVar = a;
        ypfVar.l().ai(7890).y("Checking permission: %s", str);
        if (packagesForUid == null || packagesForUid.length <= 0) {
            ypfVar.h().ai(7891).u("No package with that UID, denied!");
            return -1;
        }
        ypfVar.l().ai(7892).y("Checking package: %s", packagesForUid[0]);
        ypfVar.l().ai(7893).y("All packages: %s", Arrays.toString(packagesForUid));
        return dln.o(context, str, Binder.getCallingPid(), Binder.getCallingUid(), packagesForUid[0]);
    }

    public static File b(Context context) {
        rhx rhxVar = rhx.c;
        File file = new File(context.getExternalFilesDir(null), "auto");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        a.h().ai(7897).u("Failed to create auto-specific file dir");
        return null;
    }

    public static List c(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = new xxx(new xxr(new xwi(':'))).b().g(str).iterator();
        while (it.hasNext()) {
            arrayList.add((String[]) yrm.at(xxx.c(',').a(8).g((String) it.next()), String.class));
        }
        return arrayList;
    }

    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("expecting main thread");
        }
    }

    public static boolean e(CarInfo carInfo, String str) {
        return f(c(str), carInfo);
    }

    public static boolean f(List list, CarInfo carInfo) {
        if (carInfo == null) {
            a.h().ai(7898).u("Null car info");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String[] strArr = (String[]) it.next();
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
