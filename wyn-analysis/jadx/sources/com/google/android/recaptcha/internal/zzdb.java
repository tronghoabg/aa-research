package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzdb {

    @NotNull
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzdb(@NotNull String str, long j8, int i5) {
        this.zza = str;
        this.zzb = j8;
        this.zzc = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        return AbstractC3340k.a(zzdbVar.zza, this.zza) && zzdbVar.zzb == this.zzb && zzdbVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zza;
    }
}
