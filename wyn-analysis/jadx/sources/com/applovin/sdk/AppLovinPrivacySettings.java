package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.AbstractC1656p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i5) {
        k kVar = k.f22986D0;
        if (kVar != null) {
            return kVar.s0().a(i5);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i5) {
        k kVar = k.f22986D0;
        if (kVar != null) {
            return kVar.s0().b(i5);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i5) {
        k kVar = k.f22986D0;
        if (kVar != null) {
            return kVar.s0().c(i5);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i5) {
        k kVar = k.f22986D0;
        if (kVar != null) {
            return kVar.s0().d(i5);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(k.o());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(k.o());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(k.o());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(k.o());
    }

    public static void setDoNotSell(boolean z2) {
        setDoNotSell(z2, k.o());
    }

    public static void setHasUserConsent(boolean z2) {
        setHasUserConsent(z2, k.o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = AbstractC1656p0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = AbstractC1656p0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return AbstractC1656p0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return AbstractC1656p0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z2, Context context) {
        o.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (AbstractC1656p0.a(z2, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z2));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z2, Context context) {
        o.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (AbstractC1656p0.b(z2, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z2), null);
        }
    }
}
