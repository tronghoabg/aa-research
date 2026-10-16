package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaku implements zzaga {
    public static final /* synthetic */ int zza = 0;
    private final zzeu zzb;
    private final zzagx zzc;
    private final zzagt zzd;
    private final zzagv zze;
    private final zzahm zzf;
    private zzagd zzg;
    private zzahm zzh;
    private zzahm zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzaky zzr;
    private boolean zzs;

    public zzaku() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzi(com.google.android.gms.internal.ads.zzagb r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaku.zzi(com.google.android.gms.internal.ads.zzagb):int");
    }

    private final long zzj(long j8) {
        zzagx zzagxVar = this.zzc;
        return ((j8 * 1000000) / zzagxVar.zzd) + this.zzm;
    }

    private final boolean zzk(zzagb zzagbVar, boolean z2) throws IOException {
        int iZzm;
        int i5;
        int iZza;
        zzagbVar.zzl();
        if (zzagbVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzagbVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzagbVar.zzm();
            if (!z2) {
                zzagbVar.zzf(iZzm);
            }
            i5 = 0;
        } else {
            iZzm = 0;
            i5 = 0;
        }
        int i10 = i5;
        int i11 = i10;
        while (true) {
            if (!zzl(zzagbVar)) {
                zzeu zzeuVar = this.zzb;
                zzeuVar.zzh(0);
                int iZzB = zzeuVar.zzB();
                if ((i5 == 0 || zzn(iZzB, i5)) && (iZza = zzagy.zza(iZzB)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(iZzB);
                        i5 = iZzB;
                    }
                    zzagbVar.zzk(iZza - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == 131072) {
                        if (z2) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z2) {
                        zzagbVar.zzl();
                        zzagbVar.zzk(iZzm + i12);
                    } else {
                        zzagbVar.zzf(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i5 = 0;
                }
            } else if (i10 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z2) {
            zzagbVar.zzf(iZzm + i11);
        } else {
            zzagbVar.zzl();
        }
        this.zzj = i5;
        return true;
    }

    private final boolean zzl(zzagb zzagbVar) throws IOException {
        zzaky zzakyVar = this.zzr;
        if (zzakyVar != null) {
            long jZzg = zzakyVar.zzg();
            if (jZzg != -1 && zzagbVar.zzm() > jZzg - 4) {
                return true;
            }
        }
        try {
            return !zzagbVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzaky zzakyVar = this.zzr;
        if ((zzakyVar instanceof zzakp) && zzakyVar.zzb()) {
            long j8 = this.zzp;
            if (j8 == -1 || j8 == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((zzakp) this.zzr).zzi(this.zzp);
            zzagd zzagdVar = this.zzg;
            zzagdVar.getClass();
            zzagdVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i5, long j8) {
        return ((long) (i5 & (-128000))) == (j8 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return zzk(zzagbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzg = zzagdVar;
        zzahm zzahmVarZzs = zzagdVar.zzs(0, 1);
        this.zzh = zzahmVarZzs;
        this.zzi = zzahmVarZzs;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfm.zza;
        int iZzi = zzi(zzagbVar);
        if (iZzi == -1 && (this.zzr instanceof zzakq)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzj = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        if (this.zzr instanceof zzakq) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public final void zzh() {
        this.zzs = true;
    }

    public zzaku(int i5) {
        this.zzb = new zzeu(10);
        this.zzc = new zzagx();
        this.zzd = new zzagt();
        this.zzm = -9223372036854775807L;
        this.zze = new zzagv();
        zzafx zzafxVar = new zzafx();
        this.zzf = zzafxVar;
        this.zzi = zzafxVar;
        this.zzp = -1L;
    }
}
