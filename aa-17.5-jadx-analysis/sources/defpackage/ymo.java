package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class ymo extends yeo implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet a;
    private final SortedSet b;
    private transient ymo c;

    public ymo(NavigableSet navigableSet) {
        navigableSet.getClass();
        this.a = navigableSet;
        this.b = DesugarCollections.unmodifiableSortedSet(navigableSet);
    }

    @Override // defpackage.yen, defpackage.yec
    /* renamed from: a */
    protected final /* synthetic */ Collection d() {
        return this.b;
    }

    @Override // defpackage.yeo, defpackage.yen
    /* renamed from: c */
    protected final /* synthetic */ Set a() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return yrm.X(this.a.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        ymo ymoVar = this.c;
        if (ymoVar != null) {
            return ymoVar;
        }
        ymo ymoVar2 = new ymo(this.a.descendingSet());
        this.c = ymoVar2;
        ymoVar2.c = this;
        return ymoVar2;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.floor(obj);
    }

    @Override // defpackage.yeo
    protected final SortedSet g() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return yrm.s(this.a.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return yrm.s(this.a.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return yrm.s(this.a.tailSet(obj, z));
    }
}
