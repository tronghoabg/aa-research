package b1;

import Va.M6;
import android.graphics.Insets;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1494c f19120e = new C1494c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f19121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19123c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19124d;

    public C1494c(int i5, int i10, int i11, int i12) {
        this.f19121a = i5;
        this.f19122b = i10;
        this.f19123c = i11;
        this.f19124d = i12;
    }

    public static C1494c a(C1494c c1494c, C1494c c1494c2) {
        return b(Math.max(c1494c.f19121a, c1494c2.f19121a), Math.max(c1494c.f19122b, c1494c2.f19122b), Math.max(c1494c.f19123c, c1494c2.f19123c), Math.max(c1494c.f19124d, c1494c2.f19124d));
    }

    public static C1494c b(int i5, int i10, int i11, int i12) {
        return (i5 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f19120e : new C1494c(i5, i10, i11, i12);
    }

    public static C1494c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return AbstractC1493b.a(this.f19121a, this.f19122b, this.f19123c, this.f19124d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1494c.class != obj.getClass()) {
            return false;
        }
        C1494c c1494c = (C1494c) obj;
        return this.f19124d == c1494c.f19124d && this.f19121a == c1494c.f19121a && this.f19123c == c1494c.f19123c && this.f19122b == c1494c.f19122b;
    }

    public final int hashCode() {
        return (((((this.f19121a * 31) + this.f19122b) * 31) + this.f19123c) * 31) + this.f19124d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f19121a);
        sb2.append(", top=");
        sb2.append(this.f19122b);
        sb2.append(", right=");
        sb2.append(this.f19123c);
        sb2.append(", bottom=");
        return M6.r(sb2, this.f19124d, '}');
    }
}
