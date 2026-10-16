package defpackage;

/* loaded from: classes.dex */
public final class dfi {
    public final long a;
    public final long b;
    public final int c = 7;

    public dfi(long j, long j2) {
        this.a = j;
        this.b = j2;
        dlu[] dluVarArr = dlt.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfi)) {
            return false;
        }
        long j = this.a;
        dfi dfiVar = (dfi) obj;
        long j2 = dfiVar.a;
        dlu[] dluVarArr = dlt.a;
        if (!a.j(j, j2) || !a.j(this.b, dfiVar.b)) {
            return false;
        }
        int i = dfiVar.c;
        return a.Y(7, 7);
    }

    public final int hashCode() {
        dlu[] dluVarArr = dlt.a;
        return (((a.g(this.a) * 31) + a.g(this.b)) * 31) + 7;
    }

    public final String toString() {
        long j = this.b;
        return "Placeholder(width=" + dlt.c(this.a) + ", height=" + dlt.c(j) + ", placeholderVerticalAlign=" + (a.Y(7, 1) ? "AboveBaseline" : a.Y(7, 2) ? "Top" : a.Y(7, 3) ? "Bottom" : a.Y(7, 4) ? "Center" : a.Y(7, 5) ? "TextTop" : a.Y(7, 6) ? "TextBottom" : a.Y(7, 7) ? "TextCenter" : "Invalid") + ")";
    }
}
