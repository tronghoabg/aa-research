package com.qonversion.android.sdk.internal.storage;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "Lcom/qonversion/android/sdk/internal/storage/Storage;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "load", "()Ljava/lang/String;", "Lef/C;", "delete", "()V", "Landroid/content/SharedPreferences;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenStorage implements Storage {

    @NotNull
    private static final String TOKEN_KEY = "token_key";

    @NotNull
    private final SharedPreferences preferences;

    public TokenStorage(@NotNull SharedPreferences preferences) {
        AbstractC3340k.e(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.qonversion.android.sdk.internal.storage.Storage
    public void delete() {
        this.preferences.edit().remove(TOKEN_KEY).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Storage
    @NotNull
    public String load() {
        String string = this.preferences.getString(TOKEN_KEY, "");
        return string == null ? "" : string;
    }
}
