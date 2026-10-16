package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gpc implements defpackage.gnd {
    public final defpackage.gnd a;
    public final defpackage.gpb b;

    public gpc(defpackage.gnd gndVar, defpackage.gpb gpbVar) {
        this.a = gndVar;
        this.b = gpbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gpc)) {
            return false;
        }
        defpackage.gpc gpcVar = (defpackage.gpc) obj;
        return defpackage.afga.f(this.a, gpcVar.a) && defpackage.afga.f(this.b, gpcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MapWithContentTemplateInternal(content=" + this.a + ", mapActions=" + this.b + ")";
    }
}
