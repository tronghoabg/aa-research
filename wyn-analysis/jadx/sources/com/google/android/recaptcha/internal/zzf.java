package com.google.android.recaptcha.internal;

import Ef.L0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzf {
    @NotNull
    public static final zzbj zza(@NotNull Exception exc, @NotNull zzbj zzbjVar) {
        return exc instanceof L0 ? new zzbj(zzbh.zzb, zzbg.zzb, null) : exc instanceof zzbj ? (zzbj) exc : zzbjVar;
    }
}
