package defpackage;

/* loaded from: classes2.dex */
public final class gri implements gvi {
    public final hju a;
    public final hju b;

    public gri(hju hjuVar, hju hjuVar2) {
        hjuVar.getClass();
        this.a = hjuVar;
        this.b = hjuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        return affa.f(this.a, griVar.a) && affa.f(this.b, griVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hju hjuVar = this.b;
        return iHashCode + (hjuVar == null ? 0 : hjuVar.hashCode());
    }

    public final String toString() {
        return "MediaOverlayUiModel(expandableWidget=" + this.a + ", action=" + this.b + ")";
    }
}
