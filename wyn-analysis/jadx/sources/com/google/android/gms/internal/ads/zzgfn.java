package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgfn {
    private final ExecutorService zza;

    public zzgfn(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzgfe zza(File file, zzifz zzifzVar, zzgti zzgtiVar) {
        return new zzgfm(file, this.zza, new zzgfk(zzifzVar), zzgtiVar);
    }

    public final zzgfe zzb(File file, byte[] bArr, zzgti zzgtiVar) {
        return new zzgfm(file, this.zza, new zzgfg(bArr), zzgtiVar);
    }
}
