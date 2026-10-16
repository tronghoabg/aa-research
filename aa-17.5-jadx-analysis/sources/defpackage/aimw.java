package defpackage;

/* loaded from: classes3.dex */
final class aimw {
    private final aigl inProjection;
    private final aigl outProjection;
    private final agee typeParameter;

    public aimw(agee ageeVar, aigl aiglVar, aigl aiglVar2) {
        ageeVar.getClass();
        aiglVar.getClass();
        aiglVar2.getClass();
        this.typeParameter = ageeVar;
        this.inProjection = aiglVar;
        this.outProjection = aiglVar2;
    }

    public final aigl getInProjection() {
        return this.inProjection;
    }

    public final aigl getOutProjection() {
        return this.outProjection;
    }

    public final agee getTypeParameter() {
        return this.typeParameter;
    }

    public final boolean isConsistent() {
        return aijp.DEFAULT.isSubtypeOf(this.inProjection, this.outProjection);
    }
}
