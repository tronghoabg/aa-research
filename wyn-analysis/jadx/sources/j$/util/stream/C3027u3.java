package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3027u3 implements InterfaceC3007q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f38324b;

    public /* synthetic */ C3027u3(LongConsumer longConsumer, int i5) {
        this.f38323a = i5;
        this.f38324b = longConsumer;
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
        switch (this.f38323a) {
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
        switch (this.f38323a) {
            case 0:
                AbstractC3044y0.k();
                throw null;
            default:
                AbstractC3044y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f38323a) {
            case 0:
                ((Z2) this.f38324b).accept(j8);
                break;
            default:
                this.f38324b.accept(j8);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.f38323a) {
            case 0:
                j((Long) obj);
                break;
            default:
                j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38323a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f38323a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3007q2
    public final /* synthetic */ void j(Long l10) {
        switch (this.f38323a) {
            case 0:
                AbstractC3044y0.i(this, l10);
                break;
            default:
                AbstractC3044y0.i(this, l10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
        int i5 = this.f38323a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void l(long j8) {
        int i5 = this.f38323a;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        switch (this.f38323a) {
        }
        return false;
    }
}
