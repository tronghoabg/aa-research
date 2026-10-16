package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class yqg extends AbstractSet {
    final /* synthetic */ yqi a;

    public yqg(yqi yqiVar) {
        this.a = yqiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<yos<?>> iterator() {
        return new yqf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
