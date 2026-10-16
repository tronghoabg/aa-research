package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzaqm implements zzaqa {
    private final zzeu zza;
    private final zzagx zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzahm zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaqm(String str, int i5, String str2) {
        zzeu zzeuVar = new zzeu(4);
        this.zza = zzeuVar;
        zzeuVar.zzi()[0] = -1;
        this.zzb = new zzagx();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i5;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzg = zzaroVar.zzc();
        this.zzf = zzagdVar.zzs(zzaroVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzn = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        this.zzf.getClass();
        while (zzeuVar.zzd() > 0) {
            int i5 = this.zzh;
            if (i5 == 0) {
                byte[] bArrZzi = zzeuVar.zzi();
                int iZzg = zzeuVar.zzg();
                int iZze = zzeuVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzeuVar.zzh(iZze);
                        break;
                    }
                    int i10 = iZzg + 1;
                    byte b5 = bArrZzi[iZzg];
                    boolean z2 = (b5 & ForkServer.ERROR) == 255;
                    boolean z10 = this.zzk && (b5 & 224) == 224;
                    this.zzk = z2;
                    if (z10) {
                        zzeuVar.zzh(i10);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i10;
                }
            } else if (i5 != 1) {
                int iMin = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzeuVar, iMin);
                int i11 = this.zzi + iMin;
                this.zzi = i11;
                if (i11 >= this.zzm) {
                    zzgtr.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzeuVar.zzd(), 4 - this.zzi);
                zzeu zzeuVar2 = this.zza;
                zzeuVar.zzm(zzeuVar2.zzi(), this.zzi, iMin2);
                int i12 = this.zzi + iMin2;
                this.zzi = i12;
                if (i12 >= 4) {
                    zzeuVar2.zzh(0);
                    zzagx zzagxVar = this.zzb;
                    if (zzagxVar.zza(zzeuVar2.zzB())) {
                        this.zzm = zzagxVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (zzagxVar.zzg * 1000000) / zzagxVar.zzd;
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzn(this.zze);
                            zztVar.zzo(zzagxVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzG(zzagxVar.zze);
                            zztVar.zzI(zzagxVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzA(zztVar.zzP());
                            this.zzj = true;
                        }
                        zzeuVar2.zzh(0);
                        this.zzf.zzc(zzeuVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
    }
}
