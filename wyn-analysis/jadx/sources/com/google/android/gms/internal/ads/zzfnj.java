package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzfnj {
    private final HashMap zza = new HashMap();

    public final zzfni zza(zzfmz zzfmzVar, Context context, zzfmr zzfmrVar, zzfno zzfnoVar) {
        HashMap map = this.zza;
        zzfni zzfniVar = (zzfni) map.get(zzfmzVar);
        if (zzfniVar != null) {
            return zzfniVar;
        }
        zzfmw zzfmwVar = new zzfmw(zzfnc.zza(zzfmzVar, context));
        zzfni zzfniVar2 = new zzfni(zzfmwVar, new zzfnr(zzfmwVar, zzfmrVar, zzfnoVar));
        map.put(zzfmzVar, zzfniVar2);
        return zzfniVar2;
    }
}
