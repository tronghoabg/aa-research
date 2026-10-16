package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n0 extends AbstractList implements D, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final C f18245a;

    public n0(C c10) {
        this.f18245a = c10;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void D(C1390g c1390g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return (String) this.f18245a.get(i5);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object getRaw(int i5) {
        return this.f18245a.f18138b.get(i5);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f18245a.f18138b);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final D getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m0 m0Var = new m0();
        m0Var.f18244a = this.f18245a.iterator();
        return m0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        l0 l0Var = new l0();
        l0Var.f18241a = this.f18245a.listIterator(i5);
        return l0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18245a.size();
    }
}
