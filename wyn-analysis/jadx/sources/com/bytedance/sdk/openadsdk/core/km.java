package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class km {
    private static boolean oa(View view) {
        return view != null && view.isShown();
    }

    private static boolean uef(View view, int i5) {
        float fUef = uef(view);
        return fUef > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fUef >= ((float) i5) / 100.0f;
    }

    private static int yo(View view, int i5) {
        if (i5 == 3) {
            return com.bytedance.sdk.openadsdk.utils.af.lw(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int oa(View view, int i5) {
        if (i5 == 3) {
            return (int) (com.bytedance.sdk.openadsdk.utils.af.yo(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    public static float uef(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long jHeight = r1.height() * r1.width();
                    long height = view.getHeight() * view.getWidth();
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int oa(View view, int i5, int i10, boolean z2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!oa(view)) {
            return 1;
        }
        if (uef(view, i10, z2)) {
            return !uef(view, i5) ? 3 : 0;
        }
        return 6;
    }

    private static boolean uef(View view, int i5, boolean z2) {
        return (i5 == 1 && z2) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= oa(view, i5) && view.getHeight() >= yo(view, i5);
    }

    public static boolean uef(View view, int i5, int i10, boolean z2) {
        if (i10 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.zjm.tpx) || (view instanceof com.bytedance.sdk.openadsdk.core.moa.moa)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z2) {
                i5 = 0;
            }
        }
        return oa(view, i5, i10, z2) == 0;
    }
}
