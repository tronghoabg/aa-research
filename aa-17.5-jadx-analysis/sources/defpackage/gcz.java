package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gcz implements hju, wb {
    public final fza a;
    public final gcq b;
    public final List c;
    public final List d;
    public final fzp e;

    public gcz(fza fzaVar, gcq gcqVar, List list, List list2, fzp fzpVar) {
        this.a = fzaVar;
        this.b = gcqVar;
        this.c = list;
        this.d = list2;
        this.e = fzpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcz)) {
            return false;
        }
        gcz gczVar = (gcz) obj;
        return affa.f(this.a, gczVar.a) && affa.f(this.b, gczVar.b) && affa.f(this.c, gczVar.c) && affa.f(this.d, gczVar.d) && affa.f(this.e, gczVar.e);
    }

    public final int hashCode() {
        fza fzaVar = this.a;
        int iHashCode = fzaVar == null ? 0 : fzaVar.hashCode();
        gcq gcqVar = this.b;
        int iHashCode2 = (((((iHashCode * 31) + (gcqVar == null ? 0 : gcqVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        fzp fzpVar = this.e;
        return (iHashCode2 * 31) + (fzpVar != null ? fzpVar.hashCode() : 0);
    }

    public final String toString() {
        return "InCallUiModel(header=" + this.a + ", title=" + this.b + ", texts=" + this.c + ", actionUiModels=" + this.d + ", image=" + this.e + ")";
    }
}
