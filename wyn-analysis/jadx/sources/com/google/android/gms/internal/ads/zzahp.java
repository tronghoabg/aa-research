package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzahp {
    public final List zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    private zzahp(List list, int i5, String str, int i10) {
        this.zza = list;
        this.zzb = i5;
        this.zzc = str;
        this.zzd = i10;
    }

    public static zzahp zza(zzeu zzeuVar) throws zzat {
        String str;
        int iZzs;
        int iZzs2;
        int i5;
        int i10;
        int i11;
        try {
            if (zzeuVar.zzB() != 0) {
                throw zzat.zzb("Unsupported VVC version", null);
            }
            int iZzs3 = zzeuVar.zzs();
            int i12 = iZzs3 >> 1;
            int i13 = 1;
            str = "L";
            if ((iZzs3 & 1) != 0) {
                zzeuVar.zzk(1);
                int iZzs4 = zzeuVar.zzs() >> 4;
                iZzs = zzeuVar.zzs() >> 5;
                int iZzs5 = zzeuVar.zzs() & 63;
                int iZzs6 = zzeuVar.zzs();
                i5 = iZzs6 >> 1;
                str = (iZzs6 & 1) != 0 ? "H" : "L";
                iZzs2 = zzeuVar.zzs();
                zzeuVar.zzk(iZzs5);
                int i14 = iZzs4 & 7;
                if (i14 > 1) {
                    int iZzs7 = zzeuVar.zzs();
                    for (int i15 = 0; i15 < i14 - 1; i15++) {
                        if (((iZzs7 >> (7 - i15)) & 1) != 0) {
                            zzeuVar.zzk(1);
                        }
                    }
                }
                zzeuVar.zzk(zzeuVar.zzs() * 4);
                zzeuVar.zzk(6);
            } else {
                iZzs = 0;
                iZzs2 = 0;
                i5 = 0;
            }
            int iZzs8 = zzeuVar.zzs();
            int iZzg = zzeuVar.zzg();
            int i16 = 0;
            int i17 = 0;
            while (true) {
                i10 = 12;
                i11 = 13;
                if (i16 >= iZzs8) {
                    break;
                }
                int iZzs9 = zzeuVar.zzs() & 31;
                int iZzt = (iZzs9 == 13 || iZzs9 == 12) ? 1 : zzeuVar.zzt();
                for (int i18 = 0; i18 < iZzt; i18++) {
                    int iZzt2 = zzeuVar.zzt();
                    i17 = iZzt2 + 4 + i17;
                    zzeuVar.zzk(iZzt2);
                }
                i16++;
            }
            zzeuVar.zzh(iZzg);
            byte[] bArr = new byte[i17];
            int i19 = 0;
            int i20 = 0;
            while (i19 < iZzs8) {
                int iZzs10 = zzeuVar.zzs() & 31;
                int iZzt3 = (iZzs10 == i11 || iZzs10 == i10) ? i13 : zzeuVar.zzt();
                int i21 = i13;
                for (int i22 = 0; i22 < iZzt3; i22++) {
                    int iZzt4 = zzeuVar.zzt();
                    System.arraycopy(zzgr.zza, 0, bArr, i20, 4);
                    int i23 = i20 + 4;
                    zzeuVar.zzm(bArr, i23, iZzt4);
                    i20 = i23 + iZzt4;
                }
                i19++;
                i13 = i21;
                i10 = 12;
                i11 = 13;
            }
            Locale locale = Locale.US;
            return new zzahp(zzgwt.zzj(bArr), (i12 & 3) + 1, "vvc1." + i5 + "." + str + iZzs2, iZzs + 8);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw zzat.zzb("Error parsing VVC configuration", e7);
        }
    }
}
