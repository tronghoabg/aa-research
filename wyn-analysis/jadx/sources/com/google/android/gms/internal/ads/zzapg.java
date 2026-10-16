package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
final class zzapg {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzapg(String str, int i5, String str2, Set set) {
        this.zzb = i5;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzapg zza(String str, int i5) {
        String str2;
        String strTrim = str.trim();
        zzgtr.zza(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(StringUtils.SPACE);
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzfm.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            hashSet.add(strArrSplit[i10]);
        }
        return new zzapg(str4, i5, str2, hashSet);
    }

    public static zzapg zzb() {
        return new zzapg("", 0, "", Collections.EMPTY_SET);
    }
}
