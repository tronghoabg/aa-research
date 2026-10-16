package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f4 extends z4 implements y4, s5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f50398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f50399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f50400d;

    public f4(Supplier supplier, ObjLongConsumer objLongConsumer, o oVar) {
        this.f50398b = supplier;
        this.f50399c = objLongConsumer;
        this.f50400d = oVar;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        this.f50728a = this.f50400d.apply(this.f50728a, ((f4) y4Var).f50728a);
    }

    @Override // j$.util.stream.t5
    public final void accept(long j2) {
        this.f50399c.accept(this.f50728a, j2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50728a = this.f50398b.get();
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        d4.i(this, l2);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        u((Long) obj);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }
}
