package com.bytedance.sdk.component.uef;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class bs<K, V> {
    private final Map<K, V> uef = new HashMap();

    /* renamed from: oa, reason: collision with root package name */
    private final Map<V, Set<K>> f25081oa = new HashMap();

    public void oa(K k) {
        Set<K> set;
        V vRemove = this.uef.remove(k);
        if (vRemove == null || (set = this.f25081oa.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.f25081oa.remove(vRemove);
        }
    }

    public void uef(Set<K> set, V v2) {
        for (K k : set) {
            if (this.uef.containsKey(k)) {
                oa(k);
            }
        }
        Set<K> hashSet = this.f25081oa.get(v2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f25081oa.put(v2, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.uef.put(it.next(), v2);
        }
    }

    public V uef(K k) {
        return this.uef.get(k);
    }

    public void uef() {
        this.uef.clear();
        this.f25081oa.clear();
    }
}
