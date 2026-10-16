package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaqc implements zzaqa {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzahm zzb;
    private final zzars zzd;
    private final String zze;
    private final zzeu zzf;
    private final zzaqr zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaqb zzi = new zzaqb(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzaqc(zzars zzarsVar, String str) {
        zzeu zzeuVar;
        this.zzd = zzarsVar;
        this.zze = str;
        if (zzarsVar != null) {
            this.zzg = new zzaqr(178, 128);
            zzeuVar = new zzeu();
        } else {
            zzeuVar = null;
            this.zzg = null;
        }
        this.zzf = zzeuVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        zzgr.zzj(this.zzh);
        this.zzi.zza();
        zzaqr zzaqrVar = this.zzg;
        if (zzaqrVar != null) {
            zzaqrVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zza = zzaroVar.zzc();
        this.zzb = zzagdVar.zzs(zzaroVar.zzb(), 2);
        zzars zzarsVar = this.zzd;
        if (zzarsVar != null) {
            zzarsVar.zza(zzagdVar, zzaroVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzn = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzeu r29) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqc.zzd(com.google.android.gms.internal.ads.zzeu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
        zzahm zzahmVar = this.zzb;
        zzahmVar.getClass();
        if (z2) {
            boolean z10 = this.zzq;
            long j8 = this.zzj - this.zzo;
            zzahmVar.zze(this.zzp, z10 ? 1 : 0, (int) j8, 0, null);
        }
    }
}
