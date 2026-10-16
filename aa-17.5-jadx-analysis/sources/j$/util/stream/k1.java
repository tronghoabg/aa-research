package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class k1 extends m1 implements Spliterator.OfPrimitive {
    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((Spliterator.OfPrimitive) spliterator).forEachRemaining((Spliterator.OfPrimitive) obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            i0 i0Var = (i0) m1.a(arrayDequeB);
            if (i0Var == null) {
                this.a = null;
                return;
            }
            i0Var.e(obj);
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(Object obj) {
        i0 i0Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((Spliterator.OfPrimitive) this.d).tryAdvance((Spliterator.OfPrimitive) obj);
        if (!zTryAdvance) {
            if (this.c == null && (i0Var = (i0) m1.a(this.e)) != null) {
                Spliterator.OfPrimitive ofPrimitiveSpliterator = i0Var.spliterator();
                this.d = ofPrimitiveSpliterator;
                return ofPrimitiveSpliterator.tryAdvance((Spliterator.OfPrimitive) obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
