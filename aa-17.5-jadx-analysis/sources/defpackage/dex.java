package defpackage;

/* loaded from: classes.dex */
public final class dex extends dez {
    public final String a = "[clickable]";
    public final dfu b;
    public final glf c;

    public dex(dfu dfuVar, glf glfVar) {
        this.b = dfuVar;
        this.c = glfVar;
    }

    @Override // defpackage.dez
    public final dfu a() {
        return this.b;
    }

    @Override // defpackage.dez
    public final glf b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dex)) {
            return false;
        }
        dex dexVar = (dex) obj;
        return affa.f(this.a, dexVar.a) && affa.f(this.b, dexVar.b) && affa.f(this.c, dexVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dfu dfuVar = this.b;
        int iHashCode2 = (iHashCode + (dfuVar != null ? dfuVar.hashCode() : 0)) * 31;
        glf glfVar = this.c;
        return iHashCode2 + (glfVar != null ? glfVar.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ")";
    }
}
