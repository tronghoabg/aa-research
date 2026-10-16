package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfp {
    public final long a;
    public final long b;
    public final int c = 7;

    public dfp(long j, long j2) {
        this.a = j;
        this.b = j2;
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfp)) {
            return false;
        }
        long j = this.a;
        defpackage.dfp dfpVar = (defpackage.dfp) obj;
        long j2 = dfpVar.a;
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        if (!defpackage.a.i(j, j2) || !defpackage.a.i(this.b, dfpVar.b)) {
            return false;
        }
        int i = dfpVar.c;
        return defpackage.a.X(7, 7);
    }

    public final int hashCode() {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return (((defpackage.a.f(this.a) * 31) + defpackage.a.f(this.b)) * 31) + 7;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.b;
        java.lang.String strC = defpackage.dmb.c(this.a);
        java.lang.String strC2 = defpackage.dmb.c(j);
        if (defpackage.a.X(7, 1)) {
            str = "AboveBaseline";
        } else if (defpackage.a.X(7, 2)) {
            str = "Top";
        } else if (defpackage.a.X(7, 3)) {
            str = "Bottom";
        } else if (defpackage.a.X(7, 4)) {
            str = "Center";
        } else if (defpackage.a.X(7, 5)) {
            str = "TextTop";
        } else if (defpackage.a.X(7, 6)) {
            str = "TextBottom";
        } else {
            str = defpackage.a.X(7, 7) ? "TextCenter" : "Invalid";
        }
        return "Placeholder(width=" + strC + ", height=" + strC2 + ", placeholderVerticalAlign=" + str + ")";
    }
}
