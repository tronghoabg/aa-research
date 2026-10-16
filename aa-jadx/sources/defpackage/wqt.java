package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wqt implements defpackage.wtw {
    final /* synthetic */ defpackage.wqu a;
    private final /* synthetic */ int b;

    public wqt(defpackage.wqu wquVar, int i) {
        this.b = i;
        this.a = wquVar;
    }

    @Override // defpackage.wtw
    public final void a(android.graphics.Typeface typeface) {
        int i = this.b;
        defpackage.wqu wquVar = this.a;
        if (i != 0) {
            if (wquVar.F(typeface)) {
                wquVar.l(false);
            }
        } else if (wquVar.G(typeface)) {
            wquVar.l(false);
        }
    }
}
