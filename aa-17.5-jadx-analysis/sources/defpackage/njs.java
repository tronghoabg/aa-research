package defpackage;

/* loaded from: classes.dex */
public final class njs extends erm {
    public final boolean a;
    public final eqj b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final long f;
    private final qrn g;
    private final kjq i;
    private final eqj j;
    private final eqj k;
    private final eqj l;
    private final eqj m;

    public njs(qrn qrnVar) {
        Object aezvVar;
        this.g = qrnVar;
        kjq kjqVarA = kjq.a.a();
        this.i = kjqVarA;
        int i = 0;
        if (lej.a.a().c()) {
            kjqVarA.k(qrnVar, false);
        }
        try {
            aezvVar = kjqVarA.a();
        } catch (Throwable th) {
            aezvVar = new aezv(th);
        }
        afbe afbeVar = afbe.a;
        afco afcoVar = tby.a;
        eqj eqjVar = (eqj) (true == (aezvVar instanceof aezv) ? new eqm(afbeVar) : aezvVar);
        this.j = eqjVar;
        eqj eqjVarB = eqy.b(eqjVar, new ltk(14));
        this.k = eqjVarB;
        eqj eqjVarB2 = eqy.b(eqjVarB, new ltk(15));
        this.l = eqjVarB2;
        yph yphVar = nsr.a;
        boolean zJ = ((nsr) mki.a.i(nsr.class)).b().J();
        this.a = zJ;
        eqj eqjVarB3 = eqy.b(eqjVarB2, new njq(this, i));
        this.m = eqjVarB3;
        ltk ltkVar = new ltk(16);
        eqjVarB3.getClass();
        eqj eqjVarB4 = eqy.b(eqjVarB3, ltkVar);
        this.b = eqjVarB4;
        ltk ltkVar2 = new ltk(17);
        eqjVarB3.getClass();
        eqj eqjVarB5 = eqy.b(eqjVarB3, ltkVar2);
        this.c = eqjVarB5;
        this.d = zJ ? eqjVarB5 : eqjVarB4;
        this.e = zJ ? eqjVarB4 : eqjVarB5;
        this.f = 200L;
    }

    public static final int a(kjl kjlVar) {
        if (!(kjlVar instanceof kjk)) {
            return 1;
        }
        kjk kjkVar = (kjk) kjlVar;
        if (kjkVar.d.contains(1)) {
            return 1;
        }
        kjz kjzVar = kjkVar.a;
        int i = kjzVar.a.a;
        if (a.Y(i, 358614275) || a.Y(i, 627081341) || a.Y(i, 356517120)) {
            return 2;
        }
        if (a.Y(i, 356517131)) {
            kka kkaVar = kjzVar.b;
            kju kjuVar = kkaVar instanceof kju ? (kju) kkaVar : null;
            return (kjuVar == null || kjuVar.a >= 0 || kjuVar.b <= 0) ? 1 : 2;
        }
        return 1;
    }
}
