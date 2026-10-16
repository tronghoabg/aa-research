package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class E3 extends F3 implements j$.util.a0, LongConsumer {

    /* renamed from: f, reason: collision with root package name */
    long f37979f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.h(this, consumer);
    }

    @Override // j$.util.stream.I3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3((j$.util.a0) spliterator, this);
    }

    @Override // j$.util.stream.F3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f37979f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37979f = j8;
    }

    @Override // j$.util.stream.F3
    protected final AbstractC2988m3 h(int i5) {
        return new C2983l3(i5);
    }
}
