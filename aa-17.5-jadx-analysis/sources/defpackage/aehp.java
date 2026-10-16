package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aehp extends aehu implements Iterator, aejr {
    final /* synthetic */ aehy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehp(aehy aehyVar) {
        super(aehyVar);
        this.a = aehyVar;
    }

    @Override // defpackage.aehu
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m40m(obj).accept(this.a.a[i]);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.aa(this, consumer);
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        return this.a.a[b()];
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        super.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.Z(this);
    }
}
