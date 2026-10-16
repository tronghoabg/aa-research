package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzhnm implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzhnm(zzhnp zzhnpVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhnpVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhno(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
