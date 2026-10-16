package defpackage;

/* loaded from: classes.dex */
public final class cza extends bui {
    public cza(cxb cxbVar) {
        super(cxbVar);
    }

    @Override // defpackage.bui
    protected final void e() {
        ((cxb) this.a).R();
    }

    @Override // defpackage.bui, defpackage.buj
    public final void f() {
        cym cymVar = ((cxb) this.a).k;
        if (cymVar != null) {
            cymVar.x();
        }
    }

    @Override // defpackage.bui, defpackage.buj
    public final void g() {
        ((cxb) this.b).i();
    }

    @Override // defpackage.buj
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
        ((cxb) this.b).F(i, (cxb) obj);
    }

    @Override // defpackage.buj
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
    }

    @Override // defpackage.buj
    public final void k(int i, int i2, int i3) {
        ((cxb) this.b).O(i, i2, i3);
    }

    @Override // defpackage.buj
    public final void l(int i, int i2) {
        ((cxb) this.b).S(i, i2);
    }
}
