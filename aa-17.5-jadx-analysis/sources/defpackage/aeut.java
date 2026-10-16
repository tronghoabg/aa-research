package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class aeut extends aeqy {
    protected int b;

    protected aeut(int i) {
        this.b = i;
    }

    @Override // defpackage.aeqy, j$.util.Spliterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public aeus trySplit() {
        throw null;
    }

    protected abstract aeus c(int i, int i2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    protected abstract Object d(int i);

    protected abstract int e();

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return e() - this.b;
    }

    @Override // defpackage.aeqy, j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
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
    public boolean tryAdvance(Consumer consumer) {
        if (this.b >= e()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        consumer.accept(d(i));
        return true;
    }
}
