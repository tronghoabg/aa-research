package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaly implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzalw zzc;

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zza;
        return (i5 > 0 && i5 <= this.zzc.zzb) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] objArr = this.zzc.zza;
        int i5 = this.zza - 1;
        this.zza = i5;
        return (zzama) objArr[i5];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzaly(zzalw zzalwVar) {
        this.zzc = zzalwVar;
        this.zza = zzalwVar.zzb;
    }
}
