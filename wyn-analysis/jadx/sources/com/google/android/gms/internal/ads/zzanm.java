package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzanm {
    public static void zza(zzann zzannVar, zzanr zzanrVar, zzdu zzduVar) {
        for (int i5 = 0; i5 < zzannVar.zza(); i5++) {
            long jZzb = zzannVar.zzb(i5);
            List listZzc = zzannVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i5 == zzannVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzannVar.zzb(i5 + 1) - zzannVar.zzb(i5);
                if (jZzb2 > 0) {
                    zzduVar.zza(new zzank(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
