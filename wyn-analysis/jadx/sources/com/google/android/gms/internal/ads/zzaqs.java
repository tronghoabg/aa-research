package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaqs implements zzara {
    private zzv zza;
    private zzfj zzb;
    private zzahm zzc;

    public zzaqs(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzn("video/mp2t");
        zztVar.zzo(str);
        this.zza = zztVar.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
        this.zzb = zzfjVar;
        zzaroVar.zza();
        zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 5);
        this.zzc = zzahmVarZzs;
        zzahmVarZzs.zzA(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzb(zzeu zzeuVar) {
        this.zzb.getClass();
        String str = zzfm.zza;
        long jZzb = this.zzb.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == -9223372036854775807L || jZzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (jZzc != zzvVar.zzu) {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(jZzc);
            zzv zzvVarZzP = zztVarZza.zzP();
            this.zza = zzvVarZzP;
            this.zzc.zzA(zzvVarZzP);
        }
        int iZzd = zzeuVar.zzd();
        this.zzc.zzc(zzeuVar, iZzd);
        this.zzc.zze(jZzb, 1, iZzd, 0, null);
    }
}
