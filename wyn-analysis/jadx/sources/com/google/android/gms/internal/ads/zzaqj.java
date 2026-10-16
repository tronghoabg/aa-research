package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzaqj implements zzaqa {
    private final zzard zza;
    private String zzb;
    private zzahm zzc;
    private zzaqi zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaqr zzg = new zzaqr(32, 128);
    private final zzaqr zzh = new zzaqr(33, 128);
    private final zzaqr zzi = new zzaqr(34, 128);
    private final zzaqr zzj = new zzaqr(39, 128);
    private final zzaqr zzk = new zzaqr(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzeu zzn = new zzeu();

    public zzaqj(zzard zzardVar, String str) {
        this.zza = zzardVar;
    }

    private final void zzf(long j8, int i5, int i10, long j10) {
        this.zzd.zzb(j8, i5, i10, j10, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i10);
            this.zzh.zzc(i10);
            this.zzi.zzc(i10);
        }
        this.zzj.zzc(i10);
        this.zzk.zzc(i10);
    }

    private final void zzg(byte[] bArr, int i5, int i10) {
        this.zzd.zzc(bArr, i5, i10);
        if (!this.zze) {
            this.zzg.zzd(bArr, i5, i10);
            this.zzh.zzd(bArr, i5, i10);
            this.zzi.zzd(bArr, i5, i10);
        }
        this.zzj.zzd(bArr, i5, i10);
        this.zzk.zzd(bArr, i5, i10);
    }

    private final void zzh(long j8, int i5, int i10, long j10) {
        this.zzd.zzd(j8, i5, this.zze);
        if (!this.zze) {
            zzaqr zzaqrVar = this.zzg;
            zzaqrVar.zze(i10);
            zzaqr zzaqrVar2 = this.zzh;
            zzaqrVar2.zze(i10);
            zzaqr zzaqrVar3 = this.zzi;
            zzaqrVar3.zze(i10);
            if (zzaqrVar.zzb() && zzaqrVar2.zzb() && zzaqrVar3.zzb()) {
                String str = this.zzb;
                int i11 = zzaqrVar.zzb;
                byte[] bArr = new byte[zzaqrVar2.zzb + i11 + zzaqrVar3.zzb];
                System.arraycopy(zzaqrVar.zza, 0, bArr, 0, i11);
                System.arraycopy(zzaqrVar2.zza, 0, bArr, zzaqrVar.zzb, zzaqrVar2.zzb);
                System.arraycopy(zzaqrVar3.zza, 0, bArr, zzaqrVar.zzb + zzaqrVar2.zzb, zzaqrVar3.zzb);
                String strZzc = null;
                zzgl zzglVarZzg = zzgr.zzg(zzaqrVar2.zza, 3, zzaqrVar2.zzb, null);
                zzgg zzggVar = zzglVarZzg.zzb;
                if (zzggVar != null) {
                    int i12 = zzggVar.zzf;
                    int[] iArr = zzggVar.zze;
                    int i13 = zzggVar.zzd;
                    strZzc = zzdr.zzc(zzggVar.zza, zzggVar.zzb, zzggVar.zzc, i13, iArr, i12);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzn("video/mp2t");
                zztVar.zzo(MimeTypes.VIDEO_H265);
                zztVar.zzk(strZzc);
                zztVar.zzv(zzglVarZzg.zze);
                zztVar.zzw(zzglVarZzg.zzf);
                zztVar.zzx(zzglVarZzg.zzg);
                zztVar.zzy(zzglVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzglVarZzg.zzk);
                zzhVar.zzb(zzglVarZzg.zzl);
                zzhVar.zzc(zzglVarZzg.zzm);
                zzhVar.zze(zzglVarZzg.zzc + 8);
                zzhVar.zzf(zzglVarZzg.zzd + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzglVarZzg.zzi);
                zztVar.zzq(zzglVarZzg.zzj);
                zztVar.zzF(zzglVarZzg.zza + 1);
                zztVar.zzr(Collections.singletonList(bArr));
                zzv zzvVarZzP = zztVar.zzP();
                this.zzc.zzA(zzvVarZzP);
                int i14 = zzvVarZzP.zzr;
                zzgtr.zzi(i14 != -1);
                this.zza.zzb(i14);
                this.zze = true;
            }
        }
        zzaqr zzaqrVar4 = this.zzj;
        if (zzaqrVar4.zze(i10)) {
            int iZza = zzgr.zza(zzaqrVar4.zza, zzaqrVar4.zzb);
            zzeu zzeuVar = this.zzn;
            zzeuVar.zzb(zzaqrVar4.zza, iZza);
            zzeuVar.zzk(5);
            this.zza.zzc(j10, zzeuVar);
        }
        zzaqr zzaqrVar5 = this.zzk;
        if (zzaqrVar5.zze(i10)) {
            int iZza2 = zzgr.zza(zzaqrVar5.zza, zzaqrVar5.zzb);
            zzeu zzeuVar2 = this.zzn;
            zzeuVar2.zzb(zzaqrVar5.zza, iZza2);
            zzeuVar2.zzk(5);
            this.zza.zzc(j10, zzeuVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgr.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaqi zzaqiVar = this.zzd;
        if (zzaqiVar != null) {
            zzaqiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzb = zzaroVar.zzc();
        zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 2);
        this.zzc = zzahmVarZzs;
        this.zzd = new zzaqi(zzahmVarZzs);
        this.zza.zza(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzm = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzeu r18) {
        /*
            r17 = this;
            r0 = r17
            r7 = 3
            com.google.android.gms.internal.ads.zzahm r1 = r0.zzc
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfm.zza
        La:
            int r1 = r18.zzd()
            if (r1 <= 0) goto L78
            int r1 = r18.zzg()
            int r8 = r18.zze()
            byte[] r9 = r18.zzi()
            long r2 = r0.zzl
            int r4 = r18.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.zzl = r2
            com.google.android.gms.internal.ads.zzahm r2 = r0.zzc
            int r3 = r18.zzd()
            r10 = r18
            r2.zzc(r10, r3)
        L31:
            if (r1 >= r8) goto La
            boolean[] r2 = r0.zzf
            int r2 = com.google.android.gms.internal.ads.zzgr.zzi(r9, r1, r8, r2)
            if (r2 == r8) goto L75
            int r3 = r2 + 3
            r3 = r9[r3]
            r3 = r3 & 126(0x7e, float:1.77E-43)
            if (r2 <= 0) goto L4d
            int r4 = r2 + (-1)
            r5 = r9[r4]
            if (r5 != 0) goto L4d
            r2 = 4
            r12 = r2
            r11 = r4
            goto L4f
        L4d:
            r11 = r2
            r12 = r7
        L4f:
            int r2 = r11 - r1
            if (r2 <= 0) goto L56
            r0.zzg(r9, r1, r11)
        L56:
            r1 = r3
            int r3 = r8 - r11
            long r4 = r0.zzl
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L61
            int r2 = -r2
            goto L62
        L61:
            r2 = 0
        L62:
            int r13 = r1 >> 1
            r15 = r4
            r4 = r2
            r1 = r15
            long r5 = r0.zzm
            r0.zzh(r1, r3, r4, r5)
            long r5 = r0.zzm
            r4 = r13
            r0.zzf(r1, r3, r4, r5)
            int r1 = r11 + r12
            goto L31
        L75:
            r0.zzg(r9, r1, r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqj.zzd(com.google.android.gms.internal.ads.zzeu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
        this.zzc.getClass();
        String str = zzfm.zza;
        if (z2) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
