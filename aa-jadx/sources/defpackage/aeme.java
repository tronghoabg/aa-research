package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeme implements j$.util.Iterator, defpackage.aeqm {
    protected aeme() {
    }

    @Override // j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.util.function.LongConsumer) longConsumer);
    }

    @Override // defpackage.aeqm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public /* synthetic */ java.lang.Long next() {
        return defpackage.adrq.ad(this);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.adrq.ae(this, consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(java.util.function.LongConsumer longConsumer) {
        j$.util.PrimitiveIterator.OfLong.CC.$default$forEachRemaining((j$.util.PrimitiveIterator.OfLong) this, longConsumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Object next() {
        return next();
    }
}
