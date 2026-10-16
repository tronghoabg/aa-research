package defpackage;

/* loaded from: classes3.dex */
public final class afow<R> extends afor<R> implements afhu<R> {
    private final afox<R> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afow(afox<? extends R> afoxVar) {
        afoxVar.getClass();
        this.property = afoxVar;
    }

    @Override // defpackage.afdr
    public R invoke() {
        return getProperty().get();
    }

    @Override // defpackage.afop, defpackage.afhs
    public afox<R> getProperty() {
        return this.property;
    }
}
