package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gvn implements gmw {
    public final fzg a;
    public final har b;
    public final gag c;
    public final List d;
    public final boolean e;

    public gvn(fzg fzgVar, har harVar, gag gagVar, List list, boolean z) {
        this.a = fzgVar;
        this.b = harVar;
        this.c = gagVar;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvn)) {
            return false;
        }
        gvn gvnVar = (gvn) obj;
        return affa.f(this.a, gvnVar.a) && affa.f(this.b, gvnVar.b) && affa.f(this.c, gvnVar.c) && affa.f(this.d, gvnVar.d) && this.e == gvnVar.e;
    }

    public final int hashCode() {
        fzg fzgVar = this.a;
        int iHashCode = fzgVar == null ? 0 : fzgVar.hashCode();
        har harVar = this.b;
        int iHashCode2 = harVar == null ? 0 : harVar.hashCode();
        int i = iHashCode * 31;
        gag gagVar = this.c;
        return ((((((i + iHashCode2) * 31) + (gagVar != null ? gagVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + a.f(this.e);
    }

    public final String toString() {
        return "PaneTemplateInternal(header=" + this.a + ", rowsSection=" + this.b + ", image=" + this.c + ", actions=" + this.d + ", isLoading=" + this.e + ")";
    }
}
