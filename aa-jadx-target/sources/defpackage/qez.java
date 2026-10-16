package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qez implements defpackage.thn {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qez(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, xzi] */
    @Override // defpackage.thn
    public final java.lang.Object a() {
        int i = this.b;
        if (i == 0) {
            int i2 = defpackage.qfn.g;
            return new defpackage.lat((android.content.Context) this.a);
        }
        if (i == 1) {
            return this.a.a();
        }
        if (i == 2) {
            int i3 = defpackage.qfn.g;
            return new defpackage.qit((android.content.Context) this.a);
        }
        if (i != 3) {
            return this.a.a();
        }
        int i4 = defpackage.qfn.g;
        return (defpackage.luc) this.a.fF();
    }
}
