package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aefp implements defpackage.aegz {
    protected aefp() {
    }

    @Override // defpackage.aegz
    public final /* synthetic */ defpackage.aegb d() {
        return defpackage.aeao.y();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        j$.util.Spliterator.OfPrimitive.CC.$default$forEachRemaining(this, obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return d();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return defpackage.aeao.x(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.aeao.w(this, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }
}
