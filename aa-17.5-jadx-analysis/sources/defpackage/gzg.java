package defpackage;

/* loaded from: classes2.dex */
public final class gzg extends gvj {
    public final gzi a;
    public final boolean b;

    public gzg(gzi gziVar, boolean z) {
        this.a = gziVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzg)) {
            return false;
        }
        gzg gzgVar = (gzg) obj;
        return affa.f(this.a, gzgVar.a) && this.b == gzgVar.b;
    }

    public final int hashCode() {
        gzi gziVar = this.a;
        return ((gziVar == null ? 0 : gziVar.hashCode()) * 31) + a.f(this.b);
    }

    public final String toString() {
        return "ModelAndKeyboardRestrictionUpdate(model=" + this.a + ", isKeyboardAllowed=" + this.b + ")";
    }
}
