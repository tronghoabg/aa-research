package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class yex<K, V, T> extends AbstractSet<T> {
    final yey b;

    public yex(yey yeyVar) {
        this.b = yeyVar;
    }

    public abstract Object a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new yew(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c;
    }
}
