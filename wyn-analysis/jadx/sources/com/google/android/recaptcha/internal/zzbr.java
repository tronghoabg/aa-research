package com.google.android.recaptcha.internal;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzbr {

    @NotNull
    public static final zzbr zza = new zzbr(9999);

    @NotNull
    public static final zzbr zzb = new zzbr(1004);

    @NotNull
    public static final zzbr zzc = new zzbr(WebSocketProtocol.CLOSE_NO_STATUS_CODE);

    @NotNull
    public static final zzbr zzd = new zzbr(1006);

    @NotNull
    public static final zzbr zze = new zzbr(1007);

    @NotNull
    public static final zzbr zzf = new zzbr(1008);

    @NotNull
    public static final zzbr zzg = new zzbr(1009);

    @NotNull
    public static final zzbr zzh = new zzbr(TTAdConstant.IMAGE_MODE_1010);
    private final int zzi;

    private zzbr(int i5) {
        this.zzi = i5;
    }

    public final int zza() {
        return this.zzi;
    }
}
