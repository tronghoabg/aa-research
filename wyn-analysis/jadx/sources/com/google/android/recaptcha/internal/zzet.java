package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzet implements zzfe {

    @NotNull
    public static final zzet zza = new zzet();

    private zzet() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        boolean z2 = true;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzekVar.zzh().zza((String) objZza);
                }
                zzel zzelVarZzc = zzekVar.zzc();
                try {
                    zzej.zza(objZza);
                } catch (zzby e7) {
                    if (e7.zzb() == 8 || e7.zzb() == 6) {
                        z2 = false;
                    } else if (e7.zzb() != 47) {
                        throw e7;
                    }
                }
                zzelVarZzc.zze(i5, Boolean.valueOf(z2));
            } catch (Exception e10) {
                throw new zzby(6, 8, e10);
            }
        } catch (zzby e11) {
            throw e11;
        }
    }
}
