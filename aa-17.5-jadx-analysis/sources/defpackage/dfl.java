package defpackage;

/* loaded from: classes.dex */
public final class dfl {
    public final dfk a = null;
    public final dfj b;

    public dfl(dfj dfjVar) {
        this.b = dfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfl)) {
            return false;
        }
        dfl dflVar = (dfl) obj;
        if (!affa.f(this.b, dflVar.b)) {
            return false;
        }
        dfk dfkVar = dflVar.a;
        return true;
    }

    public final int hashCode() {
        return 38347;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.b + ")";
    }
}
