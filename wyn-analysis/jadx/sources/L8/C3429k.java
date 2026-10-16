package l8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: l8.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3429k extends C3424f implements SortedSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f40126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3429k(a0 a0Var, SortedMap sortedMap) {
        super(a0Var, sortedMap);
        this.f40126d = a0Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f40104b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C3429k(this.f40126d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C3429k(this.f40126d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C3429k(this.f40126d, a().tailMap(obj));
    }
}
