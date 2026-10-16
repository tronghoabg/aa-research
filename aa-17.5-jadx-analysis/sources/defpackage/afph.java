package defpackage;

/* loaded from: classes3.dex */
public final class afph extends afpi {
    private final String _signature;
    private final ahmm signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afph(ahmm ahmmVar) {
        super(null);
        ahmmVar.getClass();
        this.signature = ahmmVar;
        this._signature = ahmmVar.asString();
    }

    @Override // defpackage.afpi
    public String asString() {
        return this._signature;
    }

    public final String getMethodDesc() {
        return this.signature.getDesc();
    }

    public final String getMethodName() {
        return this.signature.getName();
    }
}
