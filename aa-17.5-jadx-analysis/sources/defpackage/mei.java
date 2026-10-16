package defpackage;

/* loaded from: classes2.dex */
public final class mei implements kqv {
    final /* synthetic */ aixv a;
    private final /* synthetic */ int b;

    public mei(aixv aixvVar, int i) {
        this.b = i;
        this.a = aixvVar;
    }

    @Override // defpackage.kqv
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ((ynz) mej.b.e().ai(4805)).u("All contacts changed");
            Object objA = aikz.a(this.a, afak.a);
            if (objA instanceof aixo) {
                throw new IllegalStateException("Could not post contacts list", aixp.b(objA));
            }
            return;
        }
        if (i == 1) {
            Object objA2 = aikz.a(this.a, afak.a);
            if (objA2 instanceof aixo) {
                throw new IllegalStateException("Could not post contacts list", aixp.b(objA2));
            }
        } else {
            ((ynz) mer.a.e().ai(4812)).u("Favorite contacts changed");
            Object objA3 = aikz.a(this.a, afak.a);
            if (objA3 instanceof aixo) {
                throw new IllegalStateException("Could not send favorites", aixp.b(objA3));
            }
        }
    }

    @Override // defpackage.kqv
    public final void b() {
        int i = this.b;
        if (i == 0) {
            ((ynz) mej.b.e().ai(4806)).u("Stopping contacts manager");
        } else if (i != 1) {
            ((ynz) mer.a.e().ai(4813)).u("Stopping favorites manager");
        } else {
            ((ynz) lxv.a.e().ai(4448)).u("Stopping contacts manager");
        }
    }
}
