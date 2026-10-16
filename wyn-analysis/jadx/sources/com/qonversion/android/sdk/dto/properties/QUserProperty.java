package com.qonversion.android.sdk.dto.properties;

import R8.v;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "(Ljava/lang/String;Ljava/lang/String;)V", "definedKey", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "getDefinedKey", "()Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QUserProperty {

    @NotNull
    private final QUserPropertyKey definedKey;

    @NotNull
    private final String key;

    @NotNull
    private final String value;

    public QUserProperty(@InterfaceC2812o(name = ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) @NotNull String key, @InterfaceC2812o(name = MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.key = key;
        this.value = value;
        this.definedKey = QUserPropertyKey.INSTANCE.fromString$sdk_release(key);
    }

    public static /* synthetic */ QUserProperty copy$default(QUserProperty qUserProperty, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qUserProperty.key;
        }
        if ((i5 & 2) != 0) {
            str2 = qUserProperty.value;
        }
        return qUserProperty.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final QUserProperty copy(@InterfaceC2812o(name = ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) @NotNull String key, @InterfaceC2812o(name = MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        return new QUserProperty(key, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QUserProperty)) {
            return false;
        }
        QUserProperty qUserProperty = (QUserProperty) other;
        return AbstractC3340k.a(this.key, qUserProperty.key) && AbstractC3340k.a(this.value, qUserProperty.value);
    }

    @NotNull
    public final QUserPropertyKey getDefinedKey() {
        return this.definedKey;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return v.g("QUserProperty(key=", this.key, ", value=", this.value, ")");
    }
}
