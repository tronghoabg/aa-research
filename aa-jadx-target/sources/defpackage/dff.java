package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dff extends defpackage.dfg {
    public final java.lang.String a;
    public final defpackage.dgb b;

    public dff(java.lang.String str, defpackage.dgb dgbVar) {
        this.a = str;
        this.b = dgbVar;
    }

    @Override // defpackage.dfg
    public final defpackage.dgb a() {
        return this.b;
    }

    @Override // defpackage.dfg
    public final glm b() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dff)) {
            return false;
        }
        defpackage.dff dffVar = (defpackage.dff) obj;
        return defpackage.afga.f(this.a, dffVar.a) && defpackage.afga.f(this.b, dffVar.b) && defpackage.afga.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.dgb dgbVar = this.b;
        return (iHashCode + (dgbVar != null ? dgbVar.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ")";
    }
}
