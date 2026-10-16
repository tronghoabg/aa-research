package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhlu {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhlu() {
    }

    public final zzhlu zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzhlv zzb() {
        return new zzhlv(DesugarCollections.unmodifiableMap(this.zza), DesugarCollections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzhlu(byte[] bArr) {
    }
}
