package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nft implements defpackage.liw {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nft(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.liw
    public final void a(int i) {
        int i2 = this.b;
        java.lang.Object obj = this.a;
        if (i2 == 0) {
            ((defpackage.eqp) obj).j(java.lang.Integer.valueOf(i));
        } else {
            java.util.Iterator it = ((defpackage.ljr) obj).i.iterator();
            while (it.hasNext()) {
                ((defpackage.liw) it.next()).a(i);
            }
        }
    }
}
