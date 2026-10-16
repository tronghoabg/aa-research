package com.qonversion.android.sdk.internal.dto.request;

import com.qonversion.android.sdk.internal.dto.Environment;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0012\u0010\u0015\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/RequestData;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "clientUid", "getClientUid", "debugMode", "getDebugMode", "device", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "getDevice", "()Lcom/qonversion/android/sdk/internal/dto/Environment;", "installDate", "", "getInstallDate", "()J", "receipt", "getReceipt", "version", MobileAdsBridge.versionMethodName, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RequestData {
    @NotNull
    public abstract String getAccessToken();

    @Nullable
    public abstract String getClientUid();

    @NotNull
    public abstract String getDebugMode();

    @NotNull
    public abstract Environment getDevice();

    public abstract long getInstallDate();

    @NotNull
    public abstract String getReceipt();

    @NotNull
    public abstract String getVersion();
}
