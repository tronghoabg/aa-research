package defpackage;

/* loaded from: classes.dex */
final class ind implements Runnable {
    public int a;
    public final xya b;
    final /* synthetic */ ine c;

    public ind(ine ineVar, int i) {
        xyi xyiVar = xvx.a;
        this.c = ineVar;
        this.a = i;
        this.b = new xya(xyiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ine ineVar = this.c;
        ing ingVar = (ing) ineVar.v();
        if (ingVar == null) {
            return;
        }
        String strB = ineVar.b(this.a);
        ((ype) ((ype) ing.a.f()).ai((char) 597)).y("Client ANR due to command time out %s.", new zjd(zjc.a, strB));
        ineVar.l(this.a, false);
        inc incVar = ineVar.a;
        if (incVar != null) {
            incVar.b(this.a, false);
        }
        xya xyaVar = this.b;
        if (xyaVar.a) {
            ingVar.K(strB, xyaVar.c());
        } else {
            ingVar.K(strB, null);
        }
    }
}
