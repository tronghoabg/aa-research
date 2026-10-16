package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkq extends android.text.style.ClickableSpan {
    private final defpackage.dfg a;

    public dkq(defpackage.dfg dfgVar) {
        this.a = dfgVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        defpackage.dfg dfgVar = this.a;
        glm glmVarB = dfgVar.b();
        if (glmVarB != null) {
            glmVarB.b(dfgVar);
        }
    }
}
