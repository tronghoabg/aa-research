package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3008q3 implements InterfaceC2997o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f38293b;

    public /* synthetic */ C3008q3(DoubleConsumer doubleConsumer, int i5) {
        this.f38292a = i5;
        this.f38293b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        switch (this.f38292a) {
            case 0:
                ((V2) this.f38293b).accept(d3);
                break;
            default:
                this.f38293b.accept(d3);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        switch (this.f38292a) {
            case 0:
                AbstractC3044y0.k();
                throw null;
            default:
                AbstractC3044y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f38292a) {
            case 0:
                AbstractC3044y0.l();
                throw null;
            default:
                AbstractC3044y0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.f38292a) {
            case 0:
                p((Double) obj);
                break;
            default:
                p((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38292a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f38292a) {
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
        int i5 = this.f38292a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void l(long j8) {
        int i5 = this.f38292a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        switch (this.f38292a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        switch (this.f38292a) {
            case 0:
                AbstractC3044y0.e(this, d3);
                break;
            default:
                AbstractC3044y0.e(this, d3);
                break;
        }
    }
}
