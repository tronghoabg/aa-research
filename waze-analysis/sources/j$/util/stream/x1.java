package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class x1 extends y1 implements q5 {
    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.y1, j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        if (this.f50704a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d2);
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C((Double) obj);
    }
}
