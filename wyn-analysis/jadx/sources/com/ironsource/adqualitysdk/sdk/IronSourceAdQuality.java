package com.ironsource.adqualitysdk.sdk;

import Va.Kb;
import android.content.Context;

@Deprecated
/* loaded from: classes4.dex */
public abstract class IronSourceAdQuality {

    @Deprecated
    public static final String TAG = "ISAdQuality Agent SDK";

    @Deprecated
    public static final String VERSION = "9.5.1";

    @Deprecated
    public static IronSourceAdQuality getInstance() {
        return Kb.u();
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.5.1";
    }

    @Deprecated
    public abstract void changeUserId(String str);

    @Deprecated
    public abstract void initialize(Context context, String str);

    @Deprecated
    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    @Deprecated
    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    @Deprecated
    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void setMetaData(String str, String str2);

    @Deprecated
    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z2);

    @Deprecated
    public abstract void shutdown();
}
