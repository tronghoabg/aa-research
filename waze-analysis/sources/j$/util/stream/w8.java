package j$.util.stream;

import java.util.function.IntPredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w8 extends n5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50665b;

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        if (this.f50665b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i2);
            throw null;
        }
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50539a.l(-1L);
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public final boolean o() {
        return !this.f50665b || this.f50539a.o();
    }
}
