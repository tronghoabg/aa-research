package com.qonversion.android.sdk.dto.properties;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "", "userPropertyCode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getUserPropertyCode", "()Ljava/lang/String;", "Email", "Name", "KochavaDeviceId", "AppsFlyerUserId", "AdjustAdId", "CustomUserId", "FacebookAttribution", "FirebaseAppInstanceId", "AppSetId", "AdvertisingId", "AppMetricaDeviceId", "AppMetricaUserProfileId", "PushWooshHwId", "PushWooshUserId", "TenjinAnalyticsInstallationId", "Custom", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QUserPropertyKey {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QUserPropertyKey[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String userPropertyCode;
    public static final QUserPropertyKey Email = new QUserPropertyKey("Email", 0, "_q_email");
    public static final QUserPropertyKey Name = new QUserPropertyKey("Name", 1, "_q_name");
    public static final QUserPropertyKey KochavaDeviceId = new QUserPropertyKey("KochavaDeviceId", 2, "_q_kochava_device_id");
    public static final QUserPropertyKey AppsFlyerUserId = new QUserPropertyKey("AppsFlyerUserId", 3, "_q_appsflyer_user_id");
    public static final QUserPropertyKey AdjustAdId = new QUserPropertyKey("AdjustAdId", 4, "_q_adjust_adid");
    public static final QUserPropertyKey CustomUserId = new QUserPropertyKey("CustomUserId", 5, "_q_custom_user_id");
    public static final QUserPropertyKey FacebookAttribution = new QUserPropertyKey("FacebookAttribution", 6, "_q_fb_attribution");
    public static final QUserPropertyKey FirebaseAppInstanceId = new QUserPropertyKey("FirebaseAppInstanceId", 7, "_q_firebase_instance_id");
    public static final QUserPropertyKey AppSetId = new QUserPropertyKey("AppSetId", 8, "_q_app_set_id");
    public static final QUserPropertyKey AdvertisingId = new QUserPropertyKey("AdvertisingId", 9, "_q_advertising_id");
    public static final QUserPropertyKey AppMetricaDeviceId = new QUserPropertyKey("AppMetricaDeviceId", 10, "_q_appmetrica_device_id");
    public static final QUserPropertyKey AppMetricaUserProfileId = new QUserPropertyKey("AppMetricaUserProfileId", 11, "_q_appmetrica_user_profile_id");
    public static final QUserPropertyKey PushWooshHwId = new QUserPropertyKey("PushWooshHwId", 12, "_q_pushwoosh_hwid");
    public static final QUserPropertyKey PushWooshUserId = new QUserPropertyKey("PushWooshUserId", 13, "_q_pushwoosh_user_id");
    public static final QUserPropertyKey TenjinAnalyticsInstallationId = new QUserPropertyKey("TenjinAnalyticsInstallationId", 14, "_q_tenjin_aiid");
    public static final QUserPropertyKey Custom = new QUserPropertyKey("Custom", 15, "");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey$Companion;", "", "()V", "fromString", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", "fromString$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QUserPropertyKey fromString$sdk_release(@NotNull String key) {
            QUserPropertyKey qUserPropertyKey;
            AbstractC3340k.e(key, "key");
            QUserPropertyKey[] qUserPropertyKeyArrValues = QUserPropertyKey.values();
            int length = qUserPropertyKeyArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    qUserPropertyKey = null;
                    break;
                }
                qUserPropertyKey = qUserPropertyKeyArrValues[i5];
                if (AbstractC3340k.a(qUserPropertyKey.getUserPropertyCode(), key)) {
                    break;
                }
                i5++;
            }
            return qUserPropertyKey == null ? QUserPropertyKey.Custom : qUserPropertyKey;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QUserPropertyKey[] $values() {
        return new QUserPropertyKey[]{Email, Name, KochavaDeviceId, AppsFlyerUserId, AdjustAdId, CustomUserId, FacebookAttribution, FirebaseAppInstanceId, AppSetId, AdvertisingId, AppMetricaDeviceId, AppMetricaUserProfileId, PushWooshHwId, PushWooshUserId, TenjinAnalyticsInstallationId, Custom};
    }

    static {
        QUserPropertyKey[] qUserPropertyKeyArr$values = $values();
        $VALUES = qUserPropertyKeyArr$values;
        $ENTRIES = d.t(qUserPropertyKeyArr$values);
        INSTANCE = new Companion(null);
    }

    private QUserPropertyKey(String str, int i5, String str2) {
        this.userPropertyCode = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QUserPropertyKey valueOf(String str) {
        return (QUserPropertyKey) Enum.valueOf(QUserPropertyKey.class, str);
    }

    public static QUserPropertyKey[] values() {
        return (QUserPropertyKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getUserPropertyCode() {
        return this.userPropertyCode;
    }
}
