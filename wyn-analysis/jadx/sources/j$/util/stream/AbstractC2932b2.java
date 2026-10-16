package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2932b2 extends W1 implements V1 {

    /* renamed from: b, reason: collision with root package name */
    long f38155b;

    public /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC3044y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38155b = 0L;
    }
}
