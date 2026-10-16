package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.vungle.ads.internal.presenter.e0;
import ef.C2527k;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class a0 {
    public static int a(Context context, int i5) {
        AbstractC3340k.e(context, "context");
        return (int) ((i5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static WebView a(Context context, String str) throws InstantiationException {
        AbstractC3340k.e(context, "context");
        try {
            return e0.a(context, str);
        } catch (Resources.NotFoundException e7) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e7 + ".message");
        } catch (Exception e10) {
            throw new InstantiationException(e10.getMessage());
        }
    }

    public static C2527k a(Context context) {
        AbstractC3340k.e(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i5 = resources.getConfiguration().orientation;
        return new C2527k(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)));
    }
}
