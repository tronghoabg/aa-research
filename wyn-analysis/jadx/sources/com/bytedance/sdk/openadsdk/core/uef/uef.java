package com.bytedance.sdk.openadsdk.core.uef;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.dhk;
import java.util.ArrayList;
import java.util.List;
import u.k;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static Boolean f25754oa;
    private static String uef;

    public static int oa(Context context) {
        return !TextUtils.isEmpty(uef(context)) ? 1 : 0;
    }

    public static String uef(Context context) {
        String str = uef;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                uef = null;
            } else if (TextUtils.isEmpty(str2) || uef(context, intent) || !arrayList.contains(str2)) {
                uef = (String) arrayList.get(0);
            } else {
                uef = str2;
            }
        } catch (Throwable th) {
            dhk.yo("CustomTabsHelper", th.getMessage());
        }
        return uef;
    }

    private static boolean uef(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (listQueryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int uef() {
        Boolean bool = f25754oa;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void uef(Context context, String str, k kVar, Uri uri) {
        kVar.f46072a.setPackage(str);
        kVar.a(context, uri);
    }
}
