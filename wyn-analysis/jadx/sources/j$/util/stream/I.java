package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class I extends K implements InterfaceC3007q2 {

    /* renamed from: c, reason: collision with root package name */
    static final F f38003c;

    /* renamed from: d, reason: collision with root package name */
    static final F f38004d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        p(Long.valueOf(j8));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f38023a) {
            return j$.util.C.d(((Long) this.f38024b).longValue());
        }
        return null;
    }

    static {
        EnumC2963h3 enumC2963h3 = EnumC2963h3.LONG_VALUE;
        f38003c = new F(true, enumC2963h3, j$.util.C.a(), new r(3), new C2999p(6));
        f38004d = new F(false, enumC2963h3, j$.util.C.a(), new r(3), new C2999p(6));
    }
}
