package com.google.android.recaptcha.internal;

import ff.o;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzgg implements zzge {

    @NotNull
    private final zzgf zza;

    public zzgg(@NotNull zzgf zzgfVar, @NotNull zzgd zzgdVar) {
        this.zza = zzgfVar;
    }

    private final zzrg zzb(String str, List list) throws zzby {
        if (str.length() == 0) {
            throw new zzby(3, 17, null);
        }
        try {
            zzgc zzgcVar = new zzgc(this.zza.zza(o.T0(list)), 255L, zzgc.zza);
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i5 = 0; i5 < str.length(); i5++) {
                sb2.append((char) (str.charAt(i5) ^ ((int) zzgcVar.zza())));
            }
            return zzrg.zzg(zzhz.zzh().zzj(sb2.toString()));
        } catch (Exception e7) {
            throw new zzby(3, 18, e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzge
    @NotNull
    public final zzrg zza(@NotNull zzro zzroVar) throws zzby {
        zzgz zzgzVarZzb = zzgz.zzb();
        zzrg zzrgVarZzb = zzb(zzroVar.zzj(), zzroVar.zzk());
        zzgzVarZzb.zzf();
        long jZza = zzgzVarZzb.zza(TimeUnit.MICROSECONDS);
        int i5 = zzbq.zza;
        zzbq.zza(zzbr.zzh.zza(), jZza);
        return zzrgVarZzb;
    }
}
