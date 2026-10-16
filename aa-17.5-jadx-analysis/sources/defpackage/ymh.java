package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ymh extends ymn {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public ymh(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.ymn
    public final int a() {
        return wub.aw(d(this.a) + d(this.b));
    }

    @Override // defpackage.ymn
    public final int b() {
        return Math.max(e(this.a), e(this.b));
    }

    @Override // defpackage.ymn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final yno iterator() {
        return new ymg(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.b;
        Set set2 = this.a;
        int size = set2.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set2.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
