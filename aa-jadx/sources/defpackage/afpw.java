package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afpw<R> extends defpackage.afpr<R> implements defpackage.afiu<R> {
    private final defpackage.afpx<R> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afpw(defpackage.afpx<? extends R> afpxVar) {
        afpxVar.getClass();
        this.property = afpxVar;
    }

    @Override // defpackage.afer
    public R invoke() {
        return getProperty().get();
    }

    @Override // defpackage.afpp, defpackage.afis
    public defpackage.afpx<R> getProperty() {
        return this.property;
    }
}
