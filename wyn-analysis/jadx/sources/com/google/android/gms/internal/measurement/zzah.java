package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
final class zzah implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzaf zzb;

    public zzah(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zzb();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.zza >= this.zzb.zzb()) {
            throw new NoSuchElementException(AbstractC3256n.g(this.zza, "Out of bounds index: "));
        }
        zzaf zzafVar = this.zzb;
        int i5 = this.zza;
        this.zza = i5 + 1;
        return zzafVar.zza(i5);
    }
}
