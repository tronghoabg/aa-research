package defpackage;

/* loaded from: classes3.dex */
public final class afly<R> extends aflr<R> implements afhu<R> {
    private final aflz<R> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afly(aflz<? extends R> aflzVar) {
        aflzVar.getClass();
        this.property = aflzVar;
    }

    @Override // defpackage.afdr
    public R invoke() {
        return getProperty().get();
    }

    @Override // defpackage.afln, defpackage.afhs
    public aflz<R> getProperty() {
        return this.property;
    }
}
