package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h0 extends l0 implements q5 {

    /* renamed from: b, reason: collision with root package name */
    public final DoubleConsumer f50426b;

    public h0(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.f50426b = doubleConsumer;
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.l0, j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50426b.accept(d2);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        C((Double) obj);
    }
}
