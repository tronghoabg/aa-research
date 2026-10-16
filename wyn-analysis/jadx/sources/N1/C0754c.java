package N1;

import y3.C4552j;

/* renamed from: N1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0754c f8139e = new C0754c(0, 0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f8140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8142c;

    /* renamed from: d, reason: collision with root package name */
    public C4552j f8143d;

    static {
        N0.a.k(0, 1, 2, 3, 4);
    }

    public C0754c(int i5, int i10, int i11) {
        this.f8140a = i5;
        this.f8141b = i10;
        this.f8142c = i11;
    }

    public final C4552j a() {
        if (this.f8143d == null) {
            this.f8143d = new C4552j(this);
        }
        return this.f8143d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0754c.class != obj.getClass()) {
            return false;
        }
        C0754c c0754c = (C0754c) obj;
        return this.f8140a == c0754c.f8140a && this.f8141b == c0754c.f8141b && this.f8142c == c0754c.f8142c;
    }

    public final int hashCode() {
        return (((((((527 + this.f8140a) * 31) + this.f8141b) * 31) + this.f8142c) * 31) + 1) * 31;
    }
}
