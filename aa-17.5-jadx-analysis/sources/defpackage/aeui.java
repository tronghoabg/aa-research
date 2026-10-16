package defpackage;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public interface aeui<K> extends ListIterator<K>, aetu {
    @Override // java.util.ListIterator
    void add(K k);

    @Override // java.util.ListIterator, java.util.Iterator
    void remove();

    @Override // java.util.ListIterator
    void set(K k);
}
