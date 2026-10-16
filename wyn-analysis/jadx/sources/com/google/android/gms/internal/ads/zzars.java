package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzars {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzahm[] zzc;
    private final zzhb zzd;

    public zzars(List list, String str) {
        this.zza = list;
        this.zzc = new zzahm[list.size()];
        zzhb zzhbVar = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzarr
            @Override // com.google.android.gms.internal.ads.zzha
            public final /* synthetic */ void zza(long j8, zzeu zzeuVar) {
                this.zza.zzc(j8, zzeuVar);
            }
        });
        this.zzd = zzhbVar;
        zzhbVar.zza(3);
    }

    public final void zza(zzagd zzagdVar, zzaro zzaroVar) {
        int i5 = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.zzc;
            if (i5 >= zzahmVarArr.length) {
                return;
            }
            zzaroVar.zza();
            zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i5);
            String str = zzvVar.zzp;
            boolean z2 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z2 = false;
            }
            zzgtr.zzf(z2, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzaroVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzM(zzvVar.zzN);
            zztVar.zzr(zzvVar.zzs);
            zzahmVarZzs.zzA(zztVar.zzP());
            zzahmVarArr[i5] = zzahmVarZzs;
            i5++;
        }
    }

    public final void zzb(long j8, zzeu zzeuVar) {
        if (zzeuVar.zzd() < 9) {
            return;
        }
        int iZzB = zzeuVar.zzB();
        int iZzB2 = zzeuVar.zzB();
        int iZzs = zzeuVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j8, zzeuVar);
        }
    }

    public final /* synthetic */ void zzc(long j8, zzeu zzeuVar) {
        zzafn.zzb(j8, zzeuVar, this.zzc);
    }
}
