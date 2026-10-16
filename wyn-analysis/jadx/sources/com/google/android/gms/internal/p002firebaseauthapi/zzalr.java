package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzalr {
    private static final zzalr zza = new zzalr();
    private final ConcurrentMap<Class<?>, zzalv<?>> zzc = new ConcurrentHashMap();
    private final zzalu zzb = new zzakq();

    private zzalr() {
    }

    public static zzalr zza() {
        return zza;
    }

    public final <T> zzalv<T> zza(Class<T> cls) {
        zzakb.zza(cls, "messageType");
        zzalv<T> zzalvVarZza = (zzalv) this.zzc.get(cls);
        if (zzalvVarZza == null) {
            zzalvVarZza = this.zzb.zza(cls);
            zzakb.zza(cls, "messageType");
            zzakb.zza(zzalvVarZza, "schema");
            zzalv<T> zzalvVar = (zzalv) this.zzc.putIfAbsent(cls, zzalvVarZza);
            if (zzalvVar != null) {
                return zzalvVar;
            }
        }
        return zzalvVarZza;
    }

    public final <T> zzalv<T> zza(T t10) {
        return zza((Class) t10.getClass());
    }
}
