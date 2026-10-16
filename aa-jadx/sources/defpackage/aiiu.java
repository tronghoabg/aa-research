package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiiu implements defpackage.aiiv {
    private boolean result;

    @Override // defpackage.aiiv
    public void fork(defpackage.afer<java.lang.Boolean> aferVar) {
        aferVar.getClass();
        if (this.result) {
            return;
        }
        this.result = aferVar.invoke().booleanValue();
    }

    public final boolean getResult() {
        return this.result;
    }
}
