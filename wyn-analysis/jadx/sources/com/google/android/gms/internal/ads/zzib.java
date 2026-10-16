package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzib extends zzgwj {
    private final Map zza;

    public zzib(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final Set entrySet() {
        return zzgzd.zzb(this.zza.entrySet(), zzhz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final int hashCode() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final Set keySet() {
        return zzgzd.zzb(this.zza.keySet(), zzia.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgwk
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }
}
