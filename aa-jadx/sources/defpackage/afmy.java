package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afmy<R> extends defpackage.afmr<R> implements defpackage.afiu<R> {
    private final defpackage.afmz<R> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afmy(defpackage.afmz<? extends R> afmzVar) {
        afmzVar.getClass();
        this.property = afmzVar;
    }

    @Override // defpackage.afer
    public R invoke() {
        return getProperty().get();
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.afmz<R> getProperty() {
        return this.property;
    }
}
