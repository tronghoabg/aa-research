package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class a {
    public static String a(Context context) {
        AbstractC3340k.e(context, "context");
        Object systemService = context.getSystemService("phone");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getNetworkOperatorName();
    }
}
