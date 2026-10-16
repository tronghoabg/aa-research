package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzahx implements zzahs {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzahx(int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i5;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    public static zzahx zzb(zzeu zzeuVar) {
        int iZzC = zzeuVar.zzC();
        zzeuVar.zzk(12);
        int iZzC2 = zzeuVar.zzC();
        int iZzC3 = zzeuVar.zzC();
        int iZzC4 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        int iZzC5 = zzeuVar.zzC();
        int iZzC6 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        return new zzahx(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzeuVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i5 = this.zza;
        if (i5 == 1935960438) {
            return 2;
        }
        if (i5 == 1935963489) {
            return 1;
        }
        if (i5 == 1937012852) {
            return 3;
        }
        zzeh.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i5))));
        return -1;
    }

    public final long zzd() {
        return zzfm.zzw(this.zzd, this.zzb * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
