package defpackage;

/* loaded from: classes3.dex */
public final class afkw<R> extends aflv<R> implements afhj<R> {
    private final afkx<R> property;

    public afkw(afkx<R> afkxVar) {
        afkxVar.getClass();
        this.property = afkxVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m58invoke(R r) {
        getProperty().set(r);
    }

    @Override // defpackage.afln, defpackage.afhs
    public afkx<R> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m58invoke((afkw<R>) obj);
        return afak.a;
    }
}
