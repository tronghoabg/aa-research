package l1;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3374d {
    public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
