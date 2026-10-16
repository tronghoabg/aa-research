package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class v4 extends z4 implements y4, r5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f50641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f50642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f50643d;

    public v4(Supplier supplier, ObjIntConsumer objIntConsumer, o oVar) {
        this.f50641b = supplier;
        this.f50642c = objIntConsumer;
        this.f50643d = oVar;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        this.f50728a = this.f50643d.apply(this.f50728a, ((v4) y4Var).f50728a);
    }

    @Override // j$.util.stream.t5
    public final void accept(int i2) {
        this.f50642c.accept(this.f50728a, i2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50728a = this.f50641b.get();
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
