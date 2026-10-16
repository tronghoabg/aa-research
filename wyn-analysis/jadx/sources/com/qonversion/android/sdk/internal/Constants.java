package com.qonversion.android.sdk.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/Constants;", "", "()V", "CRASH_LOGS_URL", "", "CRASH_LOG_FILE_SUFFIX", "INTERNAL_SERVER_ERROR_MAX", "", "INTERNAL_SERVER_ERROR_MIN", "IS_HISTORICAL_DATA_SYNCED", "PREFS_ORIGINAL_USER_ID_KEY", "PREFS_PARTNER_IDENTITY_ID_KEY", "PREFS_PREFIX", "PREFS_QONVERSION_USER_ID_KEY", "PRICE_MICROS_DIVIDER", "", "USER_ID_PREFIX", "USER_ID_SEPARATOR", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Constants {

    @NotNull
    public static final String CRASH_LOGS_URL = "https://sdk-logs.qonversion.io/sdk.log";

    @NotNull
    public static final String CRASH_LOG_FILE_SUFFIX = ".qonversion.stacktrace";

    @NotNull
    public static final Constants INSTANCE = new Constants();
    public static final int INTERNAL_SERVER_ERROR_MAX = 599;
    public static final int INTERNAL_SERVER_ERROR_MIN = 500;

    @NotNull
    public static final String IS_HISTORICAL_DATA_SYNCED = "com.qonversion.keys.is_historical_data_synced";

    @NotNull
    public static final String PREFS_ORIGINAL_USER_ID_KEY = "com.qonversion.keys.originalUserID";

    @NotNull
    public static final String PREFS_PARTNER_IDENTITY_ID_KEY = "com.qonversion.keys.partnerIdentityUserID";

    @NotNull
    public static final String PREFS_PREFIX = "com.qonversion.keys";

    @NotNull
    public static final String PREFS_QONVERSION_USER_ID_KEY = "com.qonversion.keys.storedUserID";
    public static final double PRICE_MICROS_DIVIDER = 1000000.0d;

    @NotNull
    public static final String USER_ID_PREFIX = "QON";

    @NotNull
    public static final String USER_ID_SEPARATOR = "_";

    private Constants() {
    }
}
