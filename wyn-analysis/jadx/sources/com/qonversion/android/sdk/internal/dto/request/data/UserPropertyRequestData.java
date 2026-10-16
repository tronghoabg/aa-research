package com.qonversion.android.sdk.internal.dto.request.data;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserPropertyRequestData {

    @NotNull
    private final String key;

    @NotNull
    private final String value;

    public UserPropertyRequestData(@InterfaceC2812o(name = ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) @NotNull String key, @InterfaceC2812o(name = MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ UserPropertyRequestData copy$default(UserPropertyRequestData userPropertyRequestData, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = userPropertyRequestData.key;
        }
        if ((i5 & 2) != 0) {
            str2 = userPropertyRequestData.value;
        }
        return userPropertyRequestData.copy(str, str2);
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
    public final UserPropertyRequestData copy(@InterfaceC2812o(name = ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) @NotNull String key, @InterfaceC2812o(name = MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        return new UserPropertyRequestData(key, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPropertyRequestData)) {
            return false;
        }
        UserPropertyRequestData userPropertyRequestData = (UserPropertyRequestData) other;
        return AbstractC3340k.a(this.key, userPropertyRequestData.key) && AbstractC3340k.a(this.value, userPropertyRequestData.value);
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
        return v.g("UserPropertyRequestData(key=", this.key, ", value=", this.value, ")");
    }
}
