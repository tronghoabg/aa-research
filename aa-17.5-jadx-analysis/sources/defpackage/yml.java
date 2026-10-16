package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class yml extends ymn {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public yml(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.ymn
    public final int a() {
        return d(this.a);
    }

    @Override // defpackage.ymn
    public final int b() {
        return Math.max(e(this.a) - d(this.b), 0);
    }

    @Override // defpackage.ymn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final yno iterator() {
        return new ymk(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
