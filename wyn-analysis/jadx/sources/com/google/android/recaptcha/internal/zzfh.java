package com.google.android.recaptcha.internal;

import ff.m;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzfh implements zzfe {

    @NotNull
    public static final zzfh zza = new zzfh();

    private zzfh() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzby(4, 5, null);
        }
        Class[] clsArrZzf = zzekVar.zzc().zzf(m.L0(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i5, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e7) {
            throw new zzby(6, 9, e7);
        }
    }
}
