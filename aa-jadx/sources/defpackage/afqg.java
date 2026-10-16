package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqg extends defpackage.afqi {
    private final java.lang.String _signature;
    private final defpackage.ahnm signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqg(defpackage.ahnm ahnmVar) {
        super(null);
        ahnmVar.getClass();
        this.signature = ahnmVar;
        this._signature = ahnmVar.asString();
    }

    @Override // defpackage.afqi
    public java.lang.String asString() {
        return this._signature;
    }

    public final java.lang.String getConstructorDesc() {
        return this.signature.getDesc();
    }
}
