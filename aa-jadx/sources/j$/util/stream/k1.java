package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k1 extends j$.util.stream.m1 implements j$.util.Spliterator.OfPrimitive {
    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(java.lang.Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.Spliterator.OfPrimitive) spliterator).forEachRemaining(obj);
            return;
        }
        java.util.ArrayDeque arrayDequeB = b();
        while (true) {
            j$.util.stream.i0 i0Var = (j$.util.stream.i0) j$.util.stream.m1.a(arrayDequeB);
            if (i0Var == null) {
                this.a = null;
                return;
            }
            i0Var.e(obj);
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(java.lang.Object obj) {
        j$.util.stream.i0 i0Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.Spliterator.OfPrimitive) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (i0Var = (j$.util.stream.i0) j$.util.stream.m1.a(this.e)) != null) {
                j$.util.Spliterator.OfPrimitive ofPrimitiveSpliterator = i0Var.spliterator();
                this.d = ofPrimitiveSpliterator;
                return ofPrimitiveSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.lang.Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        forEachRemaining((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }
}
