package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class aedz {
    public final defpackage.adjx a;
    public final defpackage.adjw b;

    protected aedz(defpackage.adjx adjxVar, defpackage.adjw adjwVar) {
        adjxVar.getClass();
        this.a = adjxVar;
        this.b = adjwVar;
    }

    public abstract defpackage.aedz a(defpackage.adjx adjxVar, defpackage.adjw adjwVar);

    public final defpackage.aedz c(defpackage.adjz... adjzVarArr) {
        return a(defpackage.adrq.v(this.a, adjzVarArr), this.b);
    }

    public final defpackage.aedz d(defpackage.adrq adrqVar) {
        defpackage.adju adjuVarA = defpackage.adjw.a(this.b);
        adjuVarA.h = adrqVar;
        return a(this.a, new defpackage.adjw(adjuVarA));
    }
}
