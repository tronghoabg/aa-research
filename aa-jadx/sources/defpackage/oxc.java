package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oxc implements defpackage.rmu {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public oxc(defpackage.gla glaVar, int i) {
        this.a = i;
        glaVar.getClass();
        this.b = glaVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gla, java.lang.Object] */
    @Override // defpackage.rmu
    public final void a(defpackage.wd wdVar) {
        if (this.a != 0) {
            this.b.eA(new defpackage.gmz(wdVar, (byte[]) null));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gla, java.lang.Object] */
    @Override // defpackage.rmu, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        int i = this.a;
        ?? r3 = this.b;
        if (i != 0) {
            return r3.onCreateInputConnection(editorInfo);
        }
        defpackage.oxd oxdVar = (defpackage.oxd) r3;
        return (android.view.inputmethod.InputConnection) oxdVar.a(oxdVar.k, editorInfo);
    }

    public oxc(defpackage.oxd oxdVar, int i) {
        this.a = i;
        this.b = oxdVar;
    }
}
