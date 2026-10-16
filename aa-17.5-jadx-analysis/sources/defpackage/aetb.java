package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aetb extends aeqq {
    final /* synthetic */ aetl a;

    public aetb(aetl aetlVar) {
        this.a = aetlVar;
    }

    @Override // defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aetk(this.a, 0);
    }

    @Override // defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aetf(this.a, 2);
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
        aetl aetlVar = this.a;
        Object[] objArr = aetlVar.a;
        Object[] objArr2 = aetlVar.b;
        if (aetlVar.d) {
            consumer.accept(objArr2[aetlVar.e]);
        }
        int i = aetlVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                consumer.accept(objArr2[i]);
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
