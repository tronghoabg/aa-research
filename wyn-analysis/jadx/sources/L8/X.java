package l8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import k8.InterfaceC3199h;

/* loaded from: classes4.dex */
public final class X extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f40076a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3199h f40077b;

    /* JADX WARN: Multi-variable type inference failed */
    public X(List list, InterfaceC3199h interfaceC3199h) {
        list.getClass();
        this.f40076a = (AbstractCollection) list;
        this.f40077b = interfaceC3199h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f40076a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        return new V(this, this.f40076a.listIterator(i5), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        this.f40076a.subList(i5, i10).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40076a.size();
    }
}
