package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class n3 extends p3 implements j$.util.a1 {
    @Override // j$.util.a1
    public final void forEachRemaining(Object obj) {
        if (this.f50567a == null) {
            return;
        }
        if (this.f50570d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.f50569c;
        if (spliterator != null) {
            ((j$.util.a1) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            l2 l2Var = (l2) p3.a(arrayDequeB);
            if (l2Var == null) {
                this.f50567a = null;
                return;
            }
            l2Var.d(obj);
        }
    }

    @Override // j$.util.a1
    public final boolean tryAdvance(Object obj) {
        l2 l2Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.a1) this.f50570d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f50569c == null && (l2Var = (l2) p3.a(this.f50571e)) != null) {
                j$.util.a1 a1VarSpliterator = l2Var.spliterator();
                this.f50570d = a1VarSpliterator;
                return a1VarSpliterator.tryAdvance(obj);
            }
            this.f50567a = null;
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
