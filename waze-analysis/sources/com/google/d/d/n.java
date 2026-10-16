package com.google.d.d;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class n extends g implements SortedMap {

    /* renamed from: d, reason: collision with root package name */
    SortedSet f7644d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f7645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(t tVar, SortedMap sortedMap) {
        super(tVar, sortedMap);
        Objects.requireNonNull(tVar);
        this.f7645e = tVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    SortedMap h() {
        return (SortedMap) this.f7631a;
    }

    public SortedMap headMap(Object obj) {
        return new n(this.f7645e, h().headMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.d.d.dv
    public SortedSet i() {
        return new o(this.f7645e, h());
    }

    @Override // com.google.d.d.g, com.google.d.d.dv, java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f7644d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetI = i();
        this.f7644d = sortedSetI;
        return sortedSetI;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new n(this.f7645e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new n(this.f7645e, h().tailMap(obj));
    }
}
