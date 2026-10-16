package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeih extends aerf {
    final /* synthetic */ aeit a;

    public aeih(aeit aeitVar) {
        this.a = aeitVar;
    }

    @Override // defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aeir(this.a);
    }

    @Override // defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aeis(this.a, 0);
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
        aeit aeitVar = this.a;
        int[] iArr = aeitVar.a;
        Object[] objArr = aeitVar.b;
        if (aeitVar.d) {
            consumer.accept(objArr[aeitVar.e]);
        }
        int i = aeitVar.e;
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

    @Override // defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return b();
    }
}
