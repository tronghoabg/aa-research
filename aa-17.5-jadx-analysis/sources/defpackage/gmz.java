package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gmz implements hju {
    public final fza a;
    public final List b;
    public final hju c;

    public gmz(fza fzaVar, List list, hju hjuVar) {
        this.a = fzaVar;
        this.b = list;
        this.c = hjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmz)) {
            return false;
        }
        gmz gmzVar = (gmz) obj;
        return affa.f(this.a, gmzVar.a) && affa.f(this.b, gmzVar.b) && affa.f(this.c, gmzVar.c);
    }

    public final int hashCode() {
        fza fzaVar = this.a;
        int iHashCode = ((fzaVar == null ? 0 : fzaVar.hashCode()) * 31) + this.b.hashCode();
        hju hjuVar = this.c;
        return (iHashCode * 31) + (hjuVar != null ? hjuVar.hashCode() : 0);
    }

    public final String toString() {
        return "ItemWidgetUiModel(header=" + this.a + ", items=" + this.b + ", action=" + this.c + ")";
    }
}
