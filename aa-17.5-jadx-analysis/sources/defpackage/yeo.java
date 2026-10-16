package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class yeo extends yen implements SortedSet {
    protected yeo() {
    }

    @Override // defpackage.yen
    protected /* bridge */ /* synthetic */ Set c() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return g().first();
    }

    protected abstract SortedSet g();

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return g().headSet(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return g().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return g().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return g().tailSet(obj);
    }
}
