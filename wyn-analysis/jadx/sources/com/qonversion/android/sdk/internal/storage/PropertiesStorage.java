package com.qonversion.android.sdk.internal.storage;

import java.util.Map;
import kotlin.Metadata;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;", "", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "save", "(Ljava/lang/String;Ljava/lang/String;)V", "", "properties", "clear", "(Ljava/util/Map;)V", "getProperties", "()Ljava/util/Map;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PropertiesStorage {
    void clear(@NotNull Map<String, String> properties);

    @NotNull
    Map<String, String> getProperties();

    void save(@NotNull String key, @NotNull String value);
}
