package defpackage;

/* loaded from: classes.dex */
public final class dfu {
    public final dfm a;
    public final dfm b;

    public dfu(dfm dfmVar, dfm dfmVar2) {
        this.a = dfmVar;
        this.b = dfmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dfu)) {
            return false;
        }
        dfu dfuVar = (dfu) obj;
        return affa.f(this.a, dfuVar.a) && affa.f(this.b, dfuVar.b) && affa.f(null, null) && affa.f(null, null);
    }

    public final int hashCode() {
        dfm dfmVar = this.a;
        int iHashCode = dfmVar != null ? dfmVar.hashCode() : 0;
        dfm dfmVar2 = this.b;
        return ((iHashCode * 31) + (dfmVar2 != null ? dfmVar2.hashCode() : 0)) * 961;
    }

    public dfu() {
        this(null, null);
    }
}
