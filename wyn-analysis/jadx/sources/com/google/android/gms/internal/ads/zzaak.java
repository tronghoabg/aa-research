package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaak extends zzaar implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaak(int i5, zzbg zzbgVar, int i10, zzaan zzaanVar, int i11) {
        super(i5, zzbgVar, i10);
        this.zze = I.c(i11, zzaanVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaak zzaakVar) {
        return Integer.compare(this.zzf, zzaakVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        return false;
    }
}
