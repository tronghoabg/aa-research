package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzarh implements zzara {
    final /* synthetic */ zzark zza;
    private final zzet zzb;

    public zzarh(zzark zzarkVar) {
        Objects.requireNonNull(zzarkVar);
        this.zza = zzarkVar;
        this.zzb = new zzet(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzb(zzeu zzeuVar) {
        if (zzeuVar.zzs() == 0 && (zzeuVar.zzs() & 128) != 0) {
            zzeuVar.zzk(6);
            int iZzd = zzeuVar.zzd() / 4;
            for (int i5 = 0; i5 < iZzd; i5++) {
                zzet zzetVar = this.zzb;
                zzeuVar.zzl(zzetVar, 4);
                int iZzj = zzetVar.zzj(16);
                zzetVar.zzh(3);
                if (iZzj == 0) {
                    zzetVar.zzh(13);
                } else {
                    int iZzj2 = zzetVar.zzj(13);
                    zzark zzarkVar = this.zza;
                    if (zzarkVar.zzj().get(iZzj2) == null) {
                        zzarkVar.zzj().put(iZzj2, new zzarb(new zzari(zzarkVar, iZzj2)));
                        zzarkVar.zzo(zzarkVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
