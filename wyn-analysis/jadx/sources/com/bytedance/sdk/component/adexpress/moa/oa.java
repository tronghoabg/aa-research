package com.bytedance.sdk.component.adexpress.moa;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class oa {
    public static boolean uef(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
