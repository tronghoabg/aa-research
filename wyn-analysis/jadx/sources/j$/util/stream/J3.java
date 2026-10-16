package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class J3 implements InterfaceC3011r2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f38022b;

    public /* synthetic */ J3(Consumer consumer, int i5) {
        this.f38021a = i5;
        this.f38022b = consumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(double d3) {
        switch (this.f38021a) {
            case 0:
                AbstractC3044y0.a();
                throw null;
            default:
                AbstractC3044y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        switch (this.f38021a) {
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
        switch (this.f38021a) {
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
    public final void p(Object obj) {
        switch (this.f38021a) {
            case 0:
                ((C2938c3) this.f38022b).p(obj);
                break;
            default:
                this.f38022b.p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38021a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
        int i5 = this.f38021a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void l(long j8) {
        int i5 = this.f38021a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        switch (this.f38021a) {
        }
        return false;
    }
}
