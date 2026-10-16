package E0;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2795a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f2795a == ((k) obj).f2795a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2795a;
    }

    public final String toString() {
        int i5 = this.f2795a;
        return i5 == 0 ? OfficeOpenXMLExtended.SECURITY_NONE : i5 == 1 ? "All" : i5 == 2 ? "Weight" : i5 == 3 ? "Style" : "Invalid";
    }
}
