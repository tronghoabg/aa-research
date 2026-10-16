package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class smo {
    private final int a;
    private final defpackage.slq b;
    private final java.lang.String c;
    private final defpackage.rkq d;

    public smo(defpackage.rkq rkqVar, defpackage.slq slqVar, java.lang.String str) {
        this.d = rkqVar;
        this.b = slqVar;
        this.c = str;
        this.a = j$.util.Objects.hash(rkqVar, slqVar, str, null);
    }

    public final java.lang.String a() {
        return (java.lang.String) this.d.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.smo)) {
            return false;
        }
        defpackage.smo smoVar = (defpackage.smo) obj;
        return j$.util.Objects.equals(this.d, smoVar.d) && j$.util.Objects.equals(this.b, smoVar.b) && j$.util.Objects.equals(this.c, smoVar.c) && j$.util.Objects.equals(null, null);
    }

    public final int hashCode() {
        return this.a;
    }
}
