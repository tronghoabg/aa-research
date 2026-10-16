package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fza implements hju {
    public final gfa a;
    public final boolean b;
    public final List c;
    public final List d;
    public final fyy e;
    public final boolean f;

    public /* synthetic */ fza(gfa gfaVar, List list, List list2, fyy fyyVar, int i) {
        this((i & 1) != 0 ? gey.b : gfaVar, (i & 2) != 0, (i & 4) != 0 ? afbe.a : list, (i & 8) != 0 ? afbe.a : list2, (i & 16) != 0 ? fyy.a : fyyVar, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fza)) {
            return false;
        }
        fza fzaVar = (fza) obj;
        return affa.f(this.a, fzaVar.a) && this.b == fzaVar.b && affa.f(this.c, fzaVar.c) && affa.f(this.d, fzaVar.d) && this.e == fzaVar.e && this.f == fzaVar.f;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a.f(this.f);
    }

    public final String toString() {
        return "TitleHeaderUiModel(title=" + this.a + ", applyPassiveTintOnTitleCarIconSpans=" + this.b + ", startContents=" + this.c + ", endContents=" + this.d + ", headerStyle=" + this.e + ", constrainEndContents=" + this.f + ")";
    }

    public fza(gfa gfaVar, boolean z, List list, List list2, fyy fyyVar, boolean z2) {
        gfaVar.getClass();
        list.getClass();
        list2.getClass();
        fyyVar.getClass();
        this.a = gfaVar;
        this.b = z;
        this.c = list;
        this.d = list2;
        this.e = fyyVar;
        this.f = z2;
    }

    public fza() {
        this(null, null, null, null, 63);
    }
}
