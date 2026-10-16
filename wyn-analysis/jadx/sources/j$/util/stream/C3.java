package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class C3 extends F3 implements j$.util.V, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    double f37968f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.f(this, consumer);
    }

    @Override // j$.util.stream.I3
    protected final Spliterator c(Spliterator spliterator) {
        return new C3((j$.util.V) spliterator, this);
    }

    @Override // j$.util.stream.F3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f37968f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        this.f37968f = d3;
    }

    @Override // j$.util.stream.F3
    protected final AbstractC2988m3 h(int i5) {
        return new C2973j3(i5);
    }
}
