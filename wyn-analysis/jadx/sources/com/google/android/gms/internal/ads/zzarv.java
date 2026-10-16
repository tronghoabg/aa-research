package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzarv implements zzaru {
    private final zzagd zza;
    private final zzahm zzb;
    private final zzary zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzarv(zzagd zzagdVar, zzahm zzahmVar, zzary zzaryVar, String str, int i5) throws zzat {
        this.zza = zzagdVar;
        this.zzb = zzahmVar;
        this.zzc = zzaryVar;
        int i10 = zzaryVar.zzb * zzaryVar.zze;
        int i11 = zzaryVar.zzd;
        int i12 = i10 / 8;
        if (i11 != i12) {
            throw zzat.zzb(com.google.android.gms.internal.consent_sdk.a.u(i12, i11, "Expected block size: ", "; got: ", new StringBuilder(String.valueOf(i12).length() + 28 + String.valueOf(i11).length())), null);
        }
        int i13 = zzaryVar.zzc * i12;
        int i14 = i13 * 8;
        int iMax = Math.max(i12, i13 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i14);
        zztVar.zzj(i14);
        zztVar.zzp(iMax);
        zztVar.zzG(zzaryVar.zzb);
        zztVar.zzH(zzft.zzb(zzaryVar.zzg));
        zztVar.zzI(zzaryVar.zzc);
        zztVar.zzJ(i5);
        this.zzd = zztVar.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zza(long j8) {
        this.zzf = j8;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final void zzb(int i5, long j8) {
        zzasb zzasbVar = new zzasb(this.zzc, 1, i5, j8);
        this.zza.zzw(zzasbVar);
        zzahm zzahmVar = this.zzb;
        zzahmVar.zzA(this.zzd);
        zzahmVar.zzP(zzasbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final boolean zzc(zzagb zzagbVar, long j8) throws IOException {
        int i5;
        int i10;
        long j10 = j8;
        while (j10 > 0 && (i5 = this.zzg) < (i10 = this.zze)) {
            int iZza = this.zzb.zza(zzagbVar, (int) Math.min(i10 - i5, j10), true);
            if (iZza == -1) {
                j10 = 0;
            } else {
                this.zzg += iZza;
                j10 -= iZza;
            }
        }
        zzary zzaryVar = this.zzc;
        int i11 = this.zzg;
        int i12 = zzaryVar.zzd;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jZzw = this.zzf + zzfm.zzw(this.zzh, 1000000L, zzaryVar.zzc, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.zzg - i14;
            this.zzb.zze(jZzw, 1, i14, i15, null);
            this.zzh += i13;
            this.zzg = i15;
        }
        return j10 <= 0;
    }
}
