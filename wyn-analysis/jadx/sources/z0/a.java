package z0;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f48265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48267c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48268d;

    public a(String tag, int i5, int i10, Object obj) {
        AbstractC3340k.e(tag, "tag");
        this.f48265a = obj;
        this.f48266b = i5;
        this.f48267c = i10;
        this.f48268d = tag;
        if (i5 > i10) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3340k.a(this.f48265a, aVar.f48265a) && this.f48266b == aVar.f48266b && this.f48267c == aVar.f48267c && AbstractC3340k.a(this.f48268d, aVar.f48268d);
    }

    public final int hashCode() {
        Object obj = this.f48265a;
        return this.f48268d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f48266b) * 31) + this.f48267c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f48265a);
        sb2.append(", start=");
        sb2.append(this.f48266b);
        sb2.append(", end=");
        sb2.append(this.f48267c);
        sb2.append(", tag=");
        return AbstractC0279p0.n(sb2, this.f48268d, ')');
    }

    public a(Object obj, int i5, int i10) {
        this("", i5, i10, obj);
    }
}
