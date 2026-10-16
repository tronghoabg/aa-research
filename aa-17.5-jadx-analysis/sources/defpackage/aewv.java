package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewv extends aerm {
    final /* synthetic */ aexc a;

    public aewv(aexc aexcVar) {
        this.a = aexcVar;
    }

    @Override // defpackage.aerm, defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aexb(this.a, 1);
    }

    @Override // defpackage.aerm, defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aeww(this.a, 0);
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
        aexc aexcVar = this.a;
        Object[] objArr = aexcVar.a;
        if (aexcVar.d) {
            consumer.accept(objArr[aexcVar.e]);
        }
        int i = aexcVar.e;
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
        aexc aexcVar = this.a;
        int i = aexcVar.h;
        aexcVar.remove(obj);
        return aexcVar.h != i;
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
