package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzard {
    private final List zza;
    private final zzahm[] zzc;
    private final String zzb = "video/mp2t";
    private final zzhb zzd = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzarc
        @Override // com.google.android.gms.internal.ads.zzha
        public final /* synthetic */ void zza(long j8, zzeu zzeuVar) {
            this.zza.zzf(j8, zzeuVar);
        }
    });

    public zzard(List list, String str) {
        this.zza = list;
        this.zzc = new zzahm[list.size()];
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
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzaroVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
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

    public final void zzb(int i5) {
        this.zzd.zza(i5);
    }

    public final void zzc(long j8, zzeu zzeuVar) {
        this.zzd.zzc(j8, zzeuVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j8, zzeu zzeuVar) {
        zzafn.zza(j8, zzeuVar, this.zzc);
    }
}
