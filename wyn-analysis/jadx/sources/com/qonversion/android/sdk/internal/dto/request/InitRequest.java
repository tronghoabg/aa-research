package com.qonversion.android.sdk.internal.dto.request;

import N0.a;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.purchase.Inapp;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import hb.InterfaceC2812o;
import hb.s;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;", "Lcom/qonversion/android/sdk/internal/dto/request/RequestData;", "installDate", "", "device", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "version", "", "accessToken", "clientUid", "receipt", "debugMode", "purchases", "", "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;", "(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccessToken", "()Ljava/lang/String;", "getClientUid", "getDebugMode", "getDevice", "()Lcom/qonversion/android/sdk/internal/dto/Environment;", "getInstallDate", "()J", "getPurchases", "()Ljava/util/List;", "getReceipt", MobileAdsBridge.versionMethodName, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InitRequest extends RequestData {

    @NotNull
    private final String accessToken;

    @Nullable
    private final String clientUid;

    @NotNull
    private final String debugMode;

    @NotNull
    private final Environment device;
    private final long installDate;

    @Nullable
    private final List<Inapp> purchases;

    @NotNull
    private final String receipt;

    @NotNull
    private final String version;

    public /* synthetic */ InitRequest(long j8, Environment environment, String str, String str2, String str3, String str4, String str5, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j8, environment, str, str2, str3, (i5 & 32) != 0 ? "" : str4, str5, (i5 & 128) != 0 ? null : list);
    }

    public static /* synthetic */ InitRequest copy$default(InitRequest initRequest, long j8, Environment environment, String str, String str2, String str3, String str4, String str5, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j8 = initRequest.installDate;
        }
        long j10 = j8;
        if ((i5 & 2) != 0) {
            environment = initRequest.device;
        }
        Environment environment2 = environment;
        if ((i5 & 4) != 0) {
            str = initRequest.version;
        }
        String str6 = str;
        if ((i5 & 8) != 0) {
            str2 = initRequest.accessToken;
        }
        return initRequest.copy(j10, environment2, str6, str2, (i5 & 16) != 0 ? initRequest.clientUid : str3, (i5 & 32) != 0 ? initRequest.receipt : str4, (i5 & 64) != 0 ? initRequest.debugMode : str5, (i5 & 128) != 0 ? initRequest.purchases : list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getInstallDate() {
        return this.installDate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Environment getDevice() {
        return this.device;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getReceipt() {
        return this.receipt;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDebugMode() {
        return this.debugMode;
    }

    @Nullable
    public final List<Inapp> component8() {
        return this.purchases;
    }

    @NotNull
    public final InitRequest copy(@InterfaceC2812o(name = "install_date") long installDate, @InterfaceC2812o(name = "device") @NotNull Environment device, @InterfaceC2812o(name = "version") @NotNull String version, @InterfaceC2812o(name = "access_token") @NotNull String accessToken, @InterfaceC2812o(name = "q_uid") @Nullable String clientUid, @InterfaceC2812o(name = "receipt") @NotNull String receipt, @InterfaceC2812o(name = "debug_mode") @NotNull String debugMode, @InterfaceC2812o(name = "purchases") @Nullable List<Inapp> purchases) {
        AbstractC3340k.e(device, "device");
        AbstractC3340k.e(version, "version");
        AbstractC3340k.e(accessToken, "accessToken");
        AbstractC3340k.e(receipt, "receipt");
        AbstractC3340k.e(debugMode, "debugMode");
        return new InitRequest(installDate, device, version, accessToken, clientUid, receipt, debugMode, purchases);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitRequest)) {
            return false;
        }
        InitRequest initRequest = (InitRequest) other;
        return this.installDate == initRequest.installDate && AbstractC3340k.a(this.device, initRequest.device) && AbstractC3340k.a(this.version, initRequest.version) && AbstractC3340k.a(this.accessToken, initRequest.accessToken) && AbstractC3340k.a(this.clientUid, initRequest.clientUid) && AbstractC3340k.a(this.receipt, initRequest.receipt) && AbstractC3340k.a(this.debugMode, initRequest.debugMode) && AbstractC3340k.a(this.purchases, initRequest.purchases);
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    @NotNull
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    @Nullable
    public String getClientUid() {
        return this.clientUid;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    @NotNull
    public String getDebugMode() {
        return this.debugMode;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    @NotNull
    public Environment getDevice() {
        return this.device;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public long getInstallDate() {
        return this.installDate;
    }

    @Nullable
    public final List<Inapp> getPurchases() {
        return this.purchases;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    @NotNull
    public String getReceipt() {
        return this.receipt;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    @NotNull
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        long j8 = this.installDate;
        int iC = a.c(a.c((this.device.hashCode() + (((int) (j8 ^ (j8 >>> 32))) * 31)) * 31, 31, this.version), 31, this.accessToken);
        String str = this.clientUid;
        int iC2 = a.c(a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.receipt), 31, this.debugMode);
        List<Inapp> list = this.purchases;
        return iC2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j8 = this.installDate;
        Environment environment = this.device;
        String str = this.version;
        String str2 = this.accessToken;
        String str3 = this.clientUid;
        String str4 = this.receipt;
        String str5 = this.debugMode;
        List<Inapp> list = this.purchases;
        StringBuilder sb2 = new StringBuilder("InitRequest(installDate=");
        sb2.append(j8);
        sb2.append(", device=");
        sb2.append(environment);
        AbstractC3256n.p(sb2, ", version=", str, ", accessToken=", str2);
        AbstractC3256n.p(sb2, ", clientUid=", str3, ", receipt=", str4);
        sb2.append(", debugMode=");
        sb2.append(str5);
        sb2.append(", purchases=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    public InitRequest(@InterfaceC2812o(name = "install_date") long j8, @InterfaceC2812o(name = "device") @NotNull Environment device, @InterfaceC2812o(name = "version") @NotNull String version, @InterfaceC2812o(name = "access_token") @NotNull String accessToken, @InterfaceC2812o(name = "q_uid") @Nullable String str, @InterfaceC2812o(name = "receipt") @NotNull String receipt, @InterfaceC2812o(name = "debug_mode") @NotNull String debugMode, @InterfaceC2812o(name = "purchases") @Nullable List<Inapp> list) {
        AbstractC3340k.e(device, "device");
        AbstractC3340k.e(version, "version");
        AbstractC3340k.e(accessToken, "accessToken");
        AbstractC3340k.e(receipt, "receipt");
        AbstractC3340k.e(debugMode, "debugMode");
        this.installDate = j8;
        this.device = device;
        this.version = version;
        this.accessToken = accessToken;
        this.clientUid = str;
        this.receipt = receipt;
        this.debugMode = debugMode;
        this.purchases = list;
    }
}
