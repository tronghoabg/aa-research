package com.google.android.gms.internal.ads;

import D6.A1;
import D6.v1;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzfhk implements zzfnp {
    public final zzfid zza;
    public final zzfif zzb;
    public final v1 zzc;
    public final String zzd;
    public final Executor zze;
    public final A1 zzf;
    public final zzfnf zzg;

    public zzfhk(zzfid zzfidVar, zzfif zzfifVar, v1 v1Var, String str, Executor executor, A1 a12, zzfnf zzfnfVar) {
        this.zza = zzfidVar;
        this.zzb = zzfifVar;
        this.zzc = v1Var;
        this.zzd = str;
        this.zze = executor;
        this.zzf = a12;
        this.zzg = zzfnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final zzfnf zzb() {
        return this.zzg;
    }
}
