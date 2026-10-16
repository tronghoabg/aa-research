package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aehq extends aegr {
    final /* synthetic */ aehy a;

    public aehq(aehy aehyVar) {
        this.a = aehyVar;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aejr m() {
        return new aehp(this.a);
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aehr(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.aegr
    public final boolean l(int i) {
        aehy aehyVar = this.a;
        int i2 = aehyVar.h;
        aehyVar.b(i);
        return aehyVar.h != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
