package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aevl extends aerm {
    final /* synthetic */ aevt a;

    public aevl(aevt aevtVar) {
        this.a = aevtVar;
    }

    @Override // defpackage.aerm, defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aety iterator() {
        return new aevk(this.a);
    }

    @Override // defpackage.aerm, defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aevm(this.a, 0);
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
        aevt aevtVar = this.a;
        Object[] objArr = aevtVar.a;
        if (aevtVar.d) {
            consumer.accept(objArr[aevtVar.e]);
        }
        int i = aevtVar.e;
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
        aevt aevtVar = this.a;
        int i = aevtVar.h;
        aevtVar.b(obj);
        return aevtVar.h != i;
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
