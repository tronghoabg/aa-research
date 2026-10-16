package J7;

import A7.AbstractC0279p0;
import android.animation.TimeInterpolator;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f5725a;

    /* renamed from: b, reason: collision with root package name */
    public long f5726b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f5727c;

    /* renamed from: d, reason: collision with root package name */
    public int f5728d;

    /* renamed from: e, reason: collision with root package name */
    public int f5729e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f5727c;
        return timeInterpolator != null ? timeInterpolator : a.f5720b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f5725a == cVar.f5725a && this.f5726b == cVar.f5726b && this.f5728d == cVar.f5728d && this.f5729e == cVar.f5729e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f5725a;
        long j10 = this.f5726b;
        return ((((a().getClass().hashCode() + (((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f5728d) * 31) + this.f5729e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f5725a);
        sb2.append(" duration: ");
        sb2.append(this.f5726b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f5728d);
        sb2.append(" repeatMode: ");
        return AbstractC0279p0.j(this.f5729e, "}\n", sb2);
    }
}
