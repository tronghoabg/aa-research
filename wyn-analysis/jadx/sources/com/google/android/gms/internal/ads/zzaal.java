package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaal implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaal(zzv zzvVar, int i5) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = I.c(i5, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaal zzaalVar) {
        return zzgwg.zzg().zzd(this.zzb, zzaalVar.zzb).zzd(this.zza, zzaalVar.zza).zze();
    }
}
