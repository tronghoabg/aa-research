package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zznj {
    public static final zznj zza = new zznj(new zzni());
    public final zzgxd zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznj(zzni zzniVar) {
        this.zzb = zzniVar.zza();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zznj) && this.zzb.equals(((zznj) obj).zzb);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.zzb, null, null, bool, bool, bool, bool, bool);
    }
}
