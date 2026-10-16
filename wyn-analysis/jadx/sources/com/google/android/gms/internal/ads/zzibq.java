package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzibq extends zzibr implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzibq) && ((zzibq) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zzibr zzibrVar) {
        this.zza.add(zzibrVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzibr zzc(int i5) {
        return (zzibr) this.zza.get(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzibr) arrayList.get(0)).zzd();
        }
        throw new IllegalStateException(N0.a.d(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }
}
