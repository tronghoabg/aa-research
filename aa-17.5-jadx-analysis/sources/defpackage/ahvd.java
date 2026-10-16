package defpackage;

/* loaded from: classes3.dex */
public final class ahvd extends ahuw {
    public ahvd(long j) {
        super(Long.valueOf(j));
    }

    @Override // defpackage.ahuh
    public aigw getType(agcu agcuVar) {
        agcuVar.getClass();
        aigw longType = agcuVar.getBuiltIns().getLongType();
        longType.getClass();
        return longType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).longValue() + ".toLong()";
    }
}
