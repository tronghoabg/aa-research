package defpackage;

/* loaded from: classes3.dex */
public final class ahup extends ahuh {
    public ahup(float f) {
        super(Float.valueOf(f));
    }

    @Override // defpackage.ahuh
    public aigw getType(agcu agcuVar) {
        agcuVar.getClass();
        aigw floatType = agcuVar.getBuiltIns().getFloatType();
        floatType.getClass();
        return floatType;
    }

    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).floatValue() + ".toFloat()";
    }
}
