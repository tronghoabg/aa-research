package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class zzimv implements zzimz {
    private final Map zza;

    public zzimv(Map map) {
        this.zza = DesugarCollections.unmodifiableMap(map);
    }

    public final Map zza() {
        return this.zza;
    }
}
