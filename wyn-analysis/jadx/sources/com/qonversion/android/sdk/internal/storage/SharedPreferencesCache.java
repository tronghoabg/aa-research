package com.qonversion.android.sdk.internal.storage;

import android.content.SharedPreferences;
import hb.r;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\u00020\n\"\u0004\b\u0000\u0010#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010#2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,¨\u0006-"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "Lcom/qonversion/android/sdk/internal/storage/Cache;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "putInt", "(Ljava/lang/String;I)V", "defValue", "getInt", "(Ljava/lang/String;I)I", "", "getBool", "(Ljava/lang/String;Z)Z", "putBool", "(Ljava/lang/String;Z)V", "", "putFloat", "(Ljava/lang/String;F)V", "getFloat", "(Ljava/lang/String;F)F", "", "putLong", "(Ljava/lang/String;J)V", "getLong", "(Ljava/lang/String;J)J", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "T", "Lhb/r;", "adapter", "putObject", "(Ljava/lang/String;Ljava/lang/Object;Lhb/r;)V", "getObject", "(Ljava/lang/String;Lhb/r;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SharedPreferencesCache implements Cache {

    @NotNull
    private final SharedPreferences preferences;

    public SharedPreferencesCache(@NotNull SharedPreferences preferences) {
        AbstractC3340k.e(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public boolean getBool(@NotNull String key, boolean defValue) {
        AbstractC3340k.e(key, "key");
        return this.preferences.getBoolean(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public float getFloat(@NotNull String key, float defValue) {
        AbstractC3340k.e(key, "key");
        return this.preferences.getFloat(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public int getInt(@NotNull String key, int defValue) {
        AbstractC3340k.e(key, "key");
        return this.preferences.getInt(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public long getLong(@NotNull String key, long defValue) {
        AbstractC3340k.e(key, "key");
        return this.preferences.getLong(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    @Nullable
    public <T> T getObject(@NotNull String key, @NotNull r adapter) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(adapter, "adapter");
        String string = getString(key, "");
        if (string != null && string.length() != 0) {
            try {
                return (T) adapter.fromJson(string);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    @Nullable
    public String getString(@NotNull String key, @Nullable String defValue) {
        AbstractC3340k.e(key, "key");
        return this.preferences.getString(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putBool(@NotNull String key, boolean value) {
        AbstractC3340k.e(key, "key");
        this.preferences.edit().putBoolean(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putFloat(@NotNull String key, float value) {
        AbstractC3340k.e(key, "key");
        this.preferences.edit().putFloat(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putInt(@NotNull String key, int value) {
        AbstractC3340k.e(key, "key");
        this.preferences.edit().putInt(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putLong(@NotNull String key, long value) {
        AbstractC3340k.e(key, "key");
        this.preferences.edit().putLong(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public <T> void putObject(@NotNull String key, T value, @NotNull r adapter) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(adapter, "adapter");
        String json = adapter.toJson(value);
        AbstractC3340k.d(json, "toJson(...)");
        putString(key, json);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putString(@NotNull String key, @Nullable String value) {
        AbstractC3340k.e(key, "key");
        this.preferences.edit().putString(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void remove(@NotNull String key) {
        AbstractC3340k.e(key, "key");
        this.preferences.edit().remove(key).apply();
    }
}
