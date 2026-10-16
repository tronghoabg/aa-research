package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c0 extends e0 implements s5 {

    /* renamed from: c, reason: collision with root package name */
    public static final z f50346c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f50347d;

    static {
        k7 k7Var = k7.LONG_VALUE;
        n nVar = new n(15);
        n nVar2 = new n(16);
        j$.util.b0 b0Var = j$.util.b0.f50134c;
        f50346c = new z(true, k7Var, b0Var, nVar, nVar2);
        f50347d = new z(false, k7Var, b0Var, new n(15), new n(16));
    }

    @Override // j$.util.stream.e0, j$.util.stream.t5
    public final void accept(long j2) {
        u(Long.valueOf(j2));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f50384a) {
            return new j$.util.b0(((Long) this.f50385b).longValue());
        }
        return null;
    }
}
