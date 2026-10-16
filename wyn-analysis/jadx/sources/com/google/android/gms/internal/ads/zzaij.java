package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes3.dex */
final class zzaij extends zzaio {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaij(zzahm zzahmVar) {
        super(zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final boolean zza(zzeu zzeuVar) throws zzain {
        if (this.zzc) {
            zzeuVar.zzk(1);
        } else {
            int iZzs = zzeuVar.zzs();
            int i5 = iZzs >> 4;
            this.zze = i5;
            if (i5 == 2) {
                int i10 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("audio/mpeg");
                zztVar.zzG(1);
                zztVar.zzI(i10);
                this.zza.zzA(zztVar.zzP());
                this.zzd = true;
            } else if (i5 == 7 || i5 == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzn("video/x-flv");
                zztVar2.zzo(i5 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzG(1);
                zztVar2.zzI(8000);
                this.zza.zzA(zztVar2.zzP());
                this.zzd = true;
            } else if (i5 != 10) {
                throw new zzain(N0.a.d(i5, "Audio format not supported: ", new StringBuilder(String.valueOf(i5).length() + 28)));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final boolean zzb(zzeu zzeuVar, long j8) throws zzat {
        if (this.zze == 2) {
            int iZzd = zzeuVar.zzd();
            zzahm zzahmVar = this.zza;
            zzahmVar.zzc(zzeuVar, iZzd);
            zzahmVar.zze(j8, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzeuVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzeuVar.zzd();
            zzahm zzahmVar2 = this.zza;
            zzahmVar2.zzc(zzeuVar, iZzd2);
            zzahmVar2.zze(j8, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzeuVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzeuVar.zzm(bArr, 0, iZzd3);
        zzaex zzaexVarZza = zzaey.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzn("video/x-flv");
        zztVar.zzo("audio/mp4a-latm");
        zztVar.zzk(zzaexVarZza.zzc);
        zztVar.zzG(zzaexVarZza.zzb);
        zztVar.zzI(zzaexVarZza.zza);
        zztVar.zzr(Collections.singletonList(bArr));
        this.zza.zzA(zztVar.zzP());
        this.zzd = true;
        return false;
    }
}
