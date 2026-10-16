package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class e4 extends AbstractC2977k2 implements h4 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f4 f38185b;

    @Override // j$.util.stream.h4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e4(f4 f4Var, InterfaceC3011r2 interfaceC3011r2, boolean z2) {
        super(interfaceC3011r2);
        this.f38185b = f4Var;
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        this.f38185b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d3);
        throw null;
    }
}
