package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class H extends K implements InterfaceC3002p2 {

    /* renamed from: c, reason: collision with root package name */
    static final F f37997c;

    /* renamed from: d, reason: collision with root package name */
    static final F f37998d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        p(Integer.valueOf(i5));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f38023a) {
            return j$.util.B.d(((Integer) this.f38024b).intValue());
        }
        return null;
    }

    static {
        EnumC2963h3 enumC2963h3 = EnumC2963h3.INT_VALUE;
        f37997c = new F(true, enumC2963h3, j$.util.B.a(), new r(2), new C2999p(5));
        f37998d = new F(false, enumC2963h3, j$.util.B.a(), new r(2), new C2999p(5));
    }
}
