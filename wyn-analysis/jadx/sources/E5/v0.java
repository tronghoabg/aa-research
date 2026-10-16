package E5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v0 implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3548b;

    /* renamed from: c, reason: collision with root package name */
    public final C0446d0 f3549c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3550d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3551e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3552f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3553g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3554h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3555i;

    public v0(Object obj, int i5, C0446d0 c0446d0, Object obj2, int i10, long j8, long j10, int i11, int i12) {
        this.f3547a = obj;
        this.f3548b = i5;
        this.f3549c = c0446d0;
        this.f3550d = obj2;
        this.f3551e = i10;
        this.f3552f = j8;
        this.f3553g = j10;
        this.f3554h = i11;
        this.f3555i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f3548b == v0Var.f3548b && this.f3551e == v0Var.f3551e && this.f3552f == v0Var.f3552f && this.f3553g == v0Var.f3553g && this.f3554h == v0Var.f3554h && this.f3555i == v0Var.f3555i && Fe.b.v(this.f3547a, v0Var.f3547a) && Fe.b.v(this.f3550d, v0Var.f3550d) && Fe.b.v(this.f3549c, v0Var.f3549c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3547a, Integer.valueOf(this.f3548b), this.f3549c, this.f3550d, Integer.valueOf(this.f3551e), Long.valueOf(this.f3552f), Long.valueOf(this.f3553g), Integer.valueOf(this.f3554h), Integer.valueOf(this.f3555i)});
    }
}
