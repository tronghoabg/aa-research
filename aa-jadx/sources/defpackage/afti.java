package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afti<R> extends defpackage.afui<R> implements defpackage.afij<R> {
    private final defpackage.aftj<R> property;

    public afti(defpackage.aftj<R> aftjVar) {
        aftjVar.getClass();
        this.property = aftjVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m62invoke(R r) {
        getProperty().set(r);
    }

    @Override // defpackage.afud, defpackage.afis
    public defpackage.aftj<R> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affc
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        m62invoke(obj);
        return defpackage.afbk.a;
    }
}
