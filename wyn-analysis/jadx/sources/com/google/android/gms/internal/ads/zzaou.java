package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzaou {
    public static zzaov zza(zzaov zzaovVar, String[] strArr, Map map) {
        int length;
        int i5 = 0;
        if (zzaovVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaov) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaov zzaovVar2 = new zzaov();
                while (i5 < length2) {
                    zzaovVar2.zzr((zzaov) map.get(strArr[i5]));
                    i5++;
                }
                return zzaovVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaovVar.zzr((zzaov) map.get(strArr[0]));
                return zzaovVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i5 < length) {
                    zzaovVar.zzr((zzaov) map.get(strArr[i5]));
                    i5++;
                }
            }
        }
        return zzaovVar;
    }
}
