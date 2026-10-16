package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class v7 implements r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f50651b;

    public /* synthetic */ v7(IntConsumer intConsumer, int i2) {
        this.f50650a = i2;
        this.f50651b = intConsumer;
    }

    private final void a(long j2) {
    }

    private final void b(long j2) {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        int i3 = this.f50650a;
        IntConsumer intConsumer = this.f50651b;
        switch (i3) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                ((z6) intConsumer).accept(i2);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f50650a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50650a;
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        int i2 = this.f50650a;
    }

    @Override // j$.util.stream.r5
    public final /* synthetic */ void m(Integer num) {
        switch (this.f50650a) {
            case 0:
                d4.g(this, num);
                break;
            default:
                d4.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        switch (this.f50650a) {
        }
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f50650a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        switch (this.f50650a) {
            case 0:
                d4.d();
                throw null;
            default:
                d4.d();
                throw null;
        }
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        switch (this.f50650a) {
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
        switch (this.f50650a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }
}
