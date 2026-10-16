package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeog extends aeol implements Iterator, aepm {
    final /* synthetic */ aeop a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeog(aeop aeopVar) {
        super(aeopVar);
        this.a = aeopVar;
    }

    @Override // defpackage.aeol
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.a[i]);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ao(this, consumer);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        return this.a.a[b()];
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        super.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }
}
