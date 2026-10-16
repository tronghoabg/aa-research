package com.bytedance.sdk.openadsdk.gsd.oa;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.km;

/* loaded from: classes3.dex */
public class ivm {
    public static boolean uef(View view, int i5) {
        return uef(view, false, i5);
    }

    public static boolean uef(View view, boolean z2, int i5) {
        if (view == null) {
            return false;
        }
        return km.uef(view, z2 ? 30 : 50, i5, false);
    }
}
