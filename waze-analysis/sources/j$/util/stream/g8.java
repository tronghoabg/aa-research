package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g8 extends j8 implements j$.util.s0, DoubleConsumer {

    /* renamed from: e, reason: collision with root package name */
    public double f50419e;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50419e = d2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.m8
    public final Spliterator b(Spliterator spliterator) {
        return new g8((j$.util.s0) spliterator, this);
    }

    @Override // j$.util.stream.j8
    public final void d(Object obj) {
        ((DoubleConsumer) obj).accept(this.f50419e);
    }

    @Override // j$.util.stream.j8
    public final p7 e() {
        return new m7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.w(this, consumer);
    }
}
