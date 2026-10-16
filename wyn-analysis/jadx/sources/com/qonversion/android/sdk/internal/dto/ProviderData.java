package com.qonversion.android.sdk.internal.dto;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "", JsonStorageKeyNames.DATA_KEY, "", "", "provider", "(Ljava/util/Map;Ljava/lang/String;)V", "getData", "()Ljava/util/Map;", "getProvider", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProviderData {

    @NotNull
    private final Map<String, Object> data;

    @NotNull
    private final String provider;

    public ProviderData(@InterfaceC2812o(name = "d") @NotNull Map<String, ? extends Object> data, @InterfaceC2812o(name = "provider") @NotNull String provider) {
        AbstractC3340k.e(data, "data");
        AbstractC3340k.e(provider, "provider");
        this.data = data;
        this.provider = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProviderData copy$default(ProviderData providerData, Map map, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            map = providerData.data;
        }
        if ((i5 & 2) != 0) {
            str = providerData.provider;
        }
        return providerData.copy(map, str);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    @NotNull
    public final ProviderData copy(@InterfaceC2812o(name = "d") @NotNull Map<String, ? extends Object> data, @InterfaceC2812o(name = "provider") @NotNull String provider) {
        AbstractC3340k.e(data, "data");
        AbstractC3340k.e(provider, "provider");
        return new ProviderData(data, provider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderData)) {
            return false;
        }
        ProviderData providerData = (ProviderData) other;
        return AbstractC3340k.a(this.data, providerData.data) && AbstractC3340k.a(this.provider, providerData.provider);
    }

    @NotNull
    public final Map<String, Object> getData() {
        return this.data;
    }

    @NotNull
    public final String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return this.provider.hashCode() + (this.data.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProviderData(data=" + this.data + ", provider=" + this.provider + ")";
    }
}
