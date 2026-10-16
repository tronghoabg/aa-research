package x;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.C4518b;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4417j {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final C4518b lock;

    @NotNull
    private final y.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C4417j(int i5) {
        this.maxSize = i5;
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new y.c();
        this.lock = new C4518b();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    @Nullable
    public Object create(@NotNull Object key) {
        AbstractC3340k.e(key, "key");
        return null;
    }

    public final int createCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.createCount;
        }
        return i5;
    }

    public void entryRemoved(boolean z2, @NotNull Object key, @NotNull Object oldValue, @Nullable Object obj) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.evictionCount;
        }
        return i5;
    }

    @Nullable
    public final Object get(@NotNull Object key) {
        Object objPut;
        AbstractC3340k.e(key, "key");
        synchronized (this.lock) {
            y.c cVar = this.map;
            cVar.getClass();
            Object obj = cVar.f47916a.get(key);
            if (obj != null) {
                this.hitCount++;
                return obj;
            }
            this.missCount++;
            Object objCreate = create(key);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objPut = this.map.f47916a.put(key, objCreate);
                    if (objPut != null) {
                        this.map.f47916a.put(key, objPut);
                    } else {
                        this.size += a(key, objCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                entryRemoved(false, key, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.hitCount;
        }
        return i5;
    }

    public final int maxSize() {
        int i5;
        synchronized (this.lock) {
            i5 = this.maxSize;
        }
        return i5;
    }

    public final int missCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.missCount;
        }
        return i5;
    }

    @Nullable
    public final Object put(@NotNull Object key, @NotNull Object value) {
        Object objPut;
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            objPut = this.map.f47916a.put(key, value);
            if (objPut != null) {
                this.size -= a(key, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, key, objPut, value);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.putCount;
        }
        return i5;
    }

    @Nullable
    public final Object remove(@NotNull Object key) {
        Object objRemove;
        AbstractC3340k.e(key, "key");
        synchronized (this.lock) {
            y.c cVar = this.map;
            cVar.getClass();
            objRemove = cVar.f47916a.remove(key);
            if (objRemove != null) {
                this.size -= a(key, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, key, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i5;
        }
        trimToSize(i5);
    }

    public final int size() {
        int i5;
        synchronized (this.lock) {
            i5 = this.size;
        }
        return i5;
    }

    public int sizeOf(@NotNull Object key, @NotNull Object value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        return 1;
    }

    @NotNull
    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Set<Map.Entry> setEntrySet = this.map.f47916a.entrySet();
            AbstractC3340k.d(setEntrySet, "map.entries");
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i5 = this.hitCount;
                int i10 = this.missCount + i5;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i10 != 0 ? (i5 * 100) / i10 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            y.b r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L6e
            y.c r1 = r5.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f47916a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.size     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L6e
            goto L18
        L16:
            r6 = move-exception
            goto L76
        L18:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L6c
            y.c r1 = r5.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f47916a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L6c
        L27:
            y.c r1 = r5.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f47916a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = ff.o.r0(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            y.c r3 = r5.map     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "key"
            kotlin.jvm.internal.AbstractC3340k.e(r2, r4)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.f47916a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.size     // Catch: java.lang.Throwable -> L16
            int r4 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L16
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L16
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L6c:
            monitor-exit(r0)
            return
        L6e:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L76:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4417j.trimToSize(int):void");
    }
}
