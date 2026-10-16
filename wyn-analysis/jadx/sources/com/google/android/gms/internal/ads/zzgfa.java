package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgfa implements Comparable {
    final Runnable zza;
    final long zzb;

    public zzgfa(Runnable runnable, long j8) {
        this.zza = runnable;
        this.zzb = j8;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgfa) obj).zzb);
    }
}
