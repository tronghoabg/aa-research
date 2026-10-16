package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class zzgus extends zzgvj implements zzgxo {
    public zzgus(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public final Collection zza(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
