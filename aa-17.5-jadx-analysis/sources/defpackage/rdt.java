package defpackage;

/* loaded from: classes.dex */
public final class rdt implements zge {
    final /* synthetic */ int a;
    final /* synthetic */ qsz b;

    public rdt(qsz qszVar, int i) {
        this.a = i;
        this.b = qszVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        if (rrd.e("CAR.TOKEN", 4)) {
            rrd.d(4, "CAR.TOKEN", null, "Failed to disconnect %s, was not connected.", new zjd(zjc.a, this));
        }
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        rdm rdmVar = (rdm) obj;
        if (rdmVar != null) {
            rcf rcfVar = this.b.d;
            if (omc.c("CAR.CLIENT", 3)) {
                zjc zjcVar = zjc.a;
                rrd.d(3, "CAR.CLIENT", null, "Unregistering CarConnectionListener %s with multiplex listener %s", new zjd(zjcVar, rcfVar), new zjd(zjcVar, rdmVar.a));
            }
            rdmVar.a.g(rcfVar);
            rdmVar.l.c();
            if (rrd.e("CAR.TOKEN", 4)) {
                zjc zjcVar2 = zjc.a;
                rrd.d(4, "CAR.TOKEN", null, "Disconnected %s using %s (cx attempt %s)", new zjd(zjcVar2, this), new zjd(zjcVar2, rdmVar), new zjd(zjcVar2, Integer.valueOf(this.a)));
            }
        }
    }
}
