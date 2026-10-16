package S3;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f10965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10966b;

    public j(String workSpecId, int i5) {
        AbstractC3340k.e(workSpecId, "workSpecId");
        this.f10965a = workSpecId;
        this.f10966b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC3340k.a(this.f10965a, jVar.f10965a) && this.f10966b == jVar.f10966b;
    }

    public final int hashCode() {
        return (this.f10965a.hashCode() * 31) + this.f10966b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f10965a);
        sb2.append(", generation=");
        return M6.r(sb2, this.f10966b, ')');
    }
}
