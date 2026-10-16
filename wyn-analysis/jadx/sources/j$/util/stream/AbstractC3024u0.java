package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3024u0 implements InterfaceC3011r2 {

    /* renamed from: a, reason: collision with root package name */
    boolean f38317a;

    /* renamed from: b, reason: collision with root package name */
    boolean f38318b;

    @Override // j$.util.stream.InterfaceC3011r2
    public /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
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
    public final /* synthetic */ void l(long j8) {
    }

    AbstractC3024u0(EnumC3029v0 enumC3029v0) {
        this.f38318b = !enumC3029v0.f38328b;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return this.f38317a;
    }
}
