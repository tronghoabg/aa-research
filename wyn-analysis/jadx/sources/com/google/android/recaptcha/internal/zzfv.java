package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzfv implements zzfe {

    @NotNull
    public static final zzfv zza = new zzfv();

    private zzfv() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby, IllegalAccessException, IllegalArgumentException {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzby(4, 5, null);
        }
        try {
            field.set(null, zzekVar.zzc().zza(zzrrVarArr[1]));
        } catch (Exception e7) {
            throw new zzby(6, 11, e7);
        }
    }
}
