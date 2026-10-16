package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s4 implements y4, r5 {

    /* renamed from: a, reason: collision with root package name */
    public int f50605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f50607c;

    public s4(int i2, IntBinaryOperator intBinaryOperator) {
        this.f50606b = i2;
        this.f50607c = intBinaryOperator;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        accept(((s4) y4Var).f50605a);
    }

    @Override // j$.util.stream.t5
    public final void accept(int i2) {
        this.f50605a = this.f50607c.applyAsInt(this.f50605a, i2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f50605a);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50605a = this.f50606b;
    }

    @Override // j$.util.stream.r5
    public final /* synthetic */ void m(Integer num) {
        d4.g(this, num);
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        m((Integer) obj);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }
}
