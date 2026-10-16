package defpackage;

/* loaded from: classes3.dex */
public final class afpg extends afpi {
    private final String _signature;
    private final ahmm signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpg(ahmm ahmmVar) {
        super(null);
        ahmmVar.getClass();
        this.signature = ahmmVar;
        this._signature = ahmmVar.asString();
    }

    @Override // defpackage.afpi
    public String asString() {
        return this._signature;
    }

    public final String getConstructorDesc() {
        return this.signature.getDesc();
    }
}
