package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaho {
    public static final /* synthetic */ int zza = 0;
    private static final zzham zzb = zzham.zzb(0, 2, 1);
    private static final zzham zzc = zzham.zzc(0, 2, 1, 3, 4);
    private static final zzham zzd = zzham.zzd(0, 2, 1, 5, 3, 4);
    private static final zzham zze = zzham.zze(0, 2, 1, 6, 5, 3, 4);
    private static final zzham zzf = zzham.zze(0, 2, 1, 7, 5, 6, 3, 4);

    public static zzham zza(int i5) {
        if (i5 == 3) {
            return zzb;
        }
        if (i5 == 5) {
            return zzc;
        }
        if (i5 == 6) {
            return zzd;
        }
        if (i5 == 7) {
            return zze;
        }
        if (i5 != 8) {
            return null;
        }
        return zzf;
    }

    public static zzap zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = (String) list.get(i5);
            String str2 = zzfm.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzeh.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzajg.zzb(new zzeu(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    zzeh.zzd("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new zzakc(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }
}
