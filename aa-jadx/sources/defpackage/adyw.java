package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adyw implements defpackage.adyz {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public adyw(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.adyz
    public final void a(defpackage.adzg adzgVar) {
        int i = this.b;
        if (i == 0) {
            adzgVar.a.l(this.a);
        } else if (i != 1) {
            adzgVar.a.g(this.a);
        } else {
            adzgVar.a.k(this.a);
        }
    }
}
