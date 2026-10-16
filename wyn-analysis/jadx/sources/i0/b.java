package I0;

import Va.M6;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MetricAffectingSpan f5274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5276c;

    public b(MetricAffectingSpan metricAffectingSpan, int i5, int i10) {
        this.f5274a = metricAffectingSpan;
        this.f5275b = i5;
        this.f5276c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5274a.equals(bVar.f5274a) && this.f5275b == bVar.f5275b && this.f5276c == bVar.f5276c;
    }

    public final int hashCode() {
        return (((this.f5274a.hashCode() * 31) + this.f5275b) * 31) + this.f5276c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanRange(span=");
        sb2.append(this.f5274a);
        sb2.append(", start=");
        sb2.append(this.f5275b);
        sb2.append(", end=");
        return M6.r(sb2, this.f5276c, ')');
    }
}
