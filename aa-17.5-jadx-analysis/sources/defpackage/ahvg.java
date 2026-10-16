package defpackage;

/* loaded from: classes3.dex */
public final class ahvg extends ahuw {
    public ahvg(short s) {
        super(Short.valueOf(s));
    }

    @Override // defpackage.ahuh
    public aigw getType(agcu agcuVar) {
        agcuVar.getClass();
        aigw shortType = agcuVar.getBuiltIns().getShortType();
        shortType.getClass();
        return shortType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).intValue() + ".toShort()";
    }
}
