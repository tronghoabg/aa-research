package defpackage;

/* loaded from: classes3.dex */
public final class afsi<R> extends afti<R> implements afhj<R> {
    private final afsj<R> property;

    public afsi(afsj<R> afsjVar) {
        afsjVar.getClass();
        this.property = afsjVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m63invoke(R r) {
        getProperty().set(r);
    }

    @Override // defpackage.aftd, defpackage.afhs
    public afsj<R> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m63invoke((afsi<R>) obj);
        return afak.a;
    }
}
