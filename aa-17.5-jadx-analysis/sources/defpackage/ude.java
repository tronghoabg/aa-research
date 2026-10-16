package defpackage;

/* loaded from: classes3.dex */
public final class ude extends xyr {
    final /* synthetic */ qsb a;

    public ude(qsb qsbVar) {
        this.a = qsbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xyk] */
    @Override // defpackage.xyr
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws Exception {
        qrv qrvVar;
        abcs abcsVar = (abcs) obj;
        abco abcoVar = abcsVar.c;
        if (abcoVar == null) {
            abcoVar = abco.a;
        }
        qsb qsbVar = this.a;
        ygr ygrVar = (ygr) qsbVar.c;
        xxh xxhVarAh = udg.ah(abcoVar.c, ygrVar);
        if (!xxhVarAh.f()) {
            abco abcoVar2 = abcsVar.d;
            if (abcoVar2 == null) {
                abcoVar2 = abco.a;
            }
            xxhVarAh = udg.ah(abcoVar2.c, ygrVar);
        }
        qrv qrvVarAg = null;
        if (!udg.ak(uqf.a(abcsVar), ygrVar)) {
            if (xxhVarAh.f()) {
                qrvVarAg = qrv.ag(xxhVarAh);
            } else {
                abnh abnhVar = abbf.ac;
                abcsVar.j(abnhVar);
                Object objJ = abcsVar.w.j(abnhVar.d);
                for (abaw abawVar : ((aban) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b) {
                    if (((ygr) qsbVar.b).contains(Integer.valueOf(abawVar.c))) {
                        int i = abawVar.c;
                        qrvVar = new qrv(null);
                    }
                }
            }
            return xxh.g(qrvVarAg);
        }
        qrvVar = new qrv(null);
        qrvVarAg = qrvVar;
        return xxh.g(qrvVarAg);
    }
}
