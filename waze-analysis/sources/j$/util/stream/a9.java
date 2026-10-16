package j$.util.stream;

import java.util.function.LongPredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a9 extends o5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f50335b;

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        if (this.f50335b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j2);
            throw null;
        }
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final void l(long j2) {
        this.f50558a.l(-1L);
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public final boolean o() {
        return !this.f50335b || this.f50558a.o();
    }
}
