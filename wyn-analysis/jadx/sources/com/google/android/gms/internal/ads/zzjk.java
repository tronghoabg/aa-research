package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzjk implements zzmd {
    private final zznn zza;
    private final zzjj zzb;
    private zznc zzc;
    private zzmd zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjk(zzjj zzjjVar, zzdp zzdpVar) {
        this.zzb = zzjjVar;
        this.zza = new zznn(zzdpVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j8) {
        this.zza.zzc(j8);
    }

    public final void zzd(zznc zzncVar) throws zzjm {
        zzmd zzmdVar;
        zzmd zzmdVarZzd = zzncVar.zzd();
        if (zzmdVarZzd == null || zzmdVarZzd == (zzmdVar = this.zzd)) {
            return;
        }
        if (zzmdVar != null) {
            throw zzjm.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzmdVarZzd;
        this.zzc = zzncVar;
        zzmdVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zznc zzncVar) {
        if (zzncVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zznc r0 = r5.zzc
            if (r0 == 0) goto L69
            boolean r0 = r0.zzac()
            if (r0 != 0) goto L69
            if (r6 == 0) goto L15
            com.google.android.gms.internal.ads.zznc r0 = r5.zzc
            int r0 = r0.zze()
            r1 = 2
            if (r0 != r1) goto L69
        L15:
            com.google.android.gms.internal.ads.zznc r0 = r5.zzc
            boolean r0 = r0.zzab()
            if (r0 != 0) goto L28
            if (r6 != 0) goto L69
            com.google.android.gms.internal.ads.zznc r6 = r5.zzc
            boolean r6 = r6.zzcW()
            if (r6 == 0) goto L28
            goto L69
        L28:
            com.google.android.gms.internal.ads.zzmd r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zzg()
            boolean r2 = r5.zze
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zznn r2 = r5.zza
            long r3 = r2.zzg()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L43
            r2.zzb()
            goto L75
        L43:
            r3 = 0
            r5.zze = r3
            boolean r3 = r5.zzf
            if (r3 == 0) goto L4d
            r2.zza()
        L4d:
            com.google.android.gms.internal.ads.zznn r2 = r5.zza
            r2.zzc(r0)
            com.google.android.gms.internal.ads.zzav r6 = r6.zzj()
            com.google.android.gms.internal.ads.zzav r0 = r2.zzj()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            r2.zzi(r6)
            com.google.android.gms.internal.ads.zzjj r0 = r5.zzb
            r0.zzc(r6)
            goto L75
        L69:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L75
            com.google.android.gms.internal.ads.zznn r6 = r5.zza
            r6.zza()
        L75:
            long r0 = r5.zzg()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjk.zzf(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzmd zzmdVar = this.zzd;
        zzmdVar.getClass();
        return zzmdVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzmd zzmdVar = this.zzd;
        zzmdVar.getClass();
        return zzmdVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzi(zzav zzavVar) {
        zzmd zzmdVar = this.zzd;
        if (zzmdVar != null) {
            zzmdVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        zzmd zzmdVar = this.zzd;
        return zzmdVar != null ? zzmdVar.zzj() : this.zza.zzj();
    }
}
