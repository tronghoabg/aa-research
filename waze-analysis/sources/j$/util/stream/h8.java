package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h8 extends j8 implements Spliterator.OfInt, IntConsumer {

    /* renamed from: e, reason: collision with root package name */
    public int f50435e;

    @Override // java.util.function.IntConsumer
    public final void accept(int i2) {
        this.f50435e = i2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.m8
    public final Spliterator b(Spliterator spliterator) {
        return new h8((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.j8
    public final void d(Object obj) {
        ((IntConsumer) obj).accept(this.f50435e);
    }

    @Override // j$.util.stream.j8
    public final p7 e() {
        return new n7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }
}
