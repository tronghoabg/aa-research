package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afnl<V> extends defpackage.afmr<V> {
    private final defpackage.afnm<V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afnl(defpackage.afnm<? extends V> afnmVar) {
        afnmVar.getClass();
        this.property = afnmVar;
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.afnm<V> getProperty() {
        return this.property;
    }
}
