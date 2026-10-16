package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class fuw {
    public final gru a;
    public final gml b;
    public final fvd c;
    public final Map d;

    public fuw(gru gruVar, gml gmlVar, fvd fvdVar, Map map) {
        gmlVar.getClass();
        this.a = gruVar;
        this.b = gmlVar;
        this.c = fvdVar;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuw)) {
            return false;
        }
        fuw fuwVar = (fuw) obj;
        return affa.f(this.a, fuwVar.a) && this.b == fuwVar.b && affa.f(this.c, fuwVar.c) && affa.f(this.d, fuwVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fvd fvdVar = this.c;
        return (((iHashCode * 31) + (fvdVar == null ? 0 : fvdVar.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AlphaJumpModel(listModel=" + this.a + ", state=" + this.b + ", jumpKey=" + this.c + ", alphaJumpKeyIndex=" + this.d + ")";
    }
}
