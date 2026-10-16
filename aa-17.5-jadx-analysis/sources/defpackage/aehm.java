package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aehm extends aeqq {
    final /* synthetic */ aehy a;

    public aehm(aehy aehyVar) {
        this.a = aehyVar;
    }

    @Override // defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aety iterator() {
        return new aehw(this.a);
    }

    @Override // defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aehx(this.a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        aehy aehyVar = this.a;
        int[] iArr = aehyVar.a;
        Object[] objArr = aehyVar.b;
        if (aehyVar.d) {
            consumer.accept(objArr[aehyVar.e]);
        }
        int i = aehyVar.e;
        while (i != 0) {
            i--;
            if (iArr[i] != 0) {
                consumer.accept(objArr[i]);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
