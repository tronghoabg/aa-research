package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2986m1 extends AbstractC2996o1 implements j$.util.d0 {
    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        J0 j02;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.d0) this.f38270d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f38269c == null && (j02 = (J0) AbstractC2996o1.a(this.f38271e)) != null) {
                j$.util.d0 d0VarSpliterator = j02.spliterator();
                this.f38270d = d0VarSpliterator;
                return d0VarSpliterator.tryAdvance(obj);
            }
            this.f38267a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        if (this.f38267a == null) {
            return;
        }
        if (this.f38270d == null) {
            Spliterator spliterator = this.f38269c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                while (true) {
                    J0 j02 = (J0) AbstractC2996o1.a(arrayDequeB);
                    if (j02 != null) {
                        j02.e(obj);
                    } else {
                        this.f38267a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.d0) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
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
