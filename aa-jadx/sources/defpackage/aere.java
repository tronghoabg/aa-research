package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aere extends defpackage.aemn {
    protected int b;

    protected aere(int i) {
        this.b = i;
    }

    protected abstract long b(int i);

    protected abstract defpackage.aerd c(int i, int i2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    protected abstract int e();

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return ((long) e()) - ((long) this.b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.aemn, j$.util.Spliterator.OfLong
    public void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        int iE = e();
        while (true) {
            int i = this.b;
            if (i >= iE) {
                return;
            }
            longConsumer.accept(b(i));
            this.b++;
        }
    }

    @Override // defpackage.aemn, j$.util.Spliterator
    /* JADX INFO: renamed from: gE, reason: merged with bridge method [inline-methods] */
    public defpackage.aerd trySplit() {
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.util.Spliterator.OfLong
    public boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        if (this.b >= e()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        longConsumer.accept(b(i));
        return true;
    }

    @Override // defpackage.aemn, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining(defpackage.a$$ExternalSyntheticApiModelOutline2.m41m((java.lang.Object) longConsumer));
    }

    @Override // defpackage.aemn, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance(defpackage.a$$ExternalSyntheticApiModelOutline2.m41m((java.lang.Object) longConsumer));
    }
}
