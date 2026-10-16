package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzidd extends zzide {
    final /* synthetic */ zzidl zza;
    private int zzb;
    private final int zzc;

    public zzidd(zzidl zzidlVar) {
        Objects.requireNonNull(zzidlVar);
        this.zza = zzidlVar;
        this.zzb = 0;
        this.zzc = zzidlVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidg
    public final byte zza() {
        int i5 = this.zzb;
        if (i5 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i5 + 1;
        return this.zza.zza(i5);
    }
}
