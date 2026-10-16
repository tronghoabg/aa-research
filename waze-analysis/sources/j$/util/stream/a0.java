package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a0 extends e0 implements q5 {

    /* renamed from: c, reason: collision with root package name */
    public static final z f50322c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f50323d;

    static {
        k7 k7Var = k7.DOUBLE_VALUE;
        n nVar = new n(11);
        n nVar2 = new n(12);
        j$.util.z zVar = j$.util.z.f50736c;
        f50322c = new z(true, k7Var, zVar, nVar, nVar2);
        f50323d = new z(false, k7Var, zVar, new n(11), new n(12));
    }

    @Override // j$.util.stream.e0, j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        u(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f50384a) {
            return new j$.util.z(((Double) this.f50385b).doubleValue());
        }
        return null;
    }
}
