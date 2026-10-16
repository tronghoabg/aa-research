package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3017s3 implements InterfaceC3002p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f38310b;

    public /* synthetic */ C3017s3(IntConsumer intConsumer, int i5) {
        this.f38309a = i5;
        this.f38310b = intConsumer;
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
        switch (this.f38309a) {
            case 0:
                AbstractC3044y0.a();
                throw null;
            default:
                AbstractC3044y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        switch (this.f38309a) {
            case 0:
                ((X2) this.f38310b).accept(i5);
                break;
            default:
                this.f38310b.accept(i5);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f38309a) {
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
        switch (this.f38309a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38309a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f38309a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
        int i5 = this.f38309a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void l(long j8) {
        int i5 = this.f38309a;
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        switch (this.f38309a) {
            case 0:
                AbstractC3044y0.g(this, num);
                break;
            default:
                AbstractC3044y0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        switch (this.f38309a) {
        }
        return false;
    }
}
