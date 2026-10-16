package defpackage;

/* loaded from: classes3.dex */
public final class aihb extends aiio {
    private final aigl nullableAnyType;

    public aihb(afye afyeVar) {
        afyeVar.getClass();
        aigw nullableAnyType = afyeVar.getNullableAnyType();
        nullableAnyType.getClass();
        this.nullableAnyType = nullableAnyType;
    }

    @Override // defpackage.aiin
    public aijg getProjectionKind() {
        return aijg.OUT_VARIANCE;
    }

    @Override // defpackage.aiin
    public aigl getType() {
        return this.nullableAnyType;
    }

    @Override // defpackage.aiin
    public boolean isStarProjection() {
        return true;
    }

    @Override // defpackage.aiin
    public aiin refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }
}
