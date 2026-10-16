package com.google.l.b;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u<K, V> implements Map.Entry<K, V> {

    /* renamed from: a, reason: collision with root package name */
    u f12390a;

    /* renamed from: b, reason: collision with root package name */
    u f12391b;

    /* renamed from: c, reason: collision with root package name */
    u f12392c;

    /* renamed from: d, reason: collision with root package name */
    u f12393d;

    /* renamed from: e, reason: collision with root package name */
    u f12394e;

    /* renamed from: f, reason: collision with root package name */
    final Object f12395f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f12396g;

    /* renamed from: h, reason: collision with root package name */
    Object f12397h;

    /* renamed from: i, reason: collision with root package name */
    int f12398i;

    u(boolean z, u uVar, Object obj, u uVar2, u uVar3) {
        this.f12390a = uVar;
        this.f12395f = obj;
        this.f12396g = z;
        this.f12398i = 1;
        this.f12393d = uVar2;
        this.f12394e = uVar3;
        uVar3.f12393d = this;
        uVar2.f12394e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f12395f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f12397h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.f12395f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.f12397h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f12395f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f12397h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (v == null && !this.f12396g) {
            throw new NullPointerException("value == null");
        }
        V v2 = (V) this.f12397h;
        this.f12397h = v;
        return v2;
    }

    public final String toString() {
        return String.valueOf(this.f12395f) + "=" + String.valueOf(this.f12397h);
    }

    u(boolean z) {
        this.f12395f = null;
        this.f12396g = z;
        this.f12394e = this;
        this.f12393d = this;
    }
}
