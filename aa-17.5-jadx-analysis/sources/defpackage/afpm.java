package defpackage;

/* loaded from: classes3.dex */
public final class afpm extends afpn {
    private final afph getterSignature;
    private final afph setterSignature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpm(afph afphVar, afph afphVar2) {
        super(null);
        afphVar.getClass();
        this.getterSignature = afphVar;
        this.setterSignature = afphVar2;
    }

    @Override // defpackage.afpn
    public String asString() {
        return this.getterSignature.asString();
    }

    public final afph getGetterSignature() {
        return this.getterSignature;
    }

    public final afph getSetterSignature() {
        return this.setterSignature;
    }
}
