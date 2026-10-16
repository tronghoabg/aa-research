package defpackage;

/* loaded from: classes.dex */
public final class ney extends eqj {
    public static final yph a = yph.c("GH.EtcStatusLiveData");
    public final qrn h;
    public final qse i = new ljb(this, 4);
    public roj j;

    public ney(qrn qrnVar) {
        this.h = qrnVar;
    }

    @Override // defpackage.eqj
    protected final void c() {
        khc.u(new wci("GH.EtcStatusLiveData", yzz.ETC_STATUS, yzy.pq, "Could not listen to toll card status updates", new Object[0]), new nav(this, 8));
    }

    @Override // defpackage.eqj
    protected final void d() {
        roj rojVar = this.j;
        if (rojVar != null) {
            rojVar.b(this.i);
            this.j = null;
        }
    }
}
