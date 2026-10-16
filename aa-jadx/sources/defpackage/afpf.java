package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afpf<R> extends defpackage.afpu<R> implements defpackage.afij<R> {
    private final defpackage.afpg<R> property;

    public afpf(defpackage.afpg<R> afpgVar) {
        afpgVar.getClass();
        this.property = afpgVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m61invoke(R r) {
        getProperty().set(r);
    }

    @Override // defpackage.afpp, defpackage.afis
    public defpackage.afpg<R> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affc
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        m61invoke(obj);
        return defpackage.afbk.a;
    }
}
