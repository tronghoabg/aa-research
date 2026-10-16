package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class t7 implements q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f50622b;

    public /* synthetic */ t7(DoubleConsumer doubleConsumer, int i2) {
        this.f50621a = i2;
        this.f50622b = doubleConsumer;
    }

    private final void a(long j2) {
    }

    private final void b(long j2) {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        switch (this.f50621a) {
            case 0:
                d4.e(this, d2);
                break;
            default:
                d4.e(this, d2);
                break;
        }
    }

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        int i2 = this.f50621a;
        DoubleConsumer doubleConsumer = this.f50622b;
        switch (i2) {
            case 0:
                doubleConsumer.accept(d2);
                break;
            default:
                ((x6) doubleConsumer).accept(d2);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f50621a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50621a;
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        int i2 = this.f50621a;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        switch (this.f50621a) {
        }
        return false;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f50621a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        switch (this.f50621a) {
            case 0:
                d4.k();
                throw null;
            default:
                d4.k();
                throw null;
        }
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        switch (this.f50621a) {
            case 0:
                d4.l();
                throw null;
            default:
                d4.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        switch (this.f50621a) {
            case 0:
                C((Double) obj);
                break;
            default:
                C((Double) obj);
                break;
        }
    }
}
