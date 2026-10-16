package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzay extends zzal {
    private final /* synthetic */ zzav zza;

    public zzay(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzy.zza(i5, this.zza.zzc);
        int i10 = i5 * 2;
        Object obj = this.zza.zzb[i10];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }
}
