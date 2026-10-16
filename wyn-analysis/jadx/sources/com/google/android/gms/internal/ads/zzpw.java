package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class zzpw implements zzqf {
    public static final zzguj zza = zzpu.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzqe zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpw() {
        throw null;
    }

    private final void zzl(zznp zznpVar) {
        if (zznpVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpv zzpvVar = (zzpv) this.zze.get(str);
                zzpvVar.getClass();
                zzm(zzpvVar);
                return;
            }
            return;
        }
        zzpv zzpvVar2 = (zzpv) this.zze.get(this.zzh);
        int i5 = zznpVar.zzc;
        zzxl zzxlVar = zznpVar.zzd;
        this.zzh = zzo(i5, zzxlVar).zze();
        zzc(zznpVar);
        if (zzxlVar == null || !zzxlVar.zzb()) {
            return;
        }
        if (zzpvVar2 != null) {
            if (zzpvVar2.zzg() == zzxlVar.zzd && zzpvVar2.zzh() != null) {
                zzxl zzxlVarZzh = zzpvVar2.zzh();
                if (zzxlVarZzh.zzb == zzxlVar.zzb) {
                    zzxl zzxlVarZzh2 = zzpvVar2.zzh();
                    if (zzxlVarZzh2.zzc == zzxlVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i5, new zzxl(zzxlVar.zza, zzxlVar.zzd));
    }

    private final void zzm(zzpv zzpvVar) {
        if (zzpvVar.zzg() != -1 && zzpvVar.zzi()) {
            this.zzi = zzpvVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpv zzpvVar = (zzpv) this.zze.get(this.zzh);
        return (zzpvVar == null || zzpvVar.zzg() == -1) ? this.zzi + 1 : zzpvVar.zzg();
    }

    private final zzpv zzo(int i5, zzxl zzxlVar) {
        HashMap map = this.zze;
        long j8 = Long.MAX_VALUE;
        zzpv zzpvVar = null;
        for (zzpv zzpvVar2 : map.values()) {
            zzpvVar2.zzc(i5, zzxlVar);
            if (zzpvVar2.zzb(i5, zzxlVar)) {
                long jZzg = zzpvVar2.zzg();
                if (jZzg == -1 || jZzg < j8) {
                    zzpvVar = zzpvVar2;
                    j8 = jZzg;
                } else if (jZzg == j8) {
                    String str = zzfm.zza;
                    if (zzpvVar.zzh() != null && zzpvVar2.zzh() != null) {
                        zzpvVar = zzpvVar2;
                    }
                }
            }
        }
        if (zzpvVar != null) {
            return zzpvVar;
        }
        String strZzp = zzp();
        zzpv zzpvVar3 = new zzpv(this, strZzp, i5, zzxlVar);
        map.put(strZzp, zzpvVar3);
        return zzpvVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zza(zzqe zzqeVar) {
        this.zzf = zzqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized String zzb(zzbf zzbfVar, zzxl zzxlVar) {
        return zzo(zzbfVar.zzo(zzxlVar.zza, this.zzd).zzc, zzxlVar).zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zznp r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzqe r0 = r9.zzf     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Lb5
            com.google.android.gms.internal.ads.zzbf r0 = r10.zzb     // Catch: java.lang.Throwable -> L24
            boolean r1 = r0.zzg()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto Lf
            goto Lb3
        Lf:
            com.google.android.gms.internal.ads.zzxl r1 = r10.zzd     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L43
            long r2 = r1.zzd     // Catch: java.lang.Throwable -> L24
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L27
            long r6 = r9.zzi()     // Catch: java.lang.Throwable -> L24
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto Lb3
            goto L27
        L24:
            r10 = move-exception
            goto Lb7
        L27:
            java.util.HashMap r2 = r9.zze     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzpv r2 = (com.google.android.gms.internal.ads.zzpv) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L43
            long r6 = r2.zzg()     // Catch: java.lang.Throwable -> L24
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L43
            int r2 = r2.zzf()     // Catch: java.lang.Throwable -> L24
            int r3 = r10.zzc     // Catch: java.lang.Throwable -> L24
            if (r2 != r3) goto Lb3
        L43:
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzpv r3 = r9.zzo(r2, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r9.zzh     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L53
            java.lang.String r4 = r3.zze()     // Catch: java.lang.Throwable -> L24
            r9.zzh = r4     // Catch: java.lang.Throwable -> L24
        L53:
            r4 = 1
            if (r1 == 0) goto L8a
            boolean r5 = r1.zzb()     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r1.zza     // Catch: java.lang.Throwable -> L24
            long r6 = r1.zzd     // Catch: java.lang.Throwable -> L24
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzxl r8 = new com.google.android.gms.internal.ads.zzxl     // Catch: java.lang.Throwable -> L24
            r8.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzpv r2 = r9.zzo(r2, r8)     // Catch: java.lang.Throwable -> L24
            boolean r6 = r2.zzi()     // Catch: java.lang.Throwable -> L24
            if (r6 != 0) goto L8a
            r2.zzj(r4)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzbd r2 = r9.zzd     // Catch: java.lang.Throwable -> L24
            r0.zzo(r5, r2)     // Catch: java.lang.Throwable -> L24
            r2.zzc(r1)     // Catch: java.lang.Throwable -> L24
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzfm.zzs(r0)     // Catch: java.lang.Throwable -> L24
            long r7 = com.google.android.gms.internal.ads.zzfm.zzs(r0)     // Catch: java.lang.Throwable -> L24
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L24
        L8a:
            boolean r0 = r3.zzi()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L93
            r3.zzj(r4)     // Catch: java.lang.Throwable -> L24
        L93:
            java.lang.String r0 = r3.zze()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Lb3
            boolean r0 = r3.zzk()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto Lb3
            r3.zzl(r4)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzqe r0 = r9.zzf     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r3.zze()     // Catch: java.lang.Throwable -> L24
            r0.zzc(r10, r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r9)
            return
        Lb3:
            monitor-exit(r9)
            return
        Lb5:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L24
        Lb7:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L24
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpw.zzc(com.google.android.gms.internal.ads.zznp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zzd(zznp zznpVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = this.zzg;
            this.zzg = zznpVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpv zzpvVar = (zzpv) it.next();
                if (!zzpvVar.zza(zzbfVar, this.zzg) || zzpvVar.zzd(zznpVar)) {
                    it.remove();
                    if (zzpvVar.zze().equals(this.zzh)) {
                        zzm(zzpvVar);
                    }
                    if (zzpvVar.zzi()) {
                        this.zzf.zzd(zznpVar, zzpvVar.zze(), false);
                    }
                }
            }
            zzl(zznpVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zze(zznp zznpVar, int i5) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpv zzpvVar = (zzpv) it.next();
                if (zzpvVar.zzd(zznpVar)) {
                    it.remove();
                    boolean zEquals = zzpvVar.zze().equals(this.zzh);
                    if (zEquals) {
                        zzm(zzpvVar);
                    }
                    if (zzpvVar.zzi()) {
                        boolean z2 = false;
                        if (i5 == 0 && zEquals && zzpvVar.zzk()) {
                            z2 = true;
                        }
                        this.zzf.zzd(zznpVar, zzpvVar.zze(), z2);
                    }
                }
            }
            zzl(zznpVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final synchronized void zzg(zznp zznpVar) {
        zzqe zzqeVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzpv zzpvVar = (zzpv) this.zze.get(str);
                if (zzpvVar == null) {
                    throw null;
                }
                zzm(zzpvVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpv zzpvVar2 = (zzpv) it.next();
                it.remove();
                if (zzpvVar2.zzi() && (zzqeVar = this.zzf) != null) {
                    zzqeVar.zzd(zznpVar, zzpvVar2.zze(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzpw(zzguj zzgujVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }
}
