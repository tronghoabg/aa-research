package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class zzgxb<K, V> extends zzgvn<K, V> implements Serializable {
    final transient zzgww<K, ? extends zzgwp<V>> map;
    final transient int size;

    public zzgxb(zzgww zzgwwVar, int i5) {
        this.map = zzgwwVar;
        this.size = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgyb
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyb
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final /* synthetic */ Collection zzj() {
        return new zzgxa(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
