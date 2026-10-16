package com.google.v.b;

import h.g.b.x;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h<K, V> extends d<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, j$.util.Set<Map.Entry<? extends K, ? extends V>>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f12694a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Set set) {
        super(set);
        x.f(set, "delegate");
        this.f12694a = set;
    }

    @Override // com.google.v.b.d, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.v.b.d, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new g(this.f12694a.iterator());
    }

    @Override // com.google.v.b.d, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
