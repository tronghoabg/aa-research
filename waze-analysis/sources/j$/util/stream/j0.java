package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j0 extends l0 implements s5 {

    /* renamed from: b, reason: collision with root package name */
    public final LongConsumer f50462b;

    public j0(LongConsumer longConsumer, boolean z) {
        super(z);
        this.f50462b = longConsumer;
    }

    @Override // j$.util.stream.l0, j$.util.stream.t5
    public final void accept(long j2) {
        this.f50462b.accept(j2);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        d4.i(this, l2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        u((Long) obj);
    }
}
