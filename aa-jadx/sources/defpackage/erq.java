package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class erq implements defpackage.eqe {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public erq(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ept, java.lang.Object] */
    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        defpackage.ept[] eptVarArr;
        if (this.a == 0) {
            ?? r2 = this.b;
            r2.a();
            r2.a();
            return;
        }
        new java.util.HashMap();
        int i = 0;
        while (true) {
            eptVarArr = (defpackage.ept[]) this.b;
            if (i >= eptVarArr.length) {
                break;
            }
            eptVarArr[i].a();
            i++;
        }
        for (defpackage.ept eptVar : eptVarArr) {
            eptVar.a();
        }
    }
}
