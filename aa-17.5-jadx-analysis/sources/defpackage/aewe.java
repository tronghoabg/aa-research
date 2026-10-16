package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewe extends aerm {
    final /* synthetic */ aewk a;

    public aewe(aewk aewkVar) {
        this.a = aewkVar;
    }

    @Override // defpackage.aerm, defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aewj(this.a, 1);
    }

    @Override // defpackage.aerm, defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aewf(this.a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.aerf, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        aewk aewkVar = this.a;
        Object[] objArr = aewkVar.a;
        if (aewkVar.d) {
            consumer.accept(objArr[aewkVar.e]);
        }
        int i = aewkVar.e;
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
        aewk aewkVar = this.a;
        int i = aewkVar.h;
        aewkVar.remove(obj);
        return aewkVar.h != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }

    @Override // defpackage.aerm, defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }
}
