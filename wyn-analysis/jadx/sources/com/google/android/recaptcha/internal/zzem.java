package com.google.android.recaptcha.internal;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzem {

    @NotNull
    private final zzel zza;

    @NotNull
    private final HashMap zzb;

    @NotNull
    private final zzed zzc;

    @NotNull
    private final zzcb zzd;

    public zzem(@NotNull zzed zzedVar, @NotNull zzcb zzcbVar, @NotNull zzbu zzbuVar) {
        this.zzc = zzedVar;
        this.zzd = zzcbVar;
        zzel zzelVar = new zzel();
        this.zza = zzelVar;
        HashMap map = new HashMap();
        this.zzb = map;
        zzelVar.zzd(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, map);
    }

    @NotNull
    public final zzel zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, this.zzb);
    }

    @NotNull
    public final zzcb zzc() {
        return this.zzd;
    }

    @NotNull
    public final zzed zzd() {
        return this.zzc;
    }

    public final void zze(@NotNull int i5, @NotNull Object obj) {
        this.zzb.put(Integer.valueOf(i5 - 2), obj);
    }
}
