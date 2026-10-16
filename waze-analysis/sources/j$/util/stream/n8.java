package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class n8 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f50542b;

    public /* synthetic */ n8(Consumer consumer, int i2) {
        this.f50541a = i2;
        this.f50542b = consumer;
    }

    private final void a(long j2) {
    }

    private final void b(long j2) {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        int i2 = this.f50541a;
        Consumer consumer = this.f50542b;
        switch (i2) {
            case 0:
                ((e7) consumer).u(obj);
                break;
            default:
                consumer.u(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f50541a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50541a;
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        int i2 = this.f50541a;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        switch (this.f50541a) {
        }
        return false;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        switch (this.f50541a) {
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
        switch (this.f50541a) {
            case 0:
                d4.l();
                throw null;
            default:
                d4.l();
                throw null;
        }
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        switch (this.f50541a) {
            case 0:
                d4.d();
                throw null;
            default:
                d4.d();
                throw null;
        }
    }
}
