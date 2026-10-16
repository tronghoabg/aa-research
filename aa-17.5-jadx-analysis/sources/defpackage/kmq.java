package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class kmq implements svu {
    private final /* synthetic */ int a;

    public /* synthetic */ kmq(int i) {
        this.a = i;
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        int i = this.a;
        if (i == 0) {
            ((ype) ((ype) ((ype) kmr.a.g()).p(exc)).ai((char) 3237)).u("Failed to update Car Policy experiment tokens!");
            return;
        }
        if (i == 1) {
            ((ype) ((ype) ((ype) kmr.a.g()).p(exc)).ai((char) 3239)).u("Failed to update Gearhead experiment tokens!");
            return;
        }
        if (i == 2) {
            ((ype) ((ype) ljf.d.g()).ai((char) 3975)).u("Connection failed.");
        } else if (i != 3) {
            mjv.x(thd.b, null);
        } else {
            mjv.x(thd.a, null);
        }
    }
}
