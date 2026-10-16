package s2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final x f44935a;

    /* renamed from: b, reason: collision with root package name */
    public final x f44936b;

    public v(x xVar, x xVar2) {
        this.f44935a = xVar;
        this.f44936b = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f44935a.equals(vVar.f44935a) && this.f44936b.equals(vVar.f44936b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44936b.hashCode() + (this.f44935a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        x xVar = this.f44935a;
        sb2.append(xVar);
        x xVar2 = this.f44936b;
        if (xVar.equals(xVar2)) {
            str = "";
        } else {
            str = ", " + xVar2;
        }
        return wg.b.c(sb2, str, "]");
    }
}
