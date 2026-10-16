package U8;

import A7.AbstractC0279p0;
import java.util.List;

/* loaded from: classes4.dex */
public final class V extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12483a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12484b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12485c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f12486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12487e;

    public V(String str, String str2, List list, z0 z0Var, int i5) {
        this.f12483a = str;
        this.f12484b = str2;
        this.f12485c = list;
        this.f12486d = z0Var;
        this.f12487e = i5;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f12483a.equals(((V) z0Var).f12483a) && ((str = this.f12484b) != null ? str.equals(((V) z0Var).f12484b) : ((V) z0Var).f12484b == null)) {
                V v2 = (V) z0Var;
                if (this.f12485c.equals(v2.f12485c)) {
                    z0 z0Var2 = v2.f12486d;
                    z0 z0Var3 = this.f12486d;
                    if (z0Var3 != null ? z0Var3.equals(z0Var2) : z0Var2 == null) {
                        if (this.f12487e == v2.f12487e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12483a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12484b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f12485c.hashCode()) * 1000003;
        z0 z0Var = this.f12486d;
        return ((iHashCode2 ^ (z0Var != null ? z0Var.hashCode() : 0)) * 1000003) ^ this.f12487e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f12483a);
        sb2.append(", reason=");
        sb2.append(this.f12484b);
        sb2.append(", frames=");
        sb2.append(this.f12485c);
        sb2.append(", causedBy=");
        sb2.append(this.f12486d);
        sb2.append(", overflowCount=");
        return AbstractC0279p0.j(this.f12487e, "}", sb2);
    }
}
