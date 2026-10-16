package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gvw implements hju {
    public static final int a = fzv.a;
    public final fzv b;
    public final gfa c;
    public final hju d;
    public final gfa e;
    public final List f;

    public gvw(fzv fzvVar, gfa gfaVar, hju hjuVar, gfa gfaVar2, List list) {
        this.b = fzvVar;
        this.c = gfaVar;
        this.d = hjuVar;
        this.e = gfaVar2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvw)) {
            return false;
        }
        gvw gvwVar = (gvw) obj;
        return affa.f(this.b, gvwVar.b) && affa.f(this.c, gvwVar.c) && affa.f(this.d, gvwVar.d) && affa.f(this.e, gvwVar.e) && affa.f(this.f, gvwVar.f);
    }

    public final int hashCode() {
        fzv fzvVar = this.b;
        int iHashCode = ((fzvVar == null ? 0 : fzvVar.hashCode()) * 31) + this.c.hashCode();
        hju hjuVar = this.d;
        return (((((iHashCode * 31) + (hjuVar != null ? hjuVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PaneWidgetUiModel(headerIcon=" + this.b + ", headerText=" + this.c + ", headerAction=" + this.d + ", paneText=" + this.e + ", actions=" + this.f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gvw() {
        gfs gfsVar = gey.b;
        this(null, gfsVar, null, gfsVar, afbe.a);
    }
}
