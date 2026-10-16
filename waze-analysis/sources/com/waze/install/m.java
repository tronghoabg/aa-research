package com.waze.install;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class m {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void countrySelected$default(m mVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: countrySelected");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        mVar.countrySelected(i2, lVar);
    }

    static final h.ab countrySelected$lambda$0(m mVar, int i2) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.install.InstallNativeManager");
        ((InstallNativeManager) mVar).countrySelectedNTV(i2);
        return null;
    }

    static final void onGlobalConfigLoadedJNI$lambda$0(m mVar) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.install.InstallNativeManager");
        ((InstallNativeManager) mVar).onGlobalConfigLoaded$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void openSelectCountryMenuJNI$lambda$0(m mVar) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.install.InstallNativeManager");
        ((InstallNativeManager) mVar).openSelectCountryMenu$third_party_waze_client_android_project_waze_src_main_waze();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void retryLogin$default(m mVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retryLogin");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        mVar.retryLogin(lVar);
    }

    static final h.ab retryLogin$lambda$0(m mVar) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.install.InstallNativeManager");
        ((InstallNativeManager) mVar).retryLoginNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCountry$default(m mVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCountry");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        mVar.setCountry(str, lVar);
    }

    static final h.ab setCountry$lambda$0(m mVar, String str) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.install.InstallNativeManager");
        ((InstallNativeManager) mVar).setCountryNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLangFromLocale$default(m mVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLangFromLocale");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        mVar.setLangFromLocale(str, lVar);
    }

    static final h.ab setLangFromLocale$lambda$0(m mVar, String str) {
        h.g.b.x.d(mVar, "null cannot be cast to non-null type com.waze.install.InstallNativeManager");
        ((InstallNativeManager) mVar).setLangFromLocaleNTV(str);
        return null;
    }

    public void countrySelected(final int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.install.h
            @Override // com.waze.hw
            public final Object a() {
                m.countrySelected$lambda$0(this.f24777a, i2);
                return null;
            }
        }, lVar != null ? new i(lVar, 0) : null);
    }

    protected final String getPlatformLocaleJNI() {
        return ((InstallNativeManager) this).getPlatformLocale$third_party_waze_client_android_project_waze_src_main_waze();
    }

    public boolean isPrivacyConsentApproved() {
        return ((InstallNativeManager) this).isPrivacyConsentApprovedNTV();
    }

    protected final void onGlobalConfigLoadedJNI() {
        NativeManager.runMainThreadTask(new j(this, 1));
    }

    protected final void openSelectCountryMenuJNI() {
        NativeManager.runMainThreadTask(new j(this, 0));
    }

    public void retryLogin(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.install.l
            @Override // com.waze.hw
            public final Object a() {
                m.retryLogin$lambda$0(this.f24786a);
                return null;
            }
        }, lVar != null ? new i(lVar, 3) : null);
    }

    public void setCountry(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "country");
        NativeManager.runNativeTask(new k(this, str, 0), lVar != null ? new i(lVar, 2) : null);
    }

    public void setLangFromLocale(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "locale");
        int i2 = 1;
        NativeManager.runNativeTask(new k(this, str, i2), lVar != null ? new i(lVar, i2) : null);
    }

    public final void countrySelected(int i2) {
        countrySelected$default(this, i2, null, 2, null);
    }

    public final void retryLogin() {
        retryLogin$default(this, null, 1, null);
    }

    public final void setLangFromLocale(String str) {
        h.g.b.x.f(str, "locale");
        setLangFromLocale$default(this, str, null, 2, null);
    }

    public final void setCountry(String str) {
        h.g.b.x.f(str, "country");
        setCountry$default(this, str, null, 2, null);
    }
}
