package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aete extends aeqw {
    final /* synthetic */ aetl a;

    public aete(aetl aetlVar) {
        this.a = aetlVar;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aetk(this.a, 1);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aetf(this.a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        aetl aetlVar = this.a;
        Object[] objArr = aetlVar.a;
        if (aetlVar.d) {
            consumer.accept(objArr[aetlVar.e]);
        }
        int i = aetlVar.e;
        while (i != 0) {
            i--;
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        aetl aetlVar = this.a;
        int i = aetlVar.h;
        aetlVar.remove(obj);
        return aetlVar.h != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
