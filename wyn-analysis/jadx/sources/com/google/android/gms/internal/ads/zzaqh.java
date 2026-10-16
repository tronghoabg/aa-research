package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaqh implements zzaqa {
    private final zzard zza;
    private long zzf;
    private String zzh;
    private zzahm zzi;
    private zzaqg zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzaqr zzc = new zzaqr(7, 128);
    private final zzaqr zzd = new zzaqr(8, 128);
    private final zzaqr zze = new zzaqr(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzeu zzn = new zzeu();

    public zzaqh(zzard zzardVar, boolean z2, boolean z10, String str) {
        this.zza = zzardVar;
    }

    private final void zzf(long j8, int i5, long j10) {
        if (!this.zzk) {
            this.zzc.zzc(i5);
            this.zzd.zzc(i5);
        }
        this.zze.zzc(i5);
        this.zzj.zzd(j8, i5, j10, this.zzm);
    }

    private final void zzg(byte[] bArr, int i5, int i10) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i5, i10);
            this.zzd.zzd(bArr, i5, i10);
        }
        this.zze.zzd(bArr, i5, i10);
    }

    private final void zzh(long j8, int i5, int i10, long j10) {
        if (!this.zzk) {
            zzaqr zzaqrVar = this.zzc;
            zzaqrVar.zze(i10);
            zzaqr zzaqrVar2 = this.zzd;
            zzaqrVar2.zze(i10);
            if (this.zzk) {
                if (zzaqrVar.zzb()) {
                    zzgq zzgqVarZze = zzgr.zze(zzaqrVar.zza, 4, zzaqrVar.zzb);
                    this.zza.zzb(zzgqVarZze.zzm);
                    this.zzj.zza(zzgqVarZze);
                    zzaqrVar.zza();
                } else if (zzaqrVar2.zzb()) {
                    this.zzj.zzb(zzgr.zzh(zzaqrVar2.zza, 4, zzaqrVar2.zzb));
                    zzaqrVar2.zza();
                }
            } else if (zzaqrVar.zzb() && zzaqrVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqrVar.zza, zzaqrVar.zzb));
                arrayList.add(Arrays.copyOf(zzaqrVar2.zza, zzaqrVar2.zzb));
                zzgq zzgqVarZze2 = zzgr.zze(zzaqrVar.zza, 4, zzaqrVar.zzb);
                zzgp zzgpVarZzh = zzgr.zzh(zzaqrVar2.zza, 4, zzaqrVar2.zzb);
                String strZzb = zzdr.zzb(zzgqVarZze2.zza, zzgqVarZze2.zzb, zzgqVarZze2.zzc);
                zzahm zzahmVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo(MimeTypes.VIDEO_H264);
                zztVar.zzk(strZzb);
                zztVar.zzv(zzgqVarZze2.zze);
                zztVar.zzw(zzgqVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzgqVarZze2.zzj);
                zzhVar.zzb(zzgqVarZze2.zzk);
                zzhVar.zzc(zzgqVarZze2.zzl);
                zzhVar.zze(zzgqVarZze2.zzh + 8);
                zzhVar.zzf(zzgqVarZze2.zzi + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzgqVarZze2.zzg);
                zztVar.zzr(arrayList);
                int i11 = zzgqVarZze2.zzm;
                zztVar.zzq(i11);
                zzahmVar.zzA(zztVar.zzP());
                this.zzk = true;
                this.zza.zzb(i11);
                this.zzj.zza(zzgqVarZze2);
                this.zzj.zzb(zzgpVarZzh);
                zzaqrVar.zza();
                zzaqrVar2.zza();
            }
        }
        zzaqr zzaqrVar3 = this.zze;
        if (zzaqrVar3.zze(i10)) {
            int iZza = zzgr.zza(zzaqrVar3.zza, zzaqrVar3.zzb);
            zzeu zzeuVar = this.zzn;
            zzeuVar.zzb(zzaqrVar3.zza, iZza);
            zzeuVar.zzh(4);
            this.zza.zzc(j10, zzeuVar);
        }
        if (this.zzj.zze(j8, i5, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgr.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaqg zzaqgVar = this.zzj;
        if (zzaqgVar != null) {
            zzaqgVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzh = zzaroVar.zzc();
        zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 2);
        this.zzi = zzahmVarZzs;
        this.zzj = new zzaqg(zzahmVarZzs, false, false);
        this.zza.zza(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzl = j8;
        int i10 = i5 & 2;
        this.zzm = (i10 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzeu r16) {
        /*
            r15 = this;
            r7 = 3
            com.google.android.gms.internal.ads.zzahm r1 = r15.zzi
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfm.zza
            int r1 = r16.zzg()
            int r8 = r16.zze()
            byte[] r9 = r16.zzi()
            long r2 = r15.zzf
            int r4 = r16.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r15.zzf = r2
            com.google.android.gms.internal.ads.zzahm r2 = r15.zzi
            int r3 = r16.zzd()
            r4 = r16
            r2.zzc(r4, r3)
        L29:
            boolean[] r2 = r15.zzg
            int r2 = com.google.android.gms.internal.ads.zzgr.zzi(r9, r1, r8, r2)
            if (r2 == r8) goto L6a
            int r3 = r2 + 3
            r3 = r9[r3]
            r10 = r3 & 31
            if (r2 <= 0) goto L43
            int r3 = r2 + (-1)
            r4 = r9[r3]
            if (r4 != 0) goto L43
            r2 = 4
            r12 = r2
            r11 = r3
            goto L45
        L43:
            r11 = r2
            r12 = r7
        L45:
            int r2 = r11 - r1
            if (r2 <= 0) goto L4c
            r15.zzg(r9, r1, r11)
        L4c:
            int r3 = r8 - r11
            long r4 = r15.zzf
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L57
            int r1 = -r2
        L55:
            r13 = r4
            goto L59
        L57:
            r1 = 0
            goto L55
        L59:
            long r5 = r15.zzl
            r0 = r15
            r4 = r1
            r1 = r13
            r0.zzh(r1, r3, r4, r5)
            long r4 = r15.zzl
            r3 = r10
            r0.zzf(r1, r3, r4)
            int r1 = r11 + r12
            goto L29
        L6a:
            r15.zzg(r9, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqh.zzd(com.google.android.gms.internal.ads.zzeu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
        this.zzi.getClass();
        String str = zzfm.zza;
        if (z2) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
