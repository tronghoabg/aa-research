package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* compiled from: WazeSource */
/* renamed from: com.google.d.d.do, reason: invalid class name */
/* loaded from: classes4.dex */
abstract class Cdo extends fk {
    Cdo() {
    }

    abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objX = fo.x(a(), key);
            if (Objects.equals(objX, entry.getValue())) {
                return objX != null || a().containsKey(key);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.d.d.fk, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            com.google.d.b.an.B(collection);
            return fo.i(this, collection);
        } catch (UnsupportedOperationException unused) {
            return fo.j(this, collection.iterator());
        }
    }

    @Override // com.google.d.d.fk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        try {
            com.google.d.b.an.B(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetD = fo.d(collection.size());
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetD.add(((Map.Entry) obj).getKey());
                }
            }
            return this.a().keySet().retainAll(hashSetD);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
