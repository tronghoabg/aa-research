package defpackage;

/* loaded from: classes3.dex */
public final class ahvh extends ahuh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvh(String str) {
        super(str);
        str.getClass();
    }

    @Override // defpackage.ahuh
    public aigw getType(agcu agcuVar) {
        agcuVar.getClass();
        aigw stringType = agcuVar.getBuiltIns().getStringType();
        stringType.getClass();
        return stringType;
    }

    @Override // defpackage.ahuh
    public String toString() {
        return "\"" + ((String) getValue()) + '\"';
    }
}
