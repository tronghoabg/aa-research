package com.google.android.gms.internal.ads;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class zzgww<K, V> implements Map<K, V>, Serializable, j$.util.Map {
    private transient zzgxd zza;
    private transient zzgxd zzb;
    private transient zzgwp zzc;

    public static zzgww zza() {
        return zzgyt.zza;
    }

    public static zzgww zzb(Object obj, Object obj2) {
        zzgvp.zza("dialog_not_shown_reason", obj2);
        return zzgyt.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgww zzc(Map map) {
        if ((map instanceof zzgww) && !(map instanceof SortedMap)) {
            zzgww zzgwwVar = (zzgww) map;
            zzgwwVar.zzj();
            return zzgwwVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgwv zzgwvVar = new zzgwv(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgwvVar.zzb(setEntrySet);
        return zzgwvVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgya.zzb(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgzd.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        zzgvp.zzb(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z2 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z2) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z2 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgxd entrySet() {
        zzgxd zzgxdVar = this.zza;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxd zzgxdVarZze = zze();
        this.zza = zzgxdVarZze;
        return zzgxdVarZze;
    }

    public abstract zzgxd zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgxd keySet() {
        zzgxd zzgxdVar = this.zzb;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxd zzgxdVarZzg = zzg();
        this.zzb = zzgxdVarZzg;
        return zzgxdVarZzg;
    }

    public abstract zzgxd zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgwp values() {
        zzgwp zzgwpVar = this.zzc;
        if (zzgwpVar != null) {
            return zzgwpVar;
        }
        zzgwp zzgwpVarZzi = zzi();
        this.zzc = zzgwpVarZzi;
        return zzgwpVarZzi;
    }

    public abstract zzgwp zzi();

    public abstract boolean zzj();

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
