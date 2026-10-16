package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uas {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/indoor/model/IndoorBuilding");
    public final defpackage.toz b;
    public final defpackage.ygw c;
    public final boolean d;
    public final int e;
    public final defpackage.tpf f;
    public final defpackage.uas g;

    public uas(defpackage.toz tozVar, defpackage.ygw ygwVar, int i, boolean z, defpackage.tpf tpfVar, defpackage.uas uasVar) {
        this.b = tozVar;
        this.c = ygwVar;
        this.e = i;
        this.d = z;
        this.f = tpfVar;
        this.g = uasVar;
    }

    public final defpackage.uau a() {
        return b(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.uau b(int i) {
        if (i < 0) {
            return null;
        }
        defpackage.ygw ygwVar = this.c;
        if (i >= ((defpackage.ymx) ygwVar).c) {
            return null;
        }
        return (defpackage.uau) ygwVar.get(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.uas)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.uas uasVar = (defpackage.uas) obj;
        return j$.util.Objects.equals(this.f, uasVar.f) && j$.util.Objects.equals(this.c, uasVar.c) && j$.util.Objects.equals(this.b, uasVar.b) && this.e == uasVar.e && this.d == uasVar.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f, this.c, java.lang.Integer.valueOf(this.e), this.b, java.lang.Boolean.valueOf(this.d));
    }

    public final java.lang.String toString() {
        return "[Building: " + this.b.f() + "]";
    }
}
