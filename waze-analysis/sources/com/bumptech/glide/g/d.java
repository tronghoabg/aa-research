package com.bumptech.glide.g;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d<K, V> extends ArrayMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private int f2895a;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.f2895a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        int i2 = this.f2895a;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = super.hashCode();
        this.f2895a = iHashCode;
        return iHashCode;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final V put(K k2, V v) {
        this.f2895a = 0;
        return (V) super.put(k2, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f2895a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V removeAt(int i2) {
        this.f2895a = 0;
        return (V) super.removeAt(i2);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V setValueAt(int i2, V v) {
        this.f2895a = 0;
        return (V) super.setValueAt(i2, v);
    }
}
