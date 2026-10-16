package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgxr extends zzgzg {
    final /* synthetic */ zzgxs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgxr(zzgxs zzgxsVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgxsVar);
        this.zza = zzgxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzf
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
