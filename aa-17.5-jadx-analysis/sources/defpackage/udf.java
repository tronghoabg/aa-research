package defpackage;

/* loaded from: classes3.dex */
public final class udf extends xyr {
    final /* synthetic */ qsb a;

    public udf(qsb qsbVar) {
        this.a = qsbVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xyk] */
    @Override // defpackage.xyr
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws Exception {
        qrv qrvVar;
        abeg abegVar = (abeg) obj;
        abch abchVar = abegVar.d;
        if (abchVar == null) {
            abchVar = abch.a;
        }
        abci abciVar = abchVar.d;
        if (abciVar == null) {
            abciVar = abci.a;
        }
        qsb qsbVar = this.a;
        aboh abohVar = abciVar.b;
        ygr ygrVar = (ygr) qsbVar.c;
        xxh xxhVarAh = udg.ah(abohVar, ygrVar);
        abch abchVar2 = abegVar.d;
        if (abchVar2 == null) {
            abchVar2 = abch.a;
        }
        if (((ygr) qsbVar.b).contains(Integer.valueOf(abchVar2.c))) {
            abch abchVar3 = abegVar.d;
            if (abchVar3 == null) {
                abchVar3 = abch.a;
            }
            int i = abchVar3.c;
            qrvVar = new qrv(null);
        } else {
            abej abejVar = abegVar.c;
            if (abejVar == null) {
                abejVar = abej.a;
            }
            qrvVar = udg.ak(abejVar.c, ygrVar) ? new qrv(null) : qrv.ag(xxhVarAh);
        }
        return xxh.g(qrvVar);
    }
}
