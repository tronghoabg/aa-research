package G5;

import A.e0;
import E5.InterfaceC0453h;

/* renamed from: G5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0527h implements InterfaceC0453h {

    /* renamed from: g, reason: collision with root package name */
    public static final C0527h f4408g = new C0527h(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4412d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4413e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f4414f;

    public C0527h(int i5, int i10, int i11, int i12, int i13) {
        this.f4409a = i5;
        this.f4410b = i10;
        this.f4411c = i11;
        this.f4412d = i12;
        this.f4413e = i13;
    }

    public final e0 a() {
        if (this.f4414f == null) {
            this.f4414f = new e0(this);
        }
        return this.f4414f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0527h.class == obj.getClass()) {
            C0527h c0527h = (C0527h) obj;
            if (this.f4409a == c0527h.f4409a && this.f4410b == c0527h.f4410b && this.f4411c == c0527h.f4411c && this.f4412d == c0527h.f4412d && this.f4413e == c0527h.f4413e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f4409a) * 31) + this.f4410b) * 31) + this.f4411c) * 31) + this.f4412d) * 31) + this.f4413e;
    }
}
