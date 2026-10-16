package defpackage;

/* loaded from: classes.dex */
final class adxt implements adxw {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public adxt(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.adxw
    public final void a(adye adyeVar) {
        int i = this.b;
        if (i == 0) {
            adyeVar.a.l(this.a);
        } else if (i != 1) {
            adyeVar.a.g(this.a);
        } else {
            adyeVar.a.k(this.a);
        }
    }
}
