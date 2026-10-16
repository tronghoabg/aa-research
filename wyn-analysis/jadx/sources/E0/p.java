package E0;

import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final o f2804a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2805b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2806c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2807d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2808e;

    public p(o oVar, l lVar, int i5, int i10, Object obj) {
        this.f2804a = oVar;
        this.f2805b = lVar;
        this.f2806c = i5;
        this.f2807d = i10;
        this.f2808e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3340k.a(this.f2804a, pVar.f2804a) && AbstractC3340k.a(this.f2805b, pVar.f2805b) && this.f2806c == pVar.f2806c && this.f2807d == pVar.f2807d && AbstractC3340k.a(this.f2808e, pVar.f2808e);
    }

    public final int hashCode() {
        o oVar = this.f2804a;
        int iHashCode = (((((((oVar == null ? 0 : oVar.hashCode()) * 31) + this.f2805b.f2802a) * 31) + this.f2806c) * 31) + this.f2807d) * 31;
        Object obj = this.f2808e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f2804a);
        sb2.append(", fontWeight=");
        sb2.append(this.f2805b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i5 = this.f2806c;
        sb2.append((Object) (i5 == 0 ? "Normal" : i5 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i10 = this.f2807d;
        if (i10 == 0) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        } else if (i10 == 1) {
            str = "All";
        } else if (i10 == 2) {
            str = "Weight";
        } else if (i10 == 3) {
            str = "Style";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f2808e);
        sb2.append(')');
        return sb2.toString();
    }
}
