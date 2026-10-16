package com.bytedance.adsdk.oa;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class dz<K, V> {
    private int bcc;
    private int ivm;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24548oa;
    private final LinkedHashMap<K, V> uef;
    private int xs;
    private int yo;

    public dz(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.yo = i5;
        this.uef = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int yo(K k, V v2) {
        int iOa = oa(k, v2);
        if (iOa >= 0) {
            return iOa;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v2);
    }

    public int oa(K k, V v2) {
        return 1;
    }

    public final synchronized String toString() {
        int i5;
        try {
            int i10 = this.xs;
            int i11 = this.bcc + i10;
            i5 = i11 != 0 ? (i10 * 100) / i11 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.yo + ",hits=" + this.xs + ",misses=" + this.bcc + ",hitRate=" + i5 + "%]";
    }

    public final V uef(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v2 = this.uef.get(k);
                if (v2 != null) {
                    this.xs++;
                    return v2;
                }
                this.bcc++;
                V vOa = oa(k);
                if (vOa == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.lw++;
                        vPut = this.uef.put(k, vOa);
                        if (vPut != null) {
                            this.uef.put(k, vPut);
                        } else {
                            this.f24548oa += yo(k, vOa);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                uef(this.yo);
                return vOa;
            } finally {
            }
        }
    }

    public V oa(K k) {
        return null;
    }

    public final V uef(K k, V v2) {
        V vPut;
        if (k != null && v2 != null) {
            synchronized (this) {
                try {
                    this.moa++;
                    this.f24548oa += yo(k, v2);
                    vPut = this.uef.put(k, v2);
                    if (vPut != null) {
                        this.f24548oa -= yo(k, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            uef(this.yo);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f24548oa     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.uef     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f24548oa     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.f24548oa     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.uef     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.uef     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.uef     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f24548oa     // Catch: java.lang.Throwable -> L12
            int r0 = r3.yo(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.f24548oa = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.ivm     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.ivm = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.dz.uef(int):void");
    }
}
