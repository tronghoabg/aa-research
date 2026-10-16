package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wdm {
    public java.lang.Object a;
    public final java.lang.Object b;

    public wdm(defpackage.sks sksVar) {
        this.b = new android.util.SparseIntArray();
        if (sksVar == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        this.a = sksVar;
    }

    public static defpackage.wdm c(defpackage.eqp eqpVar) {
        defpackage.wdm wdmVar = new defpackage.wdm((byte[]) null);
        wdmVar.b(eqpVar);
        return wdmVar;
    }

    public final synchronized void a(defpackage.wba wbaVar) {
        if (this.a == null) {
            this.a = defpackage.tnx.c(wbaVar.c, new defpackage.wdg(this, 3), wbaVar.b());
        }
    }

    public final void b(defpackage.eqp eqpVar) {
        java.lang.Object obj = this.a;
        if (eqpVar == obj) {
            return;
        }
        if (obj != null) {
            ((defpackage.eqr) this.b).s((defpackage.eqp) obj);
        }
        this.a = eqpVar;
        java.lang.Object obj2 = this.b;
        ((defpackage.eqr) obj2).r(eqpVar, new defpackage.kkr(obj2, 8));
    }

    public final void d() {
        java.lang.Object obj = this.b;
        synchronized (obj) {
            ((android.util.SparseIntArray) obj).clear();
        }
    }

    public final int e(int i) {
        int i2;
        java.lang.Object obj = this.b;
        synchronized (obj) {
            i2 = ((android.util.SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public wdm(byte[] bArr) {
        this.b = new defpackage.eqr();
    }

    public wdm() {
        this.a = null;
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }
}
