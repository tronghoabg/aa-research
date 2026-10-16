package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aehk implements j$.util.Iterator, defpackage.aekr {
    protected aehk() {
    }

    @Override // j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.util.function.IntConsumer) intConsumer);
    }

    @Override // defpackage.aekr, j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    public /* synthetic */ java.lang.Integer next() {
        return defpackage.aefc.Y(this);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.aefc.Z(this, consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(java.util.function.IntConsumer intConsumer) {
        j$.util.PrimitiveIterator.OfInt.CC.$default$forEachRemaining((j$.util.PrimitiveIterator.OfInt) this, intConsumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Object next() {
        return next();
    }
}
