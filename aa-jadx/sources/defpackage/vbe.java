package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vbe implements defpackage.vbb {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public vbe(defpackage.qsv qsvVar, defpackage.pwu pwuVar, int i) {
        this.c = i;
        this.a = pwuVar;
        this.b = qsvVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vbb] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, vav] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, vav] */
    @Override // defpackage.vbb
    public final void a(defpackage.vav vavVar) {
        defpackage.zif zifVar;
        int i = this.c;
        ?? r0 = this.b;
        if (i == 0) {
            r0.a(this.a);
            return;
        }
        defpackage.xyn xynVarA = ((defpackage.qsv) r0).a();
        boolean zF = xynVarA.f();
        java.lang.Object obj = this.a;
        if (zF && defpackage.lnt.D(((defpackage.pnz) xynVarA.b()).k())) {
            defpackage.pwu pwuVar = (defpackage.pwu) obj;
            pwuVar.c = true;
            defpackage.pxg pxgVarC = pwuVar.c();
            synchronized (obj) {
                zifVar = ((defpackage.pwu) obj).a;
            }
            zifVar.o(pxgVarC);
            if (pwuVar.b.getAndSet(true)) {
                return;
            }
            defpackage.qsv qsvVar = pwuVar.d;
            defpackage.vbb vbbVar = (defpackage.vbb) qsvVar.a.remove(obj);
            if (vbbVar != null) {
                qsvVar.c.f(vbbVar);
            }
        }
    }

    public /* synthetic */ vbe(defpackage.vbf vbfVar, defpackage.vbb vbbVar, int i) {
        this.c = i;
        this.a = vbfVar;
        this.b = vbbVar;
    }
}
