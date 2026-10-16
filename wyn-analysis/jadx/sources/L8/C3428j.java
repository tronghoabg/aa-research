package l8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: l8.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3428j extends C3423e implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f40117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f40118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3428j(a0 a0Var, SortedMap sortedMap) {
        super(a0Var, sortedMap);
        this.f40118f = a0Var;
    }

    public SortedSet c() {
        return new C3429k(this.f40118f, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // l8.C3423e, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f40117e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f40117e = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.f40099c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C3428j(this.f40118f, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C3428j(this.f40118f, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C3428j(this.f40118f, e().tailMap(obj));
    }
}
