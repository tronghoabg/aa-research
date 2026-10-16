package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import ef.C2515C;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class zzm implements zzaa {

    @NotNull
    private final zzdc zza;

    @NotNull
    private final ContentResolver zzb;

    public zzm(@NotNull zzdc zzdcVar, @NotNull ContentResolver contentResolver) {
        this.zza = zzdcVar;
        this.zzb = contentResolver;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @NotNull
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) throws MissingResourceException {
        ContentResolver contentResolver = this.zzb;
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        String strZza = zzau.zza(contentResolver);
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(strZza);
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
