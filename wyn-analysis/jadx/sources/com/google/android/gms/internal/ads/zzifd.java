package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzifd implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zziff zziffVar = (zziff) this.zza.getValue();
        if (zziffVar == null) {
            return null;
        }
        return zziffVar.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzifz)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.zza;
        zzifz zzifzVar = ((zziff) entry.getValue()).zza;
        entry.setValue(new zziff((zzifz) obj));
        return zzifzVar;
    }

    public final zziff zza() {
        return (zziff) this.zza.getValue();
    }
}
