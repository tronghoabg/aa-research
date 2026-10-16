package com.bytedance.sdk.component.lw.oa.yo.uef;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class yo<K, V> {

    /* renamed from: oa, reason: collision with root package name */
    private int f25038oa;
    private final LinkedHashMap<K, SoftReference<V>> uef = new LinkedHashMap<>(0, 0.75f, true);

    public yo(int i5) {
        this.f25038oa = i5;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.f25038oa), Integer.valueOf(this.uef.size()));
    }

    public synchronized V uef(K k) {
        V v2 = null;
        if (k == null) {
            return null;
        }
        if (this.f25038oa <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.uef.get(k);
        if (softReference != null) {
            v2 = softReference.get();
            if (v2 != null) {
                return v2;
            }
            this.uef.remove(k);
        }
        return v2;
    }

    public synchronized void uef(K k, V v2) {
        if (this.f25038oa <= 0) {
            return;
        }
        if (k == null || v2 == null) {
            return;
        }
        this.uef.put(k, new SoftReference<>(v2));
        int size = this.uef.size();
        int i5 = this.f25038oa;
        if (size > i5) {
            uef((int) (i5 * 0.7d));
        }
    }

    public synchronized void uef(int i5) {
        int size = this.uef.size() - i5;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.uef.entrySet().iterator();
            for (int i10 = 0; i10 < size; i10++) {
                it.next();
                it.remove();
            }
        }
        if (i5 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.uef.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
