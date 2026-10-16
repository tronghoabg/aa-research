package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aema extends aell {
    final /* synthetic */ aemi a;

    public aema(aemi aemiVar) {
        this.a = aemiVar;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aepm m() {
        return new aelz(this.a);
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aemb(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return this.a.d(j);
    }

    @Override // defpackage.aell
    public final boolean l(long j) {
        aemi aemiVar = this.a;
        int i = aemiVar.h;
        aemiVar.b(j);
        return aemiVar.h != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
