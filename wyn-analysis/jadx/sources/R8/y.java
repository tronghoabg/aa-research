package R8;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f10541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10542b;

    public y(String str, String str2) {
        this.f10541a = str;
        this.f10542b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC3340k.a(this.f10541a, yVar.f10541a) && AbstractC3340k.a(this.f10542b, yVar.f10542b);
    }

    public final int hashCode() {
        String str = this.f10541a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10542b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f10541a);
        sb2.append(", authToken=");
        return AbstractC0279p0.n(sb2, this.f10542b, ')');
    }
}
