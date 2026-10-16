package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ljj {
    public final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List b = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean c;
    public boolean d;
    public final defpackage.qsy e;
    public final defpackage.rpe f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public ljj(defpackage.rpe rpeVar) throws defpackage.qst, rlo {
        defpackage.lji ljiVar = new defpackage.lji(this, 0);
        this.e = ljiVar;
        this.f = rpeVar;
        rpeVar.f(ljiVar, 11, 0);
        defpackage.qsz qszVarA = rpeVar.a(11);
        if (qszVarA != null) {
            ljiVar.d(qszVarA.a, qszVarA.b, qszVarA.c, qszVarA.d);
        }
    }
}
