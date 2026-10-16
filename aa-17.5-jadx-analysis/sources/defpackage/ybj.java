package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

/* loaded from: classes3.dex */
final class ybj extends ybl implements NavigableSet {
    final /* synthetic */ ybm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybj(ybm ybmVar, Object obj, NavigableSet navigableSet, ybg ybgVar) {
        super(ybmVar, obj, navigableSet, ybgVar);
        this.f = ybmVar;
    }

    private final NavigableSet f(NavigableSet navigableSet) {
        ybg ybgVar = this.c;
        if (ybgVar == null) {
            ybgVar = this;
        }
        return new ybj(this.f, this.a, navigableSet, ybgVar);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceiling(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ybl
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableSet e() {
        return (NavigableSet) super.e();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return new ybf(this, e().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return f(e().descendingSet());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return f(e().headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return yrm.Z(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return yrm.Z(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return f(e().subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return f(e().tailSet(obj, z));
    }
}
