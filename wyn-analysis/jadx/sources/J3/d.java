package J3;

import A.AbstractC0213f;
import java.util.Set;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f5554i = new d(1, false, false, false, false, -1, -1, ff.x.f35434a);

    /* renamed from: a, reason: collision with root package name */
    public final int f5555a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5556b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5557c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5558d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5559e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5560f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5561g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f5562h;

    public d(int i5, boolean z2, boolean z10, boolean z11, boolean z12, long j8, long j10, Set contentUriTriggers) {
        AbstractC3256n.m(i5, "requiredNetworkType");
        AbstractC3340k.e(contentUriTriggers, "contentUriTriggers");
        this.f5555a = i5;
        this.f5556b = z2;
        this.f5557c = z10;
        this.f5558d = z11;
        this.f5559e = z12;
        this.f5560f = j8;
        this.f5561g = j10;
        this.f5562h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f5556b == dVar.f5556b && this.f5557c == dVar.f5557c && this.f5558d == dVar.f5558d && this.f5559e == dVar.f5559e && this.f5560f == dVar.f5560f && this.f5561g == dVar.f5561g && this.f5555a == dVar.f5555a) {
            return AbstractC3340k.a(this.f5562h, dVar.f5562h);
        }
        return false;
    }

    public final int hashCode() {
        int iF = ((((((((AbstractC0213f.f(this.f5555a) * 31) + (this.f5556b ? 1 : 0)) * 31) + (this.f5557c ? 1 : 0)) * 31) + (this.f5558d ? 1 : 0)) * 31) + (this.f5559e ? 1 : 0)) * 31;
        long j8 = this.f5560f;
        int i5 = (iF + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f5561g;
        return this.f5562h.hashCode() + ((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
