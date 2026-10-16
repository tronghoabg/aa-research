package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aenb extends aemz implements Iterator, aepm {
    final /* synthetic */ aend a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenb(aend aendVar, int i) {
        super(aendVar);
        this.h = i;
        this.a = aendVar;
    }

    @Override // defpackage.aemz
    public final /* synthetic */ void a(Object obj, int i) {
        if (this.h != 0) {
            a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.b[i]);
        } else {
            a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.c[i]);
        }
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.h != 0) {
            adqq.ao(this, consumer);
        } else {
            adqq.ao(this, consumer);
        }
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.h != 0 ? adqq.an(this) : adqq.an(this);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        int i = this.h;
        aend aendVar = this.a;
        return i != 0 ? aendVar.b[b()] : aendVar.c[b()];
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != 0) {
            super.forEachRemaining((Object) longConsumer);
        } else {
            super.forEachRemaining((Object) longConsumer);
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.h != 0 ? adqq.an(this) : adqq.an(this);
    }
}
