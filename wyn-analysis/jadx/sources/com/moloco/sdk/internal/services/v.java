package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import ef.C2532p;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29732a;

    /* renamed from: b, reason: collision with root package name */
    public final C2532p f29733b = Fe.c.z(new Af.q(this, 14));

    public v(Context context) {
        this.f29732a = context;
    }

    public final F a() {
        String networkOperatorName;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5 = Build.MANUFACTURER;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = Build.MODEL;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = Build.HARDWARE;
        String str8 = str6;
        String str9 = str7 == null ? "" : str7;
        boolean zBooleanValue = ((Boolean) this.f29733b.getValue()).booleanValue();
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3340k.d(RELEASE, "RELEASE");
        int i5 = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        AbstractC3340k.d(language, "getLanguage(...)");
        TelephonyManager telephonyManager = (TelephonyManager) Y0.e.getSystemService(this.f29732a, TelephonyManager.class);
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (str7 == null) {
            str7 = "";
        }
        String str10 = Build.BRAND;
        if (str10 == null) {
            str = "";
            str3 = str7;
            z2 = zBooleanValue;
            str4 = language;
            str2 = networkOperatorName;
        } else {
            str = str10;
            str2 = networkOperatorName;
            str3 = str7;
            z2 = zBooleanValue;
            str4 = language;
        }
        return new F(str5, str8, str9, z2, i5, str4, str2, f10, jCurrentTimeMillis, str3, str);
    }
}
