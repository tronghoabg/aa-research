package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzxg extends zzzq {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzxe zze;
    private zzxd zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzxg(zzxn zzxnVar, boolean z2) {
        boolean z10;
        super(zzxnVar);
        if (z2) {
            zzxnVar.zzJ();
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzxnVar.zzI();
        this.zze = zzxe.zzp(zzxnVar.zzK());
    }

    private final Object zzL(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzxe.zzc)) ? obj : this.zze.zzs();
    }

    private final boolean zzM(long j8) {
        zzxd zzxdVar = this.zzf;
        int iZze = this.zze.zze(zzxdVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzxe zzxeVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzxeVar.zzd(iZze, zzbdVar, false);
        long j10 = zzbdVar.zzd;
        if (j10 != -9223372036854775807L && j8 >= j10) {
            j8 = Math.max(0L, j10 - 1);
        }
        zzxdVar.zzg(j8);
        return true;
    }

    public final zzbf zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwm, com.google.android.gms.internal.ads.zzxn
    public final void zzB(zzak zzakVar) {
        if (this.zzi) {
            zzxe zzxeVar = this.zze;
            this.zze = zzxeVar.zzr(zzzm.zzp(zzxeVar.zzb, zzakVar));
        } else {
            this.zze = zzxe.zzp(zzakVar);
        }
        ((zzzq) this).zza.zzB(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    public final void zzC() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzw(null, ((zzzq) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzxn
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final zzxd zzH(zzxl zzxlVar, zzabm zzabmVar, long j8) {
        zzxd zzxdVar = new zzxd(zzxlVar, zzabmVar, j8);
        zzxdVar.zzi(((zzzq) this).zza);
        if (this.zzh) {
            zzxdVar.zzj(zzxlVar.zza(zzL(zzxlVar.zza)));
            return zzxdVar;
        }
        this.zzf = zzxdVar;
        if (!this.zzg) {
            this.zzg = true;
            zzw(null, ((zzzq) this).zza);
        }
        return zzxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzxn
    public final void zzE(zzxj zzxjVar) {
        ((zzxd) zzxjVar).zzk();
        if (zzxjVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzF(com.google.android.gms.internal.ads.zzbf r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzxe r0 = r11.zze
            com.google.android.gms.internal.ads.zzxe r12 = r0.zzr(r12)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzxd r12 = r11.zzf
            if (r12 == 0) goto L97
            long r2 = r12.zzh()
            r11.zzM(r2)
            goto L97
        L1a:
            boolean r0 = r12.zzg()
            if (r0 == 0) goto L36
            boolean r0 = r11.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzxe r0 = r11.zze
            com.google.android.gms.internal.ads.zzxe r12 = r0.zzr(r12)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbe.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzxe.zzc
            com.google.android.gms.internal.ads.zzxe r12 = com.google.android.gms.internal.ads.zzxe.zzq(r12, r0, r2)
        L33:
            r11.zze = r12
            goto L97
        L36:
            com.google.android.gms.internal.ads.zzbe r3 = r11.zzc
            r0 = 0
            r4 = 0
            r12.zzb(r0, r3, r4)
            java.lang.Object r8 = r3.zzb
            com.google.android.gms.internal.ads.zzxd r2 = r11.zzf
            if (r2 == 0) goto L5d
            long r6 = r2.zza()
            com.google.android.gms.internal.ads.zzxe r9 = r11.zze
            com.google.android.gms.internal.ads.zzbd r10 = r11.zzd
            com.google.android.gms.internal.ads.zzxl r2 = r2.zza
            java.lang.Object r2 = r2.zza
            r9.zzo(r2, r10)
            com.google.android.gms.internal.ads.zzxe r2 = r11.zze
            r2.zzb(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r6 = r4
        L5e:
            com.google.android.gms.internal.ads.zzbd r4 = r11.zzd
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.zzm(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.zzi
            if (r12 == 0) goto L7b
            com.google.android.gms.internal.ads.zzxe r12 = r11.zze
            com.google.android.gms.internal.ads.zzxe r12 = r12.zzr(r2)
            goto L7f
        L7b:
            com.google.android.gms.internal.ads.zzxe r12 = com.google.android.gms.internal.ads.zzxe.zzq(r2, r8, r0)
        L7f:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzxd r12 = r11.zzf
            if (r12 == 0) goto L97
            boolean r0 = r11.zzM(r3)
            if (r0 == 0) goto L97
            com.google.android.gms.internal.ads.zzxl r12 = r12.zza
            java.lang.Object r0 = r12.zza
            java.lang.Object r0 = r11.zzL(r0)
            com.google.android.gms.internal.ads.zzxl r1 = r12.zza(r0)
        L97:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzxe r12 = r11.zze
            r11.zze(r12)
            if (r1 == 0) goto Lab
            com.google.android.gms.internal.ads.zzxd r12 = r11.zzf
            r12.getClass()
            r12.zzj(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxg.zzF(com.google.android.gms.internal.ads.zzbf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    public final zzxl zzG(zzxl zzxlVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzxlVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzxe.zzc;
        }
        return zzxlVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }
}
