package defpackage;

/* loaded from: classes3.dex */
public final class aftl<R> extends aftf<R> implements afhu<R> {
    private final aftm<R> property;

    /* JADX WARN: Multi-variable type inference failed */
    public aftl(aftm<? extends R> aftmVar) {
        aftmVar.getClass();
        this.property = aftmVar;
    }

    @Override // defpackage.afdr
    public R invoke() {
        return getProperty().get();
    }

    @Override // defpackage.aftd, defpackage.afhs
    public aftm<R> getProperty() {
        return this.property;
    }
}
