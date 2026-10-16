package com.google.v;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ff<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private static final ff f12954a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12955b;

    static {
        ff ffVar = new ff();
        f12954a = ffVar;
        ffVar.c();
    }

    private ff() {
        this.f12955b = true;
    }

    public static ff a() {
        return f12954a;
    }

    private static int f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof eg) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = ep.f12912a;
        int length = bArr.length;
        int iA = ep.a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    private final void g() {
        if (!this.f12955b) {
            throw new UnsupportedOperationException();
        }
    }

    public final ff b() {
        return isEmpty() ? new ff() : new ff(this);
    }

    public final void c() {
        this.f12955b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(ff ffVar) {
        g();
        if (ffVar.isEmpty()) {
            return;
        }
        putAll(ffVar);
    }

    public final boolean e() {
        return this.f12955b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iF = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iF += f(entry.getValue()) ^ f(entry.getKey());
        }
        return iF;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        g();
        k2.getClass();
        v.getClass();
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        g();
        for (K k2 : map.keySet()) {
            k2.getClass();
            map.get(k2).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }

    private ff(Map map) {
        super(map);
        this.f12955b = true;
    }
}
