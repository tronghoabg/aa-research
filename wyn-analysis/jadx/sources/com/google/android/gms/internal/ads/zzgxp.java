package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgxp extends zzgzg {
    final /* synthetic */ zzgxq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgxp(zzgxq zzgxqVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgxqVar);
        this.zza = zzgxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzf
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
