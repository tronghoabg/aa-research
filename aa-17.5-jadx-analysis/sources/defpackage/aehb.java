package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aehb extends aegs {
    final /* synthetic */ aehf a;

    public aehb(aehf aehfVar) {
        this.a = aehfVar;
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aeks(iterator(), adzo.m(this.a), 337);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aegs, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.aegr
    public final boolean l(int i) {
        aehf aehfVar = this.a;
        int i2 = aehfVar.k;
        aehfVar.b(i);
        return aehfVar.k != i2;
    }

    @Override // defpackage.aekk
    public final int s() {
        aehf aehfVar = this.a;
        if (aehfVar.k != 0) {
            return aehfVar.a[aehfVar.e];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.k;
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // defpackage.aekk
    public final int t() {
        aehf aehfVar = this.a;
        if (aehfVar.k != 0) {
            return aehfVar.a[aehfVar.f];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aegs
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aekb m() {
        return new aeha(this.a);
    }

    @Override // defpackage.aekk
    public final aekk v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aekk
    public final aekk w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aekk
    public final aekk x() {
        throw new UnsupportedOperationException();
    }
}
