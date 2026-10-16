package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afuu<V> extends defpackage.afuf<V> {
    private final defpackage.afuv<V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afuu(defpackage.afuv<? extends V> afuvVar) {
        afuvVar.getClass();
        this.property = afuvVar;
    }

    @Override // defpackage.afud, defpackage.afis
    public defpackage.afuv<V> getProperty() {
        return this.property;
    }
}
