package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
class zzgvd extends zzguw implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzgvj zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvd(zzgvj zzgvjVar, SortedMap sortedMap) {
        super(zzgvjVar, sortedMap);
        Objects.requireNonNull(zzgvjVar);
        this.zze = zzgvjVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzgvd(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzgvd(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzgvd(this.zze, zzg().tailMap(obj));
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    /* renamed from: zze */
    public SortedSet zzh() {
        return new zzgve(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzguw, com.google.android.gms.internal.ads.zzgxz, java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzh = zzh();
        this.zzd = sortedSetZzh;
        return sortedSetZzh;
    }

    public SortedMap zzg() {
        return (SortedMap) ((zzguw) this).zza;
    }
}
