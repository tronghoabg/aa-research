package com.qonversion.android.sdk.internal.storage;

import ff.AbstractC2640A;
import ff.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;", "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;", "<init>", "()V", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "save", "(Ljava/lang/String;Ljava/lang/String;)V", "", "properties", "clear", "(Ljava/util/Map;)V", "getProperties", "()Ljava/util/Map;", "", "userProperties", "Ljava/util/Map;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserPropertiesStorage implements PropertiesStorage {

    @NotNull
    private final Map<String, String> userProperties = new ConcurrentHashMap();

    @Override // com.qonversion.android.sdk.internal.storage.PropertiesStorage
    public void clear(@NotNull Map<String, String> properties) {
        AbstractC3340k.e(properties, "properties");
        Set<String> setKeySet = properties.keySet();
        ArrayList arrayList = new ArrayList(p.a0(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.userProperties.remove((String) it.next()));
        }
    }

    @Override // com.qonversion.android.sdk.internal.storage.PropertiesStorage
    @NotNull
    public Map<String, String> getProperties() {
        return AbstractC2640A.Y(this.userProperties);
    }

    @Override // com.qonversion.android.sdk.internal.storage.PropertiesStorage
    public void save(@NotNull String key, @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.userProperties.put(key, value);
    }
}
