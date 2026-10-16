package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzicm extends zzibx {
    public static final zzicm zza = new zzicm();

    private zzicm() {
    }

    public final void zza(zzicq zzicqVar, zzibr zzibrVar) throws IOException {
        if (zzibrVar == null || (zzibrVar instanceof zzibs)) {
            zzicqVar.zzj();
            return;
        }
        if (zzibrVar instanceof zzibv) {
            zzibv zzibvVarZzg = zzibrVar.zzg();
            if (zzibvVarZzg.zzc()) {
                zzicqVar.zzi(zzibvVarZzg.zzh());
                return;
            } else if (zzibvVarZzg.zza()) {
                zzicqVar.zzh(zzibvVarZzg.zzb());
                return;
            } else {
                zzicqVar.zzg(zzibvVarZzg.zzd());
                return;
            }
        }
        if (zzibrVar instanceof zzibq) {
            zzicqVar.zzb();
            Iterator it = zzibrVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzicqVar, (zzibr) it.next());
            }
            zzicqVar.zzc();
            return;
        }
        if (!(zzibrVar instanceof zzibt)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzibrVar.getClass())));
        }
        zzicqVar.zzd();
        for (Map.Entry entry : zzibrVar.zze().zzb()) {
            zzicqVar.zzf((String) entry.getKey());
            zza(zzicqVar, (zzibr) entry.getValue());
        }
        zzicqVar.zze();
    }
}
