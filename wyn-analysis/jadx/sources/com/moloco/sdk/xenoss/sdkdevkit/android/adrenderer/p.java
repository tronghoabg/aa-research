package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32386a;

    public p(Context context, int i5) {
        switch (i5) {
            case 1:
                this.f32386a = context;
                break;
            default:
                AbstractC3340k.e(context, "context");
                this.f32386a = context;
                break;
        }
    }

    public com.moloco.sdk.common_adapter_internal.a a() {
        DisplayMetrics displayMetrics;
        Context context = this.f32386a;
        WindowManager windowManager = (WindowManager) Y0.e.getSystemService(context, WindowManager.class);
        if (windowManager == null) {
            return new com.moloco.sdk.common_adapter_internal.a(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            displayMetrics = new DisplayMetrics();
            displayMetrics.density = context.getResources().getDisplayMetrics().density;
            displayMetrics.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
            displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
            displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        } else {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        int i5 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        return new com.moloco.sdk.common_adapter_internal.a(i5, i10, i5 / f10, i10 / f10, displayMetrics.densityDpi, f10);
    }
}
