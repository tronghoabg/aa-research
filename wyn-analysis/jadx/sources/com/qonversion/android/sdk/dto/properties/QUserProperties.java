package com.qonversion.android.sdk.dto.properties;

import ff.AbstractC2641B;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\rJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\rHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b¨\u0006!"}, d2 = {"Lcom/qonversion/android/sdk/dto/properties/QUserProperties;", "", "properties", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "(Ljava/util/List;)V", "customProperties", "getCustomProperties", "()Ljava/util/List;", "definedProperties", "getDefinedProperties", "flatCustomPropertiesMap", "", "", "getFlatCustomPropertiesMap", "()Ljava/util/Map;", "flatDefinedPropertiesMap", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "getFlatDefinedPropertiesMap", "flatPropertiesMap", "getFlatPropertiesMap", "getProperties", "component1", "copy", "equals", "", "other", "getDefinedProperty", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "getProperty", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QUserProperties {

    @NotNull
    private final List<QUserProperty> customProperties;

    @NotNull
    private final List<QUserProperty> definedProperties;

    @NotNull
    private final Map<String, String> flatCustomPropertiesMap;

    @NotNull
    private final Map<QUserPropertyKey, String> flatDefinedPropertiesMap;

    @NotNull
    private final Map<String, String> flatPropertiesMap;

    @NotNull
    private final List<QUserProperty> properties;

    public QUserProperties(@NotNull List<QUserProperty> properties) {
        AbstractC3340k.e(properties, "properties");
        this.properties = properties;
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (((QUserProperty) obj).getDefinedKey() != QUserPropertyKey.Custom) {
                arrayList.add(obj);
            }
        }
        this.definedProperties = arrayList;
        List<QUserProperty> list = this.properties;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((QUserProperty) obj2).getDefinedKey() == QUserPropertyKey.Custom) {
                arrayList2.add(obj2);
            }
        }
        this.customProperties = arrayList2;
        List<QUserProperty> list2 = this.properties;
        int iD = AbstractC2641B.D(p.a0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD < 16 ? 16 : iD);
        for (QUserProperty qUserProperty : list2) {
            linkedHashMap.put(qUserProperty.getKey(), qUserProperty.getValue());
        }
        this.flatPropertiesMap = linkedHashMap;
        List<QUserProperty> list3 = this.definedProperties;
        int iD2 = AbstractC2641B.D(p.a0(list3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD2 < 16 ? 16 : iD2);
        for (QUserProperty qUserProperty2 : list3) {
            linkedHashMap2.put(qUserProperty2.getDefinedKey(), qUserProperty2.getValue());
        }
        this.flatDefinedPropertiesMap = linkedHashMap2;
        List<QUserProperty> list4 = this.customProperties;
        int iD3 = AbstractC2641B.D(p.a0(list4, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iD3 >= 16 ? iD3 : 16);
        for (QUserProperty qUserProperty3 : list4) {
            linkedHashMap3.put(qUserProperty3.getKey(), qUserProperty3.getValue());
        }
        this.flatCustomPropertiesMap = linkedHashMap3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QUserProperties copy$default(QUserProperties qUserProperties, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = qUserProperties.properties;
        }
        return qUserProperties.copy(list);
    }

    @NotNull
    public final List<QUserProperty> component1() {
        return this.properties;
    }

    @NotNull
    public final QUserProperties copy(@NotNull List<QUserProperty> properties) {
        AbstractC3340k.e(properties, "properties");
        return new QUserProperties(properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QUserProperties) && AbstractC3340k.a(this.properties, ((QUserProperties) other).properties);
    }

    @NotNull
    public final List<QUserProperty> getCustomProperties() {
        return this.customProperties;
    }

    @NotNull
    public final List<QUserProperty> getDefinedProperties() {
        return this.definedProperties;
    }

    @Nullable
    public final QUserProperty getDefinedProperty(@NotNull QUserPropertyKey key) {
        Object next;
        AbstractC3340k.e(key, "key");
        Iterator<T> it = this.definedProperties.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((QUserProperty) next).getDefinedKey() == key) {
                break;
            }
        }
        return (QUserProperty) next;
    }

    @NotNull
    public final Map<String, String> getFlatCustomPropertiesMap() {
        return this.flatCustomPropertiesMap;
    }

    @NotNull
    public final Map<QUserPropertyKey, String> getFlatDefinedPropertiesMap() {
        return this.flatDefinedPropertiesMap;
    }

    @NotNull
    public final Map<String, String> getFlatPropertiesMap() {
        return this.flatPropertiesMap;
    }

    @NotNull
    public final List<QUserProperty> getProperties() {
        return this.properties;
    }

    @Nullable
    public final QUserProperty getProperty(@NotNull String key) {
        Object next;
        AbstractC3340k.e(key, "key");
        Iterator<T> it = this.properties.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC3340k.a(((QUserProperty) next).getKey(), key)) {
                break;
            }
        }
        return (QUserProperty) next;
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @NotNull
    public String toString() {
        return "QUserProperties(properties=" + this.properties + ")";
    }
}
