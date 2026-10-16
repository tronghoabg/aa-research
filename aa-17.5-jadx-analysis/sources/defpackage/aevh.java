package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aevh extends aegj {
    final /* synthetic */ aevt a;

    public aevh(aevt aevtVar) {
        this.a = aevtVar;
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aejr m() {
        return new aevr(this.a);
    }

    @Override // defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aevs(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        return this.a.m(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
