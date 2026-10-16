package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dnb implements defpackage.bvu {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public dnb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [bvh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [affc, java.lang.Object] */
    @Override // defpackage.bvu
    public final void a() {
        int i = this.b;
        if (i == 0) {
            dnu dnuVar = (dnu) this.a;
            dnuVar.dismiss();
            dnuVar.c.e();
            return;
        }
        if (i == 1) {
            this.a.d();
            return;
        }
        if (i != 2) {
            ?? r2 = this.a;
            if (i != 3) {
                r2.invoke(java.lang.Boolean.FALSE);
                return;
            } else {
                ((hne) r2).i.invoke();
                return;
            }
        }
        java.lang.Object obj = this.a;
        ((defpackage.czl) obj).e();
        android.view.View view = (android.view.View) obj;
        defpackage.edd.d(view, null);
        ((dny) obj).b.removeViewImmediate(view);
    }
}
