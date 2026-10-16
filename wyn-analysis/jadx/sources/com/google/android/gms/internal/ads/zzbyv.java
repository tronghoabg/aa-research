package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbyv {
    private final com.google.android.gms.ads.nativead.j zza;
    private final com.google.android.gms.ads.nativead.i zzb;
    private com.google.android.gms.ads.nativead.k zzc;

    public zzbyv(com.google.android.gms.ads.nativead.j jVar, com.google.android.gms.ads.nativead.i iVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.ads.nativead.k zzc(zzbnc zzbncVar) {
        com.google.android.gms.ads.nativead.k kVar = this.zzc;
        if (kVar != null) {
            return kVar;
        }
        zzbyw zzbywVar = new zzbyw(zzbncVar);
        this.zzc = zzbywVar;
        return zzbywVar;
    }

    public final zzbnp zza() {
        return new zzbyu(this, null);
    }

    public final zzbnm zzb() {
        return null;
    }

    public final /* synthetic */ com.google.android.gms.ads.nativead.j zzd() {
        return null;
    }

    public final /* synthetic */ com.google.android.gms.ads.nativead.i zze() {
        return null;
    }
}
