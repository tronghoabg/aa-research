package com.qonversion.android.sdk.internal.dto;

import R8.v;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import hb.InterfaceC2812o;
import hb.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "", "savedProperties", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "propertyErrors", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;", "(Ljava/util/List;Ljava/util/List;)V", "getPropertyErrors", "()Ljava/util/List;", "getSavedProperties", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PropertyError", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SendPropertiesResult {

    @NotNull
    private final List<PropertyError> propertyErrors;

    @NotNull
    private final List<QUserProperty> savedProperties;

    @s(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PropertyError {

        @NotNull
        private final String error;

        @NotNull
        private final String key;

        public PropertyError(@InterfaceC2812o(name = ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) @NotNull String key, @InterfaceC2812o(name = "error") @NotNull String error) {
            AbstractC3340k.e(key, "key");
            AbstractC3340k.e(error, "error");
            this.key = key;
            this.error = error;
        }

        public static /* synthetic */ PropertyError copy$default(PropertyError propertyError, String str, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = propertyError.key;
            }
            if ((i5 & 2) != 0) {
                str2 = propertyError.error;
            }
            return propertyError.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final PropertyError copy(@InterfaceC2812o(name = ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) @NotNull String key, @InterfaceC2812o(name = "error") @NotNull String error) {
            AbstractC3340k.e(key, "key");
            AbstractC3340k.e(error, "error");
            return new PropertyError(key, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropertyError)) {
                return false;
            }
            PropertyError propertyError = (PropertyError) other;
            return AbstractC3340k.a(this.key, propertyError.key) && AbstractC3340k.a(this.error, propertyError.error);
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.error.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return v.g("PropertyError(key=", this.key, ", error=", this.error, ")");
        }
    }

    public SendPropertiesResult(@InterfaceC2812o(name = "savedProperties") @NotNull List<QUserProperty> savedProperties, @InterfaceC2812o(name = "propertyErrors") @NotNull List<PropertyError> propertyErrors) {
        AbstractC3340k.e(savedProperties, "savedProperties");
        AbstractC3340k.e(propertyErrors, "propertyErrors");
        this.savedProperties = savedProperties;
        this.propertyErrors = propertyErrors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendPropertiesResult copy$default(SendPropertiesResult sendPropertiesResult, List list, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = sendPropertiesResult.savedProperties;
        }
        if ((i5 & 2) != 0) {
            list2 = sendPropertiesResult.propertyErrors;
        }
        return sendPropertiesResult.copy(list, list2);
    }

    @NotNull
    public final List<QUserProperty> component1() {
        return this.savedProperties;
    }

    @NotNull
    public final List<PropertyError> component2() {
        return this.propertyErrors;
    }

    @NotNull
    public final SendPropertiesResult copy(@InterfaceC2812o(name = "savedProperties") @NotNull List<QUserProperty> savedProperties, @InterfaceC2812o(name = "propertyErrors") @NotNull List<PropertyError> propertyErrors) {
        AbstractC3340k.e(savedProperties, "savedProperties");
        AbstractC3340k.e(propertyErrors, "propertyErrors");
        return new SendPropertiesResult(savedProperties, propertyErrors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendPropertiesResult)) {
            return false;
        }
        SendPropertiesResult sendPropertiesResult = (SendPropertiesResult) other;
        return AbstractC3340k.a(this.savedProperties, sendPropertiesResult.savedProperties) && AbstractC3340k.a(this.propertyErrors, sendPropertiesResult.propertyErrors);
    }

    @NotNull
    public final List<PropertyError> getPropertyErrors() {
        return this.propertyErrors;
    }

    @NotNull
    public final List<QUserProperty> getSavedProperties() {
        return this.savedProperties;
    }

    public int hashCode() {
        return this.propertyErrors.hashCode() + (this.savedProperties.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SendPropertiesResult(savedProperties=" + this.savedProperties + ", propertyErrors=" + this.propertyErrors + ")";
    }
}
