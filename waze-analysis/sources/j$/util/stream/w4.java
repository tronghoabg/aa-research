package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w4 implements y4, s5 {

    /* renamed from: a, reason: collision with root package name */
    public long f50658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f50659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f50660c;

    public w4(long j2, LongBinaryOperator longBinaryOperator) {
        this.f50659b = j2;
        this.f50660c = longBinaryOperator;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        accept(((w4) y4Var).f50658a);
    }

    @Override // j$.util.stream.t5
    public final void accept(long j2) {
        this.f50658a = this.f50660c.applyAsLong(this.f50658a, j2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f50658a);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50658a = this.f50659b;
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
