package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class x7 implements s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f50690b;

    public /* synthetic */ x7(LongConsumer longConsumer, int i2) {
        this.f50689a = i2;
        this.f50690b = longConsumer;
    }

    private final void a(long j2) {
    }

    private final void b(long j2) {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        int i2 = this.f50689a;
        LongConsumer longConsumer = this.f50690b;
        switch (i2) {
            case 0:
                longConsumer.accept(j2);
                break;
            default:
                ((b7) longConsumer).accept(j2);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f50689a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
        int i2 = this.f50689a;
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        int i2 = this.f50689a;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        switch (this.f50689a) {
        }
        return false;
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        switch (this.f50689a) {
            case 0:
                d4.i(this, l2);
                break;
            default:
                d4.i(this, l2);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f50689a) {
        }
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        switch (this.f50689a) {
            case 0:
                d4.k();
                throw null;
            default:
                d4.k();
                throw null;
        }
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        switch (this.f50689a) {
            case 0:
                d4.d();
                throw null;
            default:
                d4.d();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        switch (this.f50689a) {
            case 0:
                u((Long) obj);
                break;
            default:
                u((Long) obj);
                break;
        }
    }
}
