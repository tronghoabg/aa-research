package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqm extends defpackage.afqn {
    private final defpackage.afqh getterSignature;
    private final defpackage.afqh setterSignature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqm(defpackage.afqh afqhVar, defpackage.afqh afqhVar2) {
        super(null);
        afqhVar.getClass();
        this.getterSignature = afqhVar;
        this.setterSignature = afqhVar2;
    }

    @Override // defpackage.afqn
    public java.lang.String asString() {
        return this.getterSignature.asString();
    }

    public final defpackage.afqh getGetterSignature() {
        return this.getterSignature;
    }

    public final defpackage.afqh getSetterSignature() {
        return this.setterSignature;
    }
}
