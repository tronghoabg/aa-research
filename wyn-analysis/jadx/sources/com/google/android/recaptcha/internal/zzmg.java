package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
final class zzmg {
    public static final /* synthetic */ int zza = 0;
    private static final zzmg zzb = new zzmg();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzml zzc = new zzlp();

    private zzmg() {
    }

    public static zzmg zza() {
        return zzb;
    }

    public final zzmk zzb(Class cls) {
        zzla.zzc(cls, "messageType");
        zzmk zzmkVar = (zzmk) this.zzd.get(cls);
        if (zzmkVar != null) {
            return zzmkVar;
        }
        zzmk zzmkVarZza = this.zzc.zza(cls);
        zzla.zzc(cls, "messageType");
        zzmk zzmkVar2 = (zzmk) this.zzd.putIfAbsent(cls, zzmkVarZza);
        return zzmkVar2 == null ? zzmkVarZza : zzmkVar2;
    }
}
