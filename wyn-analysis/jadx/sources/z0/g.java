package z0;

import Va.M6;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final H0.c f48291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48293c;

    public g(H0.c cVar, int i5, int i10) {
        this.f48291a = cVar;
        this.f48292b = i5;
        this.f48293c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f48291a.equals(gVar.f48291a) && this.f48292b == gVar.f48292b && this.f48293c == gVar.f48293c;
    }

    public final int hashCode() {
        return (((this.f48291a.hashCode() * 31) + this.f48292b) * 31) + this.f48293c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f48291a);
        sb2.append(", startIndex=");
        sb2.append(this.f48292b);
        sb2.append(", endIndex=");
        return M6.r(sb2, this.f48293c, ')');
    }
}
