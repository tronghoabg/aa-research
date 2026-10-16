package defpackage;

/* loaded from: classes2.dex */
public final class gvh implements gvi {
    public final hju a;
    public final hju b;

    public gvh(hju hjuVar, hju hjuVar2) {
        this.a = hjuVar;
        this.b = hjuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvh)) {
            return false;
        }
        gvh gvhVar = (gvh) obj;
        return affa.f(this.a, gvhVar.a) && affa.f(this.b, gvhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hju hjuVar = this.b;
        return iHashCode + (hjuVar == null ? 0 : hjuVar.hashCode());
    }

    public final String toString() {
        return "GenericOverlayUiModel(expandableWidget=" + this.a + ", action=" + this.b + ")";
    }
}
