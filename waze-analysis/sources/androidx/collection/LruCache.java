package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i2) {
        this.maxSize = i2;
        if (i2 <= 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k2, V v) {
        int iSizeOf = sizeOf(k2, v);
        if (iSizeOf < 0) {
            RuntimeHelpersKt.throwIllegalStateException("Negative size: " + k2 + "=" + v);
        }
        return iSizeOf;
    }

    protected V create(K k2) {
        x.f(k2, "key");
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.createCount;
        }
        return i2;
    }

    protected void entryRemoved(boolean z, K k2, V v, V v2) {
        x.f(k2, "key");
        x.f(v, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    public final V get(K k2) {
        V v;
        x.f(k2, "key");
        synchronized (this.lock) {
            V v2 = this.map.get(k2);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(k2);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                v = (V) this.map.put(k2, vCreate);
                if (v != null) {
                    this.map.put(k2, v);
                } else {
                    this.size += safeSizeOf(k2, vCreate);
                }
            }
            if (v != null) {
                entryRemoved(false, k2, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.lock) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final V put(K k2, V v) {
        V vPut;
        x.f(k2, "key");
        x.f(v, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(k2, v);
            vPut = this.map.put(k2, v);
            if (vPut != null) {
                this.size -= safeSizeOf(k2, vPut);
            }
        }
        if (vPut != null) {
            entryRemoved(false, k2, vPut, v);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final V remove(K k2) {
        V vRemove;
        x.f(k2, "key");
        synchronized (this.lock) {
            vRemove = this.map.remove(k2);
            if (vRemove != null) {
                this.size -= safeSizeOf(k2, vRemove);
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k2, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i2) {
        if (i2 <= 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i2;
        }
        trimToSize(i2);
    }

    public final int size() {
        int i2;
        synchronized (this.lock) {
            i2 = this.size;
        }
        return i2;
    }

    protected int sizeOf(K k2, V v) {
        x.f(k2, "key");
        x.f(v, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.map.getEntries().size());
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            int i2 = this.hitCount;
            int i3 = this.missCount;
            int i4 = i2 + i3;
            int i5 = i4 != 0 ? (i2 * 100) / i4 : 0;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i5 + "%]";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int i2) {
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                    RuntimeHelpersKt.throwIllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.size <= i2 || this.map.isEmpty() || (entry = (Map.Entry) i.Q(this.map.getEntries())) == null) {
                    break;
                }
                key = entry.getKey();
                value = entry.getValue();
                this.map.remove(key);
                this.size -= safeSizeOf(key, value);
                this.evictionCount++;
            }
            entryRemoved(true, key, value, null);
        }
    }
}
