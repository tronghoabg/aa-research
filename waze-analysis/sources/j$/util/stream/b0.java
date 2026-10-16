package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b0 extends e0 implements r5 {

    /* renamed from: c, reason: collision with root package name */
    public static final z f50338c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f50339d;

    static {
        k7 k7Var = k7.INT_VALUE;
        n nVar = new n(13);
        n nVar2 = new n(14);
        j$.util.a0 a0Var = j$.util.a0.f50129c;
        f50338c = new z(true, k7Var, a0Var, nVar, nVar2);
        f50339d = new z(false, k7Var, a0Var, new n(13), new n(14));
    }

    @Override // j$.util.stream.e0, j$.util.stream.t5
    public final void accept(int i2) {
        u(Integer.valueOf(i2));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f50384a) {
            return new j$.util.a0(((Integer) this.f50385b).intValue());
        }
        return null;
    }
}
