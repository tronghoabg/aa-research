package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class dfs {
    public final deu a;
    public final dfw b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final dlg g;
    public final dlr h;
    public final long i;
    public final wci j;

    public dfs(deu deuVar, dfw dfwVar, List list, int i, boolean z, int i2, dlg dlgVar, dlr dlrVar, wci wciVar, long j) {
        this.a = deuVar;
        this.b = dfwVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = dlgVar;
        this.h = dlrVar;
        this.j = wciVar;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfs)) {
            return false;
        }
        dfs dfsVar = (dfs) obj;
        return affa.f(this.a, dfsVar.a) && affa.f(this.b, dfsVar.b) && affa.f(this.c, dfsVar.c) && this.d == dfsVar.d && this.e == dfsVar.e && this.f == dfsVar.f && affa.f(this.g, dfsVar.g) && this.h == dfsVar.h && affa.f(this.j, dfsVar.j) && this.i == dfsVar.i;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.e;
        int iHashCode2 = (((((((((((iHashCode * 31) + this.d) * 31) + (true != z ? 1237 : 1231)) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode();
        long j = this.i;
        return (iHashCode2 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.f;
        String str = i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
        boolean z = this.e;
        int i2 = this.d;
        List list = this.c;
        dfw dfwVar = this.b;
        deu deuVar = this.a;
        return "TextLayoutInput(text=" + ((Object) deuVar) + ", style=" + dfwVar + ", placeholders=" + list + ", maxLines=" + i2 + ", softWrap=" + z + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.j + ", constraints=" + dle.e(this.i) + ")";
    }
}
