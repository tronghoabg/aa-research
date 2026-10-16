package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class drd extends defpackage.dqv {
    public java.util.ArrayList aL;

    public drd(byte[] bArr) {
        super(0, 0);
        this.aL = new java.util.ArrayList();
    }

    @Override // defpackage.dqv
    public final void ad(defpackage.lam lamVar) {
        super.ad(lamVar);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.dqv) this.aL.get(i)).ad(lamVar);
        }
    }

    public void ae() {
        java.util.ArrayList arrayList = this.aL;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.dqv dqvVar = (defpackage.dqv) this.aL.get(i);
            if (dqvVar instanceof defpackage.drd) {
                ((defpackage.drd) dqvVar).ae();
            }
        }
    }

    public final void am(defpackage.dqv dqvVar) {
        this.aL.add(dqvVar);
        defpackage.dqv dqvVar2 = dqvVar.ae;
        if (dqvVar2 != null) {
            ((defpackage.drd) dqvVar2).an(dqvVar);
        }
        dqvVar.ae = this;
    }

    public final void an(defpackage.dqv dqvVar) {
        this.aL.remove(dqvVar);
        dqvVar.u();
    }

    public final void ao() {
        this.aL.clear();
    }

    @Override // defpackage.dqv
    public void u() {
        this.aL.clear();
        super.u();
    }

    public drd() {
        this.aL = new java.util.ArrayList();
    }
}
