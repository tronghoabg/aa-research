package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ywh implements java.lang.Comparable, java.io.Serializable {
    public final double a;
    public final defpackage.ywg b;

    protected ywh(defpackage.ywg ywgVar, double d) {
        this.b = ywgVar;
        this.a = d;
    }

    public static double a(double d, defpackage.ywg ywgVar, defpackage.ywg ywgVar2) {
        if (ywgVar.equals(ywgVar2)) {
            return d;
        }
        int i = ywgVar.c;
        if (i == 0 && ywgVar2.c == 0) {
            return (d * (((long) ywgVar2.a) * ((long) ywgVar.b))) / (((long) ywgVar2.b) * ((long) ywgVar.a));
        }
        long j = ((long) ywgVar2.a) * ((long) ywgVar.b);
        double d2 = d * j;
        double d3 = j * ((long) i);
        double d4 = ((long) ywgVar2.b) * ((long) ywgVar.a);
        return ((d2 / d4) - (d3 / d4)) + ((double) ywgVar2.c);
    }

    protected final double b(defpackage.ywh ywhVar) {
        return a(ywhVar.a, ywhVar.b, this.b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.ywh ywhVar = (defpackage.ywh) obj;
        if (this == ywhVar) {
            return 0;
        }
        return java.lang.Double.compare(this.a, b(ywhVar));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ywh) && this.a == b((defpackage.ywh) obj);
    }

    public int hashCode() {
        return ((int) (this.a * 413.0d)) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return java.lang.Double.toString(this.a);
    }
}
