package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
final class J extends K {

    /* renamed from: c, reason: collision with root package name */
    static final F f38016c;

    /* renamed from: d, reason: collision with root package name */
    static final F f38017d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f38023a) {
            return Optional.of(this.f38024b);
        }
        return null;
    }

    static {
        EnumC2963h3 enumC2963h3 = EnumC2963h3.REFERENCE;
        f38016c = new F(true, enumC2963h3, Optional.empty(), new r(4), new C2999p(7));
        f38017d = new F(false, enumC2963h3, Optional.empty(), new r(4), new C2999p(7));
    }
}
