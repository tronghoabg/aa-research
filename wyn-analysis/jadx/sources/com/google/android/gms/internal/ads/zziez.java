package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* loaded from: classes3.dex */
public final class zziez extends AbstractList {
    private final zziex zza;
    private final zziey zzb;

    public zziez(zziex zziexVar, zziey zzieyVar) {
        this.zza = zziexVar;
        this.zzb = zzieyVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return this.zzb.zzb(this.zza.zzf(i5));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
