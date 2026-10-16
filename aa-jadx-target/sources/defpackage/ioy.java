package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ioy implements defpackage.rqk {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ioy(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rqk
    public final void a(boolean z) {
        if (this.b != 0) {
            ((defpackage.ioh) this.a).aq();
            return;
        }
        ((defpackage.yqj) defpackage.iph.E.l().ai((char) 961)).y("Finished waiting for lifetime to complete, verified: %b", java.lang.Boolean.valueOf(z));
        ((defpackage.iph) this.a).H.j(49, 50);
    }
}
