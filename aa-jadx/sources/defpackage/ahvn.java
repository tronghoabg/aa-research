package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahvn extends defpackage.ahvo {
    private final java.lang.String message;

    public ahvn(java.lang.String str) {
        str.getClass();
        this.message = str;
    }

    @Override // defpackage.ahvh
    public defpackage.aimj getType(defpackage.agdu agduVar) {
        agduVar.getClass();
        return defpackage.aimm.createErrorType(defpackage.aiml.ERROR_CONSTANT_VALUE, this.message);
    }

    @Override // defpackage.ahvh
    public java.lang.String toString() {
        return this.message;
    }
}
