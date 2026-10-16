package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aflw<R> extends defpackage.afmv<R> implements defpackage.afij<R> {
    private final defpackage.aflx<R> property;

    public aflw(defpackage.aflx<R> aflxVar) {
        aflxVar.getClass();
        this.property = aflxVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m57invoke(R r) {
        getProperty().set(r);
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.aflx<R> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affc
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        m57invoke(obj);
        return defpackage.afbk.a;
    }
}
