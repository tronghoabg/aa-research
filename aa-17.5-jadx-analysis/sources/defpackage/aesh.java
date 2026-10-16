package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aesh extends aesf implements Iterator, aejr {
    final /* synthetic */ aesj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesh(aesj aesjVar) {
        super(aesjVar);
        this.a = aesjVar;
    }

    @Override // defpackage.aesf
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m40m(obj).accept(this.a.b[i]);
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
        return this.a.b[b()];
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
