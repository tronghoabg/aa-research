package com.google.android.recaptcha.internal;

import android.os.Build;
import ef.C2515C;
import ff.m;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class zzn implements zzaa {

    @NotNull
    private final zzdc zza;

    public zzn(@NotNull zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    private static final zzrl zzg(String str) {
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(str);
        return (zzrl) zzrkVarZzf.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @NotNull
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) throws MissingResourceException {
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrjVarZzf.zzd(AbstractC3935e.D(zzg(Build.MANUFACTURER), zzg(Build.MODEL), zzg(Build.DEVICE), zzg(Build.HARDWARE), zzg(Build.FINGERPRINT), zzg(Build.PRODUCT), zzg(Build.BOARD), zzg(Build.BRAND), zzg(m.A0(Build.SUPPORTED_ABIS, ",", "[", "]", null, 56))));
        zzdfVarZzb.zza();
        return zzab.zza(this, (zzrm) zzrjVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @Nullable
    public final Object zzd(@NotNull zzps zzpsVar, @NotNull InterfaceC3103c interfaceC3103c) throws MissingResourceException {
        zzab.zzc(this).zza();
        return C2515C.f34653a;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(@NotNull zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
