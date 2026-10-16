package com.qonversion.android.sdk.internal.storage;

import hb.r;
import kotlin.Metadata;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\"\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H&¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/Cache;", "", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "putInt", "(Ljava/lang/String;I)V", "defValue", "getInt", "(Ljava/lang/String;I)I", "", "getBool", "(Ljava/lang/String;Z)Z", "putBool", "(Ljava/lang/String;Z)V", "", "putFloat", "(Ljava/lang/String;F)V", "getFloat", "(Ljava/lang/String;F)F", "", "putLong", "(Ljava/lang/String;J)V", "getLong", "(Ljava/lang/String;J)J", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "T", "Lhb/r;", "adapter", "putObject", "(Ljava/lang/String;Ljava/lang/Object;Lhb/r;)V", "getObject", "(Ljava/lang/String;Lhb/r;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Cache {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean getBool$default(Cache cache, String str, boolean z2, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
            }
            if ((i5 & 2) != 0) {
                z2 = false;
            }
            return cache.getBool(str, z2);
        }
    }

    boolean getBool(@NotNull String key, boolean defValue);

    float getFloat(@NotNull String key, float defValue);

    int getInt(@NotNull String key, int defValue);

    long getLong(@NotNull String key, long defValue);

    @Nullable
    <T> T getObject(@NotNull String key, @NotNull r adapter);

    @Nullable
    String getString(@NotNull String key, @Nullable String defValue);

    void putBool(@NotNull String key, boolean value);

    void putFloat(@NotNull String key, float value);

    void putInt(@NotNull String key, int value);

    void putLong(@NotNull String key, long value);

    <T> void putObject(@NotNull String key, T value, @NotNull r adapter);

    void putString(@NotNull String key, @Nullable String value);

    void remove(@NotNull String key);
}
