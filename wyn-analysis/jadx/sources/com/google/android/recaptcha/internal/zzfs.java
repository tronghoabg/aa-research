package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzfs implements zzfe {

    @NotNull
    public static final zzfs zza = new zzfs();

    private zzfs() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        zzekVar.zzc().zze(i5, zzekVar.zzc().zza(zzrrVarArr[0]));
    }
}
