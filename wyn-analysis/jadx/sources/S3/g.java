package S3;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10959c;

    public g(String workSpecId, int i5, int i10) {
        AbstractC3340k.e(workSpecId, "workSpecId");
        this.f10957a = workSpecId;
        this.f10958b = i5;
        this.f10959c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC3340k.a(this.f10957a, gVar.f10957a) && this.f10958b == gVar.f10958b && this.f10959c == gVar.f10959c;
    }

    public final int hashCode() {
        return (((this.f10957a.hashCode() * 31) + this.f10958b) * 31) + this.f10959c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f10957a);
        sb2.append(", generation=");
        sb2.append(this.f10958b);
        sb2.append(", systemId=");
        return M6.r(sb2, this.f10959c, ')');
    }
}
