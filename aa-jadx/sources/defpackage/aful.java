package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aful<R> extends defpackage.afuf<R> implements defpackage.afiu<R> {
    private final defpackage.afum<R> property;

    /* JADX WARN: Multi-variable type inference failed */
    public aful(defpackage.afum<? extends R> afumVar) {
        afumVar.getClass();
        this.property = afumVar;
    }

    @Override // defpackage.afer
    public R invoke() {
        return getProperty().get();
    }

    @Override // defpackage.afud, defpackage.afis
    public defpackage.afum<R> getProperty() {
        return this.property;
    }
}
