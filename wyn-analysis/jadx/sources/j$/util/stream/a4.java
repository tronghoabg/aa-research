package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class a4 extends AbstractC2987m2 implements h4 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b4 f38144b;

    @Override // j$.util.stream.h4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a4(b4 b4Var, InterfaceC3011r2 interfaceC3011r2, boolean z2) {
        super(interfaceC3011r2);
        this.f38144b = b4Var;
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f38144b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j8);
        throw null;
    }
}
