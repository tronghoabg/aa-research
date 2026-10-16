package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aesq extends aeqx {
    final /* synthetic */ aesu a;

    public aesq(aesu aesuVar) {
        this.a = aesuVar;
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeuy(iterator(), adzo.m(this.a), 81);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aeui iterator() {
        return new aest(this.a, 1);
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aeur headSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aeur subSet(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        aesu aesuVar = this.a;
        if (aesuVar.k != 0) {
            return aesuVar.a[aesuVar.e];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        aesu aesuVar = this.a;
        long[] jArr = aesuVar.g;
        Object[] objArr = aesuVar.a;
        int i = aesuVar.k;
        int i2 = aesuVar.e;
        while (i != 0) {
            i--;
            int i3 = (int) jArr[i2];
            consumer.accept(objArr[i2]);
            i2 = i3;
        }
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aeur tailSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        aesu aesuVar = this.a;
        if (aesuVar.k != 0) {
            return aesuVar.a[aesuVar.f];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        aesu aesuVar = this.a;
        int i = aesuVar.k;
        aesuVar.remove(obj);
        return aesuVar.k != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.k;
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
