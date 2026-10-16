package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ybt extends AbstractCollection {
    final /* synthetic */ ybu a;

    public ybt(ybu ybuVar) {
        this.a = ybuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.z(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.h();
    }
}
