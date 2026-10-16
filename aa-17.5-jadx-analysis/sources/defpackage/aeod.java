package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeod extends aerf {
    final /* synthetic */ aeop a;

    public aeod(aeop aeopVar) {
        this.a = aeopVar;
    }

    @Override // defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aeon(this.a);
    }

    @Override // defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aeoo(this.a, 0);
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
        aeop aeopVar = this.a;
        long[] jArr = aeopVar.a;
        Object[] objArr = aeopVar.b;
        if (aeopVar.d) {
            consumer.accept(objArr[aeopVar.e]);
        }
        int i = aeopVar.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
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
