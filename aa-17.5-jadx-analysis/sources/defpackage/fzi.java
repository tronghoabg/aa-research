package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fzi implements fzj {
    public final gbv a;
    public final List b;
    public final List c;

    public fzi(gbv gbvVar, List list, List list2) {
        this.a = gbvVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzi)) {
            return false;
        }
        fzi fziVar = (fzi) obj;
        return affa.f(this.a, fziVar.a) && affa.f(this.b, fziVar.b) && affa.f(this.c, fziVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SearchHeaderUiModel(searchTextField=" + this.a + ", startContents=" + this.b + ", endContents=" + this.c + ")";
    }
}
