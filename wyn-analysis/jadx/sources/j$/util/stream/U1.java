package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class U1 implements V1, InterfaceC3007q2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f38110a;

    /* renamed from: b, reason: collision with root package name */
    private long f38111b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f38112c;

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

    U1(LongBinaryOperator longBinaryOperator) {
        this.f38112c = longBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        U1 u12 = (U1) v1;
        if (u12.f38110a) {
            return;
        }
        accept(u12.f38111b);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38110a = true;
        this.f38111b = 0L;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        if (this.f38110a) {
            this.f38110a = false;
            this.f38111b = j8;
        } else {
            this.f38111b = this.f38112c.applyAsLong(this.f38111b, j8);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f38110a ? j$.util.C.a() : j$.util.C.d(this.f38111b);
    }
}
