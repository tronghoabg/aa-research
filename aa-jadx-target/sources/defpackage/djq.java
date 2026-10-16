package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class djq extends defpackage.djp {
    public djq(android.view.inputmethod.InputConnection inputConnection, defpackage.affc affcVar) {
        super(inputConnection, affcVar);
    }

    @Override // defpackage.djp
    protected final void a(android.view.inputmethod.InputConnection inputConnection) {
        a$.ExternalSyntheticApiModelOutline2.m(inputConnection);
    }

    @Override // defpackage.djp, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        android.view.inputmethod.InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return a$.ExternalSyntheticApiModelOutline2.m(inputConnection, i, i2);
        }
        return false;
    }

    @Override // defpackage.djp, android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }
}
