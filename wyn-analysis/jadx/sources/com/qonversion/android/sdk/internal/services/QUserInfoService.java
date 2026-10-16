package com.qonversion.android.sdk.internal.services;

import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.storage.Cache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "", "Lcom/qonversion/android/sdk/internal/storage/Cache;", "preferences", "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "tokenStorage", "<init>", "(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V", "", "generateRandomUserID", "()Ljava/lang/String;", "obtainUserID", "userID", "Lef/C;", "storeQonversionUserId", "(Ljava/lang/String;)V", "storePartnersIdentityId", "getPartnersIdentityId", "", "logoutIfNeeded", "()Z", "deleteUser", "()V", "Lcom/qonversion/android/sdk/internal/storage/Cache;", "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QUserInfoService {

    @NotNull
    public static final String TEST_UID = "40egafre6_e_";

    @NotNull
    private final Cache preferences;

    @NotNull
    private final TokenStorage tokenStorage;

    public QUserInfoService(@NotNull Cache preferences, @NotNull TokenStorage tokenStorage) {
        AbstractC3340k.e(preferences, "preferences");
        AbstractC3340k.e(tokenStorage, "tokenStorage");
        this.preferences = preferences;
        this.tokenStorage = tokenStorage;
    }

    private final String generateRandomUserID() {
        String string = UUID.randomUUID().toString();
        AbstractC3340k.d(string, "toString(...)");
        Pattern patternCompile = Pattern.compile("-");
        AbstractC3340k.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
        return "QON_".concat(strReplaceAll);
    }

    public final void deleteUser() {
        this.preferences.putString(Constants.PREFS_ORIGINAL_USER_ID_KEY, null);
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, null);
        this.preferences.putString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, null);
        this.tokenStorage.delete();
    }

    @Nullable
    public final String getPartnersIdentityId() {
        return this.preferences.getString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, null);
    }

    public final boolean logoutIfNeeded() {
        String string = this.preferences.getString(Constants.PREFS_ORIGINAL_USER_ID_KEY, null);
        String string2 = this.preferences.getString(Constants.PREFS_QONVERSION_USER_ID_KEY, null);
        this.preferences.putString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, null);
        if (AbstractC3340k.a(string, string2)) {
            return false;
        }
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, string);
        return true;
    }

    @NotNull
    public final String obtainUserID() {
        String strLoad;
        String string = this.preferences.getString(Constants.PREFS_QONVERSION_USER_ID_KEY, null);
        if (string == null || string.length() == 0) {
            strLoad = this.tokenStorage.load();
            this.tokenStorage.delete();
        } else {
            strLoad = string;
        }
        if (strLoad == null || strLoad.length() == 0 || AbstractC3340k.a(strLoad, TEST_UID)) {
            strLoad = generateRandomUserID();
        }
        if (string != null && string.length() != 0 && !AbstractC3340k.a(string, TEST_UID)) {
            return strLoad;
        }
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, strLoad);
        this.preferences.putString(Constants.PREFS_ORIGINAL_USER_ID_KEY, strLoad);
        return strLoad;
    }

    public final void storePartnersIdentityId(@NotNull String userID) {
        AbstractC3340k.e(userID, "userID");
        this.preferences.putString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, userID);
    }

    public final void storeQonversionUserId(@NotNull String userID) {
        AbstractC3340k.e(userID, "userID");
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, userID);
    }
}
