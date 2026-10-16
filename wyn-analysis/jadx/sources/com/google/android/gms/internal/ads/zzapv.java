package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzapv implements zzaga {
    private final zzapw zza;
    private final zzeu zzb;
    private final zzeu zzc;
    private final zzet zzd;
    private zzagd zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzapv() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar;
        int i5 = 0;
        while (true) {
            zzeuVar = this.zzc;
            zzagbVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i5 += iZzG + 10;
            zzagbVar.zzk(iZzG);
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i5);
        if (this.zzg == -1) {
            this.zzg = i5;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i5;
        do {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
            zzeuVar.zzh(0);
            if (zzapw.zzf(zzeuVar.zzt())) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
                zzet zzetVar = this.zzd;
                zzetVar.zzf(14);
                int iZzj = zzetVar.zzj(13);
                if (iZzj <= 6) {
                    i12++;
                    zzagbVar.zzl();
                    zzagbVar.zzk(i12);
                } else {
                    zzagbVar.zzk(iZzj - 6);
                    i11 += iZzj;
                }
            } else {
                i12++;
                zzagbVar.zzl();
                zzagbVar.zzk(i12);
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i5 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zze = zzagdVar;
        this.zza.zzb(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        this.zze.getClass();
        zzeu zzeuVar = this.zzb;
        int iZza = zzagbVar.zza(zzeuVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzahc(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public zzapv(int i5) {
        this.zza = new zzapw(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzeu(2048);
        this.zzg = -1L;
        zzeu zzeuVar = new zzeu(10);
        this.zzc = zzeuVar;
        byte[] bArrZzi = zzeuVar.zzi();
        this.zzd = new zzet(bArrZzi, bArrZzi.length);
    }
}
