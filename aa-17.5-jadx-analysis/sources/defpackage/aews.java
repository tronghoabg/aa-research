package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aews extends aerf {
    final /* synthetic */ aexc a;

    public aews(aexc aexcVar) {
        this.a = aexcVar;
    }

    @Override // defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aexb(this.a, 0);
    }

    @Override // defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aeww(this.a, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // defpackage.aerf, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        aexc aexcVar = this.a;
        Object[] objArr = aexcVar.a;
        Object[] objArr2 = aexcVar.b;
        if (aexcVar.d) {
            consumer.accept(objArr2[aexcVar.e]);
        }
        int i = aexcVar.e;
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

    @Override // defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }
}
