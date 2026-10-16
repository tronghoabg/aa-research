package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeln extends defpackage.aeht {
    protected int b;

    protected aeln(int i) {
        this.b = i;
    }

    protected abstract int a(int i);

    protected abstract defpackage.aelm c(int i, int i2);

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
    @Override // defpackage.aeht, j$.util.Spliterator.OfInt
    public void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        int iE = e();
        while (true) {
            int i = this.b;
            if (i >= iE) {
                return;
            }
            intConsumer.accept(a(i));
            this.b++;
        }
    }

    @Override // defpackage.aeht, j$.util.Spliterator
    /* JADX INFO: renamed from: gC, reason: merged with bridge method [inline-methods] */
    public defpackage.aelm trySplit() {
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.util.Spliterator.OfInt
    public boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        if (this.b >= e()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        intConsumer.accept(a(i));
        return true;
    }

    @Override // defpackage.aeht, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining(defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) intConsumer));
    }

    @Override // defpackage.aeht, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance(defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) intConsumer));
    }
}
