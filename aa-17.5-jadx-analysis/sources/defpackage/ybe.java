package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
class ybe extends yaz implements SortedSet {
    final /* synthetic */ ybm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybe(ybm ybmVar, SortedMap sortedMap) {
        super(ybmVar, sortedMap);
        this.c = ybmVar;
    }

    public SortedMap b() {
        return (SortedMap) this.d;
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
        return new ybe(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new ybe(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new ybe(this.c, b().tailMap(obj));
    }
}
