package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class G extends K implements InterfaceC2997o2 {

    /* renamed from: c, reason: collision with root package name */
    static final F f37989c;

    /* renamed from: d, reason: collision with root package name */
    static final F f37990d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        p(Double.valueOf(d3));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f38023a) {
            return j$.util.A.d(((Double) this.f38024b).doubleValue());
        }
        return null;
    }

    static {
        EnumC2963h3 enumC2963h3 = EnumC2963h3.DOUBLE_VALUE;
        f37989c = new F(true, enumC2963h3, j$.util.A.a(), new r(1), new C2999p(4));
        f37990d = new F(false, enumC2963h3, j$.util.A.a(), new r(1), new C2999p(4));
    }
}
