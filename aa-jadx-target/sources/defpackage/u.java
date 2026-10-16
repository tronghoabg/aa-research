package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class u extends defpackage.p {
    public final java.util.ArrayList al = new java.util.ArrayList();

    public void D() {
        q();
        java.util.ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.p pVar = (defpackage.p) arrayList.get(i);
            if (pVar instanceof defpackage.u) {
                ((defpackage.u) pVar).D();
            }
        }
    }

    public final void F(defpackage.p pVar) {
        this.al.remove(pVar);
        pVar.r = null;
    }

    @Override // defpackage.p
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.p
    public final void n(int i, int i2) {
        super.n(i, i2);
        java.util.ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.p) arrayList.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.p
    public final void q() {
        super.q();
        java.util.ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.p pVar = (defpackage.p) arrayList.get(i);
            pVar.n(b(), c());
            if (!(pVar instanceof defpackage.q)) {
                pVar.q();
            }
        }
    }

    @Override // defpackage.p
    public final void z(defpackage.lam lamVar) {
        super.z(lamVar);
        java.util.ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.p) arrayList.get(i)).z(lamVar);
        }
    }
}
