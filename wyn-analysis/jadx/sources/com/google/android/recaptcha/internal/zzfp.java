package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzfp implements zzfe {

    @NotNull
    public static final zzfp zza = new zzfp();

    private zzfp() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        Object array;
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
        if (objZza instanceof Integer) {
            array = Integer.valueOf(((Number) objZza).intValue() * iIntValue);
        } else {
            if (!(objZza instanceof int[])) {
                throw new zzby(4, 5, null);
            }
            int[] iArr = (int[]) objZza;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList.add(Integer.valueOf(i10 * iIntValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzekVar.zzc().zze(i5, array);
    }
}
