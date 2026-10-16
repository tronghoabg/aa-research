package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqh extends defpackage.afqi {
    private final java.lang.String _signature;
    private final defpackage.ahnm signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqh(defpackage.ahnm ahnmVar) {
        super(null);
        ahnmVar.getClass();
        this.signature = ahnmVar;
        this._signature = ahnmVar.asString();
    }

    @Override // defpackage.afqi
    public java.lang.String asString() {
        return this._signature;
    }

    public final java.lang.String getMethodDesc() {
        return this.signature.getDesc();
    }

    public final java.lang.String getMethodName() {
        return this.signature.getName();
    }
}
