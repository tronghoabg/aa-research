package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class iia extends defpackage.iid implements defpackage.iic, defpackage.ihz {
    public java.util.List i = new java.util.ArrayList();
    public java.util.Set j = null;
    public java.lang.String k = null;
    public java.util.Set l = null;
    public java.util.Set m = null;

    protected iia() {
    }

    @Override // defpackage.iic
    public void b(defpackage.iig iigVar) throws org.xml.sax.SAXException {
        this.i.add(iigVar);
    }

    @Override // defpackage.ihz
    public final java.lang.String c() {
        return this.k;
    }

    @Override // defpackage.ihz
    public final java.util.Set d() {
        return this.j;
    }

    @Override // defpackage.ihz
    public final java.util.Set e() {
        return this.m;
    }

    @Override // defpackage.ihz
    public final java.util.Set f() {
        return this.l;
    }

    @Override // defpackage.ihz
    public final java.util.Set g() {
        return null;
    }

    @Override // defpackage.ihz
    public final void h(java.lang.String str) {
        this.k = str;
    }

    @Override // defpackage.ihz
    public final void i(java.util.Set set) {
        this.j = set;
    }

    @Override // defpackage.ihz
    public final void j(java.util.Set set) {
        this.m = set;
    }

    @Override // defpackage.ihz
    public final void k(java.util.Set set) {
        this.l = set;
    }

    @Override // defpackage.iic
    public final java.util.List n() {
        return this.i;
    }

    @Override // defpackage.ihz
    public final void l(java.util.Set set) {
    }
}
