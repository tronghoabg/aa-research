package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
abstract class n4 extends q4 implements IntConsumer, Spliterator.OfInt {

    /* renamed from: e, reason: collision with root package name */
    final IntPredicate f38262e;

    /* renamed from: f, reason: collision with root package name */
    int f38263f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    n4(Spliterator.OfInt ofInt, IntPredicate intPredicate) {
        super(ofInt);
        this.f38262e = intPredicate;
    }

    n4(Spliterator.OfInt ofInt, n4 n4Var) {
        super(ofInt, n4Var);
        this.f38262e = n4Var.f38262e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.f38297d = (this.f38297d + 1) & 63;
        this.f38263f = i5;
    }

    @Override // j$.util.d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
