package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzacw {
    final /* synthetic */ zzacx zza;
    private zzv zzb;

    public /* synthetic */ zzacw(zzacx zzacxVar, byte[] bArr) {
        Objects.requireNonNull(zzacxVar);
        this.zza = zzacxVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo("video/raw");
        this.zzb = zztVar.zzP();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j8, long j10, boolean z2) {
        if (z2) {
            zzacx zzacxVar = this.zza;
            if (zzacxVar.zzA() != null) {
                zzacxVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzact
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzP = this.zzb;
        if (zzvVarZzP == null) {
            zzvVarZzP = new zzt().zzP();
        }
        zzv zzvVar = zzvVarZzP;
        zzacx zzacxVar2 = this.zza;
        zzacxVar2.zzD().zzcS(j10, j8, zzvVar, null);
        ((zzaeu) zzacxVar2.zzz().remove()).zza(j8);
    }
}
