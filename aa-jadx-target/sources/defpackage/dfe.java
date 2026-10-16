package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfe extends defpackage.dfg {
    public final java.lang.String a = "[clickable]";
    public final defpackage.dgb b;
    public final glm c;

    public dfe(defpackage.dgb dgbVar, glm glmVar) {
        this.b = dgbVar;
        this.c = glmVar;
    }

    @Override // defpackage.dfg
    public final defpackage.dgb a() {
        return this.b;
    }

    @Override // defpackage.dfg
    public final glm b() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfe)) {
            return false;
        }
        defpackage.dfe dfeVar = (defpackage.dfe) obj;
        return defpackage.afga.f(this.a, dfeVar.a) && defpackage.afga.f(this.b, dfeVar.b) && defpackage.afga.f(this.c, dfeVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.dgb dgbVar = this.b;
        int iHashCode2 = (iHashCode + (dgbVar != null ? dgbVar.hashCode() : 0)) * 31;
        glm glmVar = this.c;
        return iHashCode2 + (glmVar != null ? glmVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ")";
    }
}
