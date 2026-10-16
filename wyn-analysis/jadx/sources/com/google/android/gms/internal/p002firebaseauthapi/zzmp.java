package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmp<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmp<E, O> zza(E e7, O o7) {
        this.zza.put(e7, o7);
        this.zzb.put(o7, e7);
        return this;
    }

    private zzmp() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmm<E, O> zza() {
        return new zzmm<>(DesugarCollections.unmodifiableMap(this.zza), DesugarCollections.unmodifiableMap(this.zzb));
    }
}
