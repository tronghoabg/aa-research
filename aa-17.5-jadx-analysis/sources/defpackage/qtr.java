package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class qtr {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList("com.google.android.projection.bumblebee", "com.google.android.projection.gearhead"));

    @ResultIgnorabilityUnspecified
    public static String a(Context context) {
        return b(context, !"user".equals(Build.TYPE));
    }

    public static String b(Context context, boolean z) {
        String packageName = context.getPackageName();
        List list = a;
        if (list.contains(packageName)) {
            return context.getPackageName();
        }
        ComponentName componentNameResolveActivity = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK").resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity != null && list.contains(componentNameResolveActivity.getPackageName())) {
            try {
                String packageName2 = componentNameResolveActivity.getPackageName();
                uqw.ae(context, packageName2, z);
                return packageName2;
            } catch (PackageManager.NameNotFoundException | SecurityException unused) {
            }
        }
        ArrayList arrayList = null;
        for (String str : a) {
            try {
                uqw.ae(context, str, z);
                return str;
            } catch (PackageManager.NameNotFoundException e) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Android Auto is not installed!");
        if (arrayList == null || arrayList.isEmpty()) {
            throw illegalStateException;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            illegalStateException.addSuppressed((Exception) arrayList.get(i));
        }
        throw illegalStateException;
    }
}
