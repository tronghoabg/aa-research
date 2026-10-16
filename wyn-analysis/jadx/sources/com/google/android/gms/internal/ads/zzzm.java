package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzzm extends zzwz {
    private final zzak zzc;

    private zzzm(zzbf zzbfVar, zzak zzakVar) {
        super(zzbfVar);
        this.zzc = zzakVar;
    }

    public static zzzm zzp(zzbf zzbfVar, zzak zzakVar) {
        return zzbfVar instanceof zzzm ? new zzzm(((zzzm) zzbfVar).zzb, zzakVar) : new zzzm(zzbfVar, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j8) {
        this.zzb.zzb(i5, zzbeVar, j8);
        zzak zzakVar = this.zzc;
        zzbeVar.zzd = zzakVar;
        zzag zzagVar = zzakVar.zzb;
        zzbeVar.zzc = null;
        return zzbeVar;
    }
}
