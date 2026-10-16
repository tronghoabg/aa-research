package com.google.android.recaptcha.internal;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzdc {

    @NotNull
    private final String zza;

    @NotNull
    private String zzb;

    @NotNull
    private String zzc;

    @NotNull
    private final Context zzd;

    @NotNull
    private final zzdg zze;

    @Nullable
    private String zzf;

    @Nullable
    private Integer zzg;

    private zzdc(String str, String str2, String str3, Context context, zzdg zzdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = context;
        this.zze = zzdgVar;
    }

    @NotNull
    public final zzdc zza() {
        return new zzdc(this);
    }

    @NotNull
    public final zzdc zzb(int i5) {
        this.zzg = Integer.valueOf(i5);
        return this;
    }

    @NotNull
    public final zzdc zzc(@NotNull String str) {
        this.zzf = str;
        return this;
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    public final void zze(@NotNull zzre zzreVar) {
        this.zze.zza(zzreVar);
    }

    @NotNull
    public final zzdf zzf(@NotNull int i5) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzbw zzbwVar = new zzbw();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzdf(i5, this.zza, str, str2, str3, null, this.zze, zzbwVar, context, num);
    }

    public /* synthetic */ zzdc(String str, String str2, String str3, Context context, zzdg zzdgVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, context, zzdgVar);
    }

    private zzdc(zzdc zzdcVar) {
        this(zzdcVar.zza, zzdcVar.zzb, zzdcVar.zzc, zzdcVar.zzd, zzdcVar.zze);
        this.zzf = zzdcVar.zzf;
        this.zzg = zzdcVar.zzg;
    }
}
