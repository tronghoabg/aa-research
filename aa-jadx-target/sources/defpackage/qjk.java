package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjk implements lyu {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public qjk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void a(boolean z) {
        if (this.b != 0) {
            ((lwc) this.a).m(new lwb(z, 1));
            lwc.l(new lwb(z, 0));
        } else {
            ((defpackage.qjm) this.a).m(new lwb(z, 2));
            defpackage.qjm.l(new defpackage.qhx(5));
        }
    }

    public final void b() {
        if (this.b != 0) {
            lwc.l(new defpackage.ixc(15));
        } else {
            defpackage.qjm.l(new defpackage.qhx(5));
        }
    }
}
