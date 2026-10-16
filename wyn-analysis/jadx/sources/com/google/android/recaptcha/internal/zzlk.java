package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes4.dex */
final class zzlk {
    public static final List zza(Object obj, long j8) {
        zzkz zzkzVar = (zzkz) zzni.zzf(obj, j8);
        if (zzkzVar.zzc()) {
            return zzkzVar;
        }
        int size = zzkzVar.size();
        zzkz zzkzVarZzd = zzkzVar.zzd(size == 0 ? 10 : size + size);
        zzni.zzs(obj, j8, zzkzVarZzd);
        return zzkzVarZzd;
    }
}
