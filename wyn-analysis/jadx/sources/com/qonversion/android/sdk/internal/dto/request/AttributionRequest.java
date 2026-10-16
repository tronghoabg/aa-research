package com.qonversion.android.sdk.internal.dto.request;

import N0.a;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.ProviderData;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "", "d", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "v", "", "accessToken", "providerData", "Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "clientUid", "(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getClientUid", "setClientUid", "(Ljava/lang/String;)V", "getD", "()Lcom/qonversion/android/sdk/internal/dto/Environment;", "getProviderData", "()Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "getV", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AttributionRequest {

    @NotNull
    private final String accessToken;

    @Nullable
    private String clientUid;

    @NotNull
    private final Environment d;

    @NotNull
    private final ProviderData providerData;

    @NotNull
    private final String v;

    public AttributionRequest(@InterfaceC2812o(name = "d") @NotNull Environment d3, @InterfaceC2812o(name = "v") @NotNull String v2, @InterfaceC2812o(name = "access_token") @NotNull String accessToken, @InterfaceC2812o(name = "provider_data") @NotNull ProviderData providerData, @InterfaceC2812o(name = "client_uid") @Nullable String str) {
        AbstractC3340k.e(d3, "d");
        AbstractC3340k.e(v2, "v");
        AbstractC3340k.e(accessToken, "accessToken");
        AbstractC3340k.e(providerData, "providerData");
        this.d = d3;
        this.v = v2;
        this.accessToken = accessToken;
        this.providerData = providerData;
        this.clientUid = str;
    }

    public static /* synthetic */ AttributionRequest copy$default(AttributionRequest attributionRequest, Environment environment, String str, String str2, ProviderData providerData, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            environment = attributionRequest.d;
        }
        if ((i5 & 2) != 0) {
            str = attributionRequest.v;
        }
        if ((i5 & 4) != 0) {
            str2 = attributionRequest.accessToken;
        }
        if ((i5 & 8) != 0) {
            providerData = attributionRequest.providerData;
        }
        if ((i5 & 16) != 0) {
            str3 = attributionRequest.clientUid;
        }
        String str4 = str3;
        String str5 = str2;
        return attributionRequest.copy(environment, str, str5, providerData, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Environment getD() {
        return this.d;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getV() {
        return this.v;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProviderData getProviderData() {
        return this.providerData;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    @NotNull
    public final AttributionRequest copy(@InterfaceC2812o(name = "d") @NotNull Environment d3, @InterfaceC2812o(name = "v") @NotNull String v2, @InterfaceC2812o(name = "access_token") @NotNull String accessToken, @InterfaceC2812o(name = "provider_data") @NotNull ProviderData providerData, @InterfaceC2812o(name = "client_uid") @Nullable String clientUid) {
        AbstractC3340k.e(d3, "d");
        AbstractC3340k.e(v2, "v");
        AbstractC3340k.e(accessToken, "accessToken");
        AbstractC3340k.e(providerData, "providerData");
        return new AttributionRequest(d3, v2, accessToken, providerData, clientUid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributionRequest)) {
            return false;
        }
        AttributionRequest attributionRequest = (AttributionRequest) other;
        return AbstractC3340k.a(this.d, attributionRequest.d) && AbstractC3340k.a(this.v, attributionRequest.v) && AbstractC3340k.a(this.accessToken, attributionRequest.accessToken) && AbstractC3340k.a(this.providerData, attributionRequest.providerData) && AbstractC3340k.a(this.clientUid, attributionRequest.clientUid);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getClientUid() {
        return this.clientUid;
    }

    @NotNull
    public final Environment getD() {
        return this.d;
    }

    @NotNull
    public final ProviderData getProviderData() {
        return this.providerData;
    }

    @NotNull
    public final String getV() {
        return this.v;
    }

    public int hashCode() {
        int iHashCode = (this.providerData.hashCode() + a.c(a.c(this.d.hashCode() * 31, 31, this.v), 31, this.accessToken)) * 31;
        String str = this.clientUid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setClientUid(@Nullable String str) {
        this.clientUid = str;
    }

    @NotNull
    public String toString() {
        Environment environment = this.d;
        String str = this.v;
        String str2 = this.accessToken;
        ProviderData providerData = this.providerData;
        String str3 = this.clientUid;
        StringBuilder sb2 = new StringBuilder("AttributionRequest(d=");
        sb2.append(environment);
        sb2.append(", v=");
        sb2.append(str);
        sb2.append(", accessToken=");
        sb2.append(str2);
        sb2.append(", providerData=");
        sb2.append(providerData);
        sb2.append(", clientUid=");
        return b.c(sb2, str3, ")");
    }
}
