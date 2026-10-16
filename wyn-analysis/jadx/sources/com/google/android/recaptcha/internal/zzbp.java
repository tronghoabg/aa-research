package com.google.android.recaptcha.internal;

import A7.AbstractC0279p0;
import Bf.k;
import Va.M6;
import android.support.v4.media.session.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzbp implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        return M6.t(AbstractC0279p0.r("avgExecutionTime: ", k.C0(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", k.C0(10, String.valueOf(this.zzc)), " us| totalTime: "), k.C0(10, String.valueOf(this.zzb)), " us| #Usages: ", k.C0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzbp zzbpVar) {
        return b.W(Long.valueOf(this.zzb), Long.valueOf(zzbpVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j8) {
        this.zzc = j8;
    }

    public final void zzf(long j8) {
        this.zzb = j8;
    }

    public final void zzg(int i5) {
        this.zza = i5;
    }
}
