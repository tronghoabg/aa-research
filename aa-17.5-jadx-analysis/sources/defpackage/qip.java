package defpackage;

/* loaded from: classes.dex */
public final class qip implements lyo {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qip(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.lyo
    public final void a(boolean z) {
        if (this.b != 0) {
            ((lvv) this.a).m(new lvu(z, 1));
            lvv.l(new lvu(z, 0));
        } else {
            ((qir) this.a).m(new lvu(z, 2));
            qir.l(new qhc(5));
        }
    }

    @Override // defpackage.lyo
    public final void b() {
        if (this.b != 0) {
            lvv.l(new iwu(15));
        } else {
            qir.l(new qhc(5));
        }
    }
}
