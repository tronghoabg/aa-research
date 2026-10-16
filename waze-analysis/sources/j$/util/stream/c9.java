package j$.util.stream;

import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c9 extends m5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50359b;

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        if (this.f50359b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d2);
            throw null;
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50521a.l(-1L);
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public final boolean o() {
        return !this.f50359b || this.f50521a.o();
    }
}
