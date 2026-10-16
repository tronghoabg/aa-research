package A3;

import A7.AbstractC0279p0;
import R8.v;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f282d;

    public b(Rect rect) {
        int i5 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        this.f279a = i5;
        this.f280b = i10;
        this.f281c = i11;
        this.f282d = i12;
        if (i5 > i11) {
            throw new IllegalArgumentException(v.e(i5, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(v.e(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f279a, this.f280b, this.f281c, this.f282d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f279a == bVar.f279a && this.f280b == bVar.f280b && this.f281c == bVar.f281c && this.f282d == bVar.f282d;
    }

    public final int hashCode() {
        return (((((this.f279a * 31) + this.f280b) * 31) + this.f281c) * 31) + this.f282d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f279a);
        sb2.append(',');
        sb2.append(this.f280b);
        sb2.append(',');
        sb2.append(this.f281c);
        sb2.append(',');
        return AbstractC0279p0.j(this.f282d, "] }", sb2);
    }
}
