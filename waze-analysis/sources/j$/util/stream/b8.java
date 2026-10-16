package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b8 extends c8 implements j$.util.x0 {
    @Override // j$.util.stream.f8
    public final Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5) {
        return new b8((j$.util.x0) spliterator, j2, j3, j4, j5);
    }

    @Override // j$.util.stream.c8
    public final Object b() {
        return new j2(1);
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
