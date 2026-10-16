package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static AccessibilityManager f32610a;

    private static AccessibilityManager a(Context context) {
        if (f32610a == null) {
            f32610a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return f32610a;
    }

    public static String b(Context context) {
        AccessibilityManager accessibilityManagerA;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (accessibilityManagerA = a(context)) == null || (enabledAccessibilityServiceList = accessibilityManagerA.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < enabledAccessibilityServiceList.size(); i5++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i5);
            if (accessibilityServiceInfo != null) {
                String strG = N0.a.g(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, "#", accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (!arrayList.contains(strG)) {
                    arrayList.add(strG);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ",");
            }
        }
        return sb2.toString();
    }
}
