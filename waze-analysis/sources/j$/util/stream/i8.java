package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i8 extends j8 implements j$.util.x0, LongConsumer {

    /* renamed from: e, reason: collision with root package name */
    public long f50456e;

    @Override // java.util.function.LongConsumer
    public final void accept(long j2) {
        this.f50456e = j2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.m8
    public final Spliterator b(Spliterator spliterator) {
        return new i8((j$.util.x0) spliterator, this);
    }

    @Override // j$.util.stream.j8
    public final void d(Object obj) {
        ((LongConsumer) obj).accept(this.f50456e);
    }

    @Override // j$.util.stream.j8
    public final p7 e() {
        return new o7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }
}
