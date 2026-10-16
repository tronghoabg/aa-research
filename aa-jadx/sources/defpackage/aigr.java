package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aigr extends defpackage.aigq {
    private final defpackage.aihw delegate;

    public aigr(defpackage.aihw aihwVar) {
        aihwVar.getClass();
        this.delegate = aihwVar;
    }

    @Override // defpackage.aigq
    protected defpackage.aihw getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.aikf
    public defpackage.aihw makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : getDelegate().makeNullableAsSpecified(z).replaceAttributes(getAttributes());
    }

    @Override // defpackage.aikf
    public defpackage.aihw replaceAttributes(defpackage.aiir aiirVar) {
        aiirVar.getClass();
        return aiirVar != getAttributes() ? new defpackage.aihy(this, aiirVar) : this;
    }
}
