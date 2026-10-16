package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class aeoh extends aell {
    final /* synthetic */ aeop a;

    public aeoh(aeop aeopVar) {
        this.a = aeopVar;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aepm m() {
        return new aeog(this.a);
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aeoi(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return this.a.c(j);
    }

    @Override // defpackage.aell
    public final boolean l(long j) {
        aeop aeopVar = this.a;
        int i = aeopVar.h;
        aeopVar.b(j);
        return aeopVar.h != i;
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
