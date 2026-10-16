package defpackage;

/* loaded from: classes.dex */
public final class lim implements lis {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lim(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.lis
    public final void a(lir lirVar) {
        int i = this.b;
        if (i == 0) {
            ype ypeVar = (ype) lin.a.l().ai(3968);
            Object obj = this.a;
            ypeVar.M("Location manager parking state changed from %s to %s", ((lin) obj).h, lirVar);
            szp.u(new kzu(obj, lirVar, 5, null));
            return;
        }
        if (i == 1) {
            ((kbn) this.a).g(kbn.h(lirVar));
            return;
        }
        lir lirVar2 = lir.a;
        Object obj2 = this.a;
        if (lirVar == lirVar2) {
            ((xcw) obj2).g(false);
        } else {
            ((xcw) obj2).h();
        }
    }

    @Override // defpackage.lis
    public final void b(Float f) {
    }
}
