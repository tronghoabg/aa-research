package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
final class zzgva extends zzgvd implements NavigableMap {
    final /* synthetic */ zzgvj zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgva(zzgvj zzgvjVar, NavigableMap navigableMap) {
        super(zzgvjVar, navigableMap);
        Objects.requireNonNull(zzgvjVar);
        this.zzc = zzgvjVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return zzb(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzgva(this.zzc, ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return zzb(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return zzb(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return zzb(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, com.google.android.gms.internal.ads.zzguw, com.google.android.gms.internal.ads.zzgxz, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return zzb(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return zzb(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzgvj zzgvjVar = this.zzc;
        Collection collectionZzc = zzgvjVar.zzc();
        collectionZzc.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), zzgvjVar.zza(collectionZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, com.google.android.gms.internal.ads.zzgxz
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzh() {
        return new zzgvb(this.zzc, (NavigableMap) ((SortedMap) ((zzguw) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzgvd
    /* renamed from: zzf */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.zzgvd
    public final /* synthetic */ SortedMap zzg() {
        return (NavigableMap) ((SortedMap) ((zzguw) this).zza);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z2) {
        return new zzgva(this.zzc, ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).headMap(obj, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z10) {
        return new zzgva(this.zzc, ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).subMap(obj, z2, obj2, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z2) {
        return new zzgva(this.zzc, ((NavigableMap) ((SortedMap) ((zzguw) this).zza)).tailMap(obj, z2));
    }
}
