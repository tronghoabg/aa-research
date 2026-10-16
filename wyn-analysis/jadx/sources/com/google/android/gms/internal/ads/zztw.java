package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zztw implements zztm {
    public zztw(zztv zztvVar) {
    }

    public static int zza(int i5, int i10, int i11) {
        return zzhaq.zza(((i5 * i10) * i11) / 1000000);
    }

    public static final int zzb(int i5, int i10, int i11, int i12, int i13, int i14) {
        int i15 = 250000;
        if (i11 == 0) {
            int iZza = zza(250000, i13, i12);
            int iZza2 = zza(750000, i13, i12);
            String str = zzfm.zza;
            return Math.max(iZza, Math.min(i5 * 4, iZza2));
        }
        if (i11 == 1) {
            return zzhaq.zza((zzc(i10) * 50000000) / 1000000);
        }
        if (i10 == 5) {
            i15 = 500000;
        } else if (i10 == 8) {
            i15 = 1000000;
            i10 = 8;
        }
        return zzhaq.zza((i15 * (i14 != -1 ? zzhag.zzb(i14, 8, RoundingMode.CEILING) : zzc(i10))) / 1000000);
    }

    private static int zzc(int i5) {
        int iZzf = zzage.zzf(i5);
        zzgtr.zzi(iZzf != -2147483647);
        return iZzf;
    }
}
