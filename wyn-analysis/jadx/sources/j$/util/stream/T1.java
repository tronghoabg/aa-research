package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class T1 implements V1, InterfaceC3007q2 {

    /* renamed from: a, reason: collision with root package name */
    private long f38099a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f38100b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f38101c;

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3007q2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3044y0.i(this, l10);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    T1(long j8, LongBinaryOperator longBinaryOperator) {
        this.f38100b = j8;
        this.f38101c = longBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        accept(((T1) v1).f38099a);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38099a = this.f38100b;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f38099a = this.f38101c.applyAsLong(this.f38099a, j8);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f38099a);
    }
}
