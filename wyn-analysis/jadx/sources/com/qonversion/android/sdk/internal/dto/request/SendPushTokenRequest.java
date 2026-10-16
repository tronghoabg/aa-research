package com.qonversion.android.sdk.internal.dto.request;

import A7.AbstractC0279p0;
import N0.a;
import hb.InterfaceC2812o;
import hb.s;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;", "", "accessToken", "", "clientUid", "deviceId", "pushToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getClientUid", "getDeviceId", "getPushToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SendPushTokenRequest {

    @NotNull
    private final String accessToken;

    @Nullable
    private final String clientUid;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String pushToken;

    public SendPushTokenRequest(@InterfaceC2812o(name = "access_token") @NotNull String accessToken, @InterfaceC2812o(name = "q_uid") @Nullable String str, @InterfaceC2812o(name = "device_id") @NotNull String deviceId, @InterfaceC2812o(name = "push_token") @NotNull String pushToken) {
        AbstractC3340k.e(accessToken, "accessToken");
        AbstractC3340k.e(deviceId, "deviceId");
        AbstractC3340k.e(pushToken, "pushToken");
        this.accessToken = accessToken;
        this.clientUid = str;
        this.deviceId = deviceId;
        this.pushToken = pushToken;
    }

    public static /* synthetic */ SendPushTokenRequest copy$default(SendPushTokenRequest sendPushTokenRequest, String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = sendPushTokenRequest.accessToken;
        }
        if ((i5 & 2) != 0) {
            str2 = sendPushTokenRequest.clientUid;
        }
        if ((i5 & 4) != 0) {
            str3 = sendPushTokenRequest.deviceId;
        }
        if ((i5 & 8) != 0) {
            str4 = sendPushTokenRequest.pushToken;
        }
        return sendPushTokenRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    @NotNull
    public final SendPushTokenRequest copy(@InterfaceC2812o(name = "access_token") @NotNull String accessToken, @InterfaceC2812o(name = "q_uid") @Nullable String clientUid, @InterfaceC2812o(name = "device_id") @NotNull String deviceId, @InterfaceC2812o(name = "push_token") @NotNull String pushToken) {
        AbstractC3340k.e(accessToken, "accessToken");
        AbstractC3340k.e(deviceId, "deviceId");
        AbstractC3340k.e(pushToken, "pushToken");
        return new SendPushTokenRequest(accessToken, clientUid, deviceId, pushToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendPushTokenRequest)) {
            return false;
        }
        SendPushTokenRequest sendPushTokenRequest = (SendPushTokenRequest) other;
        return AbstractC3340k.a(this.accessToken, sendPushTokenRequest.accessToken) && AbstractC3340k.a(this.clientUid, sendPushTokenRequest.clientUid) && AbstractC3340k.a(this.deviceId, sendPushTokenRequest.deviceId) && AbstractC3340k.a(this.pushToken, sendPushTokenRequest.pushToken);
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
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getPushToken() {
        return this.pushToken;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        String str = this.clientUid;
        return this.pushToken.hashCode() + a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.deviceId);
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.clientUid;
        return AbstractC3256n.h(AbstractC0279p0.r("SendPushTokenRequest(accessToken=", str, ", clientUid=", str2, ", deviceId="), this.deviceId, ", pushToken=", this.pushToken, ")");
    }
}
