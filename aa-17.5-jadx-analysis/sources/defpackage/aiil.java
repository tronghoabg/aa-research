package defpackage;

/* loaded from: classes3.dex */
final class aiil {
    private final aify typeAttr;
    private final agee typeParameter;

    public aiil(agee ageeVar, aify aifyVar) {
        ageeVar.getClass();
        aifyVar.getClass();
        this.typeParameter = ageeVar;
        this.typeAttr = aifyVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aiil)) {
            return false;
        }
        aiil aiilVar = (aiil) obj;
        return affa.f(aiilVar.typeParameter, this.typeParameter) && affa.f(aiilVar.typeAttr, this.typeAttr);
    }

    public final aify getTypeAttr() {
        return this.typeAttr;
    }

    public final agee getTypeParameter() {
        return this.typeParameter;
    }

    public int hashCode() {
        int iHashCode = this.typeParameter.hashCode();
        return iHashCode + (iHashCode * 31) + this.typeAttr.hashCode();
    }

    public String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.typeParameter + ", typeAttr=" + this.typeAttr + ')';
    }
}
