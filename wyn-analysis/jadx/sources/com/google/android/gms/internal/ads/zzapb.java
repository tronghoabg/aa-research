package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzapb {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzeu zzc = new zzeu();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzeu zzeuVar) {
        while (true) {
            for (boolean z2 = true; zzeuVar.zzd() > 0 && z2; z2 = false) {
                char c10 = (char) zzeuVar.zzi()[zzeuVar.zzg()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzeuVar.zzk(1);
                } else {
                    int iZzg = zzeuVar.zzg();
                    int iZze = zzeuVar.zze();
                    byte[] bArrZzi = zzeuVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i5 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i10 = iZzg + 2;
                            if (bArrZzi[i5] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i10]) == '*' && ((char) bArrZzi[i11]) == '/') {
                                        iZze = i10 + 2;
                                        i10 = iZze;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                zzeuVar.zzk(iZze - zzeuVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String zzc(zzeu zzeuVar, StringBuilder sb2) {
        zzb(zzeuVar);
        if (zzeuVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzeuVar, sb2);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzeuVar.zzs();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzs).length());
        sb3.append(cZzs);
        return sb3.toString();
    }

    private static String zzd(zzeu zzeuVar, StringBuilder sb2) {
        boolean z2;
        char c10;
        sb2.setLength(0);
        int iZzg = zzeuVar.zzg();
        int iZze = zzeuVar.zze();
        loop0: while (true) {
            for (false; iZzg < iZze && !z2; true) {
                c10 = (char) zzeuVar.zzi()[iZzg];
                z2 = (c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_');
            }
            sb2.append(c10);
            iZzg++;
        }
        zzeuVar.zzk(iZzg - zzeuVar.zzg());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x030b, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzeu r18) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapb.zza(com.google.android.gms.internal.ads.zzeu):java.util.List");
    }
}
