package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class imw implements defpackage.inf {
    public final /* synthetic */ defpackage.inh a;
    private final /* synthetic */ int b;

    public /* synthetic */ imw(defpackage.inh inhVar, int i) {
        this.b = i;
        this.a = inhVar;
    }

    @Override // defpackage.inf
    public final boolean a(defpackage.jhl jhlVar) {
        boolean zAf;
        int i = this.b;
        defpackage.inh inhVar = this.a;
        if (i == 0) {
            return inhVar.ag(jhlVar);
        }
        synchronized (inhVar) {
            zAf = inhVar.af(jhlVar, true);
        }
        return zAf;
    }
}
