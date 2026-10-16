package j$.util.stream;

import j$.util.Optional;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d0 extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z f50367c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f50368d;

    static {
        k7 k7Var = k7.REFERENCE;
        f50367c = new z(true, k7Var, Optional.empty(), new n(17), new n(18));
        f50368d = new z(false, k7Var, Optional.empty(), new n(17), new n(18));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f50384a) {
            return Optional.of(this.f50385b);
        }
        return null;
    }
}
