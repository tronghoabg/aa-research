package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;

/* loaded from: classes3.dex */
public final class zzfw {
    public final String zza;

    private zzfw(int i5, int i10, String str) {
        this.zza = str;
    }

    public static zzfw zza(zzeu zzeuVar) {
        String str;
        zzeuVar.zzk(2);
        int iZzs = zzeuVar.zzs();
        int i5 = iZzs >> 1;
        int i10 = iZzs & 1;
        int iZzs2 = zzeuVar.zzs() >> 3;
        if (i5 == 4 || i5 == 5 || i5 == 7 || i5 == 8) {
            str = "dvhe";
        } else if (i5 == 9) {
            str = "dvav";
        } else {
            if (i5 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i11 = iZzs2 | (i10 << 5);
        String str2 = i5 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i5).length();
        int length3 = String.valueOf(i11).length();
        String str3 = i11 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(length + length2, length3, str3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i5);
        sb2.append(str3);
        sb2.append(i11);
        return new zzfw(i5, i11, sb2.toString());
    }
}
