package defpackage;

/* loaded from: classes3.dex */
public final class aihu implements aihv {
    private boolean result;

    @Override // defpackage.aihv
    public void fork(afdr<Boolean> afdrVar) {
        afdrVar.getClass();
        if (this.result) {
            return;
        }
        this.result = afdrVar.invoke().booleanValue();
    }

    public final boolean getResult() {
        return this.result;
    }
}
