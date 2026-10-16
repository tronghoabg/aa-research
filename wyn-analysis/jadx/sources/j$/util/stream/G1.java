package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class G1 implements V1, InterfaceC2997o2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37991a;

    /* renamed from: b, reason: collision with root package name */
    private double f37992b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f37993c;

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3044y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    G1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f37993c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        G1 g12 = (G1) v1;
        if (g12.f37991a) {
            return;
        }
        accept(g12.f37992b);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f37991a = true;
        this.f37992b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        if (this.f37991a) {
            this.f37991a = false;
            this.f37992b = d3;
        } else {
            this.f37992b = this.f37993c.applyAsDouble(this.f37992b, d3);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f37991a ? j$.util.A.a() : j$.util.A.d(this.f37992b);
    }
}
