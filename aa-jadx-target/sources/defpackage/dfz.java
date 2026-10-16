package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfz {
    public final defpackage.dfb a;
    public final defpackage.dgd b;
    public final java.util.List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final defpackage.dlo g;
    public final defpackage.dlz h;
    public final long i;
    public final defpackage.wde j;

    public dfz(defpackage.dfb dfbVar, defpackage.dgd dgdVar, java.util.List list, int i, boolean z, int i2, defpackage.dlo dloVar, defpackage.dlz dlzVar, defpackage.wde wdeVar, long j) {
        this.a = dfbVar;
        this.b = dgdVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = dloVar;
        this.h = dlzVar;
        this.j = wdeVar;
        this.i = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfz)) {
            return false;
        }
        defpackage.dfz dfzVar = (defpackage.dfz) obj;
        return defpackage.afga.f(this.a, dfzVar.a) && defpackage.afga.f(this.b, dfzVar.b) && defpackage.afga.f(this.c, dfzVar.c) && this.d == dfzVar.d && this.e == dfzVar.e && this.f == dfzVar.f && defpackage.afga.f(this.g, dfzVar.g) && this.h == dfzVar.h && defpackage.afga.f(this.j, dfzVar.j) && this.i == dfzVar.i;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.e;
        int iHashCode2 = (((((((((((iHashCode * 31) + this.d) * 31) + (true != z ? 1237 : 1231)) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode();
        long j = this.i;
        return (iHashCode2 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        boolean z = this.e;
        int i2 = this.d;
        java.util.List list = this.c;
        defpackage.dgd dgdVar = this.b;
        defpackage.dfb dfbVar = this.a;
        return "TextLayoutInput(text=" + ((java.lang.Object) dfbVar) + ", style=" + dgdVar + ", placeholders=" + list + ", maxLines=" + i2 + ", softWrap=" + z + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.j + ", constraints=" + defpackage.dlm.e(this.i) + ")";
    }
}
