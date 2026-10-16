package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h4 implements y4, q5 {

    /* renamed from: a, reason: collision with root package name */
    public double f50431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f50432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f50433c;

    public h4(double d2, DoubleBinaryOperator doubleBinaryOperator) {
        this.f50432b = d2;
        this.f50433c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        accept(((h4) y4Var).f50431a);
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50431a = this.f50433c.applyAsDouble(this.f50431a, d2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f50431a);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50431a = this.f50432b;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        C((Double) obj);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }
}
