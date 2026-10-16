package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3019t0 extends AbstractC3024u0 implements InterfaceC2997o2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    @Override // j$.util.stream.AbstractC3024u0, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        if (this.f38317a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d3);
        throw null;
    }
}
