package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzimp implements Iterator {
    int zza = 0;
    final /* synthetic */ zzimq zzb;

    public zzimp(zzimq zzimqVar) {
        this.zzb = zzimqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zza;
        zzimq zzimqVar = this.zzb;
        return i5 < zzimqVar.zza.size() || zzimqVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.zza;
        zzimq zzimqVar = this.zzb;
        List list = zzimqVar.zza;
        if (i5 >= list.size()) {
            list.add(zzimqVar.zzb.next());
            return next();
        }
        int i10 = this.zza;
        this.zza = i10 + 1;
        return list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
