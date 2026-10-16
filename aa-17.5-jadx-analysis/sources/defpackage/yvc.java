package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class yvc implements Comparable, Serializable {
    public final double a;
    public final yvb b;

    protected yvc(yvb yvbVar, double d) {
        this.b = yvbVar;
        this.a = d;
    }

    public static double a(double d, yvb yvbVar, yvb yvbVar2) {
        if (yvbVar.equals(yvbVar2)) {
            return d;
        }
        int i = yvbVar.c;
        if (i == 0 && yvbVar2.c == 0) {
            return (d * (yvbVar2.a * yvbVar.b)) / (yvbVar2.b * yvbVar.a);
        }
        long j = yvbVar2.a * yvbVar.b;
        double d2 = j * i;
        double d3 = yvbVar2.b * yvbVar.a;
        return (((d * j) / d3) - (d2 / d3)) + yvbVar2.c;
    }

    protected final double b(yvc yvcVar) {
        return a(yvcVar.a, yvcVar.b, this.b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        yvc yvcVar = (yvc) obj;
        if (this == yvcVar) {
            return 0;
        }
        return Double.compare(this.a, b(yvcVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvc) && this.a == b((yvc) obj);
    }

    public int hashCode() {
        return ((int) (this.a * 413.0d)) + this.b.hashCode();
    }

    public String toString() {
        return Double.toString(this.a);
    }
}
