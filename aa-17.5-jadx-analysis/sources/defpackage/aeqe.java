package defpackage;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public abstract class aeqe extends aeln {
    protected int b;

    protected aeqe(int i) {
        this.b = i;
    }

    protected abstract long b(int i);

    protected abstract aeqd c(int i, int i2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    protected abstract int e();

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return e() - this.b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.aeln, j$.util.Spliterator.OfLong
    public void forEachRemaining(LongConsumer longConsumer) {
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

    @Override // defpackage.aeln, j$.util.Spliterator
    /* renamed from: hs, reason: merged with bridge method [inline-methods] */
    public aeqd trySplit() {
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.util.Spliterator.OfLong
    public boolean tryAdvance(LongConsumer longConsumer) {
        if (this.b >= e()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        longConsumer.accept(b(i));
        return true;
    }

    @Override // defpackage.aeln, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // defpackage.aeln, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }
}
