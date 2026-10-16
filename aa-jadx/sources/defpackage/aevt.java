package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aevt extends defpackage.aery {
    protected int b;

    protected aevt(int i) {
        this.b = i;
    }

    @Override // defpackage.aery, j$.util.Spliterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public defpackage.aevs trySplit() {
        throw null;
    }

    protected abstract defpackage.aevs c(int i, int i2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    protected abstract java.lang.Object d(int i);

    protected abstract int e();

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return ((long) e()) - ((long) this.b);
    }

    @Override // defpackage.aery, j$.util.Spliterator
    public void forEachRemaining(java.util.function.Consumer consumer) {
        int iE = e();
        while (true) {
            int i = this.b;
            if (i >= iE) {
                return;
            }
            consumer.accept(d(i));
            this.b++;
        }
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(java.util.function.Consumer consumer) {
        if (this.b >= e()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        consumer.accept(d(i));
        return true;
    }
}
