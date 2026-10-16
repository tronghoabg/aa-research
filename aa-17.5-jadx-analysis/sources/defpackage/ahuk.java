package defpackage;

/* loaded from: classes3.dex */
public final class ahuk extends ahuh {
    public ahuk(double d) {
        super(Double.valueOf(d));
    }

    @Override // defpackage.ahuh
    public aigw getType(agcu agcuVar) {
        agcuVar.getClass();
        aigw doubleType = agcuVar.getBuiltIns().getDoubleType();
        doubleType.getClass();
        return doubleType;
    }

    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).doubleValue() + ".toDouble()";
    }
}
