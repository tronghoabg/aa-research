package defpackage;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aesn extends aeqq {
    final /* synthetic */ aesu a;

    public aesn(aesu aesuVar) {
        this.a = aesuVar;
    }

    @Override // defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aest(this.a, 0);
    }

    @Override // defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeuy(iterator(), adzo.m(this.a), 80);
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
        aesu aesuVar = this.a;
        long[] jArr = aesuVar.g;
        Object[] objArr = aesuVar.b;
        int i = aesuVar.k;
        int i2 = aesuVar.e;
        while (i != 0) {
            i--;
            int i3 = (int) jArr[i2];
            consumer.accept(objArr[i2]);
            i2 = i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.k;
    }

    @Override // defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
