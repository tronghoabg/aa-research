package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzapw implements zzaqa {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzahm zzi;
    private zzahm zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzahm zzw;
    private long zzx;
    private final zzet zzc = new zzet(new byte[7], 7);
    private final zzeu zzd = new zzeu(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzapw(boolean z2, String str, int i5, String str2) {
        this.zzb = z2;
        this.zze = str;
        this.zzf = i5;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i5) {
        return (i5 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzeu zzeuVar, byte[] bArr, int i5) {
        int iMin = Math.min(zzeuVar.zzd(), i5 - this.zzl);
        zzeuVar.zzm(bArr, this.zzl, iMin);
        int i10 = this.zzl + iMin;
        this.zzl = i10;
        return i10 == i5;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzahm zzahmVar, long j8, int i5, int i10) {
        this.zzk = 4;
        this.zzl = i5;
        this.zzw = zzahmVar;
        this.zzx = j8;
        this.zzu = i10;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b5, byte b10) {
        return zzf((b10 & ForkServer.ERROR) | 65280);
    }

    private static final boolean zzm(zzeu zzeuVar, byte[] bArr, int i5) {
        if (zzeuVar.zzd() < i5) {
            return false;
        }
        zzeuVar.zzm(bArr, 0, i5);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzh = zzaroVar.zzc();
        zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 1);
        this.zzi = zzahmVarZzs;
        this.zzw = zzahmVarZzs;
        if (!this.zzb) {
            this.zzj = new zzafx();
            return;
        }
        zzaroVar.zza();
        zzahm zzahmVarZzs2 = zzagdVar.zzs(zzaroVar.zzb(), 5);
        this.zzj = zzahmVarZzs2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaroVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo("application/id3");
        zzahmVarZzs2.zzA(zztVar.zzP());
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzv = j8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0261, code lost:
    
        r20.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
    
        if (r20.zzo != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
    
        r20.zzk = 1;
        r20.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0270, code lost:
    
        r21.zzh(r13);
        r9 = r19;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ec, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0253, code lost:
    
        r20.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025c, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzeu r21) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapw.zzd(com.google.android.gms.internal.ads.zzeu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
    }
}
