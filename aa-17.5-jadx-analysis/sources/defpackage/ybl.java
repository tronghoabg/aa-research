package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes3.dex */
class ybl extends ybg implements SortedSet {
    final /* synthetic */ ybm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybl(ybm ybmVar, Object obj, SortedSet sortedSet, ybg ybgVar) {
        super(ybmVar, obj, sortedSet, ybgVar);
        this.g = ybmVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedSet e() {
        return (SortedSet) this.b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        b();
        return e().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        b();
        SortedSet sortedSetHeadSet = e().headSet(obj);
        ybg ybgVar = this.c;
        if (ybgVar == null) {
            ybgVar = this;
        }
        return new ybl(this.g, this.a, sortedSetHeadSet, ybgVar);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        b();
        return e().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        b();
        SortedSet sortedSetSubSet = e().subSet(obj, obj2);
        ybg ybgVar = this.c;
        if (ybgVar == null) {
            ybgVar = this;
        }
        return new ybl(this.g, this.a, sortedSetSubSet, ybgVar);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        b();
        SortedSet sortedSetTailSet = e().tailSet(obj);
        ybg ybgVar = this.c;
        if (ybgVar == null) {
            ybgVar = this;
        }
        return new ybl(this.g, this.a, sortedSetTailSet, ybgVar);
    }
}
