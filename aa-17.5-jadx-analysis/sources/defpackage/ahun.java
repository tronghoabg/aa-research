package defpackage;

/* loaded from: classes3.dex */
public final class ahun extends ahuo {
    private final String message;

    public ahun(String str) {
        str.getClass();
        this.message = str;
    }

    @Override // defpackage.ahuh
    public ailj getType(agcu agcuVar) {
        agcuVar.getClass();
        return ailm.createErrorType(aill.ERROR_CONSTANT_VALUE, this.message);
    }

    @Override // defpackage.ahuh
    public String toString() {
        return this.message;
    }
}
