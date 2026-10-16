package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes3.dex */
final class zzaip extends zzaio {
    private final zzeu zzb;
    private final zzeu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaip(zzahm zzahmVar) {
        super(zzahmVar);
        this.zzb = new zzeu(zzgr.zza);
        this.zzc = new zzeu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final boolean zza(zzeu zzeuVar) throws zzain {
        int iZzs = zzeuVar.zzs();
        int i5 = iZzs >> 4;
        int i10 = iZzs & 15;
        if (i10 != 7) {
            throw new zzain(N0.a.d(i10, "Video format not supported: ", new StringBuilder(String.valueOf(i10).length() + 28)));
        }
        this.zzg = i5;
        return i5 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final boolean zzb(zzeu zzeuVar, long j8) throws zzat {
        int i5;
        int iZzs = zzeuVar.zzs();
        long jZzy = zzeuVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzeu zzeuVar2 = new zzeu(new byte[zzeuVar.zzd()]);
                zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar.zzd());
                zzaff zzaffVarZza = zzaff.zza(zzeuVar2);
                this.zzd = zzaffVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo(MimeTypes.VIDEO_H264);
                zztVar.zzk(zzaffVarZza.zzl);
                zztVar.zzv(zzaffVarZza.zzc);
                zztVar.zzw(zzaffVarZza.zzd);
                zztVar.zzB(zzaffVarZza.zzk);
                zztVar.zzr(zzaffVarZza.zza);
                this.zza.zzA(zztVar.zzP());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i10 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i5 = i10;
            } else if (i10 != 0) {
                i5 = 1;
            }
            zzeu zzeuVar3 = this.zzc;
            byte[] bArrZzi = zzeuVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzeuVar.zzd() > 0) {
                zzeuVar.zzm(zzeuVar3.zzi(), i11, this.zzd);
                zzeuVar3.zzh(0);
                zzeu zzeuVar4 = this.zzb;
                int iZzH = zzeuVar3.zzH();
                zzeuVar4.zzh(0);
                zzahm zzahmVar = this.zza;
                zzahmVar.zzc(zzeuVar4, 4);
                zzahmVar.zzc(zzeuVar, iZzH);
                i12 = i12 + 4 + iZzH;
            }
            this.zza.zze((jZzy * 1000) + j8, i5, i12, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
