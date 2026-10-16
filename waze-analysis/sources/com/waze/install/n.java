package com.waze.install;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ n f24787a = new n();

    public static final String a(Context context) {
        String networkCountryIso;
        h.g.b.x.f(context, "context");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        h.g.b.x.e(locale, "getDefault(...)");
        String upperCase = networkCountryIso.toUpperCase(locale);
        h.g.b.x.e(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
