package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r4 extends z4 implements y4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f50594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f50595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f50596d;

    public r4(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f50594b = supplier;
        this.f50595c = biConsumer;
        this.f50596d = biConsumer2;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        this.f50596d.accept(this.f50728a, ((r4) y4Var).f50728a);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        this.f50595c.accept(this.f50728a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50728a = this.f50594b.get();
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }
}
