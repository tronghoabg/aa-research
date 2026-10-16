package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aeil extends aegr {
    final /* synthetic */ aeit a;

    public aeil(aeit aeitVar) {
        this.a = aeitVar;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aejr m() {
        return new aeik(this.a);
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aeim(this.a);
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
        aeit aeitVar = this.a;
        int i2 = aeitVar.h;
        aeitVar.b(i);
        return aeitVar.h != i2;
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
