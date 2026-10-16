package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class l4 extends z4 implements y4, q5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f50493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f50494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f50495d;

    public l4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, o oVar) {
        this.f50493b = supplier;
        this.f50494c = objDoubleConsumer;
        this.f50495d = oVar;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        this.f50728a = this.f50495d.apply(this.f50728a, ((l4) y4Var).f50728a);
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50494c.accept(this.f50728a, d2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50728a = this.f50493b.get();
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
