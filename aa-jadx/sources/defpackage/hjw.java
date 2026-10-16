package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hjw {
    public final defpackage.hjv a;
    public final defpackage.hju b;
    public final int c;
    public final int d;

    public hjw(defpackage.hjv hjvVar, defpackage.hju hjuVar, int i, int i2) {
        this.a = hjvVar;
        this.b = hjuVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean a(defpackage.hjv hjvVar, defpackage.hju hjuVar) {
        if (this.a.d >= hjvVar.d) {
            return this.b.d >= hjuVar.d;
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hjw)) {
            return false;
        }
        defpackage.hjw hjwVar = (defpackage.hjw) obj;
        return this.a == hjwVar.a && this.b == hjwVar.b && this.c == hjwVar.c && this.d == hjwVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "TemplateBreakpoint(width=" + this.a + ", height=" + this.b + ", widthDp=" + this.c + ", heightDp=" + this.d + ")";
    }
}
