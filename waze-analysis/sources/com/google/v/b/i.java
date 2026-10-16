package com.google.v.b;

import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i<K, V> implements Map.Entry<K, V>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Map.Entry f12695a;

    public i(Map.Entry entry) {
        x.f(entry, "delegate");
        this.f12695a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.f12695a.getKey();
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.f12695a.getValue();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
