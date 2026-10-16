package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aenl extends aelm {
    final /* synthetic */ aenq a;

    public aenl(aenq aenqVar) {
        this.a = aenqVar;
    }

    @Override // defpackage.aelm, defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // defpackage.aelm, defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aeqi(iterator(), adzo.m(this.a), 337);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aelm, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return this.a.c(j);
    }

    @Override // defpackage.aell
    public final boolean l(long j) {
        aenq aenqVar = this.a;
        int i = aenqVar.k;
        aenqVar.b(j);
        return aenqVar.k != i;
    }

    @Override // defpackage.aeqb
    public final long s() {
        aenq aenqVar = this.a;
        if (aenqVar.k != 0) {
            return aenqVar.a[aenqVar.e];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.k;
    }

    @Override // defpackage.aelm, defpackage.aell, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // defpackage.aeqb
    public final long t() {
        aenq aenqVar = this.a;
        if (aenqVar.k != 0) {
            return aenqVar.a[aenqVar.f];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aelm
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aept m() {
        return new aenk(this.a);
    }

    @Override // defpackage.aeqb
    public final aeqb v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqb
    public final aeqb w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqb
    public final aeqb x() {
        throw new UnsupportedOperationException();
    }
}
