package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzab {
    @NotNull
    public static final zzac zza(@NotNull zzaa zzaaVar, @NotNull zzrm zzrmVar) {
        zzrj zzrjVar = (zzrj) zzrmVar.zzq();
        zzrjVar.zzp(zzaaVar.zza());
        return new zzz(zzaaVar.zza(), (zzrm) zzrjVar.zzj());
    }

    @NotNull
    public static final zzdf zzb(@NotNull zzaa zzaaVar, @NotNull String str) {
        zzdc zzdcVarZzb = zzaaVar.zzb();
        zzdcVarZzb.zzc(str);
        zzdcVarZzb.zzb(zzaaVar.zza());
        return zzdcVarZzb.zzf(37);
    }

    @NotNull
    public static final zzdf zzc(@NotNull zzaa zzaaVar) {
        zzdc zzdcVarZzb = zzaaVar.zzb();
        zzdcVarZzb.zzc(zzaaVar.zzb().zzd());
        zzdcVarZzb.zzb(zzaaVar.zza());
        return zzdcVarZzb.zzf(36);
    }
}
