package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class zzhmx {
    private static final zzhmx zzb = new zzhmx();
    private final ConcurrentMap zza = new ConcurrentHashMap();

    public static zzhmx zza() {
        return zzb;
    }

    public final void zzb(zzhmw zzhmwVar, Class cls) throws GeneralSecurityException {
        zzhmw zzhmwVar2 = (zzhmw) this.zza.putIfAbsent(cls, zzhmwVar);
        if (zzhmwVar2 != null && !zzhmwVar2.equals(zzhmwVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
