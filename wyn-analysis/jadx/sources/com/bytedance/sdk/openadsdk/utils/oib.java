package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class oib {
    private static List<String> oa() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    public static void uef() {
        Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
        if (contextUef != null && com.bytedance.sdk.component.utils.wk.yo()) {
            String packageName = contextUef.getPackageName();
            int i5 = contextUef.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextUef.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listOa = oa();
                for (String str : strArr) {
                    if (str != null) {
                        listOa.remove(str);
                    }
                }
                if (listOa.isEmpty()) {
                    return;
                }
                for (String str2 : listOa) {
                }
            } catch (Throwable unused) {
            }
        }
    }
}
