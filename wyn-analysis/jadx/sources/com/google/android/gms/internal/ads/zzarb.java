package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzarb implements zzarp {
    private final zzara zza;
    private final zzeu zzb = new zzeu(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzarb(zzara zzaraVar) {
        this.zza = zzaraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zza(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
        this.zza.zza(zzfjVar, zzagdVar, zzaroVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzc(zzeu zzeuVar, int i5) {
        int i10 = i5 & 1;
        int iZzg = i10 != 0 ? zzeuVar.zzg() + zzeuVar.zzs() : -1;
        if (this.zzf) {
            if (i10 == 0) {
                return;
            }
            this.zzf = false;
            zzeuVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzeuVar.zzd() > 0) {
            int i11 = this.zzd;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iZzs = zzeuVar.zzs();
                    zzeuVar.zzh(zzeuVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzeuVar.zzd(), 3 - this.zzd);
                zzeu zzeuVar2 = this.zzb;
                zzeuVar.zzm(zzeuVar2.zzi(), this.zzd, iMin);
                int i12 = this.zzd + iMin;
                this.zzd = i12;
                if (i12 == 3) {
                    zzeuVar2.zzh(0);
                    zzeuVar2.zzf(3);
                    zzeuVar2.zzk(1);
                    int iZzs2 = zzeuVar2.zzs();
                    boolean z2 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzeuVar2.zzs();
                    this.zze = z2;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzeuVar2.zzj();
                    int i13 = this.zzc;
                    if (iZzj < i13) {
                        int iZzj2 = zzeuVar2.zzj();
                        zzeuVar2.zzc(Math.min(4098, Math.max(i13, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzeuVar.zzd(), this.zzc - this.zzd);
                zzeu zzeuVar3 = this.zzb;
                zzeuVar.zzm(zzeuVar3.zzi(), this.zzd, iMin2);
                int i14 = this.zzd + iMin2;
                this.zzd = i14;
                int i15 = this.zzc;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzeuVar3.zzf(i15);
                    } else {
                        if (zzfm.zzL(zzeuVar3.zzi(), 0, i15, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzeuVar3.zzf(this.zzc - 4);
                    }
                    zzeuVar3.zzh(0);
                    this.zza.zzb(zzeuVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
