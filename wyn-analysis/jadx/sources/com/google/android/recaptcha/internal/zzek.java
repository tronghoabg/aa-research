package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzek {
    public zzbt zza;

    @NotNull
    private final zzem zzb;
    private int zzd;

    @NotNull
    private final zzel zze;

    @NotNull
    private final zzed zzg;

    @NotNull
    private final zzcb zzh;

    @NotNull
    private String zzc = "recaptcha.m.Main.rge";

    @NotNull
    private final zzbt zzf = new zzbt();

    public zzek(@NotNull zzem zzemVar) {
        this.zzb = zzemVar;
        this.zze = zzemVar.zza();
        this.zzg = zzemVar.zzd();
        this.zzh = zzemVar.zzc();
    }

    public final int zza() {
        return this.zzd;
    }

    @NotNull
    public final zzbt zzb() {
        return this.zzf;
    }

    @NotNull
    public final zzel zzc() {
        return this.zze;
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    public final void zze() {
        this.zzb.zzb();
    }

    public final void zzf(@NotNull String str) {
        this.zzc = str;
    }

    public final void zzg(int i5) {
        this.zzd = i5;
    }

    @NotNull
    public final zzcb zzh() {
        return this.zzh;
    }

    @NotNull
    public final zzed zzi() {
        return this.zzg;
    }
}
