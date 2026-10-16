package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgxa extends zzgwp {
    private final transient zzgxb zza;

    public zzgxa(zzgxb zzgxbVar) {
        this.zza = zzgxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwy(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* renamed from: zza */
    public final zzgzh iterator() {
        return new zzgwy(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg(Object[] objArr, int i5) {
        zzgzi zzgziVarListIterator = ((zzgwt) this.zza.map.values()).listIterator(0);
        while (zzgziVarListIterator.hasNext()) {
            i5 = ((zzgwp) zzgziVarListIterator.next()).zzg(objArr, i5);
        }
        return i5;
    }
}
