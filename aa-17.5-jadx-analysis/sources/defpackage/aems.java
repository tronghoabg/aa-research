package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aems extends aeld {
    final /* synthetic */ aend a;

    public aems(aend aendVar) {
        this.a = aendVar;
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aepm m() {
        return new aenb(this.a, 0);
    }

    @Override // defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aenc(this.a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return this.a.r(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.i;
    }

    @Override // defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
