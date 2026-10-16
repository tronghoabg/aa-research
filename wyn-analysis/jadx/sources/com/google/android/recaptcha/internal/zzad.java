package com.google.android.recaptcha.internal;

import android.os.Build;
import ef.C2515C;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class zzad implements zzaa {

    @NotNull
    private final zzdc zza;

    public zzad(@NotNull zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 10;
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
        int i5 = Build.VERSION.SDK_INT;
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(String.valueOf(i5));
        zzrjVarZzf.zzd(AbstractC3935e.C(zzrkVarZzf.zzj()));
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
