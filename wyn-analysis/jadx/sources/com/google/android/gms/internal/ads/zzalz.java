package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzalz {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z2 = false;
        while (it.hasNext()) {
            String str2 = ((zzams) it.next()).zza.zzg.zzp;
            if (zzas.zzb(str2)) {
                return "video/mp4";
            }
            if (zzas.zza(str2)) {
                z2 = true;
            } else if (zzas.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z2 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
