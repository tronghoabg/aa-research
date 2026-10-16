package defpackage;

/* loaded from: classes3.dex */
public abstract class aifr extends aifq {
    private final aigw delegate;

    public aifr(aigw aigwVar) {
        aigwVar.getClass();
        this.delegate = aigwVar;
    }

    @Override // defpackage.aifq
    protected aigw getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : getDelegate().makeNullableAsSpecified(z).replaceAttributes(getAttributes());
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return aihrVar != getAttributes() ? new aigy(this, aihrVar) : this;
    }
}
