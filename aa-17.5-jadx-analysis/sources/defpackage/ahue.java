package defpackage;

/* loaded from: classes3.dex */
public final class ahue extends ahuw {
    public ahue(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.ahuh
    public aigw getType(agcu agcuVar) {
        agcuVar.getClass();
        aigw byteType = agcuVar.getBuiltIns().getByteType();
        byteType.getClass();
        return byteType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).intValue() + ".toByte()";
    }
}
