package defpackage;

/* loaded from: classes3.dex */
public final class afof<R> extends afou<R> implements afhj<R> {
    private final afog<R> property;

    public afof(afog<R> afogVar) {
        afogVar.getClass();
        this.property = afogVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m62invoke(R r) {
        getProperty().set(r);
    }

    @Override // defpackage.afop, defpackage.afhs
    public afog<R> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m62invoke((afof<R>) obj);
        return afak.a;
    }
}
