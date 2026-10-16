package com.vungle.ads;

import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/VunglePrivacySettings;", "", "", "isUserCoppa", "Lef/C;", "setCOPPAStatus", "(Z)V", "", "getCOPPAStatus", "()Ljava/lang/String;", "optIn", "consentMessageVersion", "setGDPRStatus", "(ZLjava/lang/String;)V", "getGDPRStatus", "getGDPRMessageVersion", "getGDPRSource", "", "getGDPRTimestamp", "()J", "setCCPAStatus", "getCCPAStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class VunglePrivacySettings {

    @NotNull
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    @NotNull
    public static final String getCCPAStatus() {
        String value;
        PrivacyManager.INSTANCE.getClass();
        PrivacyConsent privacyConsent = PrivacyManager.f33590h;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    @NotNull
    public static final String getCOPPAStatus() {
        PrivacyManager.INSTANCE.getClass();
        return PrivacyManager.c().name();
    }

    @NotNull
    public static final String getGDPRMessageVersion() {
        PrivacyManager.INSTANCE.getClass();
        String str = PrivacyManager.f33588f;
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getGDPRSource() {
        PrivacyManager.INSTANCE.getClass();
        String str = PrivacyManager.f33587e;
        return str == null ? "no_interaction" : str;
    }

    @NotNull
    public static final String getGDPRStatus() {
        PrivacyManager.INSTANCE.getClass();
        return PrivacyManager.b();
    }

    public static final long getGDPRTimestamp() {
        PrivacyManager.INSTANCE.getClass();
        Long l10 = PrivacyManager.f33589g;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public static final void setCCPAStatus(boolean optIn) {
        PrivacyManager.INSTANCE.updateCcpaConsent(optIn ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean isUserCoppa) {
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.f33584b.set(Boolean.valueOf(isUserCoppa));
        FilePreferences filePreferences = PrivacyManager.f33591i;
        if (filePreferences != null) {
            filePreferences.a(isUserCoppa, "is_coppa").b();
        }
    }

    public static final void setGDPRStatus(boolean optIn, @Nullable String consentMessageVersion) {
        String value = optIn ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue();
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a(value, "publisher", consentMessageVersion);
    }
}
