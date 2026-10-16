package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgze extends zzgxd {
    final transient Object zza;

    public zzgze(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgxl(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* renamed from: zza */
    public final zzgzh iterator() {
        return new zzgxl(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    public final zzgwt zze() {
        return zzgwt.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg(Object[] objArr, int i5) {
        objArr[i5] = this.zza;
        return i5 + 1;
    }
}
