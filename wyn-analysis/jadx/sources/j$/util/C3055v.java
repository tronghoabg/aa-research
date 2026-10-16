package j$.util;

import java.util.SortedMap;

/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3055v extends C2923s implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;

    /* renamed from: e, reason: collision with root package name */
    private final SortedMap f38366e;

    C3055v(SortedMap sortedMap) {
        super(sortedMap);
        this.f38366e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return this.f38366e.comparator();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C3055v(this.f38366e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C3055v(this.f38366e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C3055v(this.f38366e.tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f38366e.firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f38366e.lastKey();
    }
}
