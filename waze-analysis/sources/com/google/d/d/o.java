package com.google.d.d;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class o extends j implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f7646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(t tVar, SortedMap sortedMap) {
        super(tVar, sortedMap);
        Objects.requireNonNull(tVar);
        this.f7646c = tVar;
    }

    SortedMap b() {
        return (SortedMap) this.f7545d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new o(this.f7646c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new o(this.f7646c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new o(this.f7646c, b().tailMap(obj));
    }
}
