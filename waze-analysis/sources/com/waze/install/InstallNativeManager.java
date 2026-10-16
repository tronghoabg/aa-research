package com.waze.install;

import java.util.Locale;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InstallNativeManager extends m {
    public static final int $stable = 8;
    private final bn<Boolean> geoConfigReady;
    private final x installationRequirements;
    private final com.waze.shared_infra.i.e logger;

    public InstallNativeManager(x xVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(xVar, "installationRequirements");
        h.g.b.x.f(eVar, "logger");
        this.installationRequirements = xVar;
        this.logger = eVar;
        this.geoConfigReady = ck.b(false);
    }

    public final native void countrySelectedNTV(int i2);

    public final ch<Boolean> getGeoConfigReadyState() {
        return kotlinx.coroutines.b.ai.U(this.geoConfigReady);
    }

    public final String getLocale() {
        String language = Locale.getDefault().getLanguage();
        h.g.b.x.e(language, "getLanguage(...)");
        String country = Locale.getDefault().getCountry();
        h.g.b.x.e(country, "getCountry(...)");
        return (h.g.b.x.n(language, "en") && h.g.b.x.n(country, "GB")) ? "en-GB" : (h.g.b.x.n(language, "pt") && h.g.b.x.n(country, "PT")) ? "pt-PT" : (h.g.b.x.n(language, "zh") && h.g.b.x.n(country, "TW")) ? "zh_TW" : (!h.g.b.x.n(language, "es") || country.length() == 0 || h.g.b.x.n(country, "ES")) ? language : "es-".concat(String.valueOf(country));
    }

    public final String getPlatformLocale$third_party_waze_client_android_project_waze_src_main_waze() {
        return getLocale();
    }

    public final native void initNativeLayerNTV();

    public final native boolean isPrivacyConsentApprovedNTV();

    public final void onGlobalConfigLoaded$third_party_waze_client_android_project_waze_src_main_waze() {
        this.logger.a("InstallNativeManager.onGlobalConfigLoaded called");
        this.geoConfigReady.e(true);
    }

    public final void openSelectCountryMenu$third_party_waze_client_android_project_waze_src_main_waze() {
        this.installationRequirements.e(r.f24792a);
    }

    public final native void retryLoginNTV();

    public final native void setCountryNTV(String str);

    public final native void setLangFromLocaleNTV(String str);

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InstallNativeManager(x xVar, com.waze.shared_infra.i.e eVar, int i2, h.g.b.o oVar) {
        if ((i2 & 2) != 0) {
            eVar = com.waze.shared_infra.i.a.d("InstallNativeManager");
            h.g.b.x.e(eVar, "create(...)");
        }
        this(xVar, eVar);
    }
}
