package E5;

import f6.C2613z;
import u6.AbstractC4256a;

/* renamed from: E5.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0454h0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2613z f3403a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3404b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3405c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3406d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3407e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3408f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3409g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3410h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3411i;

    public C0454h0(C2613z c2613z, long j8, long j10, long j11, long j12, boolean z2, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        AbstractC4256a.e(!z12 || z10);
        AbstractC4256a.e(!z11 || z10);
        if (z2 && (z10 || z11 || z12)) {
            z13 = false;
        }
        AbstractC4256a.e(z13);
        this.f3403a = c2613z;
        this.f3404b = j8;
        this.f3405c = j10;
        this.f3406d = j11;
        this.f3407e = j12;
        this.f3408f = z2;
        this.f3409g = z10;
        this.f3410h = z11;
        this.f3411i = z12;
    }

    public final C0454h0 a(long j8) {
        if (j8 == this.f3405c) {
            return this;
        }
        return new C0454h0(this.f3403a, this.f3404b, j8, this.f3406d, this.f3407e, this.f3408f, this.f3409g, this.f3410h, this.f3411i);
    }

    public final C0454h0 b(long j8) {
        if (j8 == this.f3404b) {
            return this;
        }
        return new C0454h0(this.f3403a, j8, this.f3405c, this.f3406d, this.f3407e, this.f3408f, this.f3409g, this.f3410h, this.f3411i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0454h0.class == obj.getClass()) {
            C0454h0 c0454h0 = (C0454h0) obj;
            if (this.f3404b == c0454h0.f3404b && this.f3405c == c0454h0.f3405c && this.f3406d == c0454h0.f3406d && this.f3407e == c0454h0.f3407e && this.f3408f == c0454h0.f3408f && this.f3409g == c0454h0.f3409g && this.f3410h == c0454h0.f3410h && this.f3411i == c0454h0.f3411i && u6.v.a(this.f3403a, c0454h0.f3403a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3403a.hashCode() + 527) * 31) + ((int) this.f3404b)) * 31) + ((int) this.f3405c)) * 31) + ((int) this.f3406d)) * 31) + ((int) this.f3407e)) * 31) + (this.f3408f ? 1 : 0)) * 31) + (this.f3409g ? 1 : 0)) * 31) + (this.f3410h ? 1 : 0)) * 31) + (this.f3411i ? 1 : 0);
    }
}
