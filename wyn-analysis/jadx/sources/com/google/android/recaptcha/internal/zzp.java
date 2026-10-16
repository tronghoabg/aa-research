package com.google.android.recaptcha.internal;

import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2641B;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class zzp implements zzaa {

    @NotNull
    private final zzdc zza;

    @NotNull
    private final zzbl zzb;
    private boolean zzc = true;

    public zzp(@NotNull zzdc zzdcVar, @NotNull zzbl zzblVar) {
        this.zza = zzdcVar;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @NotNull
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) throws MissingResourceException {
        zzbl zzblVar = this.zzb;
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        String strZza = zzblVar.zza();
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
        zzdf zzdfVarZzc = zzab.zzc(this);
        int length = zzpsVar.zzJ().length();
        C2515C c2515c = C2515C.f34653a;
        if (length == 0) {
            this.zzc = false;
            zzdfVarZzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
            return c2515c;
        }
        this.zzb.zzb(AbstractC2641B.E(new C2527k("_GRECAPTCHA_KC", zzpsVar.zzJ())));
        zzdfVarZzc.zza();
        return c2515c;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(@NotNull zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
