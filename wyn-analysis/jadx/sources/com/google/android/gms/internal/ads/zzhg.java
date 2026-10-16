package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class zzhg {
    public static int zza(int i5) {
        int i10 = 0;
        while (i5 > 0) {
            i5 >>>= 1;
            i10++;
        }
        return i10;
    }

    public static zzhd zzb(zzeu zzeuVar, boolean z2, boolean z10) throws zzat {
        if (z2) {
            zzc(3, zzeuVar, false);
        }
        String strZzK = zzeuVar.zzK((int) zzeuVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzeuVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i5 = 0; i5 < jZzA; i5++) {
            String strZzK2 = zzeuVar.zzK((int) zzeuVar.zzA(), StandardCharsets.UTF_8);
            strArr[i5] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z10 && (zzeuVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzhd(strZzK, strArr, length2 + 1);
    }

    public static boolean zzc(int i5, zzeu zzeuVar, boolean z2) throws zzat {
        if (zzeuVar.zzd() < 7) {
            if (z2) {
                return false;
            }
            int iZzd = zzeuVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iZzd);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (zzeuVar.zzs() != i5) {
            if (z2) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i5))), null);
        }
        if (zzeuVar.zzs() == 118 && zzeuVar.zzs() == 111 && zzeuVar.zzs() == 114 && zzeuVar.zzs() == 98 && zzeuVar.zzs() == 105 && zzeuVar.zzs() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
