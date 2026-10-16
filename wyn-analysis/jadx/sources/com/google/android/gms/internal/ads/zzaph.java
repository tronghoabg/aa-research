package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaph implements Comparable {
    public final int zza;
    public final zzapc zzb;

    public zzaph(int i5, zzapc zzapcVar) {
        this.zza = i5;
        this.zzb = zzapcVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzaph) obj).zza);
    }
}
