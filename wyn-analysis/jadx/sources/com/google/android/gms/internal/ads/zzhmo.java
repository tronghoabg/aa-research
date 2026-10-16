package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhmo {
    private HashMap zza = new HashMap();

    public final zzhmp zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhmp zzhmpVar = new zzhmp(DesugarCollections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhmpVar;
    }
}
