package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class dln {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static float c(dlm dlmVar, long j) {
        dlw dlwVarA;
        if (dlt.a[(int) ((1095216660480L & j) >>> 32)].a != 4294967296L) {
            b("Only Sp can convert to Px");
        }
        int i = dlx.a;
        int i2 = (int) (j & 4294967295L);
        if (dlmVar.b() >= 1.03f && (dlwVarA = dlx.a(dlmVar.b())) != null) {
            return dlwVarA.b(Float.intBitsToFloat(i2));
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        float fB = dlmVar.b();
        return fIntBitsToFloat * fB;
    }

    public static long d(dlm dlmVar, float f) {
        long jFloatToRawIntBits;
        int i = dlx.a;
        if (dlmVar.b() >= 1.03f) {
            dlw dlwVarA = dlx.a(dlmVar.b());
            jFloatToRawIntBits = Float.floatToRawIntBits(dlwVarA != null ? dlwVarA.a(f) : f / dlmVar.b());
            dlu[] dluVarArr = dlt.a;
        } else {
            jFloatToRawIntBits = Float.floatToRawIntBits(f / dlmVar.b());
            dlu[] dluVarArr2 = dlt.a;
        }
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long e(double d) {
        long jFloatToRawIntBits = Float.floatToRawIntBits((float) d);
        dlu[] dluVarArr = dlt.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long f(int i) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(i);
        dlu[] dluVarArr = dlt.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long g(long j, float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        dlu[] dluVarArr = dlt.a;
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public static final void h(long j) {
        dlu[] dluVarArr = dlt.a;
        if ((j & 1095216660480L) == 0) {
            a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void i() {
        Float.floatToRawIntBits(0.25f);
        dlu[] dluVarArr = dlt.a;
    }

    public static final long j(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long k(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static int l(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static List m(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(t(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(t(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int o(Context context, String str, int i, int i2, String str2) {
        int iU;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (iMyUid == i2 && Objects.equals(packageName, str2) && Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iU = dsq.b(appOpsManager, strPermissionToOp, Binder.getCallingUid(), str2);
            if (iU == 0) {
                iU = dsq.b(appOpsManager, strPermissionToOp, i2, context.getOpPackageName());
            }
        } else {
            iU = dsg.u(context, strPermissionToOp, str2);
        }
        return iU == 0 ? 0 : -2;
    }

    public static int p(Context context, String str) {
        return o(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static Intent q(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strS = s(activity, activity.getComponentName());
            if (strS == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strS);
            try {
                return s(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", a.bq(strS, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent r(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strS = s(context, componentName);
        if (strS == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strS);
        return s(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String s(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    private static List t(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
