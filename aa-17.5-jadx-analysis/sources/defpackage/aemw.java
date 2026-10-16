package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aemw extends aell {
    final /* synthetic */ aend a;

    public aemw(aend aendVar) {
        this.a = aendVar;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aepm m() {
        return new aenb(this.a, 1);
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aenc(this.a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return this.a.e(j);
    }

    @Override // defpackage.aell
    public final boolean l(long j) {
        aend aendVar = this.a;
        int i = aendVar.i;
        aendVar.c(j);
        return aendVar.i != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
