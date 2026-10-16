package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzfb implements zzfe {

    @NotNull
    public static final zzfb zza = new zzfb();

    private zzfb() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objZza = zzekVar.zzh().zza((String) objZza);
            }
            zzekVar.zzc().zze(i5, Array.newInstance((Class<?>) zzej.zza(objZza), iIntValue));
        } catch (Exception e7) {
            throw new zzby(6, 21, e7);
        }
    }
}
