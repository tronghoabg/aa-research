package defpackage;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public abstract class aekn extends aegt {
    protected int b;

    protected aekn(int i) {
        this.b = i;
    }

    protected abstract int a(int i);

    protected abstract aekm c(int i, int i2);

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
    @Override // defpackage.aegt, j$.util.Spliterator.OfInt
    public void forEachRemaining(IntConsumer intConsumer) {
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

    @Override // defpackage.aegt, j$.util.Spliterator
    /* renamed from: hq, reason: merged with bridge method [inline-methods] */
    public aekm trySplit() {
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.util.Spliterator.OfInt
    public boolean tryAdvance(IntConsumer intConsumer) {
        if (this.b >= e()) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        intConsumer.accept(a(i));
        return true;
    }

    @Override // defpackage.aegt, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // defpackage.aegt, j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }
}
