package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class zzaog implements zzans {
    private final zzeu zza = new zzeu();
    private final zzeu zzb = new zzeu();
    private final zzaof zzc = new zzaof();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i5, int i10, zzanr zzanrVar, zzdu zzduVar) {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i10 + i5);
        zzeuVar.zzh(i5);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzeu zzeuVar2 = this.zzb;
        if (zzfm.zzQ(zzeuVar, zzeuVar2, this.zzd)) {
            zzeuVar.zzb(zzeuVar2.zzi(), zzeuVar2.zze());
        }
        zzaof zzaofVar = this.zzc;
        zzaofVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.zzd() >= 3) {
            int iZze = zzeuVar.zze();
            int iZzs = zzeuVar.zzs();
            int iZzt = zzeuVar.zzt();
            int iZzg = zzeuVar.zzg() + iZzt;
            zzcy zzcyVarZza = null;
            if (iZzg > iZze) {
                zzeuVar.zzh(iZze);
            } else {
                if (iZzs != 128) {
                    switch (iZzs) {
                        case 20:
                            zzaofVar.zzc(zzeuVar, iZzt);
                            break;
                        case 21:
                            zzaofVar.zzd(zzeuVar, iZzt);
                            break;
                        case 22:
                            zzaofVar.zze(zzeuVar, iZzt);
                            break;
                    }
                } else {
                    zzcyVarZza = zzaofVar.zza();
                    zzaofVar.zzb();
                }
                zzeuVar.zzh(iZzg);
            }
            if (zzcyVarZza != null) {
                arrayList.add(zzcyVarZza);
            }
        }
        zzduVar.zza(new zzank(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
