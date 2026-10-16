package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzby extends Exception {

    @Nullable
    private final Throwable zza;

    @NotNull
    private final zzrh zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    public zzby(@NotNull int i5, @NotNull int i10, @Nullable Throwable th) {
        this.zzc = i5;
        this.zzd = i10;
        this.zza = th;
        zzrh zzrhVarZzf = zzri.zzf();
        zzrhVarZzf.zzp(i10);
        zzrhVarZzf.zzq(i5);
        this.zzb = zzrhVarZzf;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zzrh zza() {
        return this.zzb;
    }

    @NotNull
    public final int zzb() {
        return this.zzd;
    }
}
