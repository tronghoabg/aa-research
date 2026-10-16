package j$.util;

import java.util.SortedSet;

/* loaded from: classes2.dex */
final class Q extends q0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ SortedSet f37764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f37764f = sortedSet;
    }

    @Override // j$.util.q0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f37764f.comparator();
    }
}
