package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgyq extends zzgxd {
    private final transient zzgww zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgyq(zzgww zzgwwVar, Object[] objArr, int i5, int i10) {
        this.zza = zzgwwVar;
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* renamed from: zza */
    public final zzgzh iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg(Object[] objArr, int i5) {
        return zze().zzg(objArr, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final zzgwt zzs() {
        return new zzgyp(this);
    }

    public final /* synthetic */ Object[] zzw() {
        return this.zzb;
    }

    public final /* synthetic */ int zzx() {
        return this.zzc;
    }
}
